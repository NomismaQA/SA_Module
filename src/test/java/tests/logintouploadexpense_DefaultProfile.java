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

//http://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/65459307-2c1a-456d-a618-17b078ff16f3
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 260, profileId = 100216)
public class logintouploadexpense_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"3ded1c4c-7243-4cb0-a553-ee9bd5e79525","login to upload expense","login to upload expense - Default Profile"})
    @TestModellerPath(guid = "3ded1c4c-7243-4cb0-a553-ee9bd5e79525")
    public void GoToUrlpositiveenterusernamepositiveenterpasswordClickLoginsuccessGoToUrlpositiveagentnameCl()
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
    

pages.upload_expense _pagesupload_expense = new pages.upload_expense(driver);
    TestModellerLogger.SetLastNodeGuid("683ac2e1-df5a-4076-aad0-c7aac62d0ced");
    _pagesupload_expense.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("0831d88e-7580-4ec6-8f4d-4fdd35e9ed5a");
    _pagesupload_expense.Click_xPath_htmlbodyformmaindiv10div3div1div4divdiv2div1divdiv5divdivtabl();
    

    TestModellerLogger.SetLastNodeGuid("53beeb87-b4a2-4deb-bfc1-1515ba7779ca");
    _pagesupload_expense.Enter_ctl00cPHfuExpenseList("");
    

    TestModellerLogger.SetLastNodeGuid("ad6f4252-a071-4554-82ba-d973cde89bd1");
    _pagesupload_expense.Click__Upload_();
    

    TestModellerLogger.SetLastNodeGuid("73648c90-60e5-4c76-b080-49241a201cd5");
    _pagesupload_expense.Click__Save_();
    

pages.ledger_report _pagesledger_report = new pages.ledger_report(driver);
//    TestModellerLogger.SetLastNodeGuid("10a93e7b-89d4-4e19-9a88-e060adcfc4fc");
//    _pagesledger_report.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("5ed5d463-01ac-4af1-8b37-9b046a594b3f");
    _pagesledger_report.Click_Reports();
    

    TestModellerLogger.SetLastNodeGuid("b710b1e5-b8bc-4f42-96b0-e9ff4c68ef40");
    _pagesledger_report.Click_Ledger();
    

    }

}
