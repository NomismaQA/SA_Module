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

//http://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/10149eec-c15a-4e6b-b900-70989fef765d
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 208, profileId = 100160)
public class Logintoaddcustomer_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"35040afe-c830-4639-b005-dabdc34e0c64","Login to add customer","Login to add customer - Default Profile"})
    @TestModellerPath(guid = "35040afe-c830-4639-b005-dabdc34e0c64")
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
//    TestModellerLogger.SetLastNodeGuid("5ca4399f-c2c9-4907-89c2-1f3a8c74b5e9");
//    _pagesAgent_page.GoToUrl();
    

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
    

pages.new_customer _pagesnew_customer = new pages.new_customer(driver);
    TestModellerLogger.SetLastNodeGuid("f100c5bb-38f7-4b03-91ec-576b9e43a4d6");
    _pagesnew_customer.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("e1cc0f95-4dce-424c-971d-c12b1af9eb4a");
    _pagesnew_customer.Click_xPath_htmlbodyformmaindiv10div3div1div4divdiv2div1divdiv1divdivdiv();
    

    TestModellerLogger.SetLastNodeGuid("9ee16a86-e563-4847-a3a7-4ff15a57abef");
    _pagesnew_customer.Enter_ctl00cPHtxtCustomerName("david");
    

    TestModellerLogger.SetLastNodeGuid("3343a3e6-39c4-4a13-8552-49ed360cdfb0");
    _pagesnew_customer.Enter_ctl00cPHtxtContactName("david");
    

    TestModellerLogger.SetLastNodeGuid("ee8903e2-aa25-43b0-b401-b5a9f7dda15f");
    _pagesnew_customer.Enter_ctl00cPHtxtContactLastName("Smith");
    

    TestModellerLogger.SetLastNodeGuid("e773a61b-f3e5-410d-a3ea-3671ce7bf0d5");
    _pagesnew_customer.Enter_ctl00cPHtxtPhone("1234567890");
    

    TestModellerLogger.SetLastNodeGuid("50189b7c-b21f-4d33-b4bd-de4f65a2eb34");
    _pagesnew_customer.Enter_ctl00cPHtxtEmail("deepika@nomisma.co.uk");
    

    TestModellerLogger.SetLastNodeGuid("36f20909-4e46-4026-89db-16b3ff158300");
    _pagesnew_customer.Enter_ctl00cPHtxtAddress1("Edgeware road");
    

    TestModellerLogger.SetLastNodeGuid("230d70ea-dd39-4454-8fd4-4b5fc3c167e7");
    _pagesnew_customer.Enter_ctl00cPHtxtAddress2("London");
    

    TestModellerLogger.SetLastNodeGuid("fbeb9062-018a-4d47-bc19-a00cf0f63fb3");
    _pagesnew_customer.Enter_ctl00cPHtxtPostCode("E14 9PX");
    

    TestModellerLogger.SetLastNodeGuid("0ecbdd6e-02b9-4660-8de3-3bb76bcb8e12");
    _pagesnew_customer.Click_Save();
    

    }

}
