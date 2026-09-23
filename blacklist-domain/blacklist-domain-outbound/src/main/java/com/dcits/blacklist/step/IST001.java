package com.dcits.blacklist.step;

import com.dcits.blacklist.facade.bo.ST001InputBO;
import com.dcits.blacklist.facade.bo.ST001OutputBO;

/**
 * ST001 检查黑名单 步骤接口。
 *
 * <p>当前实现范围仅覆盖子步骤1-2：按接口服务代码+接口服务类型查询【核心服务定义表】，
 * [服务信息列表]中不存在 服务状态="A-生效" 且 黑名单检查标志="Y-是" 的记录时，
 * 返回检查结果“通过”（succeed=true，dealFlow=null）。</p>
 *
 * <p>存在上述记录时按 SPEC 应跳转至子步骤3《获取黑名单信息》及后续黑名单检查（子步骤3-15），
 * 但所需实体（【名单信息表】【名单类型表】【名单检查范围表】无对应 EO/BCC）与
 * 子步骤8/11/12/13/14/15 的比较取值、控制流及返回约定均未定义，该路径暂不可实现，
 * 执行时抛出 {@link UnsupportedOperationException}，待需求方补充实体与业务定义后实现。</p>
 *
 * <p>本步骤仅查询本地数据，无数据库写入，不要求调用方提供事务。</p>
 */
public interface IST001 {

	/**
	 * 执行检查黑名单步骤。
	 *
	 * @param input 步骤输入
	 * @return 检查结果输出：succeed=true 且 dealFlow=null 表示“通过”；
	 *         接口服务允许黑名单检查时当前版本抛出 UnsupportedOperationException（见类注释）
	 */
	ST001OutputBO execute(ST001InputBO input);
}
