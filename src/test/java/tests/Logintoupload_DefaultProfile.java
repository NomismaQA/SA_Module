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

//http://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/0cdf9603-74b5-4bc6-9e4b-6dbb9c83b55b
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 231, profileId = 100184)
public class Logintoupload_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"ce7713fd-92f4-4a59-8f52-7fa60ef23ff6","Login to upload","Login to upload - Default Profile"})
    @TestModellerPath(guid = "ce7713fd-92f4-4a59-8f52-7fa60ef23ff6")
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
    

pages.sales_upload_feature _pagessales_upload_feature = new pages.sales_upload_feature(driver);
    TestModellerLogger.SetLastNodeGuid("4c7b5061-1446-4ddb-bc48-740a37c9d71b");
    _pagessales_upload_feature.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("49ea4574-5794-4b39-9bac-c27435778cb4");
    _pagessales_upload_feature.Click_xPath_htmlbodyformmaindiv10div3div1div4divdiv2div1divdiv1divdivdiv();
    

    TestModellerLogger.SetLastNodeGuid("b02f2659-cfca-4034-bfd0-4e38dfd6eda5");
    _pagessales_upload_feature.Enter_ctl00cPHFileUpload1("");
    

    TestModellerLogger.SetLastNodeGuid("e062f2e8-0e0a-40f4-bad2-02a17cc641b3");
    _pagessales_upload_feature.Click_Upload_();
    

pages.import_csv _pagesimport_csv = new pages.import_csv(driver);
    TestModellerLogger.SetLastNodeGuid("f0bedc3d-42be-44ff-a594-01aa19060e8c");
    _pagesimport_csv.Select_ctl00cPHrptrDisplayHeaderctl01ddlBank("Maria");
    

    TestModellerLogger.SetLastNodeGuid("e5800f30-fc8d-4b8e-a669-224e5359dba7");
    _pagesimport_csv.Select_ctl00cPHrptrDisplayHeaderctl01ddVatCode11("STD 20%");
    

    TestModellerLogger.SetLastNodeGuid("8bbf1552-a138-4dc2-80a3-6b808e2ed049");
    _pagesimport_csv.Click__Import_();
    

pages.income_dashboardlist _pagesincome_dashboardlist = new pages.income_dashboardlist(driver);
    TestModellerLogger.SetLastNodeGuid("031502c2-671c-40db-a374-7e55b2413392");
    _pagesincome_dashboardlist.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("93cd7fcd-bd33-42cc-91e0-d5614caa3f2b");
    _pagesincome_dashboardlist.Click_Sales();
    

    }

}
