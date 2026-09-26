package com.dcits.blacklist.task.scenario;

import java.util.ResourceBundle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.dcits.blacklist.enums.AcctBranch;
import com.dcits.blacklist.enums.DealFlow;
import com.dcits.blacklist.enums.DocClass;
import com.dcits.blacklist.enums.DocumentType;
import com.dcits.blacklist.enums.SourceType;
import com.dcits.blacklist.enums.TranType;
import com.dcits.blacklist.facade.bo.ST001InputBO;
import com.dcits.blacklist.facade.bo.ST001OutputBO;
import com.dcits.blacklist.step.IST001;
import com.dcits.blacklist.task.dto.T1S1InputDTO;
import com.dcits.blacklist.task.dto.T1S1OutputDTO;
import com.dcits.common.task.RespHeader;

/**
 * T1S1 检查黑名单 场景类。
 *
 * <p>按场景定义调用步骤 ST001（检查黑名单）：ST001 仅查询本地数据、
 * 无事务要求，场景不启用事务；四种检查结果（通过/拒绝/授权/提醒）
 * 均为正常业务结论，步骤 SPEC 未定义业务失败错误码。</p>
 */
@Component
public class T1S1 {

	private static final Logger logger = LoggerFactory.getLogger(T1S1.class);

	private final IST001 st001;

	public T1S1(IST001 st001) {
		this.st001 = st001;
	}

	public T1S1OutputDTO execute(RespHeader header, T1S1InputDTO input) {
		T1S1OutputDTO output = new T1S1OutputDTO();

		// 步骤1 ST001 检查黑名单：入参全部来自场景输入
		ST001InputBO st001Input = new ST001InputBO();
		st001Input.setDocClass(DocClass.byValue(input.getDocClass()));
		st001Input.setBaseAcctNo(input.getBaseAcctNo());
		st001Input.setSourceType(SourceType.byValue(input.getSourceType()));
		st001Input.setProgramId(input.getProgramId());
		st001Input.setTranType(TranType.byValue(input.getTranType()));
		st001Input.setEventType(input.getEventType());
		st001Input.setServiceCode(input.getServiceCode());
		st001Input.setMessageType(input.getMessageType());
		st001Input.setMessageCode(input.getMessageCode());
		st001Input.setClientNo(input.getClientNo());
		st001Input.setDocumentId(input.getDocumentId());
		st001Input.setDocumentType(DocumentType.byValue(input.getDocumentType()));
		st001Input.setTranBranch(AcctBranch.byValue(input.getTranBranch()));

		ST001OutputBO st001Result = st001.execute(st001Input);
		if (!st001Result.isSucceed()) {
			handleError(header, st001Result.getErrorCode(), st001Result.getErrorMessage());
			return output;
		}

		// 全部步骤成功，映射业务输出
		output.setCheckResult(st001Result.getCheckResult());
		DealFlow dealFlow = st001Result.getDealFlow();
		output.setDealFlow(dealFlow == null ? null : dealFlow.getValue());

		header.setSucceed(true);
		header.setErrorCode(null);
		header.setErrorMessage(null);
		return output;
	}

	/**
	 * 步骤失败处理：设置失败响应头并立即短路返回。
	 * 响应头业务文案唯一来源为 errorcodes 资源。
	 */
	private void handleError(RespHeader header, String errorCode, String errorMessage) {
		logger.error("T1S1 场景步骤 ST001 执行失败：errorCode={}, errorMessage={}", errorCode, errorMessage);
		header.setSucceed(false);
		header.setErrorCode(errorCode);
		header.setErrorMessage(ResourceBundle.getBundle("errorcodes").getString(errorCode));
	}
}
