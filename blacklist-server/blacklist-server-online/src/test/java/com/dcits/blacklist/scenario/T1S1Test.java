package com.dcits.blacklist.scenario;

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
import com.dcits.blacklist.task.scenario.T1S1;
import com.dcits.common.task.RespHeader;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.lenient;

/**
 * T1S1 检查黑名单 场景单元测试。
 * 用例来源：outputs/测试用例.md T1S1-TC001~TC004（步骤成功 × DealFlow 四种业务结论）。
 * ST001 无业务失败出口（允许检查路径抛 UnsupportedOperationException 属技术异常，不模拟），
 * 故无失败短路用例；ST001InputBO.tranBranch 无场景来源（阻断缺口，见用例文档），
 * 断言不覆盖该字段，不以猜值充当预期。
 */
@ExtendWith(MockitoExtension.class)
public class T1S1Test {

	@Mock
	private IST001 ist001;

	@InjectMocks
	private T1S1 t1s1;

	/**
	 * 构造公共响应头：serviceCode 刻意区别于 input.serviceCode，验证 ST001InputBO.serviceCode 来源于场景输入；
	 * 另预置旧失败状态（复用头携带历史错误），验证全成功路径显式清理旧错误。
	 */
	private RespHeader buildHeader() {
		RespHeader header = new RespHeader();
		header.setServiceCode("SVC-HDR-001");
		header.setTransSeqNo("SEQ-20260923-0001");
		header.setSucceed(false);
		header.setErrorCode("STALE_ERROR");
		header.setErrorMessage("复用响应头携带的旧错误信息");
		return header;
	}

	/**
	 * 构造公共场景输入（T1S1-TC001~TC004 共用同一组确定值，来自用例文档）：
	 * 枚举入参均为已核实真实常量业务值；blacklistCheckFlag="Y"、serviceStatus="A" 与 ST001 子步骤2值域一致；
	 * eventType、cardMedium、programId 取值域 SPEC 未定义，仅验证传递。
	 */
	private T1S1InputDTO buildInput() {
		T1S1InputDTO input = new T1S1InputDTO();
		input.setDocClass("CRD");
		input.setBaseAcctNo("6217000010001234567");
		input.setAcctBranch("351155");
		input.setSourceType("MT");
		input.setProgramId("P0001");
		input.setTranType("1000");
		input.setEventType("EVT001");
		input.setCardMedium("01");
		input.setResBranchRange("A");
		input.setServiceCode("SVC-IN-001");
		input.setMessageType("MSG-TYPE-01");
		input.setMessageCode("MSG-CODE-01");
		input.setBlacklistCheckFlag("Y");
		input.setServiceStatus("A");
		input.setClientNo("C20260923001");
		input.setDocumentId("140105199001011234");
		input.setDocumentType("110001");
		return input;
	}

	// 场景：全量输入上送，ST001 返回检查“通过”（succeed=true 且 dealFlow=null），场景置头成功并清理旧错误，逐项核对 DTO 到 InputBO 的 17 字段映射（含 6 个枚举 byValue 转换）
	@Test
	public void testT1S1T01() {
		ST001InputBO[] captured = new ST001InputBO[1];
		lenient().when(ist001.execute(any(ST001InputBO.class)))
				.thenAnswer(invocation -> {
					captured[0] = invocation.getArgument(0);
					ST001OutputBO bo = new ST001OutputBO();
					bo.setSucceed(true);
					return bo;
				});
		RespHeader header = buildHeader();

		T1S1OutputDTO output = t1s1.execute(header, buildInput());

		assertTrue(header.isSucceed());
		assertNull(header.getErrorCode());
		assertNull(header.getErrorMessage());
		assertNull(output.getDealFlow());
		assertEquals(DocClass.CRD, captured[0].getDocClass());
		assertEquals("6217000010001234567", captured[0].getBaseAcctNo());
		assertEquals(AcctBranch.VALUE_351155, captured[0].getAcctBranch());
		assertEquals(SourceType.MT, captured[0].getSourceType());
		assertEquals("P0001", captured[0].getProgramId());
		assertEquals(TranType.VALUE_1000, captured[0].getTranType());
		assertEquals("EVT001", captured[0].getEventType());
		assertEquals("01", captured[0].getCardMedium());
		assertEquals(ResBranchRange.A, captured[0].getResBranchRange());
		assertEquals("SVC-IN-001", captured[0].getServiceCode());
		assertEquals("MSG-TYPE-01", captured[0].getMessageType());
		assertEquals("MSG-CODE-01", captured[0].getMessageCode());
		assertEquals("Y", captured[0].getBlacklistCheckFlag());
		assertEquals("A", captured[0].getServiceStatus());
		assertEquals("C20260923001", captured[0].getClientNo());
		assertEquals("140105199001011234", captured[0].getDocumentId());
		assertEquals(DocumentType.VALUE_110001, captured[0].getDocumentType());
	}

	// 场景：ST001 返回检查结果“拒绝”（DealFlow.B），步骤成功，场景将处理方式透传为输出 dealFlow="B"
	@Test
	public void testT1S1T02() {
		ST001OutputBO bo = new ST001OutputBO();
		bo.setSucceed(true);
		bo.setDealFlow(DealFlow.B);
		lenient().when(ist001.execute(any(ST001InputBO.class))).thenReturn(bo);
		RespHeader header = buildHeader();

		T1S1OutputDTO output = t1s1.execute(header, buildInput());

		assertTrue(header.isSucceed());
		assertNull(header.getErrorCode());
		assertNull(header.getErrorMessage());
		assertEquals("B", output.getDealFlow());
	}

	// 场景：ST001 返回检查结果“授权”（DealFlow.A），步骤成功，场景透传 dealFlow="A"
	@Test
	public void testT1S1T03() {
		ST001OutputBO bo = new ST001OutputBO();
		bo.setSucceed(true);
		bo.setDealFlow(DealFlow.A);
		lenient().when(ist001.execute(any(ST001InputBO.class))).thenReturn(bo);
		RespHeader header = buildHeader();

		T1S1OutputDTO output = t1s1.execute(header, buildInput());

		assertTrue(header.isSucceed());
		assertNull(header.getErrorCode());
		assertNull(header.getErrorMessage());
		assertEquals("A", output.getDealFlow());
	}

	// 场景：ST001 返回检查结果“提醒”（DealFlow.D），步骤成功，场景透传 dealFlow="D"
	@Test
	public void testT1S1T04() {
		ST001OutputBO bo = new ST001OutputBO();
		bo.setSucceed(true);
		bo.setDealFlow(DealFlow.D);
		lenient().when(ist001.execute(any(ST001InputBO.class))).thenReturn(bo);
		RespHeader header = buildHeader();

		T1S1OutputDTO output = t1s1.execute(header, buildInput());

		assertTrue(header.isSucceed());
		assertNull(header.getErrorCode());
		assertNull(header.getErrorMessage());
		assertEquals("D", output.getDealFlow());
	}
}
