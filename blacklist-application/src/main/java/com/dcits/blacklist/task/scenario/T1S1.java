package com.dcits.blacklist.task.scenario;

import com.dcits.blacklist.enums.AcctBranch;
import com.dcits.blacklist.enums.DealFlow;
import com.dcits.blacklist.enums.DocClass;
import com.dcits.blacklist.enums.DocumentType;
import com.dcits.blacklist.enums.ResBranchRange;
import com.dcits.blacklist.enums.SourceType;
import com.dcits.blacklist.enums.TranType;
import com.dcits.blacklist.facade.bo.ST001InputBO;
import com.dcits.blacklist.facade.bo.ST001OutputBO;
import com.dcits.blacklist.step.IST001;
import com.dcits.blacklist.task.dto.T1S1InputDTO;
import com.dcits.blacklist.task.dto.T1S1OutputDTO;
import com.dcits.common.task.RespHeader;
import org.springframework.stereotype.Component;

import java.util.ResourceBundle;

/**
 * T1S1 检查黑名单 场景。
 *
 * <p>编排步骤：ST001 检查黑名单（单一步骤）。场景输入 17 字段与 ST001InputBO 同名字段一一映射，
 * 其中 6 个枚举字段（docClass/acctBranch/sourceType/tranType/resBranchRange/documentType）按
 * 各枚举 byValue(String) 转入业务枚举；ST001 输出 dealFlow 按 DealFlow.getValue() 转回 String，
 * 检查结果“通过”（succeed=true 且 dealFlow=null）时场景输出保持 null。</p>
 *
 * <p>ST001InputBO.tranBranch（交易机构号，步骤 SPEC 必填）在场景输入 17 字段、响应头
 * （仅 serviceCode/transSeqNo）及前序步骤输出中均无已确认来源（需求豁免项
 * outputs/SPEC-修正-豁免.md，待需求方补充场景输入字段或明确来源映射）；
 * 本场景不猜测赋值，该字段维持 BO 默认未赋值状态。</p>
 *
 * <p>IST001 契约为仅查询本地数据、无数据库写入、不要求调用方提供事务，故本场景不加事务注解。</p>
 */
@Component
public class T1S1 {

	private final IST001 ist001;

	public T1S1(IST001 ist001) {
		this.ist001 = ist001;
	}

	public T1S1OutputDTO execute(RespHeader header, T1S1InputDTO input) {
		T1S1OutputDTO output = new T1S1OutputDTO();
		// ST001 检查黑名单：场景输入 17 字段按已确认数据流组装步骤入参（tranBranch 无来源，不赋值）
		ST001InputBO st001Input = new ST001InputBO();
		st001Input.setDocClass(DocClass.byValue(input.getDocClass()));
		st001Input.setBaseAcctNo(input.getBaseAcctNo());
		st001Input.setAcctBranch(AcctBranch.byValue(input.getAcctBranch()));
		st001Input.setSourceType(SourceType.byValue(input.getSourceType()));
		st001Input.setProgramId(input.getProgramId());
		st001Input.setTranType(TranType.byValue(input.getTranType()));
		st001Input.setEventType(input.getEventType());
		st001Input.setCardMedium(input.getCardMedium());
		st001Input.setResBranchRange(ResBranchRange.byValue(input.getResBranchRange()));
		st001Input.setServiceCode(input.getServiceCode());
		st001Input.setMessageType(input.getMessageType());
		st001Input.setMessageCode(input.getMessageCode());
		st001Input.setBlacklistCheckFlag(input.getBlacklistCheckFlag());
		st001Input.setServiceStatus(input.getServiceStatus());
		st001Input.setClientNo(input.getClientNo());
		st001Input.setDocumentId(input.getDocumentId());
		st001Input.setDocumentType(DocumentType.byValue(input.getDocumentType()));
		ST001OutputBO st001Output = ist001.execute(st001Input);
		if (!st001Output.isSucceed()) {
			handleError(header, st001Output.getErrorCode());
			return output;
		}
		// 步骤成功：dealFlow 枚举转 String（“通过”时 BO dealFlow 为 null，输出保持 null）
		DealFlow dealFlow = st001Output.getDealFlow();
		output.setDealFlow(dealFlow == null ? null : dealFlow.getValue());
		header.setSucceed(true);
		header.setErrorCode(null);
		header.setErrorMessage(null);
		return output;
	}

	/**
	 * 步骤失败短路：设置失败头并停止后续编排。
	 * 错误码原样取自步骤输出，文案按主规范以 errorcodes 资源为唯一来源；
	 * 资源加载失败属技术异常，交由上层处理，本处不做降级。
	 * （ST001 当前契约无业务失败出口，本分支为步骤状态检查的标准短路处理。）
	 */
	private void handleError(RespHeader header, String errorCode) {
		header.setSucceed(false);
		header.setErrorCode(errorCode);
		header.setErrorMessage(ResourceBundle.getBundle("errorcodes").getString(errorCode));
	}
}
