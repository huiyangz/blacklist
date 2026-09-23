package com.dcits.blacklist.step;

import com.dcits.blacklist.facade.bo.ST001InputBO;
import com.dcits.blacklist.facade.bo.ST001OutputBO;
import com.dcits.blacklist.facade.components.IFmServiceDefineBcc;
import com.dcits.blacklist.facade.eo.FmServiceDefineEO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ST001 检查黑名单 步骤实现。
 *
 * <p>已实现子步骤1-2：根据{接口服务代码}、{接口服务类型}查询【核心服务定义表】获取[服务信息列表]；
 * 若列表中存在 服务状态="A-生效" 且 黑名单检查标志="Y-是" 的记录，按 SPEC 跳转子步骤《获取黑名单信息》，
 * 否则返回检查结果“通过”（succeed=true、错误字段为null、dealFlow为null）。</p>
 */
@Service
public class ST001Pbc implements IST001 {

	@Autowired
	private IFmServiceDefineBcc fmServiceDefineBcc;

	@Override
	public ST001OutputBO execute(ST001InputBO input) {
		ST001OutputBO output = new ST001OutputBO();
		// 子步骤1：获取黑名单检查标志与服务状态——按{接口服务代码}、{接口服务类型}查询【核心服务定义表】
		List<FmServiceDefineEO> serviceInfoList = findServiceInfoList(input);
		// 子步骤2：检查接口是否允许检查黑名单——存在 服务状态="A-生效" 且 黑名单检查标志="Y-是" 的记录则继续黑名单检查
		if (!existsActiveBlacklistCheckRecord(serviceInfoList)) {
			// 无符合条件的记录：返回检查结果“通过”（正常提前结束，非业务失败）
			output.setSucceed(true);
			return output;
		}
		// FIXME 交付阻断（定位问题，非占位授权）：存在"A-生效且Y-是"记录，按子步骤2应跳转至《获取黑名单信息》（子步骤3），
		// 但【名单信息表】【名单类型表】【名单检查范围表】在本工程无对应 EO/BCC（infrastructure-api 仅有核心服务定义、
		// 客户副本、对公存款账户主表、对公存款凭证账户关系、名单不检查范围、名单限制规则参数六类实体），
		// 且子步骤8比较常量（ResOperateFlag 无“检查类”取值）、子步骤11/12/13控制流、子步骤14查询对象、
		// 子步骤15“拒绝/授权/提醒”返回约定均未定义（见 outputs/SPEC-修正-豁免.md）。
		// 子步骤3-15不可实现，本路径不以“通过”默认返回掩盖检查缺失，明确报错；待需求方补充实体与业务定义后实现。
		throw new UnsupportedOperationException(
				"ST001 检查黑名单：接口服务允许黑名单检查，但子步骤3-15所需实体（名单信息表/名单类型表/名单检查范围表）"
						+ "与业务定义（子步骤8/11/12/13/14/15）缺失，路径未实现");
	}

	/**
	 * 子步骤1：按{接口服务代码}、{接口服务类型}查询【核心服务定义表】获取[服务信息列表]。
	 */
	private List<FmServiceDefineEO> findServiceInfoList(ST001InputBO input) {
		FmServiceDefineEO query = new FmServiceDefineEO();
		query.setMessageCode(input.getMessageCode());
		query.setMessageType(input.getMessageType());
		return fmServiceDefineBcc.findByEo(query);
	}

	/**
	 * 子步骤2判定：[服务信息列表]中是否存在 服务状态="A-生效" 且 黑名单检查标志="Y-是" 的记录。
	 */
	private boolean existsActiveBlacklistCheckRecord(List<FmServiceDefineEO> serviceInfoList) {
		for (FmServiceDefineEO record : serviceInfoList) {
			if ("A".equals(record.getServiceStatus()) && "Y".equals(record.getBlacklistCheckFlag())) {
				return true;
			}
		}
		return false;
	}
}
