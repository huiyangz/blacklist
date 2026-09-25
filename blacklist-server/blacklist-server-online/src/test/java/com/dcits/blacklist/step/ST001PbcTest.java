package com.dcits.blacklist.step;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.argThat;
import static org.mockito.Mockito.lenient;

import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.dcits.blacklist.enums.AcctBranch;
import com.dcits.blacklist.enums.DealFlow;
import com.dcits.blacklist.enums.DocClass;
import com.dcits.blacklist.enums.DocumentType;
import com.dcits.blacklist.enums.RcBlackStatus;
import com.dcits.blacklist.enums.ResBranchRange;
import com.dcits.blacklist.enums.ResOperateFlag;
import com.dcits.blacklist.enums.SourceType;
import com.dcits.blacklist.enums.TranType;
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
 * ST001 检查黑名单 单元测试（JUnit 5 + Mockito）。
 */
@ExtendWith(MockitoExtension.class)
public class ST001PbcTest {

	@Mock
	private IFmServiceDefineBcc fmServiceDefineBcc;

	@Mock
	private IRcAllListBcc rcAllListBcc;

	@Mock
	private IRcListTypeBcc rcListTypeBcc;

	@Mock
	private IRcRuleTypeBcc rcRuleTypeBcc;

	@Mock
	private IRcListCheckRangeBcc rcListCheckRangeBcc;

	@Mock
	private IRcListNotCheckRangeBcc rcListNotCheckRangeBcc;

	@Mock
	private IRbBusAcctBcc rbBusAcctBcc;

	@InjectMocks
	private ST001Pbc st001Pbc;

	/** 构造统一基线输入（用例特别说明时在测试方法内覆盖对应字段） */
	private ST001InputBO buildBaseInput() {
		ST001InputBO input = new ST001InputBO();
		input.setMessageCode("100001");
		input.setMessageType("0100");
		input.setServiceCode("SVC001");
		input.setSourceType(SourceType.MT);
		input.setTranType(TranType.VALUE_4308);
		input.setProgramId("DEP0001");
		input.setEventType("E0001");
		input.setDocumentId("91140000MA0GW2188X");
		input.setDocumentType(DocumentType.VALUE_610005);
		input.setClientNo(null);
		input.setBaseAcctNo("20000123456789");
		input.setDocClass(DocClass.DCT);
		input.setTranBranch(AcctBranch.VALUE_351155);
		return input;
	}

	/** 桩①：核心服务定义查询（按接口服务代码+接口服务类型），返回指定状态与检查标志的单条记录 */
	private void stubServiceDefine(String serviceStatus, String blacklistCheckFlag) {
		FmServiceDefineEO record = new FmServiceDefineEO();
		record.setMessageCode("100001");
		record.setMessageType("0100");
		record.setServiceCode("SVC001");
		record.setServiceStatus(serviceStatus);
		record.setBlacklistCheckFlag(blacklistCheckFlag);
		lenient().when(fmServiceDefineBcc.findByEo(argThat((FmServiceDefineEO eo) -> eo != null
				&& "100001".equals(eo.getMessageCode())
				&& "0100".equals(eo.getMessageType())))).thenReturn(Collections.singletonList(record));
	}

	/** 桩①（空列表）：核心服务定义查询无记录 */
	private void stubServiceDefineEmpty() {
		lenient().when(fmServiceDefineBcc.findByEo(argThat((FmServiceDefineEO eo) -> eo != null
				&& "100001".equals(eo.getMessageCode())
				&& "0100".equals(eo.getMessageType())))).thenReturn(Collections.emptyList());
	}

	/** 桩②：名单信息查询（数据值+黑名单状态生效），返回命中黑名单记录 */
	private void stubBlacklist(String dataValue, String rcSeqNo, String dataType, String createTimestamp) {
		RcAllListEO record = new RcAllListEO();
		record.setRcSeqNo(rcSeqNo);
		record.setDataType(dataType);
		record.setDataValue(dataValue);
		record.setListType("BL01");
		record.setRcBlackStatus(RcBlackStatus.A);
		record.setCreateTimestamp(createTimestamp);
		record.setLastUpdTimestamp("2026-09-20-00.00.00");
		lenient().when(rcAllListBcc.findByEo(argThat((RcAllListEO eo) -> eo != null
				&& dataValue.equals(eo.getDataValue())
				&& RcBlackStatus.A == eo.getRcBlackStatus())))
				.thenReturn(Collections.singletonList(record));
	}

