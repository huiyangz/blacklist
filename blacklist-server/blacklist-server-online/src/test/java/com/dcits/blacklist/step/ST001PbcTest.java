package com.dcits.blacklist.step;

import com.dcits.blacklist.enums.AcctBranch;
import com.dcits.blacklist.enums.DocumentType;
import com.dcits.blacklist.enums.ResBranchRange;
import com.dcits.blacklist.enums.SourceType;
import com.dcits.blacklist.enums.TranType;
import com.dcits.blacklist.facade.bo.ST001InputBO;
import com.dcits.blacklist.facade.bo.ST001OutputBO;
import com.dcits.blacklist.facade.components.IFmServiceDefineBcc;
import com.dcits.blacklist.facade.eo.FmServiceDefineEO;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.lenient;

/**
 * ST001 检查黑名单 步骤单元测试。
 * 用例来源：outputs/测试用例.md ST001-TC001~TC003（覆盖子步骤1-2可交付路径）；
 * testST001T04 为代码审核反馈（outputs/review-feedback.md 必须修复项 R1）补充：
 * 子步骤2成立分支（存在"A-生效且Y-是"记录）按交付边界显式报错，不以“通过”默认返回掩盖检查缺失。
 */
@ExtendWith(MockitoExtension.class)
public class ST001PbcTest {

	@Mock
	private IFmServiceDefineBcc fmServiceDefineBcc;

	@InjectMocks
	private ST001Pbc st001Pbc;

	/**
	 * 构造与 ST001-TC001 完全相同的输入：必填字段赋确定值，非必填 docClass、baseAcctNo、clientNo 不赋值。
	 */
	private ST001InputBO buildInput() {
		ST001InputBO input = new ST001InputBO();
		input.setMessageCode("MC0001");
		input.setMessageType("MT0001");
		input.setServiceCode("SVR0001");
		input.setProgramId("PRG0001");
		input.setEventType("ET0001");
		input.setTranBranch("351001");
		input.setDocumentId("140105199001011234");
		input.setCardMedium("1");
		input.setBlacklistCheckFlag("Y");
		input.setServiceStatus("A");
		input.setDocumentType(DocumentType.VALUE_110001);
		input.setAcctBranch(AcctBranch.VALUE_351155);
		input.setSourceType(SourceType.AC);
		input.setTranType(TranType.AC01);
		input.setResBranchRange(ResBranchRange.B);
		return input;
	}

	/**
	 * 构造服务信息记录：messageCode=MC0001、messageType=MT0001，按入参赋 服务状态 与 黑名单检查标志，其余字段不赋值。
	 */
	private FmServiceDefineEO buildRecord(String serviceStatus, String blacklistCheckFlag) {
		FmServiceDefineEO record = new FmServiceDefineEO();
		record.setMessageCode("MC0001");
		record.setMessageType("MT0001");
		record.setServiceStatus(serviceStatus);
		record.setBlacklistCheckFlag(blacklistCheckFlag);
		return record;
	}

	/**
	 * 设桩 findByEo 返回指定[服务信息列表]，返回捕获查询 EO 的单元素数组（下标0为捕获到的查询条件）。
	 */
	private FmServiceDefineEO[] stubFindByEo(List<FmServiceDefineEO> serviceInfoList) {
		FmServiceDefineEO[] capturedQuery = new FmServiceDefineEO[1];
		lenient().when(fmServiceDefineBcc.findByEo(any(FmServiceDefineEO.class)))
				.thenAnswer(invocation -> {
					capturedQuery[0] = invocation.getArgument(0);
					return serviceInfoList;
				});
		return capturedQuery;
	}

	// 场景：接口服务未配置——核心服务定义表按接口服务代码+接口服务类型查询返回空列表，子步骤2无“A-生效且Y-是”记录，返回检查结果“通过”（succeed=true，错误字段与dealFlow均为null）
	@Test
	public void testST001T01() {
		FmServiceDefineEO[] capturedQuery = stubFindByEo(new ArrayList<>());

		ST001OutputBO result = st001Pbc.execute(buildInput());

		assertTrue(result.isSucceed());
		assertNull(result.getErrorCode());
		assertNull(result.getErrorMessage());
		assertNull(result.getDealFlow());
		assertEquals("MC0001", capturedQuery[0].getMessageCode());
		assertEquals("MT0001", capturedQuery[0].getMessageType());
	}

	// 场景：接口服务已配置但不检查黑名单——服务信息列表存在1条 serviceStatus=A 而 blacklistCheckFlag=N 的记录，条件合取不满足，返回检查结果“通过”
	@Test
	public void testST001T02() {
		List<FmServiceDefineEO> serviceInfoList = new ArrayList<>();
		serviceInfoList.add(buildRecord("A", "N"));
		FmServiceDefineEO[] capturedQuery = stubFindByEo(serviceInfoList);

		ST001OutputBO result = st001Pbc.execute(buildInput());

		assertTrue(result.isSucceed());
		assertNull(result.getErrorCode());
		assertNull(result.getErrorMessage());
		assertNull(result.getDealFlow());
		assertEquals("MC0001", capturedQuery[0].getMessageCode());
		assertEquals("MT0001", capturedQuery[0].getMessageType());
	}

	// 场景：多记录存在性判断且判定以表记录为准——服务信息列表含2条记录（C+Y、A+N），无任一记录同时满足A+Y；输入自带的 blacklistCheckFlag/serviceStatus 不参与判定，返回检查结果“通过”
	@Test
	public void testST001T03() {
		List<FmServiceDefineEO> serviceInfoList = new ArrayList<>();
		serviceInfoList.add(buildRecord("C", "Y"));
		serviceInfoList.add(buildRecord("A", "N"));
		FmServiceDefineEO[] capturedQuery = stubFindByEo(serviceInfoList);

		ST001OutputBO result = st001Pbc.execute(buildInput());

		assertTrue(result.isSucceed());
		assertNull(result.getErrorCode());
		assertNull(result.getErrorMessage());
		assertNull(result.getDealFlow());
		assertEquals("MC0001", capturedQuery[0].getMessageCode());
		assertEquals("MT0001", capturedQuery[0].getMessageType());
	}

	// 场景：接口服务允许黑名单检查——服务信息列表存在 serviceStatus=A 且 blacklistCheckFlag=Y 的记录，子步骤2成立分支因【名单信息表】等实体与业务定义缺失（交付边界）不可实现，显式抛出 UnsupportedOperationException 而非默认返回“通过”
	@Test
	public void testST001T04() {
		List<FmServiceDefineEO> serviceInfoList = new ArrayList<>();
		serviceInfoList.add(buildRecord("A", "Y"));
		stubFindByEo(serviceInfoList);

		UnsupportedOperationException ex = assertThrows(UnsupportedOperationException.class,
				() -> st001Pbc.execute(buildInput()));

		// 异常信息包含子步骤3-15缺失定位说明，排除其他来源的误抛
		assertTrue(ex.getMessage().contains("子步骤3-15"));
		assertTrue(ex.getMessage().contains("缺失"));
	}
}
