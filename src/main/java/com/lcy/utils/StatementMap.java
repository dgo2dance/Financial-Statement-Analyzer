package com.lcy.utils;

import java.util.HashMap;
import java.util.Map;

public class StatementMap {
    public static Map<String, String> getBalanceSheetMap() {
        Map<String, String> balanceSheetMap = new HashMap<>();
        balanceSheetMap.put("年份", "setYear");
        balanceSheetMap.put("股票代码", "setStockCode");
        balanceSheetMap.put("货币资金", "setCashAndBankBalances");
        balanceSheetMap.put("结算备付金", "setSettlementReserveFund");
        balanceSheetMap.put("拆出资金", "setLendingsToBanksAndOtherFinancialInstitutions");
        balanceSheetMap.put("以公允价值计量且其变动计入当期损益的金融资产", "setFinancialAssetsHeldForTradingA");
        balanceSheetMap.put("交易性金融资产", "setFinancialAssetsHeldForTradingB");
        balanceSheetMap.put("衍生金融资产", "setFinancialDerivativeAssets");
        balanceSheetMap.put("[^\\u4e00-\\u9fa5]*应收票据", "setNotesReceivable");
        balanceSheetMap.put("[^\\u4e00-\\u9fa5]*应收账款", "setAccountsReceivable");
        balanceSheetMap.put("预付款项", "setPrepayments");
        balanceSheetMap.put("应收保费", "setReceivablePremium");
        balanceSheetMap.put("应收分保账款", "setAccountsReceivablereinsurance");
        balanceSheetMap.put("应收分保合同准备金", "setReinsuranceContractReserve");
        balanceSheetMap.put("其他应收款", "setOtherReceivables");
        balanceSheetMap.put("应收利息", "setInterestReceivables");
        balanceSheetMap.put("应收股利", "setDividendReceivables");
        balanceSheetMap.put("买入返售金融资产", "setBuyingBackTheSaleOfFinacialAssets");
        balanceSheetMap.put("存货", "setInventories");
        balanceSheetMap.put("一年内到期的非流动资产", "setNonCurrentAssets");
        balanceSheetMap.put("其他流动资产", "setOtherCurrentAssets");
        balanceSheetMap.put("流动资产合计", "setTotalCurrentAssets");
        balanceSheetMap.put("发放贷款[\\u4E00-\\u9FA5]垫款", "setLoansAndAdvances");
        balanceSheetMap.put("可供出售金融资产", "setAvailableForSaleFinancialAssets");
        balanceSheetMap.put("持有至到期投资", "setHeldToMaturityInvestments");
        balanceSheetMap.put("长期应收款", "setLongTermReceivables");
        balanceSheetMap.put("长期股权投资", "setLongTermEquityInvestment");
        balanceSheetMap.put("投资性房地产", "setInvenstmentProperty");
        balanceSheetMap.put("固定资产", "setFixedAssets");
        balanceSheetMap.put("工程物资", "setConstructionMaterials");
        balanceSheetMap.put("在建工程", "setConstructionInProgress");
        balanceSheetMap.put("生产性生物资产", "setProductionOfBiologicalAssets");
        balanceSheetMap.put("油气资产", "setOilAndGasAssets");
        balanceSheetMap.put("无形资产", "setIntangibleAssets");
        balanceSheetMap.put("开发支出", "setDevelopmentExpenditure");
        balanceSheetMap.put("商誉", "setGoodWill");
        balanceSheetMap.put("长期待摊费用", "setLongTermDeferedExpense");
        balanceSheetMap.put("递延所得税资产", "setDeferredIncomeTaxAssets");
        balanceSheetMap.put("其他非流动资产", "setOtherNonCurrentAssets");
        balanceSheetMap.put("非流动资产合计", "setTotalNonCurrentAssets");
        balanceSheetMap.put("资产总计", "setTotalAssets");
        balanceSheetMap.put("短期借款", "setShortTermBorrowings");
        balanceSheetMap.put("向中央银行借款", "setBorrowingFromTheCentralBank");
        balanceSheetMap.put("吸收存款及同业存放", "setAbsorptionOfDepositsAndInterbankDeposits");
        balanceSheetMap.put("拆入资金", "setLoansFromOtherBanks");
        balanceSheetMap.put("交易型金融负债", "setFinancialLiabilitiesHeldForTradingA");
        balanceSheetMap.put("以公允价值计量且其变动计入当期损益的金融负债", "setFinancialLiabilitiesHeldForTradingB");
        balanceSheetMap.put("衍生金融负债", "setFinancialDerivativeLiabilities");
        balanceSheetMap.put("应付票据", "setBillsPayable");
        balanceSheetMap.put("应付账款", "setAccountsPayable");
        balanceSheetMap.put("预收款项", "setAccountReceivedInAdvance");
        balanceSheetMap.put("卖出回购金融资产款", "setFinancialAssetsSoldForRepurchase");
        balanceSheetMap.put("应付手续费及佣金", "setHandlingFeeAndCommission");
        balanceSheetMap.put("应付职工薪酬", "setEmployeeBenefitsPayable");
        balanceSheetMap.put("应交税费", "setTaxesPayable");
        balanceSheetMap.put("其他应付款", "setOtherAccountPayable");
        balanceSheetMap.put("应付利息", "setInterestPayable");
        balanceSheetMap.put("应付股利", "setDiveidendPayable");
        balanceSheetMap.put("应付分保账款", "setAccountsPayableReinsurance");
        balanceSheetMap.put("保险合同准备金", "setReserveFundForInsuranceContracts");
        balanceSheetMap.put("代理买卖证券款", "setActingSaleOfSecurities");
        balanceSheetMap.put("代理承销证券款", "setActingUnderwritingSecurities");
        balanceSheetMap.put("一年内到期的非流动负债", "setNonCurrentLiabilitiesWithinOneYear");
        balanceSheetMap.put("其他流动负债", "setOtherCurrentLiabilities");
        balanceSheetMap.put("流动负债合计", "setTotalCurrentLiabilities");
        balanceSheetMap.put("长期借款", "setLongTermLoan");
        balanceSheetMap.put("应付债券", "setBondPayable");
        balanceSheetMap.put("长期应付款", "setLongTermAccountPayable");
        balanceSheetMap.put("预计负债", "setEstimatedLiability");
        balanceSheetMap.put("递延收益", "setDeferredIncome");
        balanceSheetMap.put("递延所得税负债", "setDeferredTaxLiabilities");
        balanceSheetMap.put("其他非流动负债", "setOtherNonCurrentLiabilities");
        balanceSheetMap.put("非流动负债合计", "setTotalNonCurrentLiabilities");
        balanceSheetMap.put("负债合计", "setTotalliabilities");
        balanceSheetMap.put("[\\u4E00-\\u9FA5]*股本[^\\u4E00-\\u9FA5]*", "setShareCapital");
        balanceSheetMap.put("资本公积", "setCapitalReserve");
        balanceSheetMap.put("专项储备", "setSpecialReserve");
        balanceSheetMap.put("盈余公积", "setSurplusReserve");
        balanceSheetMap.put("一般风险准备", "setGeneralRiskPreparation");
        balanceSheetMap.put("未分配利润", "setUndistributedProfit");
        balanceSheetMap.put("归属于母公司所有者权益[^0-9,.]{0,15}", "setTotalOwnersEquityAttributableToOwnerOfTheCompany");
        balanceSheetMap.put("少数股东权益", "setMinorityEquity");
        balanceSheetMap.put("所有者权益\\S{0,10}合计", "setTotalOwnersEquity");
        balanceSheetMap.put("负债和所有者权益\\S{0,10}总计", "setTotalLiabilitiesAndOwnersEqutiy");
        return balanceSheetMap;
    }