	/** 桩②（空列表）：名单信息查询无生效记录 */
	private void stubBlacklistEmpty(String dataValue) {
		lenient().when(rcAllListBcc.findByEo(argThat((RcAllListEO eo) -> eo != null
				&& dataValue.equals(eo.getDataValue())
				&& RcBlackStatus.A == eo.getRcBlackStatus()))).thenReturn(Collections.emptyList());
	}

	/** 桩③：名单类型查询，返回黑名单检查规则编号 */
	private RcListTypeEO stubListType(String ruleId) {
		RcListTypeEO record = new RcListTypeEO();
		record.setListType("BL01");
		record.setListTypeDesc("制裁名单");
		record.setRuleId(ruleId);
		record.setCreateTimestamp("2025-06-01-00.00.00");
		record.setLastUpdTimestamp("2026-06-01-00.00.00");
		lenient().when(rcListTypeBcc.findByPrimaryKey("BL01")).thenReturn(record);
		return record;
	}

	/** 桩④：名单限制规则查询（子步骤7、15 共用同一返回） */
	private RcRuleTypeEO stubRuleType(ResOperateFlag resOperateFlag, ResBranchRange resBranchRange, DealFlow dealFlow) {
		RcRuleTypeEO record = new RcRuleTypeEO();
		record.setRuleId("RULE001");
		record.setResOperateFlag(resOperateFlag);
		record.setResBranchRange(resBranchRange);
		record.setCardMedium("DCT");
		record.setDealFlow(dealFlow);
		record.setCreateTimestamp("2025-06-01-00.00.00");
		record.setLastUpdTimestamp("2026-06-01-00.00.00");
		lenient().when(rcRuleTypeBcc.findByPrimaryKey("RULE001")).thenReturn(record);
		return record;
	}

	/** 桩⑤：名单检查范围查询（七要素组合），返回事件类型 E0001 记录 */
	private void stubCheckRange() {
		RcListCheckRangeEO record = new RcListCheckRangeEO();
		record.setSeqNo("CR0001");
		record.setEventType("E0001");
		record.setCreateTimestamp("2025-06-01-00.00.00");
		record.setLastUpdTimestamp("2026-06-01-00.00.00");
		lenient().when(rcListCheckRangeBcc.findByEo(argThat((RcListCheckRangeEO eo) -> eo != null
				&& "E0001".equals(eo.getEventType())
				&& TranType.VALUE_4308 == eo.getTranType()
				&& SourceType.MT == eo.getSourceType()
				&& "DEP0001".equals(eo.getProgramId())
				&& "SVC001".equals(eo.getServiceCode())
				&& "0100".equals(eo.getMessageType())
				&& "100001".equals(eo.getMessageCode())))).thenReturn(Collections.singletonList(record));
	}

	/** 桩⑥：名单不检查范围查询（七要素组合），返回给定列表 */
	private void stubNotCheckRange(List<RcListNotCheckRangeEO> result) {
		lenient().when(rcListNotCheckRangeBcc.findByEo(argThat((RcListNotCheckRangeEO eo) -> eo != null
				&& TranType.VALUE_4308 == eo.getTranType()
				&& SourceType.MT == eo.getSourceType()
				&& "DEP0001".equals(eo.getProgramId())
				&& "SVC001".equals(eo.getServiceCode())
				&& "0100".equals(eo.getMessageType())
				&& "100001".equals(eo.getMessageCode())
				&& "E0001".equals(eo.getEventType())))).thenReturn(result);
	}

	/** 桩⑥（非空）：名单不检查范围命中记录 */
	private void stubNotCheckRangeHit() {
		RcListNotCheckRangeEO record = new RcListNotCheckRangeEO();
		record.setSeqNo("NCR0001");
		record.setListType("BL01");
		record.setRuleId("RULE001");
		record.setEventType("E0001");
		record.setTranType(TranType.VALUE_4308);
		record.setSourceType(SourceType.MT);
		record.setProgramId("DEP0001");
		record.setServiceCode("SVC001");
		record.setMessageType("0100");
		record.setMessageCode("100001");
		record.setCreateTimestamp("2025-06-01-00.00.00");
		record.setLastUpdTimestamp("2026-06-01-00.00.00");
		stubNotCheckRange(Collections.singletonList(record));
	}

