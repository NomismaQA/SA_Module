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

//http://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/fdb61a2b-b0cb-4a9f-b67f-a05f0bd925a0
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 262, profileId = 100223)
public class Directorbalance_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"5a7a124f-ba61-4465-95ff-fb451cf52c93","Director balance","Director balance - Default Profile"})
    @TestModellerPath(guid = "5a7a124f-ba61-4465-95ff-fb451cf52c93")
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
    

pages.Director_balance_verification _pagesDirector_balance_verification = new pages.Director_balance_verification(driver);
//    TestModellerLogger.SetLastNodeGuid("fe1e8588-9f07-4a1d-b84c-54286e471171");
//    _pagesDirector_balance_verification.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("27d2d86c-9a3b-4df7-88c7-be0f63ec7808");
    _pagesDirector_balance_verification.Click_Deepika_Arya();
    

    TestModellerLogger.SetLastNodeGuid("2459c78d-7580-4390-94e1-68b07fc47636");
    _pagesDirector_balance_verification.Click__2500();
    

    }

}
