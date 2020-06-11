package com.lcy.test;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.lcy.pojo.BalanceSheet;
import com.lcy.pojo.CashFlowStatement;
import com.lcy.pojo.IncomeStatement;
import com.lcy.utils.AnnouncementDownloader;
import com.lcy.utils.FinancialStatementAnalyer;
import com.lcy.utils.MyFormatUtils;
import com.lcy.utils.MyPDFReader;
import com.lcy.utils.MyRegUtils;

/**
 * 单元测试类
 * 
 * @author Tsilatipac
 *
 */
@SuppressWarnings("all")
public class FunctionUnitTest {

	// @Test
	public void testDownload() {
		List<String> codes = new ArrayList<String>();
		codes.add("600690");
		codes.add("600519");
		codes.add("000651");
		codes.add("002027");
		codes.add("000333");
		codes.add("603288");
		codes.add("002027");
		codes.add("600887");
		AnnouncementDownloader.downloadByStockCode(codes);
	}

	@Test
	public void testPDFReader() {
		try {

			int count = 0;

			MyPDFReader reader = new MyPDFReader("docs/贵州茅台/2015年年度报告.PDF");

			System.out.println("资产负债表");
			BalanceSheet balanceSheet = reader.getBalanceSheetFromPdf();
			Class<BalanceSheet> bs = BalanceSheet.class;
			Method[] methods1 = bs.getDeclaredMethods();
			for (Method method : methods1) {
				if (method.getName().startsWith("get") && method.invoke(balanceSheet, null) != null) {
					System.out.print(method.getName() + "\t");
					System.out.println(method.invoke(balanceSheet, null));
					count++;
				}
			}

			System.out.println("利润表");
			IncomeStatement incomeStatement = reader.getIncomeStatementFromPdf();
			Class<IncomeStatement> incs = IncomeStatement.class;
			Method[] methods2 = incs.getDeclaredMethods();
			for (Method method : methods2) {
				if (method.getName().startsWith("get") && method.invoke(incomeStatement, null) != null) {
					System.out.print(method.getName() + "\t");
					System.out.println(method.invoke(incomeStatement, null));
					count++;
				}
			}

			System.out.println("现金流量表");
			CashFlowStatement cashFlowStatement = reader.getCashFlowStatementFromPdf();
			Class<CashFlowStatement> cfs = CashFlowStatement.class;
			Method[] methods3 = cfs.getDeclaredMethods();
			for (Method method : methods3) {
				if (method.getName().startsWith("get") && method.invoke(cashFlowStatement, null) != null) {
					System.out.print(method.getName() + "\t");
					System.out.println(method.invoke(cashFlowStatement, null));
					count++;
				}
			}

			FinancialStatementAnalyer analyer = new FinancialStatementAnalyer();
			analyer.setCashFlowStatement(cashFlowStatement);
			analyer.setBalanceSheet(balanceSheet);
			analyer.setIncomeStatement(incomeStatement);
			System.out.println(analyer.getNetDebtFinancing());
			System.out.println(analyer.getCashSelfSufficiencyRate());

			System.out.println("Fount " + count + " items");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// @Test
	public void subtest() {
		Class<CashFlowStatement> cfs = CashFlowStatement.class;
		Method[] methods = cfs.getDeclaredMethods();
		for (Method method : methods) {
			System.out.println(method.getName());
		}
	}

	// @Test
	public void subtest1() {
		MyPDFReader reader = new MyPDFReader("docs/贵州茅台/2019年年度报告.PDF");
		System.out.println(reader.getCashFlowStatementText());
		MyRegUtils.parseOne("分配股利、利润或偿付利息支付的现金.+", reader.getCashFlowStatementText());
	}

	 @Test
	public void subtest2() {
		String a = "3,1,1.6";
		Double double1 = MyFormatUtils.parseDouble(a);
		System.out.println(double1);
	}

	long start;

	@Before
	public void before() {
		start = System.currentTimeMillis();
	}

	@After
	public void after() {
		System.out.println("Complete in " + (System.currentTimeMillis() - start) + " ms");
	}

}