	/** 桩⑦：账户信息查询（按账号），返回给定列表 */
	private void stubAcct(List<RbBusAcctEO> result) {
		lenient().when(rbBusAcctBcc.findByEo(argThat((RbBusAcctEO eo) -> eo != null
				&& "20000123456789".equals(eo.getBaseAcctNo())))).thenReturn(result);
	}

	/** 桩⑦（命中）：账户开立行行号等于交易机构 351155 */
	private void stubAcctHit() {
		RbBusAcctEO record = new RbBusAcctEO();
		record.setBaseAcctNo("20000123456789");
		record.setAcctBranch(AcctBranch.VALUE_351155);
		stubAcct(Collections.singletonList(record));
	}

	/** 断言提前返回"通过"：步骤成功、无错误、无处理方式 */
	private void assertPass(ST001OutputBO result) {
		assertTrue(result.isSucceed());
		assertNull(result.getErrorCode());
		assertNull(result.getErrorMessage());
		assertEquals("通过", result.getCheckResult());
		assertNull(result.getDealFlow());
	}

	/** 断言全链命中：步骤成功、无错误、检查结论与处理方式符合预期 */
	private void assertHit(ST001OutputBO result, String checkResult, DealFlow dealFlow) {
		assertTrue(result.isSucceed());
		assertNull(result.getErrorCode());
		assertNull(result.getErrorMessage());
		assertEquals(checkResult, result.getCheckResult());
		assertEquals(dealFlow, result.getDealFlow());
	}

	// ST001-TC001：全链命中，黑名单按证件号码匹配，处理方式为拒绝（子步骤16a）
	@Test
	public void testST001T01() {
		stubServiceDefine("A", "Y");
		stubBlacklist("91140000MA0GW2188X", "BL0000001", "02", "2026-01-15-00.00.00");
		stubListType("RULE001");
		stubRuleType(ResOperateFlag.E, ResBranchRange.B, DealFlow.B);
		stubCheckRange();
		stubNotCheckRange(Collections.emptyList());
		stubAcctHit();

		ST001OutputBO result = st001Pbc.execute(buildBaseInput());

		assertHit(result, "拒绝", DealFlow.B);
	}

	// ST001-TC002：全链命中，黑名单按客户号匹配，处理方式为授权（子步骤16b）
	@Test
	public void testST001T02() {
		stubServiceDefine("A", "Y");
		stubBlacklist("C1000001", "BL0000002", "01", "2026-02-10-00.00.00");
		stubListType("RULE001");
		stubRuleType(ResOperateFlag.E, ResBranchRange.B, DealFlow.A);
		stubCheckRange();
		stubNotCheckRange(Collections.emptyList());
		stubAcctHit();

		ST001InputBO input = buildBaseInput();
		input.setClientNo("C1000001");
		ST001OutputBO result = st001Pbc.execute(input);

		assertHit(result, "授权", DealFlow.A);
	}

	// ST001-TC003：全链命中，黑名单按账号匹配，处理方式为提醒（子步骤16c）
	@Test
	public void testST001T03() {
		stubServiceDefine("A", "Y");
		stubBlacklist("20000123456789", "BL0000003", "03", "2026-03-05-00.00.00");
		stubListType("RULE001");
		stubRuleType(ResOperateFlag.E, ResBranchRange.B, DealFlow.D);
		stubCheckRange();
		stubNotCheckRange(Collections.emptyList());
		stubAcctHit();

		ST001OutputBO result = st001Pbc.execute(buildBaseInput());

		assertHit(result, "提醒", DealFlow.D);
	}

	// ST001-TC004：服务定义存在记录、状态生效，但黑名单检查标志=N，子步骤2不跳转
	@Test
	public void testST001T04() {
		stubServiceDefine("A", "N");

		ST001OutputBO result = st001Pbc.execute(buildBaseInput());

		assertPass(result);
	}

	// ST001-TC005：服务定义存在记录、检查标志=Y，但服务状态=E 非生效，子步骤2不跳转
	@Test
	public void testST001T05() {
		stubServiceDefine("E", "Y");

		ST001OutputBO result = st001Pbc.execute(buildBaseInput());

		assertPass(result);
	}

