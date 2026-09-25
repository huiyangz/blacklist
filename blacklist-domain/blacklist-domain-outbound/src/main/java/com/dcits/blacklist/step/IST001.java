package com.dcits.blacklist.step;

import com.dcits.blacklist.facade.bo.ST001InputBO;
import com.dcits.blacklist.facade.bo.ST001OutputBO;

/**
 * ST001 检查黑名单 步骤接口。
 *
 * <p>本步骤仅查询本地核心服务定义、名单信息、名单类型、名单限制规则、
 * 名单检查/不检查范围及账户信息，不涉及本地数据库写入，无事务要求。</p>
 *
 * <p>检查结果通过 {@link ST001OutputBO#getCheckResult()} 返回
 * （通过/拒绝/授权/提醒），均为正常业务结论，{@code succeed} 为 true；
 * 本步骤 SPEC 未定义业务失败错误码。</p>
 */
public interface IST001 {

	/**
	 * 执行检查黑名单步骤
	 *
	 * @param input 步骤输入
	 * @return 检查结果（checkResult：通过/拒绝/授权/提醒；命中限制规则时附带 dealFlow）
	 */
	ST001OutputBO execute(ST001InputBO input);
}