    public static Map<String, String> getCashFlowStatementMap() {
        Map<String, String> cashFlowStatementMap = new HashMap<>();
        cashFlowStatementMap.put("年份", "setYear");
        cashFlowStatementMap.put("股票代码", "setStockCode");
        cashFlowStatementMap.put("销售商品、提供劳务收到的现金", "setCashReceivedFromSaleOfGoodsOrRenderingOfServices");
        cashFlowStatementMap.put("收到的税费返还", "setReceiptsOfTaxRefunds");
        cashFlowStatementMap.put("收到其他与经营活动有关的现金", "setOtherCashreceiptsRelatingToOperatingActivities");
        cashFlowStatementMap.put("经营活动现金流入小计", "setSubTotalOfCashInflowsFromOperatingActivities");
        cashFlowStatementMap.put("购买商品、接受劳务支付的现金", "setCashPaidFoGoodsAndServices");
        cashFlowStatementMap.put("支付给职工[\\u4E00-\\u9FA5]{0,1}及为职工支付的现金", "setCashPaidToAndOnBehalfOfEmployees");
        cashFlowStatementMap.put("支付的各项税费", "setPaymentsOfVariousTypesOfTaxes");
        cashFlowStatementMap.put("支付其他与经营活动有关的现金", "setOtherCashPaymentsRelatingToOperatingActivities");
        cashFlowStatementMap.put("经营活动现金流出小计", "setSubTotalOfCashOutflowsFromOperatingActivities");
        cashFlowStatementMap.put("经营活动产生的现金流量净额", "setNetCashFlowsFromOperatingActivities");
        cashFlowStatementMap.put("收回投资收到的现金", "setCashReceiptsFromRecoveryOfInvestments");
        cashFlowStatementMap.put("取得投资收益收到的现金", "setCashReceiptsFromInvestmentIncome");
        cashFlowStatementMap.put("处置固定资产、无形资产和其他长[\\s\\S]{5,15}",
                "setNetCashReceFromDisposalsOfFixedAIntangibleAAOLongTermA");
        cashFlowStatementMap.put("处置子公司及其他营业单位收到的现金净额", "setNetCashReceFromDisposalsOfSubsidiariesAOBusinessUnits");
        cashFlowStatementMap.put("收到其他与投资活动有关的现金", "setOtherCashReceiptsRelatingToInvestingActivities");
        cashFlowStatementMap.put("投资活动现金流入小计", "setSubTotalOfCashInflowsFromInvestingActivities");
        cashFlowStatementMap.put("购建固定资产、无形资产和其他长[\\s\\S]{5,12}",
                "setCashPaymentsToAcquOrConstructFixedAsIntangibleAAOLongTermA");
        cashFlowStatementMap.put("投资支付的现金", "setCashPaidToAcquireInvestments");
        cashFlowStatementMap.put("取得子公司及其他营业单位支付的现金净额", "setNetCashPaidToAquireSubsidiariesAndOtherBusinessUnits");
        cashFlowStatementMap.put("支付其他与投资活动有关的现金", "setOtherCashPaymentsRelatingToInvestingActivities");
        cashFlowStatementMap.put("投资活动现金流出小计", "setSubTotalOfCashOutflowsFromInvestingActivities");
        cashFlowStatementMap.put("投资活动产生的现金流量净额", "setNetCashFlowsFromInvestingActivities");
        cashFlowStatementMap.put("吸收投资收到的现金", "setCashReceiptsFromCapitalContributions");
        cashFlowStatementMap.put("子公司吸收少数股东投资收到的现金", "setCashReceiptsFromCapitalContributionsFromMinorOwnerOfSubsidi");
        cashFlowStatementMap.put("取得借款收到的现金", "setCashReceiptsFromBorrowings");
        cashFlowStatementMap.put("收到其他与筹资活动有关的现金", "setOtherCashReceiptsRelatingToFinancingActivities");
        cashFlowStatementMap.put("筹资活动现金流入小计", "setSubTotalOfCashInflowsFromFinancingActivities");
        cashFlowStatementMap.put("偿还债务支付的现金", "setCashRepaymentsOfBorrowings");
        cashFlowStatementMap.put("分配股利、利润或偿付利息支[\\s\\S]{3,7}", "setCashPaymentsForDistributionOfDiviOrProfiOrSettlOfIntExpen");
        cashFlowStatementMap.put("子公司支付给少数股东的[\\s\\S]{3,10}", "setDividendsAndProfitsPaidBySubsidiariesToMinorityShareholders");
        cashFlowStatementMap.put("支付其他与筹资活动有关的现金", "setOtherCashPaymentsRelatingToFinancingActivities");
        cashFlowStatementMap.put("筹资活动现金流出小计", "setSubTotalOfCashOutflowsFromFinancingActivities");
        cashFlowStatementMap.put("筹资活动产生的现金流量净额", "setNetCashFlowsFromFinancingActivities");
        cashFlowStatementMap.put("汇率变动对现金[\\s\\S]{3,14}", "setEffectOfForeignExchangeRateChangesOnCashandCashEquivalents");
        cashFlowStatementMap.put("现金及现金等价物净增加额", "setNetIncreaseinCashandCashEquivalents");
        cashFlowStatementMap.put("期初现金及现金等价物余额", "setOpeningBalanceofCashAndCashEquivalents");
        cashFlowStatementMap.put("期末现金及现金等价物余额", "setClosingBalanceofCashandCashEquivalents");
        return cashFlowStatementMap;
    }