	// ST001-TC006：核心服务定义表无记录（空列表边界），子步骤2不跳转
	@Test
	public void testST001T06() {
		stubServiceDefineEmpty();

		ST001OutputBO result = st001Pbc.execute(buildBaseInput());

		assertPass(result);
	}

	// ST001-TC007：服务定义满足 A+Y 跳转后，名单信息表无生效记录（空列表边界），子步骤4不跳转
	@Test
	public void testST001T07() {
		stubServiceDefine("A", "Y");
		stubBlacklistEmpty("91140000MA0GW2188X");

		ST001OutputBO result = st001Pbc.execute(buildBaseInput());

		assertPass(result);
	}

	// ST001-TC008：名单类型表中该名单类型的黑名单检查规则编号为空，子步骤6不跳转
	@Test
	public void testST001T08() {
		stubServiceDefine("A", "Y");
		stubBlacklist("91140000MA0GW2188X", "BL0000001", "02", "2026-01-15-00.00.00");
		stubListType(null);

		ST001OutputBO result = st001Pbc.execute(buildBaseInput());

		assertPass(result);
	}

	// ST001-TC009：名单限制规则的黑名单限制操作标识为 C-控制（非 E-异常/检查类），子步骤8不跳转
	@Test
	public void testST001T09() {
		stubServiceDefine("A", "Y");
		stubBlacklist("91140000MA0GW2188X", "BL0000001", "02", "2026-01-15-00.00.00");
		stubListType("RULE001");
		stubRuleType(ResOperateFlag.C, ResBranchRange.B, DealFlow.B);

		ST001OutputBO result = st001Pbc.execute(buildBaseInput());

		assertPass(result);
	}

	// ST001-TC010：交易命中名单不检查范围（非空），子步骤11提前返回通过，不再检查介质/机构
	@Test
	public void testST001T10() {
		stubServiceDefine("A", "Y");
		stubBlacklist("91140000MA0GW2188X", "BL0000001", "02", "2026-01-15-00.00.00");
		stubListType("RULE001");
		stubRuleType(ResOperateFlag.E, ResBranchRange.B, DealFlow.B);
		stubCheckRange();
		stubNotCheckRangeHit();

		ST001OutputBO result = st001Pbc.execute(buildBaseInput());

		assertPass(result);
	}

	// ST001-TC011：上送凭证种类（存折 PBK）不在名单限制规则介质范围（DCT）内，子步骤12提前返回通过
	@Test
	public void testST001T11() {
		stubServiceDefine("A", "Y");
		stubBlacklist("91140000MA0GW2188X", "BL0000001", "02", "2026-01-15-00.00.00");
		stubListType("RULE001");
		stubRuleType(ResOperateFlag.E, ResBranchRange.B, DealFlow.B);
		stubCheckRange();
		stubNotCheckRange(Collections.emptyList());

		ST001InputBO input = buildBaseInput();
		input.setDocClass(DocClass.PBK);
		ST001OutputBO result = st001Pbc.execute(input);

		assertPass(result);
	}

	// ST001-TC012：名单限制规则限制机构范围=A-所有机构（非 B-下级机构），子步骤14提前返回通过
	@Test
	public void testST001T12() {
		stubServiceDefine("A", "Y");
		stubBlacklist("91140000MA0GW2188X", "BL0000001", "02", "2026-01-15-00.00.00");
		stubListType("RULE001");
		stubRuleType(ResOperateFlag.E, ResBranchRange.A, DealFlow.B);
		stubCheckRange();
		stubNotCheckRange(Collections.emptyList());
		stubAcctHit();

		ST001OutputBO result = st001Pbc.execute(buildBaseInput());

		assertPass(result);
	}

	// ST001-TC013：账号在账户信息表无记录（空列表边界），账户开立行行号缺失，子步骤14条件不成立提前返回通过
	@Test
	public void testST001T13() {
		stubServiceDefine("A", "Y");
		stubBlacklist("91140000MA0GW2188X", "BL0000001", "02", "2026-01-15-00.00.00");
		stubListType("RULE001");
		stubRuleType(ResOperateFlag.E, ResBranchRange.B, DealFlow.B);
		stubCheckRange();
		stubNotCheckRange(Collections.emptyList());
		stubAcct(Collections.emptyList());

		ST001OutputBO result = st001Pbc.execute(buildBaseInput());

		assertPass(result);
	}
}
