package tests;

import reports.TestNGListener;
import ie.curiositysoftware.testmodeller.TestModellerPath;
import ie.curiositysoftware.testmodeller.TestModellerSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import ie.curiositysoftware.allocation.dto.ResultMergeMethod;
import ie.curiositysoftware.allocation.dto.DataAllocationRow;
import reports.ExtentTestListener;
import ie.curiositysoftware.allocation.dto.DataAllocationResult;
import ie.curiositysoftware.allocation.engine.DataAllocation;
import utilities.testmodeller.TestModellerLogger;

//http://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/d0738e51-c526-4dc7-8478-630e9a1478dd
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 255, profileId = 100214)
public class reimbursementscenario4_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"2bf50e5e-0f6f-4cf0-9932-732323cd9c25","reimbursement scenario 4","reimbursement scenario 4 - Default Profile"})
    @TestModellerPath(guid = "2bf50e5e-0f6f-4cf0-9932-732323cd9c25")
    public void GoToUrlpositiveenterusernamepositiveenterpasswordClickLoginsuccessGoToUrlpositiveagentnameCl1()
    {
        
        pages.login _pageslogin = new pages.login(driver);
    TestModellerLogger.SetLastNodeGuid("854a1118-4615-4409-996b-51f957f4b121");
    _pageslogin.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("5f78d4ec-ef66-42ec-80d3-bff428d78f7b");
    _pageslogin.Enter_ctl00cPHlogin("admin");
    

    TestModellerLogger.SetLastNodeGuid("98e3f377-efb7-4010-8f3a-04d5a7749cae");
    _pageslogin.Enter_ctl00cPHpass("nomisma@test");
    

    TestModellerLogger.SetLastNodeGuid("0ac50b8f-4ab4-4855-a348-232e96ddfd82");
    _pageslogin.Click_Login();
    

pages.Agent_page _pagesAgent_page = new pages.Agent_page(driver);
    TestModellerLogger.SetLastNodeGuid("5ca4399f-c2c9-4907-89c2-1f3a8c74b5e9");
    _pagesAgent_page.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("d1774d2f-8a96-4065-b7ad-7564424df697");
    _pagesAgent_page.Enter_ctl00cPHFiltertxtAgentName("deepika");
    

    TestModellerLogger.SetLastNodeGuid("12624eac-97ad-4461-a189-3bdf32926acf");
    _pagesAgent_page.Click_Search();
    

    TestModellerLogger.SetLastNodeGuid("86d6d989-b955-473d-b918-1371760f1e7f");
    _pagesAgent_page.Click__Deepika_();
    

    TestModellerLogger.SetLastNodeGuid("fe49d2c8-15b6-4831-89b7-b3aa4fe86ec1");
    _pagesAgent_page.Switch_Tab();
    

pages.Business_navigation _pagesBusiness_navigation = new pages.Business_navigation(driver);
    TestModellerLogger.SetLastNodeGuid("e4687602-1649-458e-98d6-5fd251e617a7");
    _pagesBusiness_navigation.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("814387e0-8392-4488-9a17-4455bc12fd85");
    _pagesBusiness_navigation.Click_Businesses();

    TestModellerLogger.SetLastNodeGuid("cc3b282b-3edd-4a58-b6a6-be910ce651c0");
    _pagesBusiness_navigation.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("lexagen");
    

    TestModellerLogger.SetLastNodeGuid("74c7935f-a457-4a02-b25b-8bc76b81847f");
    _pagesBusiness_navigation.Click_Search_();
    

    TestModellerLogger.SetLastNodeGuid("dcf609fe-ada5-48c3-b7d1-905de85570d5");
    _pagesBusiness_navigation.Click__Lexagen_properties_private_limited();
    

    TestModellerLogger.SetLastNodeGuid("5b0e541d-261f-4d1e-a3a9-98333b95f672");
    _pagesBusiness_navigation.Switch_Tab();
    

pages.Add_expense_reimbursement _pagesAdd_expense_reimbursement = new pages.Add_expense_reimbursement(driver);
    TestModellerLogger.SetLastNodeGuid("b7e3ea26-cc72-4755-a32e-fecab46fe00a");
    _pagesAdd_expense_reimbursement.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("2d8409d1-9061-4b7e-9f7a-0b69c829eb3a");
    _pagesAdd_expense_reimbursement.Click_xPath_htmlbodyformmaindiv10div3div1div4divdiv2div1divdiv5divdivtabl();
    

    TestModellerLogger.SetLastNodeGuid("8e696d0b-99bc-40ca-82f4-b57e2a885795");
    _pagesAdd_expense_reimbursement.Select_ctl00cPHddlentryType("Expense");
    

    TestModellerLogger.SetLastNodeGuid("c187ef14-c6d3-46b0-871c-661e4b5a4fd9");
    _pagesAdd_expense_reimbursement.Enter_ctl00cPHrptrExpensectl00txtDate("30-04-2020");
    

    TestModellerLogger.SetLastNodeGuid("86b77b31-ced9-47b7-9667-7a56c21873c9");
    _pagesAdd_expense_reimbursement.Select_ctl00cPHrptrExpensectl00ddExpenseHead("Accountancy fee");
    

    TestModellerLogger.SetLastNodeGuid("171df228-6735-4fa6-bc12-c815ebe3f086");
    _pagesAdd_expense_reimbursement.Enter_ctl00cPHrptrExpensectl00txtDescription(driver, "abc");
    

    TestModellerLogger.SetLastNodeGuid("01d9cf91-0090-477d-8cdf-100b6664748b");
    _pagesAdd_expense_reimbursement.Enter_ctl00cPHrptrExpensectl00txtAmount("100");
    

    TestModellerLogger.SetLastNodeGuid("19eca6f4-98d1-420e-8411-c0a7535b3658");
    _pagesAdd_expense_reimbursement.Select_ctl00cPHrptrExpensectl00ddVATRate("STD 20%");
    

    TestModellerLogger.SetLastNodeGuid("d7f910de-29ab-4702-909b-ddbddbec174c");
    _pagesAdd_expense_reimbursement.Click__Save_();
    

pages.Expense_reimbursement _pagesExpense_reimbursement = new pages.Expense_reimbursement(driver);
//    TestModellerLogger.SetLastNodeGuid("ee1fe0ff-f180-45f6-8cbc-f11971fa11c3");
//    _pagesExpense_reimbursement.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("27db8869-ac7f-4ac7-8eee-e9e26082a5a8");
//    _pagesExpense_reimbursement.Click_Expenditure();
//    
//
//    TestModellerLogger.SetLastNodeGuid("5d6bf358-e1c3-4c35-8cb1-fe75cfbc8960");
//    _pagesExpense_reimbursement.Click_New_();
//    
//
//    TestModellerLogger.SetLastNodeGuid("473134d7-20c2-4815-9591-116c83e66fce");
//    _pagesExpense_reimbursement.Click_Expense_Reimbursement();
    

    }
}
//    @Test  (groups= {"98790063-7a40-4977-af5d-375507360e37","reimbursement scenario 4","reimbursement scenario 4 - Default Profile"},enabled=false)
//    @TestModellerPath(guid = "98790063-7a40-4977-af5d-375507360e37")
//    public void GoToUrlpositiveenterusernamepositiveenterpasswordClickLoginsuccessGoToUrlpositiveagentnameCl2()
//    {
//        
//        pages.login _pageslogin = new pages.login(driver);
//    TestModellerLogger.SetLastNodeGuid("854a1118-4615-4409-996b-51f957f4b121");
//    _pageslogin.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("5f78d4ec-ef66-42ec-80d3-bff428d78f7b");
//    _pageslogin.Enter_ctl00cPHlogin("admin");
//    
//
//    TestModellerLogger.SetLastNodeGuid("98e3f377-efb7-4010-8f3a-04d5a7749cae");
//    _pageslogin.Enter_ctl00cPHpass("Staging@admin#92");
//    
//
//    TestModellerLogger.SetLastNodeGuid("0ac50b8f-4ab4-4855-a348-232e96ddfd82");
//    _pageslogin.Click_Login();
//    
//
//pages.Agent_page _pagesAgent_page = new pages.Agent_page(driver);
//    TestModellerLogger.SetLastNodeGuid("5ca4399f-c2c9-4907-89c2-1f3a8c74b5e9");
//    _pagesAgent_page.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("d1774d2f-8a96-4065-b7ad-7564424df697");
//    _pagesAgent_page.Enter_ctl00cPHFiltertxtAgentName("deepika");
//    
//
//    TestModellerLogger.SetLastNodeGuid("12624eac-97ad-4461-a189-3bdf32926acf");
//    _pagesAgent_page.Click_Search();
//    
//
//    TestModellerLogger.SetLastNodeGuid("86d6d989-b955-473d-b918-1371760f1e7f");
//    _pagesAgent_page.Click__Deepika_();
//    
//
//    TestModellerLogger.SetLastNodeGuid("fe49d2c8-15b6-4831-89b7-b3aa4fe86ec1");
//    _pagesAgent_page.Switch_Tab();
//    
//
//pages.Business_navigation _pagesBusiness_navigation = new pages.Business_navigation(driver);
//    TestModellerLogger.SetLastNodeGuid("e4687602-1649-458e-98d6-5fd251e617a7");
//    _pagesBusiness_navigation.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("814387e0-8392-4488-9a17-4455bc12fd85");
//    _pagesBusiness_navigation.Click_Businesses();
//    
//
//    TestModellerLogger.SetLastNodeGuid("cc3b282b-3edd-4a58-b6a6-be910ce651c0");
//    _pagesBusiness_navigation.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("lexagen");
//    
//
//    TestModellerLogger.SetLastNodeGuid("74c7935f-a457-4a02-b25b-8bc76b81847f");
//    _pagesBusiness_navigation.Click_Search_();
//    
//
//    TestModellerLogger.SetLastNodeGuid("dcf609fe-ada5-48c3-b7d1-905de85570d5");
//    _pagesBusiness_navigation.Click__Lexagen_properties_private_limited();
//    
//
//    TestModellerLogger.SetLastNodeGuid("5b0e541d-261f-4d1e-a3a9-98333b95f672");
//    _pagesBusiness_navigation.Switch_Tab();
//    
//
//pages.Add_expense_reimbursement _pagesAdd_expense_reimbursement = new pages.Add_expense_reimbursement(driver);
//    TestModellerLogger.SetLastNodeGuid("b7e3ea26-cc72-4755-a32e-fecab46fe00a");
//    _pagesAdd_expense_reimbursement.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("2d8409d1-9061-4b7e-9f7a-0b69c829eb3a");
//    _pagesAdd_expense_reimbursement.Click_xPath_htmlbodyformmaindiv10div3div1div4divdiv2div1divdiv5divdivtabl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("8e696d0b-99bc-40ca-82f4-b57e2a885795");
//    _pagesAdd_expense_reimbursement.Select_ctl00cPHddlentryType("Expense");
//    
//
//    TestModellerLogger.SetLastNodeGuid("c187ef14-c6d3-46b0-871c-661e4b5a4fd9");
//    _pagesAdd_expense_reimbursement.Enter_ctl00cPHrptrExpensectl00txtDate("30-04-2020");
//    
//
//    TestModellerLogger.SetLastNodeGuid("86b77b31-ced9-47b7-9667-7a56c21873c9");
//    _pagesAdd_expense_reimbursement.Select_ctl00cPHrptrExpensectl00ddExpenseHead("Accountancy fee");
//    
//
//    TestModellerLogger.SetLastNodeGuid("171df228-6735-4fa6-bc12-c815ebe3f086");
//    _pagesAdd_expense_reimbursement.Enter_ctl00cPHrptrExpensectl00txtDescription(driver, "abc1");
//    
//
//    TestModellerLogger.SetLastNodeGuid("01d9cf91-0090-477d-8cdf-100b6664748b");
//    _pagesAdd_expense_reimbursement.Enter_ctl00cPHrptrExpensectl00txtAmount("100");
//    
//
//    TestModellerLogger.SetLastNodeGuid("19eca6f4-98d1-420e-8411-c0a7535b3658");
//    _pagesAdd_expense_reimbursement.Select_ctl00cPHrptrExpensectl00ddVATRate("ZERO");
//    
//
//    TestModellerLogger.SetLastNodeGuid("d7f910de-29ab-4702-909b-ddbddbec174c");
//    _pagesAdd_expense_reimbursement.Click__Save_();
//    
//
//pages.Expense_reimbursement _pagesExpense_reimbursement = new pages.Expense_reimbursement(driver);
//    TestModellerLogger.SetLastNodeGuid("ee1fe0ff-f180-45f6-8cbc-f11971fa11c3");
//    _pagesExpense_reimbursement.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("27db8869-ac7f-4ac7-8eee-e9e26082a5a8");
//    _pagesExpense_reimbursement.Click_Expenditure();
//    
//
//    TestModellerLogger.SetLastNodeGuid("5d6bf358-e1c3-4c35-8cb1-fe75cfbc8960");
//    _pagesExpense_reimbursement.Click_New_();
//    
//
//    TestModellerLogger.SetLastNodeGuid("473134d7-20c2-4815-9591-116c83e66fce");
//    _pagesExpense_reimbursement.Click_Expense_Reimbursement();
//    
//
//    }
//
//    @Test  (groups= {"a612d219-aacf-4ace-a454-51ef0a157ec8","reimbursement scenario 4","reimbursement scenario 4 - Default Profile"},enabled=false)
//    @TestModellerPath(guid = "a612d219-aacf-4ace-a454-51ef0a157ec8")
//    public void GoToUrlpositiveenterusernamepositiveenterpasswordClickLoginsuccessGoToUrlpositiveagentnameCl3()
//    {
//        
//        pages.login _pageslogin = new pages.login(driver);
//    TestModellerLogger.SetLastNodeGuid("854a1118-4615-4409-996b-51f957f4b121");
//    _pageslogin.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("5f78d4ec-ef66-42ec-80d3-bff428d78f7b");
//    _pageslogin.Enter_ctl00cPHlogin("admin");
//    
//
//    TestModellerLogger.SetLastNodeGuid("98e3f377-efb7-4010-8f3a-04d5a7749cae");
//    _pageslogin.Enter_ctl00cPHpass("Staging@admin#92");
//    
//
//    TestModellerLogger.SetLastNodeGuid("0ac50b8f-4ab4-4855-a348-232e96ddfd82");
//    _pageslogin.Click_Login();
//    
//
//pages.Agent_page _pagesAgent_page = new pages.Agent_page(driver);
//    TestModellerLogger.SetLastNodeGuid("5ca4399f-c2c9-4907-89c2-1f3a8c74b5e9");
//    _pagesAgent_page.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("d1774d2f-8a96-4065-b7ad-7564424df697");
//    _pagesAgent_page.Enter_ctl00cPHFiltertxtAgentName("deepika");
//    
//
//    TestModellerLogger.SetLastNodeGuid("12624eac-97ad-4461-a189-3bdf32926acf");
//    _pagesAgent_page.Click_Search();
//    
//
//    TestModellerLogger.SetLastNodeGuid("86d6d989-b955-473d-b918-1371760f1e7f");
//    _pagesAgent_page.Click__Deepika_();
//    
//
//    TestModellerLogger.SetLastNodeGuid("fe49d2c8-15b6-4831-89b7-b3aa4fe86ec1");
//    _pagesAgent_page.Switch_Tab();
//    
//
//pages.Business_navigation _pagesBusiness_navigation = new pages.Business_navigation(driver);
//    TestModellerLogger.SetLastNodeGuid("e4687602-1649-458e-98d6-5fd251e617a7");
//    _pagesBusiness_navigation.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("814387e0-8392-4488-9a17-4455bc12fd85");
//    _pagesBusiness_navigation.Click_Businesses();
//    
//
//    TestModellerLogger.SetLastNodeGuid("cc3b282b-3edd-4a58-b6a6-be910ce651c0");
//    _pagesBusiness_navigation.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("lexagen");
//    
//
//    TestModellerLogger.SetLastNodeGuid("74c7935f-a457-4a02-b25b-8bc76b81847f");
//    _pagesBusiness_navigation.Click_Search_();
//    
//
//    TestModellerLogger.SetLastNodeGuid("dcf609fe-ada5-48c3-b7d1-905de85570d5");
//    _pagesBusiness_navigation.Click__Lexagen_properties_private_limited();
//    
//
//    TestModellerLogger.SetLastNodeGuid("5b0e541d-261f-4d1e-a3a9-98333b95f672");
//    _pagesBusiness_navigation.Switch_Tab();
//    
//
//pages.Add_expense_reimbursement _pagesAdd_expense_reimbursement = new pages.Add_expense_reimbursement(driver);
//    TestModellerLogger.SetLastNodeGuid("b7e3ea26-cc72-4755-a32e-fecab46fe00a");
//    _pagesAdd_expense_reimbursement.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("2d8409d1-9061-4b7e-9f7a-0b69c829eb3a");
//    _pagesAdd_expense_reimbursement.Click_xPath_htmlbodyformmaindiv10div3div1div4divdiv2div1divdiv5divdivtabl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("8e696d0b-99bc-40ca-82f4-b57e2a885795");
//    _pagesAdd_expense_reimbursement.Select_ctl00cPHddlentryType("Expense");
//    
//
//    TestModellerLogger.SetLastNodeGuid("c187ef14-c6d3-46b0-871c-661e4b5a4fd9");
//    _pagesAdd_expense_reimbursement.Enter_ctl00cPHrptrExpensectl00txtDate("44061");
//    
//
//    TestModellerLogger.SetLastNodeGuid("86b77b31-ced9-47b7-9667-7a56c21873c9");
//    _pagesAdd_expense_reimbursement.Select_ctl00cPHrptrExpensectl00ddExpenseHead("Accountancy fee");
//    
//
//    TestModellerLogger.SetLastNodeGuid("171df228-6735-4fa6-bc12-c815ebe3f086");
//    _pagesAdd_expense_reimbursement.Enter_ctl00cPHrptrExpensectl00txtDescription(driver, "abc2");
//    
//
//    TestModellerLogger.SetLastNodeGuid("01d9cf91-0090-477d-8cdf-100b6664748b");
//    _pagesAdd_expense_reimbursement.Enter_ctl00cPHrptrExpensectl00txtAmount("100");
//    
//
//    TestModellerLogger.SetLastNodeGuid("19eca6f4-98d1-420e-8411-c0a7535b3658");
//    _pagesAdd_expense_reimbursement.Select_ctl00cPHrptrExpensectl00ddVATRate("REDUCED 5%");
//    
//
//    TestModellerLogger.SetLastNodeGuid("d7f910de-29ab-4702-909b-ddbddbec174c");
//    _pagesAdd_expense_reimbursement.Click__Save_();
//    
//
//pages.Expense_reimbursement _pagesExpense_reimbursement = new pages.Expense_reimbursement(driver);
//    TestModellerLogger.SetLastNodeGuid("ee1fe0ff-f180-45f6-8cbc-f11971fa11c3");
//    _pagesExpense_reimbursement.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("27db8869-ac7f-4ac7-8eee-e9e26082a5a8");
//    _pagesExpense_reimbursement.Click_Expenditure();
//    
//
//    TestModellerLogger.SetLastNodeGuid("5d6bf358-e1c3-4c35-8cb1-fe75cfbc8960");
//    _pagesExpense_reimbursement.Click_New_();
//    
//
//    TestModellerLogger.SetLastNodeGuid("473134d7-20c2-4815-9591-116c83e66fce");
//    _pagesExpense_reimbursement.Click_Expense_Reimbursement();
//    
//
//    }
//
//    @Test  (groups= {"9fc88cdf-a617-41e5-bcb0-f99b6c49159c","reimbursement scenario 4","reimbursement scenario 4 - Default Profile"},enabled=false)
//    @TestModellerPath(guid = "9fc88cdf-a617-41e5-bcb0-f99b6c49159c")
//    public void GoToUrlpositiveenterusernamepositiveenterpasswordClickLoginsuccessGoToUrlpositiveagentnameCl4()
//    {
//        
//        pages.login _pageslogin = new pages.login(driver);
//    TestModellerLogger.SetLastNodeGuid("854a1118-4615-4409-996b-51f957f4b121");
//    _pageslogin.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("5f78d4ec-ef66-42ec-80d3-bff428d78f7b");
//    _pageslogin.Enter_ctl00cPHlogin("admin");
//    
//
//    TestModellerLogger.SetLastNodeGuid("98e3f377-efb7-4010-8f3a-04d5a7749cae");
//    _pageslogin.Enter_ctl00cPHpass("Staging@admin#92");
//    
//
//    TestModellerLogger.SetLastNodeGuid("0ac50b8f-4ab4-4855-a348-232e96ddfd82");
//    _pageslogin.Click_Login();
//    
//
//pages.Agent_page _pagesAgent_page = new pages.Agent_page(driver);
//    TestModellerLogger.SetLastNodeGuid("5ca4399f-c2c9-4907-89c2-1f3a8c74b5e9");
//    _pagesAgent_page.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("d1774d2f-8a96-4065-b7ad-7564424df697");
//    _pagesAgent_page.Enter_ctl00cPHFiltertxtAgentName("deepika");
//    
//
//    TestModellerLogger.SetLastNodeGuid("12624eac-97ad-4461-a189-3bdf32926acf");
//    _pagesAgent_page.Click_Search();
//    
//
//    TestModellerLogger.SetLastNodeGuid("86d6d989-b955-473d-b918-1371760f1e7f");
//    _pagesAgent_page.Click__Deepika_();
//    
//
//    TestModellerLogger.SetLastNodeGuid("fe49d2c8-15b6-4831-89b7-b3aa4fe86ec1");
//    _pagesAgent_page.Switch_Tab();
//    
//
//pages.Business_navigation _pagesBusiness_navigation = new pages.Business_navigation(driver);
//    TestModellerLogger.SetLastNodeGuid("e4687602-1649-458e-98d6-5fd251e617a7");
//    _pagesBusiness_navigation.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("814387e0-8392-4488-9a17-4455bc12fd85");
//    _pagesBusiness_navigation.Click_Businesses();
//    
//
//    TestModellerLogger.SetLastNodeGuid("cc3b282b-3edd-4a58-b6a6-be910ce651c0");
//    _pagesBusiness_navigation.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("lexagen");
//    
//
//    TestModellerLogger.SetLastNodeGuid("74c7935f-a457-4a02-b25b-8bc76b81847f");
//    _pagesBusiness_navigation.Click_Search_();
//    
//
//    TestModellerLogger.SetLastNodeGuid("dcf609fe-ada5-48c3-b7d1-905de85570d5");
//    _pagesBusiness_navigation.Click__Lexagen_properties_private_limited();
//    
//
//    TestModellerLogger.SetLastNodeGuid("5b0e541d-261f-4d1e-a3a9-98333b95f672");
//    _pagesBusiness_navigation.Switch_Tab();
//    
//
//pages.Add_expense_reimbursement _pagesAdd_expense_reimbursement = new pages.Add_expense_reimbursement(driver);
//    TestModellerLogger.SetLastNodeGuid("b7e3ea26-cc72-4755-a32e-fecab46fe00a");
//    _pagesAdd_expense_reimbursement.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("2d8409d1-9061-4b7e-9f7a-0b69c829eb3a");
//    _pagesAdd_expense_reimbursement.Click_xPath_htmlbodyformmaindiv10div3div1div4divdiv2div1divdiv5divdivtabl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("8e696d0b-99bc-40ca-82f4-b57e2a885795");
//    _pagesAdd_expense_reimbursement.Select_ctl00cPHddlentryType("Expense");
//    
//
//    TestModellerLogger.SetLastNodeGuid("c187ef14-c6d3-46b0-871c-661e4b5a4fd9");
//    _pagesAdd_expense_reimbursement.Enter_ctl00cPHrptrExpensectl00txtDate("44061");
//    
//
//    TestModellerLogger.SetLastNodeGuid("86b77b31-ced9-47b7-9667-7a56c21873c9");
//    _pagesAdd_expense_reimbursement.Select_ctl00cPHrptrExpensectl00ddExpenseHead("Accountancy fee");
//    
//
//    TestModellerLogger.SetLastNodeGuid("171df228-6735-4fa6-bc12-c815ebe3f086");
//    _pagesAdd_expense_reimbursement.Enter_ctl00cPHrptrExpensectl00txtDescription(driver, "abc3");
//    
//
//    TestModellerLogger.SetLastNodeGuid("01d9cf91-0090-477d-8cdf-100b6664748b");
//    _pagesAdd_expense_reimbursement.Enter_ctl00cPHrptrExpensectl00txtAmount("100");
//    
//
//    TestModellerLogger.SetLastNodeGuid("19eca6f4-98d1-420e-8411-c0a7535b3658");
//    _pagesAdd_expense_reimbursement.Select_ctl00cPHrptrExpensectl00ddVATRate("Exempt VAT");
//    
//
//    TestModellerLogger.SetLastNodeGuid("d7f910de-29ab-4702-909b-ddbddbec174c");
//    _pagesAdd_expense_reimbursement.Click__Save_();
//    
//
//pages.Expense_reimbursement _pagesExpense_reimbursement = new pages.Expense_reimbursement(driver);
//    TestModellerLogger.SetLastNodeGuid("ee1fe0ff-f180-45f6-8cbc-f11971fa11c3");
//    _pagesExpense_reimbursement.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("27db8869-ac7f-4ac7-8eee-e9e26082a5a8");
//    _pagesExpense_reimbursement.Click_Expenditure();
//    
//
//    TestModellerLogger.SetLastNodeGuid("5d6bf358-e1c3-4c35-8cb1-fe75cfbc8960");
//    _pagesExpense_reimbursement.Click_New_();
//    
//
//    TestModellerLogger.SetLastNodeGuid("473134d7-20c2-4815-9591-116c83e66fce");
//    _pagesExpense_reimbursement.Click_Expense_Reimbursement();
//    
//
//    }
//
//    @Test  (groups= {"2dd046da-0f65-47e2-a023-e0c1eaada76c","reimbursement scenario 4","reimbursement scenario 4 - Default Profile"},enabled=false)
//    @TestModellerPath(guid = "2dd046da-0f65-47e2-a023-e0c1eaada76c")
//    public void GoToUrlpositiveenterusernamepositiveenterpasswordClickLoginsuccessGoToUrlpositiveagentnameCl5()
//    {
//        
//        pages.login _pageslogin = new pages.login(driver);
//    TestModellerLogger.SetLastNodeGuid("854a1118-4615-4409-996b-51f957f4b121");
//    _pageslogin.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("5f78d4ec-ef66-42ec-80d3-bff428d78f7b");
//    _pageslogin.Enter_ctl00cPHlogin("admin");
//    
//
//    TestModellerLogger.SetLastNodeGuid("98e3f377-efb7-4010-8f3a-04d5a7749cae");
//    _pageslogin.Enter_ctl00cPHpass("Staging@admin#92");
//    
//
//    TestModellerLogger.SetLastNodeGuid("0ac50b8f-4ab4-4855-a348-232e96ddfd82");
//    _pageslogin.Click_Login();
//    
//
//pages.Agent_page _pagesAgent_page = new pages.Agent_page(driver);
//    TestModellerLogger.SetLastNodeGuid("5ca4399f-c2c9-4907-89c2-1f3a8c74b5e9");
//    _pagesAgent_page.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("d1774d2f-8a96-4065-b7ad-7564424df697");
//    _pagesAgent_page.Enter_ctl00cPHFiltertxtAgentName("deepika");
//    
//
//    TestModellerLogger.SetLastNodeGuid("12624eac-97ad-4461-a189-3bdf32926acf");
//    _pagesAgent_page.Click_Search();
//    
//
//    TestModellerLogger.SetLastNodeGuid("86d6d989-b955-473d-b918-1371760f1e7f");
//    _pagesAgent_page.Click__Deepika_();
//    
//
//    TestModellerLogger.SetLastNodeGuid("fe49d2c8-15b6-4831-89b7-b3aa4fe86ec1");
//    _pagesAgent_page.Switch_Tab();
//    
//
//pages.Business_navigation _pagesBusiness_navigation = new pages.Business_navigation(driver);
//    TestModellerLogger.SetLastNodeGuid("e4687602-1649-458e-98d6-5fd251e617a7");
//    _pagesBusiness_navigation.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("814387e0-8392-4488-9a17-4455bc12fd85");
//    _pagesBusiness_navigation.Click_Businesses();
//    
//
//    TestModellerLogger.SetLastNodeGuid("cc3b282b-3edd-4a58-b6a6-be910ce651c0");
//    _pagesBusiness_navigation.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("lexagen");
//    
//
//    TestModellerLogger.SetLastNodeGuid("74c7935f-a457-4a02-b25b-8bc76b81847f");
//    _pagesBusiness_navigation.Click_Search_();
//    
//
//    TestModellerLogger.SetLastNodeGuid("dcf609fe-ada5-48c3-b7d1-905de85570d5");
//    _pagesBusiness_navigation.Click__Lexagen_properties_private_limited();
//    
//
//    TestModellerLogger.SetLastNodeGuid("5b0e541d-261f-4d1e-a3a9-98333b95f672");
//    _pagesBusiness_navigation.Switch_Tab();
//    
//
//pages.Add_expense_reimbursement _pagesAdd_expense_reimbursement = new pages.Add_expense_reimbursement(driver);
//    TestModellerLogger.SetLastNodeGuid("b7e3ea26-cc72-4755-a32e-fecab46fe00a");
//    _pagesAdd_expense_reimbursement.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("2d8409d1-9061-4b7e-9f7a-0b69c829eb3a");
//    _pagesAdd_expense_reimbursement.Click_xPath_htmlbodyformmaindiv10div3div1div4divdiv2div1divdiv5divdivtabl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("8e696d0b-99bc-40ca-82f4-b57e2a885795");
//    _pagesAdd_expense_reimbursement.Select_ctl00cPHddlentryType("Expense");
//    
//
//    TestModellerLogger.SetLastNodeGuid("c187ef14-c6d3-46b0-871c-661e4b5a4fd9");
//    _pagesAdd_expense_reimbursement.Enter_ctl00cPHrptrExpensectl00txtDate("44061");
//    
//
//    TestModellerLogger.SetLastNodeGuid("86b77b31-ced9-47b7-9667-7a56c21873c9");
//    _pagesAdd_expense_reimbursement.Select_ctl00cPHrptrExpensectl00ddExpenseHead("Accountancy fee");
//    
//
//    TestModellerLogger.SetLastNodeGuid("171df228-6735-4fa6-bc12-c815ebe3f086");
//    _pagesAdd_expense_reimbursement.Enter_ctl00cPHrptrExpensectl00txtDescription(driver, "abc4");
//    
//
//    TestModellerLogger.SetLastNodeGuid("01d9cf91-0090-477d-8cdf-100b6664748b");
//    _pagesAdd_expense_reimbursement.Enter_ctl00cPHrptrExpensectl00txtAmount("100");
//    
//
//    TestModellerLogger.SetLastNodeGuid("19eca6f4-98d1-420e-8411-c0a7535b3658");
//    _pagesAdd_expense_reimbursement.Select_ctl00cPHrptrExpensectl00ddVATRate("No VAT/Out of Scope");
//    
//
//    TestModellerLogger.SetLastNodeGuid("d7f910de-29ab-4702-909b-ddbddbec174c");
//    _pagesAdd_expense_reimbursement.Click__Save_();
//    
//
//pages.Expense_reimbursement _pagesExpense_reimbursement = new pages.Expense_reimbursement(driver);
//    TestModellerLogger.SetLastNodeGuid("ee1fe0ff-f180-45f6-8cbc-f11971fa11c3");
//    _pagesExpense_reimbursement.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("27db8869-ac7f-4ac7-8eee-e9e26082a5a8");
//    _pagesExpense_reimbursement.Click_Expenditure();
//    
//
//    TestModellerLogger.SetLastNodeGuid("5d6bf358-e1c3-4c35-8cb1-fe75cfbc8960");
//    _pagesExpense_reimbursement.Click_New_();
//    
//
//    TestModellerLogger.SetLastNodeGuid("473134d7-20c2-4815-9591-116c83e66fce");
//    _pagesExpense_reimbursement.Click_Expense_Reimbursement();
//    
//
//    }
//
//    @Test  (groups= {"d7342544-9520-40f7-b2e8-ef36f06ba61f","reimbursement scenario 4","reimbursement scenario 4 - Default Profile"},enabled=false)
//    @TestModellerPath(guid = "d7342544-9520-40f7-b2e8-ef36f06ba61f")
//    public void GoToUrlpositiveenterusernamepositiveenterpasswordClickLoginsuccessGoToUrlpositiveagentnameCl6()
//    {
//        
//        pages.login _pageslogin = new pages.login(driver);
//    TestModellerLogger.SetLastNodeGuid("854a1118-4615-4409-996b-51f957f4b121");
//    _pageslogin.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("5f78d4ec-ef66-42ec-80d3-bff428d78f7b");
//    _pageslogin.Enter_ctl00cPHlogin("admin");
//    
//
//    TestModellerLogger.SetLastNodeGuid("98e3f377-efb7-4010-8f3a-04d5a7749cae");
//    _pageslogin.Enter_ctl00cPHpass("Staging@admin#92");
//    
//
//    TestModellerLogger.SetLastNodeGuid("0ac50b8f-4ab4-4855-a348-232e96ddfd82");
//    _pageslogin.Click_Login();
//    
//
//pages.Agent_page _pagesAgent_page = new pages.Agent_page(driver);
//    TestModellerLogger.SetLastNodeGuid("5ca4399f-c2c9-4907-89c2-1f3a8c74b5e9");
//    _pagesAgent_page.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("d1774d2f-8a96-4065-b7ad-7564424df697");
//    _pagesAgent_page.Enter_ctl00cPHFiltertxtAgentName("deepika");
//    
//
//    TestModellerLogger.SetLastNodeGuid("12624eac-97ad-4461-a189-3bdf32926acf");
//    _pagesAgent_page.Click_Search();
//    
//
//    TestModellerLogger.SetLastNodeGuid("86d6d989-b955-473d-b918-1371760f1e7f");
//    _pagesAgent_page.Click__Deepika_();
//    
//
//    TestModellerLogger.SetLastNodeGuid("fe49d2c8-15b6-4831-89b7-b3aa4fe86ec1");
//    _pagesAgent_page.Switch_Tab();
//    
//
//pages.Business_navigation _pagesBusiness_navigation = new pages.Business_navigation(driver);
//    TestModellerLogger.SetLastNodeGuid("e4687602-1649-458e-98d6-5fd251e617a7");
//    _pagesBusiness_navigation.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("814387e0-8392-4488-9a17-4455bc12fd85");
//    _pagesBusiness_navigation.Click_Businesses();
//    
//
//    TestModellerLogger.SetLastNodeGuid("cc3b282b-3edd-4a58-b6a6-be910ce651c0");
//    _pagesBusiness_navigation.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("lexagen");
//    
//
//    TestModellerLogger.SetLastNodeGuid("74c7935f-a457-4a02-b25b-8bc76b81847f");
//    _pagesBusiness_navigation.Click_Search_();
//    
//
//    TestModellerLogger.SetLastNodeGuid("dcf609fe-ada5-48c3-b7d1-905de85570d5");
//    _pagesBusiness_navigation.Click__Lexagen_properties_private_limited();
//    
//
//    TestModellerLogger.SetLastNodeGuid("5b0e541d-261f-4d1e-a3a9-98333b95f672");
//    _pagesBusiness_navigation.Switch_Tab();
//    
//
//pages.Add_expense_reimbursement _pagesAdd_expense_reimbursement = new pages.Add_expense_reimbursement(driver);
//    TestModellerLogger.SetLastNodeGuid("b7e3ea26-cc72-4755-a32e-fecab46fe00a");
//    _pagesAdd_expense_reimbursement.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("2d8409d1-9061-4b7e-9f7a-0b69c829eb3a");
//    _pagesAdd_expense_reimbursement.Click_xPath_htmlbodyformmaindiv10div3div1div4divdiv2div1divdiv5divdivtabl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("8e696d0b-99bc-40ca-82f4-b57e2a885795");
//    _pagesAdd_expense_reimbursement.Select_ctl00cPHddlentryType("Expense");
//    
//
//    TestModellerLogger.SetLastNodeGuid("c187ef14-c6d3-46b0-871c-661e4b5a4fd9");
//    _pagesAdd_expense_reimbursement.Enter_ctl00cPHrptrExpensectl00txtDate("44061");
//    
//
//    TestModellerLogger.SetLastNodeGuid("86b77b31-ced9-47b7-9667-7a56c21873c9");
//    _pagesAdd_expense_reimbursement.Select_ctl00cPHrptrExpensectl00ddExpenseHead("Accountancy fee");
//    
//
//    TestModellerLogger.SetLastNodeGuid("171df228-6735-4fa6-bc12-c815ebe3f086");
//    _pagesAdd_expense_reimbursement.Enter_ctl00cPHrptrExpensectl00txtDescription(driver, "abc5");
//    
//
//    TestModellerLogger.SetLastNodeGuid("01d9cf91-0090-477d-8cdf-100b6664748b");
//    _pagesAdd_expense_reimbursement.Enter_ctl00cPHrptrExpensectl00txtAmount("100");
//    
//
//    TestModellerLogger.SetLastNodeGuid("19eca6f4-98d1-420e-8411-c0a7535b3658");
//    _pagesAdd_expense_reimbursement.Select_ctl00cPHrptrExpensectl00ddVATRate("NO VAT/Out of scope");
//    
//
//    TestModellerLogger.SetLastNodeGuid("d7f910de-29ab-4702-909b-ddbddbec174c");
//    _pagesAdd_expense_reimbursement.Click__Save_();
//    
//
//pages.Expense_reimbursement _pagesExpense_reimbursement = new pages.Expense_reimbursement(driver);
//    TestModellerLogger.SetLastNodeGuid("ee1fe0ff-f180-45f6-8cbc-f11971fa11c3");
//    _pagesExpense_reimbursement.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("27db8869-ac7f-4ac7-8eee-e9e26082a5a8");
//    _pagesExpense_reimbursement.Click_Expenditure();
//    
//
//    TestModellerLogger.SetLastNodeGuid("5d6bf358-e1c3-4c35-8cb1-fe75cfbc8960");
//    _pagesExpense_reimbursement.Click_New_();
//    
//
//    TestModellerLogger.SetLastNodeGuid("473134d7-20c2-4815-9591-116c83e66fce");
//    _pagesExpense_reimbursement.Click_Expense_Reimbursement();
//    
//
//    }
//
//    @Test  (groups= {"4198e4e8-d1f1-4e8b-ad22-682ac2c7c26b","reimbursement scenario 4","reimbursement scenario 4 - Default Profile"},enabled=false)
//    @TestModellerPath(guid = "4198e4e8-d1f1-4e8b-ad22-682ac2c7c26b")
//    public void GoToUrlpositiveenterusernamepositiveenterpasswordClickLoginsuccessGoToUrlpositiveagentnameCl7()
//    {
//        
//        pages.login _pageslogin = new pages.login(driver);
//    TestModellerLogger.SetLastNodeGuid("854a1118-4615-4409-996b-51f957f4b121");
//    _pageslogin.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("5f78d4ec-ef66-42ec-80d3-bff428d78f7b");
//    _pageslogin.Enter_ctl00cPHlogin("admin");
//    
//
//    TestModellerLogger.SetLastNodeGuid("98e3f377-efb7-4010-8f3a-04d5a7749cae");
//    _pageslogin.Enter_ctl00cPHpass("Staging@admin#92");
//    
//
//    TestModellerLogger.SetLastNodeGuid("0ac50b8f-4ab4-4855-a348-232e96ddfd82");
//    _pageslogin.Click_Login();
//    
//
//pages.Agent_page _pagesAgent_page = new pages.Agent_page(driver);
//    TestModellerLogger.SetLastNodeGuid("5ca4399f-c2c9-4907-89c2-1f3a8c74b5e9");
//    _pagesAgent_page.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("d1774d2f-8a96-4065-b7ad-7564424df697");
//    _pagesAgent_page.Enter_ctl00cPHFiltertxtAgentName("deepika");
//    
//
//    TestModellerLogger.SetLastNodeGuid("12624eac-97ad-4461-a189-3bdf32926acf");
//    _pagesAgent_page.Click_Search();
//    
//
//    TestModellerLogger.SetLastNodeGuid("86d6d989-b955-473d-b918-1371760f1e7f");
//    _pagesAgent_page.Click__Deepika_();
//    
//
//    TestModellerLogger.SetLastNodeGuid("fe49d2c8-15b6-4831-89b7-b3aa4fe86ec1");
//    _pagesAgent_page.Switch_Tab();
//    
//
//pages.Business_navigation _pagesBusiness_navigation = new pages.Business_navigation(driver);
//    TestModellerLogger.SetLastNodeGuid("e4687602-1649-458e-98d6-5fd251e617a7");
//    _pagesBusiness_navigation.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("814387e0-8392-4488-9a17-4455bc12fd85");
//    _pagesBusiness_navigation.Click_Businesses();
//    
//
//    TestModellerLogger.SetLastNodeGuid("cc3b282b-3edd-4a58-b6a6-be910ce651c0");
//    _pagesBusiness_navigation.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("lexagen");
//    
//
//    TestModellerLogger.SetLastNodeGuid("74c7935f-a457-4a02-b25b-8bc76b81847f");
//    _pagesBusiness_navigation.Click_Search_();
//    
//
//    TestModellerLogger.SetLastNodeGuid("dcf609fe-ada5-48c3-b7d1-905de85570d5");
//    _pagesBusiness_navigation.Click__Lexagen_properties_private_limited();
//    
//
//    TestModellerLogger.SetLastNodeGuid("5b0e541d-261f-4d1e-a3a9-98333b95f672");
//    _pagesBusiness_navigation.Switch_Tab();
//    
//
//pages.Add_expense_reimbursement _pagesAdd_expense_reimbursement = new pages.Add_expense_reimbursement(driver);
//    TestModellerLogger.SetLastNodeGuid("b7e3ea26-cc72-4755-a32e-fecab46fe00a");
//    _pagesAdd_expense_reimbursement.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("2d8409d1-9061-4b7e-9f7a-0b69c829eb3a");
//    _pagesAdd_expense_reimbursement.Click_xPath_htmlbodyformmaindiv10div3div1div4divdiv2div1divdiv5divdivtabl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("8e696d0b-99bc-40ca-82f4-b57e2a885795");
//    _pagesAdd_expense_reimbursement.Select_ctl00cPHddlentryType("Expense");
//    
//
//    TestModellerLogger.SetLastNodeGuid("c187ef14-c6d3-46b0-871c-661e4b5a4fd9");
//    _pagesAdd_expense_reimbursement.Enter_ctl00cPHrptrExpensectl00txtDate("44061");
//    
//
//    TestModellerLogger.SetLastNodeGuid("86b77b31-ced9-47b7-9667-7a56c21873c9");
//    _pagesAdd_expense_reimbursement.Select_ctl00cPHrptrExpensectl00ddExpenseHead("Advertising, sales promotion, marketing");
//    
//
//    TestModellerLogger.SetLastNodeGuid("171df228-6735-4fa6-bc12-c815ebe3f086");
//    _pagesAdd_expense_reimbursement.Enter_ctl00cPHrptrExpensectl00txtDescription(driver, "abc6");
//    
//
//    TestModellerLogger.SetLastNodeGuid("01d9cf91-0090-477d-8cdf-100b6664748b");
//    _pagesAdd_expense_reimbursement.Enter_ctl00cPHrptrExpensectl00txtAmount("100");
//    
//
//    TestModellerLogger.SetLastNodeGuid("19eca6f4-98d1-420e-8411-c0a7535b3658");
//    _pagesAdd_expense_reimbursement.Select_ctl00cPHrptrExpensectl00ddVATRate("STD 20%");
//    
//
//    TestModellerLogger.SetLastNodeGuid("d7f910de-29ab-4702-909b-ddbddbec174c");
//    _pagesAdd_expense_reimbursement.Click__Save_();
//    
//
//pages.Expense_reimbursement _pagesExpense_reimbursement = new pages.Expense_reimbursement(driver);
//    TestModellerLogger.SetLastNodeGuid("ee1fe0ff-f180-45f6-8cbc-f11971fa11c3");
//    _pagesExpense_reimbursement.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("27db8869-ac7f-4ac7-8eee-e9e26082a5a8");
//    _pagesExpense_reimbursement.Click_Expenditure();
//    
//
//    TestModellerLogger.SetLastNodeGuid("5d6bf358-e1c3-4c35-8cb1-fe75cfbc8960");
//    _pagesExpense_reimbursement.Click_New_();
//    
//
//    TestModellerLogger.SetLastNodeGuid("473134d7-20c2-4815-9591-116c83e66fce");
//    _pagesExpense_reimbursement.Click_Expense_Reimbursement();
//    
//
//    }
//
//    @Test  (groups= {"6050f340-9dc5-4205-aaf0-3244c5a568be","reimbursement scenario 4","reimbursement scenario 4 - Default Profile"},enabled=false)
//    @TestModellerPath(guid = "6050f340-9dc5-4205-aaf0-3244c5a568be")
//    public void GoToUrlpositiveenterusernamepositiveenterpasswordClickLoginsuccessGoToUrlpositiveagentnameCl8()
//    {
//        
//        pages.login _pageslogin = new pages.login(driver);
//    TestModellerLogger.SetLastNodeGuid("854a1118-4615-4409-996b-51f957f4b121");
//    _pageslogin.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("5f78d4ec-ef66-42ec-80d3-bff428d78f7b");
//    _pageslogin.Enter_ctl00cPHlogin("admin");
//    
//
//    TestModellerLogger.SetLastNodeGuid("98e3f377-efb7-4010-8f3a-04d5a7749cae");
//    _pageslogin.Enter_ctl00cPHpass("Staging@admin#92");
//    
//
//    TestModellerLogger.SetLastNodeGuid("0ac50b8f-4ab4-4855-a348-232e96ddfd82");
//    _pageslogin.Click_Login();
//    
//
//pages.Agent_page _pagesAgent_page = new pages.Agent_page(driver);
//    TestModellerLogger.SetLastNodeGuid("5ca4399f-c2c9-4907-89c2-1f3a8c74b5e9");
//    _pagesAgent_page.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("d1774d2f-8a96-4065-b7ad-7564424df697");
//    _pagesAgent_page.Enter_ctl00cPHFiltertxtAgentName("deepika");
//    
//
//    TestModellerLogger.SetLastNodeGuid("12624eac-97ad-4461-a189-3bdf32926acf");
//    _pagesAgent_page.Click_Search();
//    
//
//    TestModellerLogger.SetLastNodeGuid("86d6d989-b955-473d-b918-1371760f1e7f");
//    _pagesAgent_page.Click__Deepika_();
//    
//
//    TestModellerLogger.SetLastNodeGuid("fe49d2c8-15b6-4831-89b7-b3aa4fe86ec1");
//    _pagesAgent_page.Switch_Tab();
//    
//
//pages.Business_navigation _pagesBusiness_navigation = new pages.Business_navigation(driver);
//    TestModellerLogger.SetLastNodeGuid("e4687602-1649-458e-98d6-5fd251e617a7");
//    _pagesBusiness_navigation.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("814387e0-8392-4488-9a17-4455bc12fd85");
//    _pagesBusiness_navigation.Click_Businesses();
//    
//
//    TestModellerLogger.SetLastNodeGuid("cc3b282b-3edd-4a58-b6a6-be910ce651c0");
//    _pagesBusiness_navigation.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("lexagen");
//    
//
//    TestModellerLogger.SetLastNodeGuid("74c7935f-a457-4a02-b25b-8bc76b81847f");
//    _pagesBusiness_navigation.Click_Search_();
//    
//
//    TestModellerLogger.SetLastNodeGuid("dcf609fe-ada5-48c3-b7d1-905de85570d5");
//    _pagesBusiness_navigation.Click__Lexagen_properties_private_limited();
//    
//
//    TestModellerLogger.SetLastNodeGuid("5b0e541d-261f-4d1e-a3a9-98333b95f672");
//    _pagesBusiness_navigation.Switch_Tab();
//    
//
//pages.Add_expense_reimbursement _pagesAdd_expense_reimbursement = new pages.Add_expense_reimbursement(driver);
//    TestModellerLogger.SetLastNodeGuid("b7e3ea26-cc72-4755-a32e-fecab46fe00a");
//    _pagesAdd_expense_reimbursement.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("2d8409d1-9061-4b7e-9f7a-0b69c829eb3a");
//    _pagesAdd_expense_reimbursement.Click_xPath_htmlbodyformmaindiv10div3div1div4divdiv2div1divdiv5divdivtabl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("8e696d0b-99bc-40ca-82f4-b57e2a885795");
//    _pagesAdd_expense_reimbursement.Select_ctl00cPHddlentryType("Expense");
//    
//
//    TestModellerLogger.SetLastNodeGuid("c187ef14-c6d3-46b0-871c-661e4b5a4fd9");
//    _pagesAdd_expense_reimbursement.Enter_ctl00cPHrptrExpensectl00txtDate("44061");
//    
//
//    TestModellerLogger.SetLastNodeGuid("86b77b31-ced9-47b7-9667-7a56c21873c9");
//    _pagesAdd_expense_reimbursement.Select_ctl00cPHrptrExpensectl00ddExpenseHead("Business entertaining");
//    
//
//    TestModellerLogger.SetLastNodeGuid("171df228-6735-4fa6-bc12-c815ebe3f086");
//    _pagesAdd_expense_reimbursement.Enter_ctl00cPHrptrExpensectl00txtDescription(driver, "abc6");
//    
//
//    TestModellerLogger.SetLastNodeGuid("01d9cf91-0090-477d-8cdf-100b6664748b");
//    _pagesAdd_expense_reimbursement.Enter_ctl00cPHrptrExpensectl00txtAmount("100");
//    
//
//    TestModellerLogger.SetLastNodeGuid("19eca6f4-98d1-420e-8411-c0a7535b3658");
//    _pagesAdd_expense_reimbursement.Select_ctl00cPHrptrExpensectl00ddVATRate("STD 20%");
//    
//
//    TestModellerLogger.SetLastNodeGuid("d7f910de-29ab-4702-909b-ddbddbec174c");
//    _pagesAdd_expense_reimbursement.Click__Save_();
//    
//
//pages.Expense_reimbursement _pagesExpense_reimbursement = new pages.Expense_reimbursement(driver);
//    TestModellerLogger.SetLastNodeGuid("ee1fe0ff-f180-45f6-8cbc-f11971fa11c3");
//    _pagesExpense_reimbursement.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("27db8869-ac7f-4ac7-8eee-e9e26082a5a8");
//    _pagesExpense_reimbursement.Click_Expenditure();
//    
//
//    TestModellerLogger.SetLastNodeGuid("5d6bf358-e1c3-4c35-8cb1-fe75cfbc8960");
//    _pagesExpense_reimbursement.Click_New_();
//    
//
//    TestModellerLogger.SetLastNodeGuid("473134d7-20c2-4815-9591-116c83e66fce");
//    _pagesExpense_reimbursement.Click_Expense_Reimbursement();
//    
//
//    }
//
//    @Test  (groups= {"8b97ee71-ace1-4056-b48d-191e5484f4b0","reimbursement scenario 4","reimbursement scenario 4 - Default Profile"})
//    @TestModellerPath(guid = "8b97ee71-ace1-4056-b48d-191e5484f4b0")
//    public void GoToUrlpositiveenterusernamepositiveenterpasswordClickLoginsuccessGoToUrlpositiveagentnameCl9()
//    {
//        
//        pages.login _pageslogin = new pages.login(driver);
//    TestModellerLogger.SetLastNodeGuid("854a1118-4615-4409-996b-51f957f4b121");
//    _pageslogin.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("5f78d4ec-ef66-42ec-80d3-bff428d78f7b");
//    _pageslogin.Enter_ctl00cPHlogin("admin");
//    
//
//    TestModellerLogger.SetLastNodeGuid("98e3f377-efb7-4010-8f3a-04d5a7749cae");
//    _pageslogin.Enter_ctl00cPHpass("Staging@admin#92");
//    
//
//    TestModellerLogger.SetLastNodeGuid("0ac50b8f-4ab4-4855-a348-232e96ddfd82");
//    _pageslogin.Click_Login();
//    
//
//pages.Agent_page _pagesAgent_page = new pages.Agent_page(driver);
//    TestModellerLogger.SetLastNodeGuid("5ca4399f-c2c9-4907-89c2-1f3a8c74b5e9");
//    _pagesAgent_page.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("d1774d2f-8a96-4065-b7ad-7564424df697");
//    _pagesAgent_page.Enter_ctl00cPHFiltertxtAgentName("deepika");
//    
//
//    TestModellerLogger.SetLastNodeGuid("12624eac-97ad-4461-a189-3bdf32926acf");
//    _pagesAgent_page.Click_Search();
//    
//
//    TestModellerLogger.SetLastNodeGuid("86d6d989-b955-473d-b918-1371760f1e7f");
//    _pagesAgent_page.Click__Deepika_();
//    
//
//    TestModellerLogger.SetLastNodeGuid("fe49d2c8-15b6-4831-89b7-b3aa4fe86ec1");
//    _pagesAgent_page.Switch_Tab();
//    
//
//pages.Business_navigation _pagesBusiness_navigation = new pages.Business_navigation(driver);
//    TestModellerLogger.SetLastNodeGuid("e4687602-1649-458e-98d6-5fd251e617a7");
//    _pagesBusiness_navigation.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("814387e0-8392-4488-9a17-4455bc12fd85");
//    _pagesBusiness_navigation.Click_Businesses();
//    
//
//    TestModellerLogger.SetLastNodeGuid("cc3b282b-3edd-4a58-b6a6-be910ce651c0");
//    _pagesBusiness_navigation.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("lexagen");
//    
//
//    TestModellerLogger.SetLastNodeGuid("74c7935f-a457-4a02-b25b-8bc76b81847f");
//    _pagesBusiness_navigation.Click_Search_();
//    
//
//    TestModellerLogger.SetLastNodeGuid("dcf609fe-ada5-48c3-b7d1-905de85570d5");
//    _pagesBusiness_navigation.Click__Lexagen_properties_private_limited();
//    
//
//    TestModellerLogger.SetLastNodeGuid("5b0e541d-261f-4d1e-a3a9-98333b95f672");
//    _pagesBusiness_navigation.Switch_Tab();
//    
//
//pages.Add_expense_reimbursement _pagesAdd_expense_reimbursement = new pages.Add_expense_reimbursement(driver);
//    TestModellerLogger.SetLastNodeGuid("b7e3ea26-cc72-4755-a32e-fecab46fe00a");
//    _pagesAdd_expense_reimbursement.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("2d8409d1-9061-4b7e-9f7a-0b69c829eb3a");
//    _pagesAdd_expense_reimbursement.Click_xPath_htmlbodyformmaindiv10div3div1div4divdiv2div1divdiv5divdivtabl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("8e696d0b-99bc-40ca-82f4-b57e2a885795");
//    _pagesAdd_expense_reimbursement.Select_ctl00cPHddlentryType("Expense");
//    
//
//    TestModellerLogger.SetLastNodeGuid("c187ef14-c6d3-46b0-871c-661e4b5a4fd9");
//    _pagesAdd_expense_reimbursement.Enter_ctl00cPHrptrExpensectl00txtDate("44061");
//    
//
//    TestModellerLogger.SetLastNodeGuid("86b77b31-ced9-47b7-9667-7a56c21873c9");
//    _pagesAdd_expense_reimbursement.Select_ctl00cPHrptrExpensectl00ddExpenseHead("Equipment expensed");
//    
//
//    TestModellerLogger.SetLastNodeGuid("171df228-6735-4fa6-bc12-c815ebe3f086");
//    _pagesAdd_expense_reimbursement.Enter_ctl00cPHrptrExpensectl00txtDescription(driver, "abc7");
//    
//
//    TestModellerLogger.SetLastNodeGuid("01d9cf91-0090-477d-8cdf-100b6664748b");
//    _pagesAdd_expense_reimbursement.Enter_ctl00cPHrptrExpensectl00txtAmount("100");
//    
//
//    TestModellerLogger.SetLastNodeGuid("19eca6f4-98d1-420e-8411-c0a7535b3658");
//    _pagesAdd_expense_reimbursement.Select_ctl00cPHrptrExpensectl00ddVATRate("STD 20%");
//    
//
//    TestModellerLogger.SetLastNodeGuid("d7f910de-29ab-4702-909b-ddbddbec174c");
//    _pagesAdd_expense_reimbursement.Click__Save_();
//    
//
//pages.Expense_reimbursement _pagesExpense_reimbursement = new pages.Expense_reimbursement(driver);
//    TestModellerLogger.SetLastNodeGuid("ee1fe0ff-f180-45f6-8cbc-f11971fa11c3");
//    _pagesExpense_reimbursement.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("27db8869-ac7f-4ac7-8eee-e9e26082a5a8");
//    _pagesExpense_reimbursement.Click_Expenditure();
//    
//
//    TestModellerLogger.SetLastNodeGuid("5d6bf358-e1c3-4c35-8cb1-fe75cfbc8960");
//    _pagesExpense_reimbursement.Click_New_();
//    
//
//    TestModellerLogger.SetLastNodeGuid("473134d7-20c2-4815-9591-116c83e66fce");
//    _pagesExpense_reimbursement.Click_Expense_Reimbursement();
//    
//
//    }
//
//    @Test  (groups= {"7e46ad36-b1e5-4d2a-a47e-97c4edfb9b2b","reimbursement scenario 4","reimbursement scenario 4 - Default Profile"},enabled=false)
//    @TestModellerPath(guid = "7e46ad36-b1e5-4d2a-a47e-97c4edfb9b2b")
//    public void GoToUrlpositiveenterusernamepositiveenterpasswordClickLoginsuccessGoToUrlpositiveagentnameC10()
//    {
//        
//        pages.login _pageslogin = new pages.login(driver);
//    TestModellerLogger.SetLastNodeGuid("854a1118-4615-4409-996b-51f957f4b121");
//    _pageslogin.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("5f78d4ec-ef66-42ec-80d3-bff428d78f7b");
//    _pageslogin.Enter_ctl00cPHlogin("admin");
//    
//
//    TestModellerLogger.SetLastNodeGuid("98e3f377-efb7-4010-8f3a-04d5a7749cae");
//    _pageslogin.Enter_ctl00cPHpass("Staging@admin#92");
//    
//
//    TestModellerLogger.SetLastNodeGuid("0ac50b8f-4ab4-4855-a348-232e96ddfd82");
//    _pageslogin.Click_Login();
//    
//
//pages.Agent_page _pagesAgent_page = new pages.Agent_page(driver);
//    TestModellerLogger.SetLastNodeGuid("5ca4399f-c2c9-4907-89c2-1f3a8c74b5e9");
//    _pagesAgent_page.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("d1774d2f-8a96-4065-b7ad-7564424df697");
//    _pagesAgent_page.Enter_ctl00cPHFiltertxtAgentName("deepika");
//    
//
//    TestModellerLogger.SetLastNodeGuid("12624eac-97ad-4461-a189-3bdf32926acf");
//    _pagesAgent_page.Click_Search();
//    
//
//    TestModellerLogger.SetLastNodeGuid("86d6d989-b955-473d-b918-1371760f1e7f");
//    _pagesAgent_page.Click__Deepika_();
//    
//
//    TestModellerLogger.SetLastNodeGuid("fe49d2c8-15b6-4831-89b7-b3aa4fe86ec1");
//    _pagesAgent_page.Switch_Tab();
//    
//
//pages.Business_navigation _pagesBusiness_navigation = new pages.Business_navigation(driver);
//    TestModellerLogger.SetLastNodeGuid("e4687602-1649-458e-98d6-5fd251e617a7");
//    _pagesBusiness_navigation.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("814387e0-8392-4488-9a17-4455bc12fd85");
//    _pagesBusiness_navigation.Click_Businesses();
//    
//
//    TestModellerLogger.SetLastNodeGuid("cc3b282b-3edd-4a58-b6a6-be910ce651c0");
//    _pagesBusiness_navigation.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("lexagen");
//    
//
//    TestModellerLogger.SetLastNodeGuid("74c7935f-a457-4a02-b25b-8bc76b81847f");
//    _pagesBusiness_navigation.Click_Search_();
//    
//
//    TestModellerLogger.SetLastNodeGuid("dcf609fe-ada5-48c3-b7d1-905de85570d5");
//    _pagesBusiness_navigation.Click__Lexagen_properties_private_limited();
//    
//
//    TestModellerLogger.SetLastNodeGuid("5b0e541d-261f-4d1e-a3a9-98333b95f672");
//    _pagesBusiness_navigation.Switch_Tab();
//    
//
//pages.Add_expense_reimbursement _pagesAdd_expense_reimbursement = new pages.Add_expense_reimbursement(driver);
//    TestModellerLogger.SetLastNodeGuid("b7e3ea26-cc72-4755-a32e-fecab46fe00a");
//    _pagesAdd_expense_reimbursement.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("2d8409d1-9061-4b7e-9f7a-0b69c829eb3a");
//    _pagesAdd_expense_reimbursement.Click_xPath_htmlbodyformmaindiv10div3div1div4divdiv2div1divdiv5divdivtabl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("8e696d0b-99bc-40ca-82f4-b57e2a885795");
//    _pagesAdd_expense_reimbursement.Select_ctl00cPHddlentryType("Expense");
//    
//
//    TestModellerLogger.SetLastNodeGuid("c187ef14-c6d3-46b0-871c-661e4b5a4fd9");
//    _pagesAdd_expense_reimbursement.Enter_ctl00cPHrptrExpensectl00txtDate("44061");
//    
//
//    TestModellerLogger.SetLastNodeGuid("86b77b31-ced9-47b7-9667-7a56c21873c9");
//    _pagesAdd_expense_reimbursement.Select_ctl00cPHrptrExpensectl00ddExpenseHead("Insurance");
//    
//
//    TestModellerLogger.SetLastNodeGuid("171df228-6735-4fa6-bc12-c815ebe3f086");
//    _pagesAdd_expense_reimbursement.Enter_ctl00cPHrptrExpensectl00txtDescription(driver, "abc8.");
//    
//
//    TestModellerLogger.SetLastNodeGuid("01d9cf91-0090-477d-8cdf-100b6664748b");
//    _pagesAdd_expense_reimbursement.Enter_ctl00cPHrptrExpensectl00txtAmount("100");
//    
//
//    TestModellerLogger.SetLastNodeGuid("19eca6f4-98d1-420e-8411-c0a7535b3658");
//    _pagesAdd_expense_reimbursement.Select_ctl00cPHrptrExpensectl00ddVATRate("STD 20%");
//    
//
//    TestModellerLogger.SetLastNodeGuid("d7f910de-29ab-4702-909b-ddbddbec174c");
//    _pagesAdd_expense_reimbursement.Click__Save_();
//    
//
//pages.Expense_reimbursement _pagesExpense_reimbursement = new pages.Expense_reimbursement(driver);
//    TestModellerLogger.SetLastNodeGuid("ee1fe0ff-f180-45f6-8cbc-f11971fa11c3");
//    _pagesExpense_reimbursement.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("27db8869-ac7f-4ac7-8eee-e9e26082a5a8");
//    _pagesExpense_reimbursement.Click_Expenditure();
//    
//
//    TestModellerLogger.SetLastNodeGuid("5d6bf358-e1c3-4c35-8cb1-fe75cfbc8960");
//    _pagesExpense_reimbursement.Click_New_();
//    
//
//    TestModellerLogger.SetLastNodeGuid("473134d7-20c2-4815-9591-116c83e66fce");
//    _pagesExpense_reimbursement.Click_Expense_Reimbursement();
//    
//
//    }
//
//    @Test  (groups= {"9d92d36d-a4e9-426b-8f28-be0bb28140a4","reimbursement scenario 4","reimbursement scenario 4 - Default Profile"})
//    @TestModellerPath(guid = "9d92d36d-a4e9-426b-8f28-be0bb28140a4")
//    public void GoToUrlpositiveenterusernamepositiveenterpasswordClickLoginsuccessGoToUrlpositiveagentnameC11()
//    {
//        
//        pages.login _pageslogin = new pages.login(driver);
//    TestModellerLogger.SetLastNodeGuid("854a1118-4615-4409-996b-51f957f4b121");
//    _pageslogin.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("5f78d4ec-ef66-42ec-80d3-bff428d78f7b");
//    _pageslogin.Enter_ctl00cPHlogin("admin");
//    
//
//    TestModellerLogger.SetLastNodeGuid("98e3f377-efb7-4010-8f3a-04d5a7749cae");
//    _pageslogin.Enter_ctl00cPHpass("Staging@admin#92");
//    
//
//    TestModellerLogger.SetLastNodeGuid("0ac50b8f-4ab4-4855-a348-232e96ddfd82");
//    _pageslogin.Click_Login();
//    
//
//pages.Agent_page _pagesAgent_page = new pages.Agent_page(driver);
//    TestModellerLogger.SetLastNodeGuid("5ca4399f-c2c9-4907-89c2-1f3a8c74b5e9");
//    _pagesAgent_page.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("d1774d2f-8a96-4065-b7ad-7564424df697");
//    _pagesAgent_page.Enter_ctl00cPHFiltertxtAgentName("deepika");
//    
//
//    TestModellerLogger.SetLastNodeGuid("12624eac-97ad-4461-a189-3bdf32926acf");
//    _pagesAgent_page.Click_Search();
//    
//
//    TestModellerLogger.SetLastNodeGuid("86d6d989-b955-473d-b918-1371760f1e7f");
//    _pagesAgent_page.Click__Deepika_();
//    
//
//    TestModellerLogger.SetLastNodeGuid("fe49d2c8-15b6-4831-89b7-b3aa4fe86ec1");
//    _pagesAgent_page.Switch_Tab();
//    
//
//pages.Business_navigation _pagesBusiness_navigation = new pages.Business_navigation(driver);
//    TestModellerLogger.SetLastNodeGuid("e4687602-1649-458e-98d6-5fd251e617a7");
//    _pagesBusiness_navigation.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("814387e0-8392-4488-9a17-4455bc12fd85");
//    _pagesBusiness_navigation.Click_Businesses();
//    
//
//    TestModellerLogger.SetLastNodeGuid("cc3b282b-3edd-4a58-b6a6-be910ce651c0");
//    _pagesBusiness_navigation.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("lexagen");
//    
//
//    TestModellerLogger.SetLastNodeGuid("74c7935f-a457-4a02-b25b-8bc76b81847f");
//    _pagesBusiness_navigation.Click_Search_();
//    
//
//    TestModellerLogger.SetLastNodeGuid("dcf609fe-ada5-48c3-b7d1-905de85570d5");
//    _pagesBusiness_navigation.Click__Lexagen_properties_private_limited();
//    
//
//    TestModellerLogger.SetLastNodeGuid("5b0e541d-261f-4d1e-a3a9-98333b95f672");
//    _pagesBusiness_navigation.Switch_Tab();
//    
//
//pages.Add_expense_reimbursement _pagesAdd_expense_reimbursement = new pages.Add_expense_reimbursement(driver);
//    TestModellerLogger.SetLastNodeGuid("b7e3ea26-cc72-4755-a32e-fecab46fe00a");
//    _pagesAdd_expense_reimbursement.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("2d8409d1-9061-4b7e-9f7a-0b69c829eb3a");
//    _pagesAdd_expense_reimbursement.Click_xPath_htmlbodyformmaindiv10div3div1div4divdiv2div1divdiv5divdivtabl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("8e696d0b-99bc-40ca-82f4-b57e2a885795");
//    _pagesAdd_expense_reimbursement.Select_ctl00cPHddlentryType("Expense");
//    
//
//    TestModellerLogger.SetLastNodeGuid("c187ef14-c6d3-46b0-871c-661e4b5a4fd9");
//    _pagesAdd_expense_reimbursement.Enter_ctl00cPHrptrExpensectl00txtDate("44061");
//    
//
//    TestModellerLogger.SetLastNodeGuid("86b77b31-ced9-47b7-9667-7a56c21873c9");
//    _pagesAdd_expense_reimbursement.Select_ctl00cPHrptrExpensectl00ddExpenseHead("Membership and subscriptions");
//    
//
//    TestModellerLogger.SetLastNodeGuid("171df228-6735-4fa6-bc12-c815ebe3f086");
//    _pagesAdd_expense_reimbursement.Enter_ctl00cPHrptrExpensectl00txtDescription(driver, "abc9");
//    
//
//    TestModellerLogger.SetLastNodeGuid("01d9cf91-0090-477d-8cdf-100b6664748b");
//    _pagesAdd_expense_reimbursement.Enter_ctl00cPHrptrExpensectl00txtAmount("100");
//    
//
//    TestModellerLogger.SetLastNodeGuid("19eca6f4-98d1-420e-8411-c0a7535b3658");
//    _pagesAdd_expense_reimbursement.Select_ctl00cPHrptrExpensectl00ddVATRate("STD 20%");
//    
//
//    TestModellerLogger.SetLastNodeGuid("d7f910de-29ab-4702-909b-ddbddbec174c");
//    _pagesAdd_expense_reimbursement.Click__Save_();
//    
//
//pages.Expense_reimbursement _pagesExpense_reimbursement = new pages.Expense_reimbursement(driver);
//    TestModellerLogger.SetLastNodeGuid("ee1fe0ff-f180-45f6-8cbc-f11971fa11c3");
//    _pagesExpense_reimbursement.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("27db8869-ac7f-4ac7-8eee-e9e26082a5a8");
//    _pagesExpense_reimbursement.Click_Expenditure();
//    
//
//    TestModellerLogger.SetLastNodeGuid("5d6bf358-e1c3-4c35-8cb1-fe75cfbc8960");
//    _pagesExpense_reimbursement.Click_New_();
//    
//
//    TestModellerLogger.SetLastNodeGuid("473134d7-20c2-4815-9591-116c83e66fce");
//    _pagesExpense_reimbursement.Click_Expense_Reimbursement();
//    
//
//    }
//
//    @Test  (groups= {"aedf3b9d-8667-458b-bd74-6b60d09defad","reimbursement scenario 4","reimbursement scenario 4 - Default Profile"},enabled=false)
//    @TestModellerPath(guid = "aedf3b9d-8667-458b-bd74-6b60d09defad")
//    public void GoToUrlpositiveenterusernamepositiveenterpasswordClickLoginsuccessGoToUrlpositiveagentnameC12()
//    {
//        
//        pages.login _pageslogin = new pages.login(driver);
//    TestModellerLogger.SetLastNodeGuid("854a1118-4615-4409-996b-51f957f4b121");
//    _pageslogin.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("5f78d4ec-ef66-42ec-80d3-bff428d78f7b");
//    _pageslogin.Enter_ctl00cPHlogin("admin");
//    
//
//    TestModellerLogger.SetLastNodeGuid("98e3f377-efb7-4010-8f3a-04d5a7749cae");
//    _pageslogin.Enter_ctl00cPHpass("Staging@admin#92");
//    
//
//    TestModellerLogger.SetLastNodeGuid("0ac50b8f-4ab4-4855-a348-232e96ddfd82");
//    _pageslogin.Click_Login();
//    
//
//pages.Agent_page _pagesAgent_page = new pages.Agent_page(driver);
//    TestModellerLogger.SetLastNodeGuid("5ca4399f-c2c9-4907-89c2-1f3a8c74b5e9");
//    _pagesAgent_page.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("d1774d2f-8a96-4065-b7ad-7564424df697");
//    _pagesAgent_page.Enter_ctl00cPHFiltertxtAgentName("deepika");
//    
//
//    TestModellerLogger.SetLastNodeGuid("12624eac-97ad-4461-a189-3bdf32926acf");
//    _pagesAgent_page.Click_Search();
//    
//
//    TestModellerLogger.SetLastNodeGuid("86d6d989-b955-473d-b918-1371760f1e7f");
//    _pagesAgent_page.Click__Deepika_();
//    
//
//    TestModellerLogger.SetLastNodeGuid("fe49d2c8-15b6-4831-89b7-b3aa4fe86ec1");
//    _pagesAgent_page.Switch_Tab();
//    
//
//pages.Business_navigation _pagesBusiness_navigation = new pages.Business_navigation(driver);
//    TestModellerLogger.SetLastNodeGuid("e4687602-1649-458e-98d6-5fd251e617a7");
//    _pagesBusiness_navigation.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("814387e0-8392-4488-9a17-4455bc12fd85");
//    _pagesBusiness_navigation.Click_Businesses();
//    
//
//    TestModellerLogger.SetLastNodeGuid("cc3b282b-3edd-4a58-b6a6-be910ce651c0");
//    _pagesBusiness_navigation.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("lexagen");
//    
//
//    TestModellerLogger.SetLastNodeGuid("74c7935f-a457-4a02-b25b-8bc76b81847f");
//    _pagesBusiness_navigation.Click_Search_();
//    
//
//    TestModellerLogger.SetLastNodeGuid("dcf609fe-ada5-48c3-b7d1-905de85570d5");
//    _pagesBusiness_navigation.Click__Lexagen_properties_private_limited();
//    
//
//    TestModellerLogger.SetLastNodeGuid("5b0e541d-261f-4d1e-a3a9-98333b95f672");
//    _pagesBusiness_navigation.Switch_Tab();
//    
//
//pages.Add_expense_reimbursement _pagesAdd_expense_reimbursement = new pages.Add_expense_reimbursement(driver);
//    TestModellerLogger.SetLastNodeGuid("b7e3ea26-cc72-4755-a32e-fecab46fe00a");
//    _pagesAdd_expense_reimbursement.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("2d8409d1-9061-4b7e-9f7a-0b69c829eb3a");
//    _pagesAdd_expense_reimbursement.Click_xPath_htmlbodyformmaindiv10div3div1div4divdiv2div1divdiv5divdivtabl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("8e696d0b-99bc-40ca-82f4-b57e2a885795");
//    _pagesAdd_expense_reimbursement.Select_ctl00cPHddlentryType("Expense");
//    
//
//    TestModellerLogger.SetLastNodeGuid("c187ef14-c6d3-46b0-871c-661e4b5a4fd9");
//    _pagesAdd_expense_reimbursement.Enter_ctl00cPHrptrExpensectl00txtDate("44061");
//    
//
//    TestModellerLogger.SetLastNodeGuid("86b77b31-ced9-47b7-9667-7a56c21873c9");
//    _pagesAdd_expense_reimbursement.Select_ctl00cPHrptrExpensectl00ddExpenseHead("Overseas allowance");
//    
//
//    TestModellerLogger.SetLastNodeGuid("171df228-6735-4fa6-bc12-c815ebe3f086");
//    _pagesAdd_expense_reimbursement.Enter_ctl00cPHrptrExpensectl00txtDescription(driver, "abc10");
//    
//
//    TestModellerLogger.SetLastNodeGuid("01d9cf91-0090-477d-8cdf-100b6664748b");
//    _pagesAdd_expense_reimbursement.Enter_ctl00cPHrptrExpensectl00txtAmount("100");
//    
//
//    TestModellerLogger.SetLastNodeGuid("19eca6f4-98d1-420e-8411-c0a7535b3658");
//    _pagesAdd_expense_reimbursement.Select_ctl00cPHrptrExpensectl00ddVATRate("STD 20%");
//    
//
//    TestModellerLogger.SetLastNodeGuid("d7f910de-29ab-4702-909b-ddbddbec174c");
//    _pagesAdd_expense_reimbursement.Click__Save_();
//    
//
//pages.Expense_reimbursement _pagesExpense_reimbursement = new pages.Expense_reimbursement(driver);
//    TestModellerLogger.SetLastNodeGuid("ee1fe0ff-f180-45f6-8cbc-f11971fa11c3");
//    _pagesExpense_reimbursement.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("27db8869-ac7f-4ac7-8eee-e9e26082a5a8");
//    _pagesExpense_reimbursement.Click_Expenditure();
//    
//
//    TestModellerLogger.SetLastNodeGuid("5d6bf358-e1c3-4c35-8cb1-fe75cfbc8960");
//    _pagesExpense_reimbursement.Click_New_();
//    
//
//    TestModellerLogger.SetLastNodeGuid("473134d7-20c2-4815-9591-116c83e66fce");
//    _pagesExpense_reimbursement.Click_Expense_Reimbursement();
//    
//
//    }
//
//    @Test  (groups= {"c10ef3e8-ca5f-4ac2-9ce5-9280d785a1e8","reimbursement scenario 4","reimbursement scenario 4 - Default Profile"},enabled=false)
//    @TestModellerPath(guid = "c10ef3e8-ca5f-4ac2-9ce5-9280d785a1e8")
//    public void GoToUrlpositiveenterusernamepositiveenterpasswordClickLoginsuccessGoToUrlpositiveagentnameC13()
//    {
//        
//        pages.login _pageslogin = new pages.login(driver);
//    TestModellerLogger.SetLastNodeGuid("854a1118-4615-4409-996b-51f957f4b121");
//    _pageslogin.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("5f78d4ec-ef66-42ec-80d3-bff428d78f7b");
//    _pageslogin.Enter_ctl00cPHlogin("admin");
//    
//
//    TestModellerLogger.SetLastNodeGuid("98e3f377-efb7-4010-8f3a-04d5a7749cae");
//    _pageslogin.Enter_ctl00cPHpass("Staging@admin#92");
//    
//
//    TestModellerLogger.SetLastNodeGuid("0ac50b8f-4ab4-4855-a348-232e96ddfd82");
//    _pageslogin.Click_Login();
//    
//
//pages.Agent_page _pagesAgent_page = new pages.Agent_page(driver);
//    TestModellerLogger.SetLastNodeGuid("5ca4399f-c2c9-4907-89c2-1f3a8c74b5e9");
//    _pagesAgent_page.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("d1774d2f-8a96-4065-b7ad-7564424df697");
//    _pagesAgent_page.Enter_ctl00cPHFiltertxtAgentName("deepika");
//    
//
//    TestModellerLogger.SetLastNodeGuid("12624eac-97ad-4461-a189-3bdf32926acf");
//    _pagesAgent_page.Click_Search();
//    
//
//    TestModellerLogger.SetLastNodeGuid("86d6d989-b955-473d-b918-1371760f1e7f");
//    _pagesAgent_page.Click__Deepika_();
//    
//
//    TestModellerLogger.SetLastNodeGuid("fe49d2c8-15b6-4831-89b7-b3aa4fe86ec1");
//    _pagesAgent_page.Switch_Tab();
//    
//
//pages.Business_navigation _pagesBusiness_navigation = new pages.Business_navigation(driver);
//    TestModellerLogger.SetLastNodeGuid("e4687602-1649-458e-98d6-5fd251e617a7");
//    _pagesBusiness_navigation.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("814387e0-8392-4488-9a17-4455bc12fd85");
//    _pagesBusiness_navigation.Click_Businesses();
//    
//
//    TestModellerLogger.SetLastNodeGuid("cc3b282b-3edd-4a58-b6a6-be910ce651c0");
//    _pagesBusiness_navigation.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("lexagen");
//    
//
//    TestModellerLogger.SetLastNodeGuid("74c7935f-a457-4a02-b25b-8bc76b81847f");
//    _pagesBusiness_navigation.Click_Search_();
//    
//
//    TestModellerLogger.SetLastNodeGuid("dcf609fe-ada5-48c3-b7d1-905de85570d5");
//    _pagesBusiness_navigation.Click__Lexagen_properties_private_limited();
//    
//
//    TestModellerLogger.SetLastNodeGuid("5b0e541d-261f-4d1e-a3a9-98333b95f672");
//    _pagesBusiness_navigation.Switch_Tab();
//    
//
//pages.Add_expense_reimbursement _pagesAdd_expense_reimbursement = new pages.Add_expense_reimbursement(driver);
//    TestModellerLogger.SetLastNodeGuid("b7e3ea26-cc72-4755-a32e-fecab46fe00a");
//    _pagesAdd_expense_reimbursement.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("2d8409d1-9061-4b7e-9f7a-0b69c829eb3a");
//    _pagesAdd_expense_reimbursement.Click_xPath_htmlbodyformmaindiv10div3div1div4divdiv2div1divdiv5divdivtabl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("8e696d0b-99bc-40ca-82f4-b57e2a885795");
//    _pagesAdd_expense_reimbursement.Select_ctl00cPHddlentryType("Expense");
//    
//
//    TestModellerLogger.SetLastNodeGuid("c187ef14-c6d3-46b0-871c-661e4b5a4fd9");
//    _pagesAdd_expense_reimbursement.Enter_ctl00cPHrptrExpensectl00txtDate("44061");
//    
//
//    TestModellerLogger.SetLastNodeGuid("86b77b31-ced9-47b7-9667-7a56c21873c9");
//    _pagesAdd_expense_reimbursement.Select_ctl00cPHrptrExpensectl00ddExpenseHead("Postage, stationery, office supplies");
//    
//
//    TestModellerLogger.SetLastNodeGuid("171df228-6735-4fa6-bc12-c815ebe3f086");
//    _pagesAdd_expense_reimbursement.Enter_ctl00cPHrptrExpensectl00txtDescription(driver, "abc12");
//    
//
//    TestModellerLogger.SetLastNodeGuid("01d9cf91-0090-477d-8cdf-100b6664748b");
//    _pagesAdd_expense_reimbursement.Enter_ctl00cPHrptrExpensectl00txtAmount("100");
//    
//
//    TestModellerLogger.SetLastNodeGuid("19eca6f4-98d1-420e-8411-c0a7535b3658");
//    _pagesAdd_expense_reimbursement.Select_ctl00cPHrptrExpensectl00ddVATRate("STD 20%");
//    
//
//    TestModellerLogger.SetLastNodeGuid("d7f910de-29ab-4702-909b-ddbddbec174c");
//    _pagesAdd_expense_reimbursement.Click__Save_();
//    
//
//pages.Expense_reimbursement _pagesExpense_reimbursement = new pages.Expense_reimbursement(driver);
//    TestModellerLogger.SetLastNodeGuid("ee1fe0ff-f180-45f6-8cbc-f11971fa11c3");
//    _pagesExpense_reimbursement.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("27db8869-ac7f-4ac7-8eee-e9e26082a5a8");
//    _pagesExpense_reimbursement.Click_Expenditure();
//    
//
//    TestModellerLogger.SetLastNodeGuid("5d6bf358-e1c3-4c35-8cb1-fe75cfbc8960");
//    _pagesExpense_reimbursement.Click_New_();
//    
//
//    TestModellerLogger.SetLastNodeGuid("473134d7-20c2-4815-9591-116c83e66fce");
//    _pagesExpense_reimbursement.Click_Expense_Reimbursement();
//    
//
//    }
//
//    @Test  (groups= {"727198be-0d07-40ed-bbf3-aa3829d167f8","reimbursement scenario 4","reimbursement scenario 4 - Default Profile"},enabled=false)
//    @TestModellerPath(guid = "727198be-0d07-40ed-bbf3-aa3829d167f8")
//    public void GoToUrlpositiveenterusernamepositiveenterpasswordClickLoginsuccessGoToUrlpositiveagentnameC14()
//    {
//        
//        pages.login _pageslogin = new pages.login(driver);
//    TestModellerLogger.SetLastNodeGuid("854a1118-4615-4409-996b-51f957f4b121");
//    _pageslogin.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("5f78d4ec-ef66-42ec-80d3-bff428d78f7b");
//    _pageslogin.Enter_ctl00cPHlogin("admin");
//    
//
//    TestModellerLogger.SetLastNodeGuid("98e3f377-efb7-4010-8f3a-04d5a7749cae");
//    _pageslogin.Enter_ctl00cPHpass("Staging@admin#92");
//    
//
//    TestModellerLogger.SetLastNodeGuid("0ac50b8f-4ab4-4855-a348-232e96ddfd82");
//    _pageslogin.Click_Login();
//    
//
//pages.Agent_page _pagesAgent_page = new pages.Agent_page(driver);
//    TestModellerLogger.SetLastNodeGuid("5ca4399f-c2c9-4907-89c2-1f3a8c74b5e9");
//    _pagesAgent_page.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("d1774d2f-8a96-4065-b7ad-7564424df697");
//    _pagesAgent_page.Enter_ctl00cPHFiltertxtAgentName("deepika");
//    
//
//    TestModellerLogger.SetLastNodeGuid("12624eac-97ad-4461-a189-3bdf32926acf");
//    _pagesAgent_page.Click_Search();
//    
//
//    TestModellerLogger.SetLastNodeGuid("86d6d989-b955-473d-b918-1371760f1e7f");
//    _pagesAgent_page.Click__Deepika_();
//    
//
//    TestModellerLogger.SetLastNodeGuid("fe49d2c8-15b6-4831-89b7-b3aa4fe86ec1");
//    _pagesAgent_page.Switch_Tab();
//    
//
//pages.Business_navigation _pagesBusiness_navigation = new pages.Business_navigation(driver);
//    TestModellerLogger.SetLastNodeGuid("e4687602-1649-458e-98d6-5fd251e617a7");
//    _pagesBusiness_navigation.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("814387e0-8392-4488-9a17-4455bc12fd85");
//    _pagesBusiness_navigation.Click_Businesses();
//    
//
//    TestModellerLogger.SetLastNodeGuid("cc3b282b-3edd-4a58-b6a6-be910ce651c0");
//    _pagesBusiness_navigation.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("lexagen");
//    
//
//    TestModellerLogger.SetLastNodeGuid("74c7935f-a457-4a02-b25b-8bc76b81847f");
//    _pagesBusiness_navigation.Click_Search_();
//    
//
//    TestModellerLogger.SetLastNodeGuid("dcf609fe-ada5-48c3-b7d1-905de85570d5");
//    _pagesBusiness_navigation.Click__Lexagen_properties_private_limited();
//    
//
//    TestModellerLogger.SetLastNodeGuid("5b0e541d-261f-4d1e-a3a9-98333b95f672");
//    _pagesBusiness_navigation.Switch_Tab();
//    
//
//pages.Add_expense_reimbursement _pagesAdd_expense_reimbursement = new pages.Add_expense_reimbursement(driver);
//    TestModellerLogger.SetLastNodeGuid("b7e3ea26-cc72-4755-a32e-fecab46fe00a");
//    _pagesAdd_expense_reimbursement.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("2d8409d1-9061-4b7e-9f7a-0b69c829eb3a");
//    _pagesAdd_expense_reimbursement.Click_xPath_htmlbodyformmaindiv10div3div1div4divdiv2div1divdiv5divdivtabl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("8e696d0b-99bc-40ca-82f4-b57e2a885795");
//    _pagesAdd_expense_reimbursement.Select_ctl00cPHddlentryType("Expense");
//    
//
//    TestModellerLogger.SetLastNodeGuid("c187ef14-c6d3-46b0-871c-661e4b5a4fd9");
//    _pagesAdd_expense_reimbursement.Enter_ctl00cPHrptrExpensectl00txtDate("44061");
//    
//
//    TestModellerLogger.SetLastNodeGuid("86b77b31-ced9-47b7-9667-7a56c21873c9");
//    _pagesAdd_expense_reimbursement.Select_ctl00cPHrptrExpensectl00ddExpenseHead("Professional, consultancy and legal fees");
//    
//
//    TestModellerLogger.SetLastNodeGuid("171df228-6735-4fa6-bc12-c815ebe3f086");
//    _pagesAdd_expense_reimbursement.Enter_ctl00cPHrptrExpensectl00txtDescription(driver, "abc11");
//    
//
//    TestModellerLogger.SetLastNodeGuid("01d9cf91-0090-477d-8cdf-100b6664748b");
//    _pagesAdd_expense_reimbursement.Enter_ctl00cPHrptrExpensectl00txtAmount("100");
//    
//
//    TestModellerLogger.SetLastNodeGuid("19eca6f4-98d1-420e-8411-c0a7535b3658");
//    _pagesAdd_expense_reimbursement.Select_ctl00cPHrptrExpensectl00ddVATRate("STD 20%");
//    
//
//    TestModellerLogger.SetLastNodeGuid("d7f910de-29ab-4702-909b-ddbddbec174c");
//    _pagesAdd_expense_reimbursement.Click__Save_();
//    
//
//pages.Expense_reimbursement _pagesExpense_reimbursement = new pages.Expense_reimbursement(driver);
//    TestModellerLogger.SetLastNodeGuid("ee1fe0ff-f180-45f6-8cbc-f11971fa11c3");
//    _pagesExpense_reimbursement.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("27db8869-ac7f-4ac7-8eee-e9e26082a5a8");
//    _pagesExpense_reimbursement.Click_Expenditure();
//    
//
//    TestModellerLogger.SetLastNodeGuid("5d6bf358-e1c3-4c35-8cb1-fe75cfbc8960");
//    _pagesExpense_reimbursement.Click_New_();
//    
//
//    TestModellerLogger.SetLastNodeGuid("473134d7-20c2-4815-9591-116c83e66fce");
//    _pagesExpense_reimbursement.Click_Expense_Reimbursement();
//    
//
//    }
//
//    @Test  (groups= {"b32c55a0-a7e1-4d39-b18a-a2ae79de8d0b","reimbursement scenario 4","reimbursement scenario 4 - Default Profile"},enabled=false)
//    @TestModellerPath(guid = "b32c55a0-a7e1-4d39-b18a-a2ae79de8d0b")
//    public void GoToUrlpositiveenterusernamepositiveenterpasswordClickLoginsuccessGoToUrlpositiveagentnameC15()
//    {
//        
//        pages.login _pageslogin = new pages.login(driver);
//    TestModellerLogger.SetLastNodeGuid("854a1118-4615-4409-996b-51f957f4b121");
//    _pageslogin.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("5f78d4ec-ef66-42ec-80d3-bff428d78f7b");
//    _pageslogin.Enter_ctl00cPHlogin("admin");
//    
//
//    TestModellerLogger.SetLastNodeGuid("98e3f377-efb7-4010-8f3a-04d5a7749cae");
//    _pageslogin.Enter_ctl00cPHpass("Staging@admin#92");
//    
//
//    TestModellerLogger.SetLastNodeGuid("0ac50b8f-4ab4-4855-a348-232e96ddfd82");
//    _pageslogin.Click_Login();
//    
//
//pages.Agent_page _pagesAgent_page = new pages.Agent_page(driver);
//    TestModellerLogger.SetLastNodeGuid("5ca4399f-c2c9-4907-89c2-1f3a8c74b5e9");
//    _pagesAgent_page.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("d1774d2f-8a96-4065-b7ad-7564424df697");
//    _pagesAgent_page.Enter_ctl00cPHFiltertxtAgentName("deepika");
//    
//
//    TestModellerLogger.SetLastNodeGuid("12624eac-97ad-4461-a189-3bdf32926acf");
//    _pagesAgent_page.Click_Search();
//    
//
//    TestModellerLogger.SetLastNodeGuid("86d6d989-b955-473d-b918-1371760f1e7f");
//    _pagesAgent_page.Click__Deepika_();
//    
//
//    TestModellerLogger.SetLastNodeGuid("fe49d2c8-15b6-4831-89b7-b3aa4fe86ec1");
//    _pagesAgent_page.Switch_Tab();
//    
//
//pages.Business_navigation _pagesBusiness_navigation = new pages.Business_navigation(driver);
//    TestModellerLogger.SetLastNodeGuid("e4687602-1649-458e-98d6-5fd251e617a7");
//    _pagesBusiness_navigation.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("814387e0-8392-4488-9a17-4455bc12fd85");
//    _pagesBusiness_navigation.Click_Businesses();
//    
//
//    TestModellerLogger.SetLastNodeGuid("cc3b282b-3edd-4a58-b6a6-be910ce651c0");
//    _pagesBusiness_navigation.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("lexagen");
//    
//
//    TestModellerLogger.SetLastNodeGuid("74c7935f-a457-4a02-b25b-8bc76b81847f");
//    _pagesBusiness_navigation.Click_Search_();
//    
//
//    TestModellerLogger.SetLastNodeGuid("dcf609fe-ada5-48c3-b7d1-905de85570d5");
//    _pagesBusiness_navigation.Click__Lexagen_properties_private_limited();
//    
//
//    TestModellerLogger.SetLastNodeGuid("5b0e541d-261f-4d1e-a3a9-98333b95f672");
//    _pagesBusiness_navigation.Switch_Tab();
//    
//
//pages.Add_expense_reimbursement _pagesAdd_expense_reimbursement = new pages.Add_expense_reimbursement(driver);
//    TestModellerLogger.SetLastNodeGuid("b7e3ea26-cc72-4755-a32e-fecab46fe00a");
//    _pagesAdd_expense_reimbursement.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("2d8409d1-9061-4b7e-9f7a-0b69c829eb3a");
//    _pagesAdd_expense_reimbursement.Click_xPath_htmlbodyformmaindiv10div3div1div4divdiv2div1divdiv5divdivtabl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("8e696d0b-99bc-40ca-82f4-b57e2a885795");
//    _pagesAdd_expense_reimbursement.Select_ctl00cPHddlentryType("Expense");
//    
//
//    TestModellerLogger.SetLastNodeGuid("c187ef14-c6d3-46b0-871c-661e4b5a4fd9");
//    _pagesAdd_expense_reimbursement.Enter_ctl00cPHrptrExpensectl00txtDate("44061");
//    
//
//    TestModellerLogger.SetLastNodeGuid("86b77b31-ced9-47b7-9667-7a56c21873c9");
//    _pagesAdd_expense_reimbursement.Select_ctl00cPHrptrExpensectl00ddExpenseHead("Staff welfare");
//    
//
//    TestModellerLogger.SetLastNodeGuid("171df228-6735-4fa6-bc12-c815ebe3f086");
//    _pagesAdd_expense_reimbursement.Enter_ctl00cPHrptrExpensectl00txtDescription(driver, "abc13");
//    
//
//    TestModellerLogger.SetLastNodeGuid("01d9cf91-0090-477d-8cdf-100b6664748b");
//    _pagesAdd_expense_reimbursement.Enter_ctl00cPHrptrExpensectl00txtAmount("100");
//    
//
//    TestModellerLogger.SetLastNodeGuid("19eca6f4-98d1-420e-8411-c0a7535b3658");
//    _pagesAdd_expense_reimbursement.Select_ctl00cPHrptrExpensectl00ddVATRate("STD 20%");
//    
//
//    TestModellerLogger.SetLastNodeGuid("d7f910de-29ab-4702-909b-ddbddbec174c");
//    _pagesAdd_expense_reimbursement.Click__Save_();
//    
//
//pages.Expense_reimbursement _pagesExpense_reimbursement = new pages.Expense_reimbursement(driver);
//    TestModellerLogger.SetLastNodeGuid("ee1fe0ff-f180-45f6-8cbc-f11971fa11c3");
//    _pagesExpense_reimbursement.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("27db8869-ac7f-4ac7-8eee-e9e26082a5a8");
//    _pagesExpense_reimbursement.Click_Expenditure();
//    
//
//    TestModellerLogger.SetLastNodeGuid("5d6bf358-e1c3-4c35-8cb1-fe75cfbc8960");
//    _pagesExpense_reimbursement.Click_New_();
//    
//
//    TestModellerLogger.SetLastNodeGuid("473134d7-20c2-4815-9591-116c83e66fce");
//    _pagesExpense_reimbursement.Click_Expense_Reimbursement();
//    
//
//    }
//
//    @Test  (groups= {"5740733b-36e3-4da1-943f-9bb55a1db980","reimbursement scenario 4","reimbursement scenario 4 - Default Profile"},enabled=false)
//    @TestModellerPath(guid = "5740733b-36e3-4da1-943f-9bb55a1db980")
//    public void GoToUrlpositiveenterusernamepositiveenterpasswordClickLoginsuccessGoToUrlpositiveagentnameC16()
//    {
//        
//        pages.login _pageslogin = new pages.login(driver);
//    TestModellerLogger.SetLastNodeGuid("854a1118-4615-4409-996b-51f957f4b121");
//    _pageslogin.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("5f78d4ec-ef66-42ec-80d3-bff428d78f7b");
//    _pageslogin.Enter_ctl00cPHlogin("admin");
//    
//
//    TestModellerLogger.SetLastNodeGuid("98e3f377-efb7-4010-8f3a-04d5a7749cae");
//    _pageslogin.Enter_ctl00cPHpass("Staging@admin#92");
//    
//
//    TestModellerLogger.SetLastNodeGuid("0ac50b8f-4ab4-4855-a348-232e96ddfd82");
//    _pageslogin.Click_Login();
//    
//
//pages.Agent_page _pagesAgent_page = new pages.Agent_page(driver);
//    TestModellerLogger.SetLastNodeGuid("5ca4399f-c2c9-4907-89c2-1f3a8c74b5e9");
//    _pagesAgent_page.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("d1774d2f-8a96-4065-b7ad-7564424df697");
//    _pagesAgent_page.Enter_ctl00cPHFiltertxtAgentName("deepika");
//    
//
//    TestModellerLogger.SetLastNodeGuid("12624eac-97ad-4461-a189-3bdf32926acf");
//    _pagesAgent_page.Click_Search();
//    
//
//    TestModellerLogger.SetLastNodeGuid("86d6d989-b955-473d-b918-1371760f1e7f");
//    _pagesAgent_page.Click__Deepika_();
//    
//
//    TestModellerLogger.SetLastNodeGuid("fe49d2c8-15b6-4831-89b7-b3aa4fe86ec1");
//    _pagesAgent_page.Switch_Tab();
//    
//
//pages.Business_navigation _pagesBusiness_navigation = new pages.Business_navigation(driver);
//    TestModellerLogger.SetLastNodeGuid("e4687602-1649-458e-98d6-5fd251e617a7");
//    _pagesBusiness_navigation.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("814387e0-8392-4488-9a17-4455bc12fd85");
//    _pagesBusiness_navigation.Click_Businesses();
//    
//
//    TestModellerLogger.SetLastNodeGuid("cc3b282b-3edd-4a58-b6a6-be910ce651c0");
//    _pagesBusiness_navigation.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("lexagen");
//    
//
//    TestModellerLogger.SetLastNodeGuid("74c7935f-a457-4a02-b25b-8bc76b81847f");
//    _pagesBusiness_navigation.Click_Search_();
//    
//
//    TestModellerLogger.SetLastNodeGuid("dcf609fe-ada5-48c3-b7d1-905de85570d5");
//    _pagesBusiness_navigation.Click__Lexagen_properties_private_limited();
//    
//
//    TestModellerLogger.SetLastNodeGuid("5b0e541d-261f-4d1e-a3a9-98333b95f672");
//    _pagesBusiness_navigation.Switch_Tab();
//    
//
//pages.Add_expense_reimbursement _pagesAdd_expense_reimbursement = new pages.Add_expense_reimbursement(driver);
//    TestModellerLogger.SetLastNodeGuid("b7e3ea26-cc72-4755-a32e-fecab46fe00a");
//    _pagesAdd_expense_reimbursement.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("2d8409d1-9061-4b7e-9f7a-0b69c829eb3a");
//    _pagesAdd_expense_reimbursement.Click_xPath_htmlbodyformmaindiv10div3div1div4divdiv2div1divdiv5divdivtabl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("8e696d0b-99bc-40ca-82f4-b57e2a885795");
//    _pagesAdd_expense_reimbursement.Select_ctl00cPHddlentryType("Expense");
//    
//
//    TestModellerLogger.SetLastNodeGuid("c187ef14-c6d3-46b0-871c-661e4b5a4fd9");
//    _pagesAdd_expense_reimbursement.Enter_ctl00cPHrptrExpensectl00txtDate("44061");
//    
//
//    TestModellerLogger.SetLastNodeGuid("86b77b31-ced9-47b7-9667-7a56c21873c9");
//    _pagesAdd_expense_reimbursement.Select_ctl00cPHrptrExpensectl00ddExpenseHead("Subcontractors");
//    
//
//    TestModellerLogger.SetLastNodeGuid("171df228-6735-4fa6-bc12-c815ebe3f086");
//    _pagesAdd_expense_reimbursement.Enter_ctl00cPHrptrExpensectl00txtDescription(driver, "abc13");
//    
//
//    TestModellerLogger.SetLastNodeGuid("01d9cf91-0090-477d-8cdf-100b6664748b");
//    _pagesAdd_expense_reimbursement.Enter_ctl00cPHrptrExpensectl00txtAmount("100");
//    
//
//    TestModellerLogger.SetLastNodeGuid("19eca6f4-98d1-420e-8411-c0a7535b3658");
//    _pagesAdd_expense_reimbursement.Select_ctl00cPHrptrExpensectl00ddVATRate("STD 20%");
//    
//
//    TestModellerLogger.SetLastNodeGuid("d7f910de-29ab-4702-909b-ddbddbec174c");
//    _pagesAdd_expense_reimbursement.Click__Save_();
//    
//
//pages.Expense_reimbursement _pagesExpense_reimbursement = new pages.Expense_reimbursement(driver);
//    TestModellerLogger.SetLastNodeGuid("ee1fe0ff-f180-45f6-8cbc-f11971fa11c3");
//    _pagesExpense_reimbursement.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("27db8869-ac7f-4ac7-8eee-e9e26082a5a8");
//    _pagesExpense_reimbursement.Click_Expenditure();
//    
//
//    TestModellerLogger.SetLastNodeGuid("5d6bf358-e1c3-4c35-8cb1-fe75cfbc8960");
//    _pagesExpense_reimbursement.Click_New_();
//    
//
//    TestModellerLogger.SetLastNodeGuid("473134d7-20c2-4815-9591-116c83e66fce");
//    _pagesExpense_reimbursement.Click_Expense_Reimbursement();
//    
//
//    }
//
//    @Test  (groups= {"2f9f52cc-16e6-478f-b3be-c5cce800ebaf","reimbursement scenario 4","reimbursement scenario 4 - Default Profile"},enabled=false)
//    @TestModellerPath(guid = "2f9f52cc-16e6-478f-b3be-c5cce800ebaf")
//    public void GoToUrlpositiveenterusernamepositiveenterpasswordClickLoginsuccessGoToUrlpositiveagentnameC17()
//    {
//        
//        pages.login _pageslogin = new pages.login(driver);
//    TestModellerLogger.SetLastNodeGuid("854a1118-4615-4409-996b-51f957f4b121");
//    _pageslogin.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("5f78d4ec-ef66-42ec-80d3-bff428d78f7b");
//    _pageslogin.Enter_ctl00cPHlogin("admin");
//    
//
//    TestModellerLogger.SetLastNodeGuid("98e3f377-efb7-4010-8f3a-04d5a7749cae");
//    _pageslogin.Enter_ctl00cPHpass("Staging@admin#92");
//    
//
//    TestModellerLogger.SetLastNodeGuid("0ac50b8f-4ab4-4855-a348-232e96ddfd82");
//    _pageslogin.Click_Login();
//    
//
//pages.Agent_page _pagesAgent_page = new pages.Agent_page(driver);
//    TestModellerLogger.SetLastNodeGuid("5ca4399f-c2c9-4907-89c2-1f3a8c74b5e9");
//    _pagesAgent_page.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("d1774d2f-8a96-4065-b7ad-7564424df697");
//    _pagesAgent_page.Enter_ctl00cPHFiltertxtAgentName("deepika");
//    
//
//    TestModellerLogger.SetLastNodeGuid("12624eac-97ad-4461-a189-3bdf32926acf");
//    _pagesAgent_page.Click_Search();
//    
//
//    TestModellerLogger.SetLastNodeGuid("86d6d989-b955-473d-b918-1371760f1e7f");
//    _pagesAgent_page.Click__Deepika_();
//    
//
//    TestModellerLogger.SetLastNodeGuid("fe49d2c8-15b6-4831-89b7-b3aa4fe86ec1");
//    _pagesAgent_page.Switch_Tab();
//    
//
//pages.Business_navigation _pagesBusiness_navigation = new pages.Business_navigation(driver);
//    TestModellerLogger.SetLastNodeGuid("e4687602-1649-458e-98d6-5fd251e617a7");
//    _pagesBusiness_navigation.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("814387e0-8392-4488-9a17-4455bc12fd85");
//    _pagesBusiness_navigation.Click_Businesses();
//    
//
//    TestModellerLogger.SetLastNodeGuid("cc3b282b-3edd-4a58-b6a6-be910ce651c0");
//    _pagesBusiness_navigation.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("lexagen");
//    
//
//    TestModellerLogger.SetLastNodeGuid("74c7935f-a457-4a02-b25b-8bc76b81847f");
//    _pagesBusiness_navigation.Click_Search_();
//    
//
//    TestModellerLogger.SetLastNodeGuid("dcf609fe-ada5-48c3-b7d1-905de85570d5");
//    _pagesBusiness_navigation.Click__Lexagen_properties_private_limited();
//    
//
//    TestModellerLogger.SetLastNodeGuid("5b0e541d-261f-4d1e-a3a9-98333b95f672");
//    _pagesBusiness_navigation.Switch_Tab();
//    
//
//pages.Add_expense_reimbursement _pagesAdd_expense_reimbursement = new pages.Add_expense_reimbursement(driver);
//    TestModellerLogger.SetLastNodeGuid("b7e3ea26-cc72-4755-a32e-fecab46fe00a");
//    _pagesAdd_expense_reimbursement.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("2d8409d1-9061-4b7e-9f7a-0b69c829eb3a");
//    _pagesAdd_expense_reimbursement.Click_xPath_htmlbodyformmaindiv10div3div1div4divdiv2div1divdiv5divdivtabl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("8e696d0b-99bc-40ca-82f4-b57e2a885795");
//    _pagesAdd_expense_reimbursement.Select_ctl00cPHddlentryType("Expense");
//    
//
//    TestModellerLogger.SetLastNodeGuid("c187ef14-c6d3-46b0-871c-661e4b5a4fd9");
//    _pagesAdd_expense_reimbursement.Enter_ctl00cPHrptrExpensectl00txtDate("44061");
//    
//
//    TestModellerLogger.SetLastNodeGuid("86b77b31-ced9-47b7-9667-7a56c21873c9");
//    _pagesAdd_expense_reimbursement.Select_ctl00cPHrptrExpensectl00ddExpenseHead("Sundry expenses");
//    
//
//    TestModellerLogger.SetLastNodeGuid("171df228-6735-4fa6-bc12-c815ebe3f086");
//    _pagesAdd_expense_reimbursement.Enter_ctl00cPHrptrExpensectl00txtDescription(driver, "abc14");
//    
//
//    TestModellerLogger.SetLastNodeGuid("01d9cf91-0090-477d-8cdf-100b6664748b");
//    _pagesAdd_expense_reimbursement.Enter_ctl00cPHrptrExpensectl00txtAmount("100");
//    
//
//    TestModellerLogger.SetLastNodeGuid("19eca6f4-98d1-420e-8411-c0a7535b3658");
//    _pagesAdd_expense_reimbursement.Select_ctl00cPHrptrExpensectl00ddVATRate("STD 20%");
//    
//
//    TestModellerLogger.SetLastNodeGuid("d7f910de-29ab-4702-909b-ddbddbec174c");
//    _pagesAdd_expense_reimbursement.Click__Save_();
//    
//
//pages.Expense_reimbursement _pagesExpense_reimbursement = new pages.Expense_reimbursement(driver);
//    TestModellerLogger.SetLastNodeGuid("ee1fe0ff-f180-45f6-8cbc-f11971fa11c3");
//    _pagesExpense_reimbursement.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("27db8869-ac7f-4ac7-8eee-e9e26082a5a8");
//    _pagesExpense_reimbursement.Click_Expenditure();
//    
//
//    TestModellerLogger.SetLastNodeGuid("5d6bf358-e1c3-4c35-8cb1-fe75cfbc8960");
//    _pagesExpense_reimbursement.Click_New_();
//    
//
//    TestModellerLogger.SetLastNodeGuid("473134d7-20c2-4815-9591-116c83e66fce");
//    _pagesExpense_reimbursement.Click_Expense_Reimbursement();
//    
//
//    }
//
//    @Test  (groups= {"a9eebc24-9f84-4039-8bf0-36c1348e6795","reimbursement scenario 4","reimbursement scenario 4 - Default Profile"},enabled=false)
//    @TestModellerPath(guid = "a9eebc24-9f84-4039-8bf0-36c1348e6795")
//    public void GoToUrlpositiveenterusernamepositiveenterpasswordClickLoginsuccessGoToUrlpositiveagentnameC18()
//    {
//        
//        pages.login _pageslogin = new pages.login(driver);
//    TestModellerLogger.SetLastNodeGuid("854a1118-4615-4409-996b-51f957f4b121");
//    _pageslogin.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("5f78d4ec-ef66-42ec-80d3-bff428d78f7b");
//    _pageslogin.Enter_ctl00cPHlogin("admin");
//    
//
//    TestModellerLogger.SetLastNodeGuid("98e3f377-efb7-4010-8f3a-04d5a7749cae");
//    _pageslogin.Enter_ctl00cPHpass("Staging@admin#92");
//    
//
//    TestModellerLogger.SetLastNodeGuid("0ac50b8f-4ab4-4855-a348-232e96ddfd82");
//    _pageslogin.Click_Login();
//    
//
//pages.Agent_page _pagesAgent_page = new pages.Agent_page(driver);
//    TestModellerLogger.SetLastNodeGuid("5ca4399f-c2c9-4907-89c2-1f3a8c74b5e9");
//    _pagesAgent_page.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("d1774d2f-8a96-4065-b7ad-7564424df697");
//    _pagesAgent_page.Enter_ctl00cPHFiltertxtAgentName("deepika");
//    
//
//    TestModellerLogger.SetLastNodeGuid("12624eac-97ad-4461-a189-3bdf32926acf");
//    _pagesAgent_page.Click_Search();
//    
//
//    TestModellerLogger.SetLastNodeGuid("86d6d989-b955-473d-b918-1371760f1e7f");
//    _pagesAgent_page.Click__Deepika_();
//    
//
//    TestModellerLogger.SetLastNodeGuid("fe49d2c8-15b6-4831-89b7-b3aa4fe86ec1");
//    _pagesAgent_page.Switch_Tab();
//    
//
//pages.Business_navigation _pagesBusiness_navigation = new pages.Business_navigation(driver);
//    TestModellerLogger.SetLastNodeGuid("e4687602-1649-458e-98d6-5fd251e617a7");
//    _pagesBusiness_navigation.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("814387e0-8392-4488-9a17-4455bc12fd85");
//    _pagesBusiness_navigation.Click_Businesses();
//    
//
//    TestModellerLogger.SetLastNodeGuid("cc3b282b-3edd-4a58-b6a6-be910ce651c0");
//    _pagesBusiness_navigation.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("lexagen");
//    
//
//    TestModellerLogger.SetLastNodeGuid("74c7935f-a457-4a02-b25b-8bc76b81847f");
//    _pagesBusiness_navigation.Click_Search_();
//    
//
//    TestModellerLogger.SetLastNodeGuid("dcf609fe-ada5-48c3-b7d1-905de85570d5");
//    _pagesBusiness_navigation.Click__Lexagen_properties_private_limited();
//    
//
//    TestModellerLogger.SetLastNodeGuid("5b0e541d-261f-4d1e-a3a9-98333b95f672");
//    _pagesBusiness_navigation.Switch_Tab();
//    
//
//pages.Add_expense_reimbursement _pagesAdd_expense_reimbursement = new pages.Add_expense_reimbursement(driver);
//    TestModellerLogger.SetLastNodeGuid("b7e3ea26-cc72-4755-a32e-fecab46fe00a");
//    _pagesAdd_expense_reimbursement.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("2d8409d1-9061-4b7e-9f7a-0b69c829eb3a");
//    _pagesAdd_expense_reimbursement.Click_xPath_htmlbodyformmaindiv10div3div1div4divdiv2div1divdiv5divdivtabl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("8e696d0b-99bc-40ca-82f4-b57e2a885795");
//    _pagesAdd_expense_reimbursement.Select_ctl00cPHddlentryType("Expense");
//    
//
//    TestModellerLogger.SetLastNodeGuid("c187ef14-c6d3-46b0-871c-661e4b5a4fd9");
//    _pagesAdd_expense_reimbursement.Enter_ctl00cPHrptrExpensectl00txtDate("44061");
//    
//
//    TestModellerLogger.SetLastNodeGuid("86b77b31-ced9-47b7-9667-7a56c21873c9");
//    _pagesAdd_expense_reimbursement.Select_ctl00cPHrptrExpensectl00ddExpenseHead("Telephone, internet and broadband");
//    
//
//    TestModellerLogger.SetLastNodeGuid("171df228-6735-4fa6-bc12-c815ebe3f086");
//    _pagesAdd_expense_reimbursement.Enter_ctl00cPHrptrExpensectl00txtDescription(driver, "abc15.");
//    
//
//    TestModellerLogger.SetLastNodeGuid("01d9cf91-0090-477d-8cdf-100b6664748b");
//    _pagesAdd_expense_reimbursement.Enter_ctl00cPHrptrExpensectl00txtAmount("100");
//    
//
//    TestModellerLogger.SetLastNodeGuid("19eca6f4-98d1-420e-8411-c0a7535b3658");
//    _pagesAdd_expense_reimbursement.Select_ctl00cPHrptrExpensectl00ddVATRate("STD 20%");
//    
//
//    TestModellerLogger.SetLastNodeGuid("d7f910de-29ab-4702-909b-ddbddbec174c");
//    _pagesAdd_expense_reimbursement.Click__Save_();
//    
//
//pages.Expense_reimbursement _pagesExpense_reimbursement = new pages.Expense_reimbursement(driver);
//    TestModellerLogger.SetLastNodeGuid("ee1fe0ff-f180-45f6-8cbc-f11971fa11c3");
//    _pagesExpense_reimbursement.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("27db8869-ac7f-4ac7-8eee-e9e26082a5a8");
//    _pagesExpense_reimbursement.Click_Expenditure();
//    
//
//    TestModellerLogger.SetLastNodeGuid("5d6bf358-e1c3-4c35-8cb1-fe75cfbc8960");
//    _pagesExpense_reimbursement.Click_New_();
//    
//
//    TestModellerLogger.SetLastNodeGuid("473134d7-20c2-4815-9591-116c83e66fce");
//    _pagesExpense_reimbursement.Click_Expense_Reimbursement();
//    
//
//    }
//
//    @Test  (groups= {"6d91acdc-2c54-44a4-95ea-1ab28becc1f6","reimbursement scenario 4","reimbursement scenario 4 - Default Profile"},enabled=false)
//    @TestModellerPath(guid = "6d91acdc-2c54-44a4-95ea-1ab28becc1f6")
//    public void GoToUrlpositiveenterusernamepositiveenterpasswordClickLoginsuccessGoToUrlpositiveagentnameC19()
//    {
//        
//        pages.login _pageslogin = new pages.login(driver);
//    TestModellerLogger.SetLastNodeGuid("854a1118-4615-4409-996b-51f957f4b121");
//    _pageslogin.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("5f78d4ec-ef66-42ec-80d3-bff428d78f7b");
//    _pageslogin.Enter_ctl00cPHlogin("admin");
//    
//
//    TestModellerLogger.SetLastNodeGuid("98e3f377-efb7-4010-8f3a-04d5a7749cae");
//    _pageslogin.Enter_ctl00cPHpass("Staging@admin#92");
//    
//
//    TestModellerLogger.SetLastNodeGuid("0ac50b8f-4ab4-4855-a348-232e96ddfd82");
//    _pageslogin.Click_Login();
//    
//
//pages.Agent_page _pagesAgent_page = new pages.Agent_page(driver);
//    TestModellerLogger.SetLastNodeGuid("5ca4399f-c2c9-4907-89c2-1f3a8c74b5e9");
//    _pagesAgent_page.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("d1774d2f-8a96-4065-b7ad-7564424df697");
//    _pagesAgent_page.Enter_ctl00cPHFiltertxtAgentName("deepika");
//    
//
//    TestModellerLogger.SetLastNodeGuid("12624eac-97ad-4461-a189-3bdf32926acf");
//    _pagesAgent_page.Click_Search();
//    
//
//    TestModellerLogger.SetLastNodeGuid("86d6d989-b955-473d-b918-1371760f1e7f");
//    _pagesAgent_page.Click__Deepika_();
//    
//
//    TestModellerLogger.SetLastNodeGuid("fe49d2c8-15b6-4831-89b7-b3aa4fe86ec1");
//    _pagesAgent_page.Switch_Tab();
//    
//
//pages.Business_navigation _pagesBusiness_navigation = new pages.Business_navigation(driver);
//    TestModellerLogger.SetLastNodeGuid("e4687602-1649-458e-98d6-5fd251e617a7");
//    _pagesBusiness_navigation.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("814387e0-8392-4488-9a17-4455bc12fd85");
//    _pagesBusiness_navigation.Click_Businesses();
//    
//
//    TestModellerLogger.SetLastNodeGuid("cc3b282b-3edd-4a58-b6a6-be910ce651c0");
//    _pagesBusiness_navigation.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("lexagen");
//    
//
//    TestModellerLogger.SetLastNodeGuid("74c7935f-a457-4a02-b25b-8bc76b81847f");
//    _pagesBusiness_navigation.Click_Search_();
//    
//
//    TestModellerLogger.SetLastNodeGuid("dcf609fe-ada5-48c3-b7d1-905de85570d5");
//    _pagesBusiness_navigation.Click__Lexagen_properties_private_limited();
//    
//
//    TestModellerLogger.SetLastNodeGuid("5b0e541d-261f-4d1e-a3a9-98333b95f672");
//    _pagesBusiness_navigation.Switch_Tab();
//    
//
//pages.Add_expense_reimbursement _pagesAdd_expense_reimbursement = new pages.Add_expense_reimbursement(driver);
//    TestModellerLogger.SetLastNodeGuid("b7e3ea26-cc72-4755-a32e-fecab46fe00a");
//    _pagesAdd_expense_reimbursement.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("2d8409d1-9061-4b7e-9f7a-0b69c829eb3a");
//    _pagesAdd_expense_reimbursement.Click_xPath_htmlbodyformmaindiv10div3div1div4divdiv2div1divdiv5divdivtabl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("8e696d0b-99bc-40ca-82f4-b57e2a885795");
//    _pagesAdd_expense_reimbursement.Select_ctl00cPHddlentryType("Expense");
//    
//
//    TestModellerLogger.SetLastNodeGuid("c187ef14-c6d3-46b0-871c-661e4b5a4fd9");
//    _pagesAdd_expense_reimbursement.Enter_ctl00cPHrptrExpensectl00txtDate("44061");
//    
//
//    TestModellerLogger.SetLastNodeGuid("86b77b31-ced9-47b7-9667-7a56c21873c9");
//    _pagesAdd_expense_reimbursement.Select_ctl00cPHrptrExpensectl00ddExpenseHead("Travel and overseas travelling");
//    
//
//    TestModellerLogger.SetLastNodeGuid("171df228-6735-4fa6-bc12-c815ebe3f086");
//    _pagesAdd_expense_reimbursement.Enter_ctl00cPHrptrExpensectl00txtDescription(driver, "abc16");
//    
//
//    TestModellerLogger.SetLastNodeGuid("01d9cf91-0090-477d-8cdf-100b6664748b");
//    _pagesAdd_expense_reimbursement.Enter_ctl00cPHrptrExpensectl00txtAmount("100");
//    
//
//    TestModellerLogger.SetLastNodeGuid("19eca6f4-98d1-420e-8411-c0a7535b3658");
//    _pagesAdd_expense_reimbursement.Select_ctl00cPHrptrExpensectl00ddVATRate("STD 20%");
//    
//
//    TestModellerLogger.SetLastNodeGuid("d7f910de-29ab-4702-909b-ddbddbec174c");
//    _pagesAdd_expense_reimbursement.Click__Save_();
//    
//
//pages.Expense_reimbursement _pagesExpense_reimbursement = new pages.Expense_reimbursement(driver);
//    TestModellerLogger.SetLastNodeGuid("ee1fe0ff-f180-45f6-8cbc-f11971fa11c3");
//    _pagesExpense_reimbursement.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("27db8869-ac7f-4ac7-8eee-e9e26082a5a8");
//    _pagesExpense_reimbursement.Click_Expenditure();
//    
//
//    TestModellerLogger.SetLastNodeGuid("5d6bf358-e1c3-4c35-8cb1-fe75cfbc8960");
//    _pagesExpense_reimbursement.Click_New_();
//    
//
//    TestModellerLogger.SetLastNodeGuid("473134d7-20c2-4815-9591-116c83e66fce");
//    _pagesExpense_reimbursement.Click_Expense_Reimbursement();
//    
//
//    }
//
//}