    public static Map<String, String> getIncomeStatementMap() {
        Map<String, String> incomeStatementMap = new HashMap<>();
        incomeStatementMap.put("年份", "setYear");
        incomeStatementMap.put("股票代码", "setStockCode");
        incomeStatementMap.put("营业总收入", "setTotalOperatingIncome");
        incomeStatementMap.put("营业收入", "setOperatingIncome");
        incomeStatementMap.put("营业总成本", "setTotalOperatingCosts");
        incomeStatementMap.put("营业成本", "setOperatingCosts");
        incomeStatementMap.put("税金及附加", "setBusinessTaxesAndSurcharges");
        incomeStatementMap.put("销售费用", "setSellingExpenses");
        incomeStatementMap.put("管理费用", "setAdministrativeExpenses");
        incomeStatementMap.put("研发费用", "setResearchAndDevelopmentExpenses");
        incomeStatementMap.put("财务费用", "setFinancialExpenses");
        incomeStatementMap.put("资产减值损失", "setImpairmentLoss");
        incomeStatementMap.put("营业利润", "setOperatingProfit");
        incomeStatementMap.put("营业外收入", "setNonOperatingIncome");
        incomeStatementMap.put("营业外支出", "setNonOperatingExpenses");
        incomeStatementMap.put("利润总额", "setTotalProfit");
        incomeStatementMap.put("所得税费用", "setIncomeTaxExpenses");
        incomeStatementMap.put("净利润", "setNetProfit");
        incomeStatementMap.put("持续经营净利润", "setNetProfitOnContinuousOperation");
        incomeStatementMap.put("终止经营净利润", "setNetLossOnTerminatedOperation");
        incomeStatementMap.put("归属于母公司[\\u4E00-\\u9FA5]{2,3}的净利润[^0-9,.]{0,17}",
                "setProfitOrOossAttributableToMinorityShareholders");
        incomeStatementMap.put("少数股东损益", "setNetProfitAttributableToOwnersOfParentCompany");
        incomeStatementMap.put("其他综合收益的税后净额", "setOtherComprehensiveIncomeNOT");
        incomeStatementMap.put("归属于{0,1}母公司所有者的其他综合收[\\s\\S]{0,5}税后净额[^0-9,.]{0,5}",
                "setOtherComprehensiveIncomeATOwnersOfTheCompanyNOT");
        incomeStatementMap.put("归属于少数股东的其他综合收益的税后净额", "setOtherComprehensiveIncomeATMinorityInterestsNOT");
        incomeStatementMap.put("综合收益总额", "setTotalComprehensiveIncome");
        incomeStatementMap.put("归属于母公司所有者的综合收益总额", "setTotalComprehensiveIncomeATOwnersOfTheParentCompany");
        incomeStatementMap.put("归属于少数股东的综合收益总额", "setTotalComprehensiveIncomeATMinorityShareholders");
        incomeStatementMap.put("基本每股收益", "setBasicEarningsPerShare");
        incomeStatementMap.put("稀释每股收益", "setDilutedEarningsPerShare");
        return incomeStatementMap;
    }
}
