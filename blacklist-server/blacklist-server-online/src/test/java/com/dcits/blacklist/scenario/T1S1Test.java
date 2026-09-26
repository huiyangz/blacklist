package com.dcits.blacklist.scenario;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.lenient;

import java.util.concurrent.atomic.AtomicReference;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

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
import com.dcits.blacklist.task.scenario.T1S1;
import com.dcits.common.task.RespHeader;

/**
 * T1S1 检查黑名单 场景单元测试（JUnit 5 + Mockito）。
 */
@ExtendWith(MockitoExtension.class)
public class T1S1Test {

	@Mock
	private IST001 ist001;

	@InjectMocks
	private T1S1 t1s1;

	/** 桩：捕获 ST001 真实入参后返回指定检查结果与处理方式的成功输出 */
	private void stubSt001(AtomicReference<ST001InputBO> captured, String checkResult, DealFlow dealFlow) {
		lenient().when(ist001.execute(any(ST001InputBO.class))).thenAnswer(invocation -> {
			captured.set(invocation.getArgument(0));
			ST001OutputBO result = new ST001OutputBO();
			result.setSucceed(true);
			result.setCheckResult(checkResult);
			result.setDealFlow(dealFlow);
			return result;
		});
	}

	// T1S1-TC001：全成功路径，ST001 返回“通过”且不附处理方式，核对 13 个字段到 ST001InputBO 的映射与输出映射，并验证复用 header 旧错误被成功清理
	@Test
	public void testT1S1T01() {
		AtomicReference<ST001InputBO> captured = new AtomicReference<>();
		stubSt001(captured, "通过", null);

		RespHeader header = new RespHeader();
		header.setSucceed(false);
		header.setErrorCode("OLD-CODE");
		header.setErrorMessage("旧错误信息");

		T1S1InputDTO input = new T1S1InputDTO();
		input.setDocClass("DCT");
		input.setBaseAcctNo("2000000001234567");
		input.setTranBranch("351001");
		input.setSourceType("MT");
		input.setProgramId("P0001");
		input.setTranType("1000");
		input.setEventType("E0001");
		input.setServiceCode("SV0001");
		input.setMessageType("0200");
		input.setMessageCode("MC0001");
		input.setClientNo("C1000001");
		input.setDocumentId("140105199001011234");
		input.setDocumentType("110001");

		T1S1OutputDTO output = t1s1.execute(header, input);

		assertTrue(header.isSucceed());
		assertNull(header.getErrorCode());
		assertNull(header.getErrorMessage());
		assertEquals("通过", output.getCheckResult());
		assertNull(output.getDealFlow());

		ST001InputBO bo = captured.get();
		assertEquals(DocClass.DCT, bo.getDocClass());
		assertEquals("2000000001234567", bo.getBaseAcctNo());
		assertEquals(AcctBranch.VALUE_351001, bo.getTranBranch());
		assertEquals(SourceType.MT, bo.getSourceType());
		assertEquals("P0001", bo.getProgramId());
		assertEquals(TranType.VALUE_1000, bo.getTranType());
		assertEquals("E0001", bo.getEventType());
		assertEquals("SV0001", bo.getServiceCode());
		assertEquals("0200", bo.getMessageType());
		assertEquals("MC0001", bo.getMessageCode());
		assertEquals("C1000001", bo.getClientNo());
		assertEquals("140105199001011234", bo.getDocumentId());
		assertEquals(DocumentType.VALUE_110001, bo.getDocumentType());
	}

	// T1S1-TC002：全成功路径，ST001 返回“拒绝”并附处理方式 DealFlow.B，第二组入参值复核映射
	@Test
	public void testT1S1T02() {
		AtomicReference<ST001InputBO> captured = new AtomicReference<>();
		stubSt001(captured, "拒绝", DealFlow.B);

		RespHeader header = new RespHeader();

		T1S1InputDTO input = new T1S1InputDTO();
		input.setDocClass("CHK");
		input.setBaseAcctNo("2000000007654321");
		input.setTranBranch("351101");
		input.setSourceType("M");
		input.setProgramId("P0002");
		input.setTranType("1003");
		input.setEventType("E0002");
		input.setServiceCode("SV0002");
		input.setMessageType("0400");
		input.setMessageCode("MC0002");
		input.setClientNo("C1000002");
		input.setDocumentId("110105198805052345");
		input.setDocumentType("120000");

		T1S1OutputDTO output = t1s1.execute(header, input);

		assertTrue(header.isSucceed());
		assertNull(header.getErrorCode());
		assertNull(header.getErrorMessage());
		assertEquals("拒绝", output.getCheckResult());
		assertEquals("B", output.getDealFlow());

		ST001InputBO bo = captured.get();
		assertEquals(DocClass.CHK, bo.getDocClass());
		assertEquals("2000000007654321", bo.getBaseAcctNo());
		assertEquals(AcctBranch.VALUE_351101, bo.getTranBranch());
		assertEquals(SourceType.M, bo.getSourceType());
		assertEquals("P0002", bo.getProgramId());
		assertEquals(TranType.VALUE_1003, bo.getTranType());
		assertEquals("E0002", bo.getEventType());
		assertEquals("SV0002", bo.getServiceCode());
		assertEquals("0400", bo.getMessageType());
		assertEquals("MC0002", bo.getMessageCode());
		assertEquals("C1000002", bo.getClientNo());
		assertEquals("110105198805052345", bo.getDocumentId());
		assertEquals(DocumentType.VALUE_120000, bo.getDocumentType());
	}

