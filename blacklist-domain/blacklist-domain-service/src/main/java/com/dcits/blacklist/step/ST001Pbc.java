package com.dcits.blacklist.step;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.dcits.blacklist.enums.AcctBranch;
import com.dcits.blacklist.enums.DealFlow;
import com.dcits.blacklist.enums.RcBlackStatus;
import com.dcits.blacklist.enums.ResBranchRange;
import com.dcits.blacklist.enums.ResOperateFlag;
import com.dcits.blacklist.facade.bo.ST001InputBO;
import com.dcits.blacklist.facade.bo.ST001OutputBO;
import com.dcits.blacklist.facade.components.IFmServiceDefineBcc;
import com.dcits.blacklist.facade.components.IRbBusAcctBcc;
import com.dcits.blacklist.facade.components.IRcAllListBcc;
import com.dcits.blacklist.facade.components.IRcListCheckRangeBcc;
import com.dcits.blacklist.facade.components.IRcListNotCheckRangeBcc;
import com.dcits.blacklist.facade.components.IRcListTypeBcc;
import com.dcits.blacklist.facade.components.IRcRuleTypeBcc;
import com.dcits.blacklist.facade.eo.FmServiceDefineEO;
import com.dcits.blacklist.facade.eo.RbBusAcctEO;
import com.dcits.blacklist.facade.eo.RcAllListEO;
import com.dcits.blacklist.facade.eo.RcListCheckRangeEO;
import com.dcits.blacklist.facade.eo.RcListNotCheckRangeEO;
import com.dcits.blacklist.facade.eo.RcListTypeEO;
import com.dcits.blacklist.facade.eo.RcRuleTypeEO;

/**
 * ST001 检查黑名单 步骤实现。
 *
 * <p>按核心服务定义的黑名单检查标志与服务状态判断是否检查黑名单；
 * 命中生效黑名单后依次核对名单检查规则编号、限制操作标识、名单不检查范围、
 * 介质与机构范围，最终按名单限制规则的处理方式返回拒绝/授权/提醒，
 * 各检查环节未命中均提前返回"通过"。</p>
 */
@Service
public class ST001Pbc implements IST001 {

	private static final Logger logger = LoggerFactory.getLogger(ST001Pbc.class);

	/** 核心服务定义-服务状态：A-生效 */
	private static final String SERVICE_STATUS_ACTIVE = "A";
	/** 核心服务定义-黑名单检查标志：Y-是 */
	private static final String BLACKLIST_CHECK_FLAG_YES = "Y";
	/** 检查结果：通过 */
	private static final String CHECK_RESULT_PASS = "通过";
	/** 检查结果：拒绝 */
	private static final String CHECK_RESULT_REJECT = "拒绝";
	/** 检查结果：授权 */
	private static final String CHECK_RESULT_AUTH = "授权";
	/** 检查结果：提醒 */
	private static final String CHECK_RESULT_REMIND = "提醒";

	private final IFmServiceDefineBcc fmServiceDefineBcc;
	private final IRcAllListBcc rcAllListBcc;
	private final IRcListTypeBcc rcListTypeBcc;
	private final IRcRuleTypeBcc rcRuleTypeBcc;
	private final IRcListCheckRangeBcc rcListCheckRangeBcc;
	private final IRcListNotCheckRangeBcc rcListNotCheckRangeBcc;
	private final IRbBusAcctBcc rbBusAcctBcc;

	public ST001Pbc(IFmServiceDefineBcc fmServiceDefineBcc, IRcAllListBcc rcAllListBcc,
			IRcListTypeBcc rcListTypeBcc, IRcRuleTypeBcc rcRuleTypeBcc,
			IRcListCheckRangeBcc rcListCheckRangeBcc, IRcListNotCheckRangeBcc rcListNotCheckRangeBcc,
			IRbBusAcctBcc rbBusAcctBcc) {
		this.fmServiceDefineBcc = fmServiceDefineBcc;
		this.rcAllListBcc = rcAllListBcc;
		this.rcListTypeBcc = rcListTypeBcc;
		this.rcRuleTypeBcc = rcRuleTypeBcc;
		this.rcListCheckRangeBcc = rcListCheckRangeBcc;
		this.rcListNotCheckRangeBcc = rcListNotCheckRangeBcc;
		this.rbBusAcctBcc = rbBusAcctBcc;
	}

