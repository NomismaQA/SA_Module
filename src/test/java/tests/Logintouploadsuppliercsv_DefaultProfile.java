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

//http://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/c828a9f1-14fe-4c50-b9f0-d9d792ed06ed
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 251, profileId = 100203)
public class Logintouploadsuppliercsv_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"f8babcfd-dbc2-424e-9beb-c1c9b0288077","Login to upload supplier csv","Login to upload supplier csv - Default Profile"})
    @TestModellerPath(guid = "f8babcfd-dbc2-424e-9beb-c1c9b0288077")
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
    

pages.Supplierupload_feature _pagesSupplierupload_feature = new pages.Supplierupload_feature(driver);
    TestModellerLogger.SetLastNodeGuid("a9221279-fd05-435f-ae24-4ed74161c468");
    _pagesSupplierupload_feature.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("261a0eef-b30b-4f6c-8667-dd051c9220a4");
    _pagesSupplierupload_feature.Click_xPath_htmlbodyformmaindiv10div3div1div4divdiv2div1divdiv2divdivtabl();
    

    TestModellerLogger.SetLastNodeGuid("e1a520b5-82ce-462f-a69e-80aabb078d3f");
    _pagesSupplierupload_feature.Enter_ctl00cPHFileUpload1("");
    

    TestModellerLogger.SetLastNodeGuid("a9f06224-647c-4d35-a291-246174dae9c0");
    _pagesSupplierupload_feature.Click_Upload_();
    

    TestModellerLogger.SetLastNodeGuid("3fa2c88a-b0ac-4683-8e47-17fa73ef10da");
    _pagesSupplierupload_feature.Select_ctl00cPHrptrDisplayRecordsctl01ddExpenseHead("Purchases");
    

    TestModellerLogger.SetLastNodeGuid("0ecfb05d-2da7-4f22-9e2c-1c6fc150c15e");
    _pagesSupplierupload_feature.Select_ctl00cPHrptrDisplayRecordsctl01ddVatType("STD 20%");
    

    TestModellerLogger.SetLastNodeGuid("9b96dbb7-e706-4bae-b8b2-29c5b29fa5d9");
    _pagesSupplierupload_feature.Click__Import_();
    

    TestModellerLogger.SetLastNodeGuid("c6073abb-193b-4254-abea-fd3bb3b66962");
    _pagesSupplierupload_feature.Click_Expenditure();
    

    }

}