	// T1S1-TC003：全成功路径，ST001 返回“授权”并附处理方式 DealFlow.A，第三组入参值复核映射
	@Test
	public void testT1S1T03() {
		AtomicReference<ST001InputBO> captured = new AtomicReference<>();
		stubSt001(captured, "授权", DealFlow.A);

		RespHeader header = new RespHeader();

		T1S1InputDTO input = new T1S1InputDTO();
		input.setDocClass("PBK");
		input.setBaseAcctNo("2000000005554443");
		input.setTranBranch("351102");
		input.setSourceType("AC");
		input.setProgramId("P0003");
		input.setTranType("4308");
		input.setEventType("E0003");
		input.setServiceCode("SV0003");
		input.setMessageType("0800");
		input.setMessageCode("MC0003");
		input.setClientNo("C1000003");
		input.setDocumentId("140105199505053456");
		input.setDocumentType("110003");

		T1S1OutputDTO output = t1s1.execute(header, input);

		assertTrue(header.isSucceed());
		assertNull(header.getErrorCode());
		assertNull(header.getErrorMessage());
		assertEquals("授权", output.getCheckResult());
		assertEquals("A", output.getDealFlow());

		ST001InputBO bo = captured.get();
		assertEquals(DocClass.PBK, bo.getDocClass());
		assertEquals("2000000005554443", bo.getBaseAcctNo());
		assertEquals(AcctBranch.VALUE_351102, bo.getTranBranch());
		assertEquals(SourceType.AC, bo.getSourceType());
		assertEquals("P0003", bo.getProgramId());
		assertEquals(TranType.VALUE_4308, bo.getTranType());
		assertEquals("E0003", bo.getEventType());
		assertEquals("SV0003", bo.getServiceCode());
		assertEquals("0800", bo.getMessageType());
		assertEquals("MC0003", bo.getMessageCode());
		assertEquals("C1000003", bo.getClientNo());
		assertEquals("140105199505053456", bo.getDocumentId());
		assertEquals(DocumentType.VALUE_110003, bo.getDocumentType());
	}

	// T1S1-TC004：全成功路径，ST001 返回“提醒”并附处理方式 DealFlow.D，第四组入参值复核映射
	@Test
	public void testT1S1T04() {
		AtomicReference<ST001InputBO> captured = new AtomicReference<>();
		stubSt001(captured, "提醒", DealFlow.D);

		RespHeader header = new RespHeader();

		T1S1InputDTO input = new T1S1InputDTO();
		input.setDocClass("BAT");
		input.setBaseAcctNo("2000000009998887");
		input.setTranBranch("351103");
		input.setSourceType("CP");
		input.setProgramId("P0004");
		input.setTranType("1006");
		input.setEventType("E0004");
		input.setServiceCode("SV0004");
		input.setMessageType("0600");
		input.setMessageCode("MC0004");
		input.setClientNo("C1000004");
		input.setDocumentId("140105200001015678");
		input.setDocumentType("110023");

		T1S1OutputDTO output = t1s1.execute(header, input);

		assertTrue(header.isSucceed());
		assertNull(header.getErrorCode());
		assertNull(header.getErrorMessage());
		assertEquals("提醒", output.getCheckResult());
		assertEquals("D", output.getDealFlow());

		ST001InputBO bo = captured.get();
		assertEquals(DocClass.BAT, bo.getDocClass());
		assertEquals("2000000009998887", bo.getBaseAcctNo());
		assertEquals(AcctBranch.VALUE_351103, bo.getTranBranch());
		assertEquals(SourceType.CP, bo.getSourceType());
		assertEquals("P0004", bo.getProgramId());
		assertEquals(TranType.VALUE_1006, bo.getTranType());
		assertEquals("E0004", bo.getEventType());
		assertEquals("SV0004", bo.getServiceCode());
		assertEquals("0600", bo.getMessageType());
		assertEquals("MC0004", bo.getMessageCode());
		assertEquals("C1000004", bo.getClientNo());
		assertEquals("140105200001015678", bo.getDocumentId());
		assertEquals(DocumentType.VALUE_110023, bo.getDocumentType());
	}
}