	@Override
	public ST001OutputBO execute(ST001InputBO input) {
		ST001OutputBO output = new ST001OutputBO();

		// 子步骤1-2：获取服务信息列表，检查接口是否允许检查黑名单
		if (!isBlacklistCheckAllowed(input)) {
			return pass(output);
		}

		// 子步骤3-4：获取黑名单信息，检查是否存在黑名单
		RcAllListEO blacklistInfo = findBlacklistInfo(input);
		if (blacklistInfo == null) {
			return pass(output);
		}

		// 子步骤5-6：获取黑名单检查规则编号，为空则通过
		String ruleId = loadRuleId(blacklistInfo.getListType());
		if (isBlank(ruleId)) {
			return pass(output);
		}

		// 子步骤7-8：获取名单限制规则信息，限制操作标识非"E-异常"（检查类）则通过
		RcRuleTypeEO ruleInfo = rcRuleTypeBcc.findByPrimaryKey(ruleId);
		if (ruleInfo == null || ruleInfo.getResOperateFlag() != ResOperateFlag.E) {
			return pass(output);
		}

		// 子步骤9-11：获取事件类型与名单不检查范围，命中不检查范围则通过
		if (isInNotCheckRange(input)) {
			return pass(output);
		}

		// 子步骤12：检查介质，凭证种类不在介质范围内则通过
		if (!isMediumMatched(input, ruleInfo)) {
			return pass(output);
		}

		// 子步骤13-14：获取账户开立行行号并检查机构，条件不成立则通过
		if (!isBranchMatched(input, ruleInfo)) {
			return pass(output);
		}

		// 子步骤15：获取黑名单处理方式
		RcRuleTypeEO ruleForDealFlow = rcRuleTypeBcc.findByPrimaryKey(ruleId);
		DealFlow dealFlow = ruleForDealFlow == null ? null : ruleForDealFlow.getDealFlow();

		// 子步骤16：按处理方式返回检查结果
		output.setDealFlow(dealFlow);
		if (dealFlow == DealFlow.B) {
			return finish(output, CHECK_RESULT_REJECT);
		}
		if (dealFlow == DealFlow.A) {
			return finish(output, CHECK_RESULT_AUTH);
		}
		if (dealFlow == DealFlow.D) {
			return finish(output, CHECK_RESULT_REMIND);
		}
		return pass(output);
	}

	/**
	 * 子步骤1-2：按接口服务代码与接口服务类型查询核心服务定义表，
	 * 存在服务状态为"A-生效"且黑名单检查标志为"Y-是"的记录时允许检查黑名单。
	 */
	private boolean isBlacklistCheckAllowed(ST001InputBO input) {
		FmServiceDefineEO query = new FmServiceDefineEO();
		query.setMessageCode(input.getMessageCode());
		query.setMessageType(input.getMessageType());
		List<FmServiceDefineEO> serviceList = fmServiceDefineBcc.findByEo(query);
		if (serviceList == null) {
			return false;
		}
		for (FmServiceDefineEO service : serviceList) {
			if (SERVICE_STATUS_ACTIVE.equals(service.getServiceStatus())
					&& BLACKLIST_CHECK_FLAG_YES.equals(service.getBlacklistCheckFlag())) {
				return true;
			}
		}
		return false;
	}

	/**
	 * 子步骤3-4：按客户号、证件号码、账号依次作为数据值查询名单信息表，
	 * 黑名单状态为"生效"即命中黑名单，任一命中即返回该记录；
	 * 空匹配键不发起查询。
	 */
	private RcAllListEO findBlacklistInfo(ST001InputBO input) {
		RcAllListEO hit = findActiveBlacklist(input.getClientNo());
		if (hit == null) {
			hit = findActiveBlacklist(input.getDocumentId());
		}
		if (hit == null) {
			hit = findActiveBlacklist(input.getBaseAcctNo());
		}
		return hit;
	}

	/** 按数据值查询名单信息表黑名单状态为"生效"的首条记录；数据值为空或无命中返回 null */
	private RcAllListEO findActiveBlacklist(String dataValue) {
		if (isBlank(dataValue)) {
			return null;
		}
		RcAllListEO query = new RcAllListEO();
		query.setDataValue(dataValue);
		query.setRcBlackStatus(RcBlackStatus.A);
		List<RcAllListEO> list = rcAllListBcc.findByEo(query);
		if (list == null || list.isEmpty()) {
			return null;
		}
		return list.get(0);
	}

	/**
	 * 子步骤5：按名单类型代码查询名单类型表，获取黑名单检查规则编号；
	 * 名单类型无记录时规则编号按无值处理，由子步骤6走"通过"出口。
	 */
	private String loadRuleId(String listType) {
		RcListTypeEO listTypeEo = rcListTypeBcc.findByPrimaryKey(listType);
		return listTypeEo == null ? null : listTypeEo.getRuleId();
	}

	/**
	 * 子步骤9-11：按事件类型、交易类型、渠道类型、交易代码、服务代码、
	 * 接口服务类型、接口服务代码查询名单检查范围表提取事件类型，
	 * 再逐事件类型查询名单不检查范围表，存在记录即命中不检查范围。
	 */
	private boolean isInNotCheckRange(ST001InputBO input) {
		RcListCheckRangeEO checkRangeQuery = new RcListCheckRangeEO();
		checkRangeQuery.setEventType(input.getEventType());
		checkRangeQuery.setTranType(input.getTranType());
		checkRangeQuery.setSourceType(input.getSourceType());
		checkRangeQuery.setProgramId(input.getProgramId());
		checkRangeQuery.setServiceCode(input.getServiceCode());
		checkRangeQuery.setMessageType(input.getMessageType());
		checkRangeQuery.setMessageCode(input.getMessageCode());
		List<RcListCheckRangeEO> checkRanges = rcListCheckRangeBcc.findByEo(checkRangeQuery);
		if (checkRanges == null || checkRanges.isEmpty()) {
			return false;
		}
		Set<String> eventTypes = new LinkedHashSet<>();
		for (RcListCheckRangeEO checkRange : checkRanges) {
			if (!isBlank(checkRange.getEventType())) {
				eventTypes.add(checkRange.getEventType());
			}
		}
		for (String eventType : eventTypes) {
			RcListNotCheckRangeEO notCheckQuery = new RcListNotCheckRangeEO();
			notCheckQuery.setTranType(input.getTranType());
			notCheckQuery.setSourceType(input.getSourceType());
			notCheckQuery.setProgramId(input.getProgramId());
			notCheckQuery.setServiceCode(input.getServiceCode());
			notCheckQuery.setMessageType(input.getMessageType());
			notCheckQuery.setMessageCode(input.getMessageCode());
			notCheckQuery.setEventType(eventType);
			List<RcListNotCheckRangeEO> notCheckList = rcListNotCheckRangeBcc.findByEo(notCheckQuery);
			if (notCheckList != null && !notCheckList.isEmpty()) {
				return true;
			}
		}
		return false;
	}

	/**
	 * 子步骤12：检查介质，上送凭证种类在名单限制规则的介质范围内时继续。
	 * 凭证种类为空或介质为空时无法命中范围，按"否则"出口返回通过。
	 */
	private boolean isMediumMatched(ST001InputBO input, RcRuleTypeEO ruleInfo) {
		if (input.getDocClass() == null || isBlank(ruleInfo.getCardMedium())) {
			return false;
		}
		return ruleInfo.getCardMedium().contains(input.getDocClass().getValue());
	}

	/**
	 * 子步骤13-14：先按账号查询账户信息获取账户开立行行号；
	 * 限制机构范围为"B-下级机构"且账户开立行行号等于交易机构时继续，
	 * 否则（含范围非 B、账号为空、账户无记录导致的行号缺失）返回通过。
	 */
	private boolean isBranchMatched(ST001InputBO input, RcRuleTypeEO ruleInfo) {
		AcctBranch acctBranch = loadAcctBranch(input.getBaseAcctNo());
		if (ruleInfo.getResBranchRange() != ResBranchRange.B) {
			return false;
		}
		return acctBranch != null && acctBranch == input.getTranBranch();
	}

	/** 子步骤13：按账号查询账户信息表获取账户开立行行号；账号为空或无记录返回 null */
	private AcctBranch loadAcctBranch(String baseAcctNo) {
		if (isBlank(baseAcctNo)) {
			return null;
		}
		RbBusAcctEO query = new RbBusAcctEO();
		query.setBaseAcctNo(baseAcctNo);
		List<RbBusAcctEO> acctList = rbBusAcctBcc.findByEo(query);
		if (acctList == null || acctList.isEmpty()) {
			return null;
		}
		return acctList.get(0).getAcctBranch();
	}

	/** 提前返回检查结果"通过" */
	private ST001OutputBO pass(ST001OutputBO output) {
		return finish(output, CHECK_RESULT_PASS);
	}

	/** 设置检查结论并按正常业务结果成功返回 */
	private ST001OutputBO finish(ST001OutputBO output, String checkResult) {
		output.setCheckResult(checkResult);
		output.setSucceed(true);
		logger.info("ST001 检查黑名单完成，检查结果：{}", checkResult);
		return output;
	}

	private boolean isBlank(String value) {
		return value == null || value.isEmpty();
	}
}
