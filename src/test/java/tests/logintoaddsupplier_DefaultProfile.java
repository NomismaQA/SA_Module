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

//http://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/2e749a42-d94e-4c50-b50e-4231fe99f7a5
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 234, profileId = 100192)
public class logintoaddsupplier_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"940ae60e-b4de-4042-a31e-8a2b5c61194d","login to add supplier","login to add supplier - Default Profile"})
    @TestModellerPath(guid = "940ae60e-b4de-4042-a31e-8a2b5c61194d")
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
    

pages.Add_supplier _pagesAdd_supplier = new pages.Add_supplier(driver);
    TestModellerLogger.SetLastNodeGuid("4a525ec5-4fcc-4edd-a8f9-8ccd1a5f266f");
    _pagesAdd_supplier.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("413af41d-73d2-4edd-bf88-0962d312f4b8");
    _pagesAdd_supplier.Click_xPath_htmlbodyformmaindiv10div3div1div4divdiv2div1divdiv2divdivtabl();
    

    TestModellerLogger.SetLastNodeGuid("697a987e-1ff5-4ee8-874d-fa76a70db712");
    _pagesAdd_supplier.Enter_ctl00cPHtxtSupplierName("Finco Private limited");
    

    TestModellerLogger.SetLastNodeGuid("4dace74d-88bd-4bc8-af26-32cf51fc8802");
    _pagesAdd_supplier.Enter_ctl00cPHtxtContactName("ELina");
    

    TestModellerLogger.SetLastNodeGuid("e9ed31de-c7da-40b3-8c08-650adb61038a");
    _pagesAdd_supplier.Enter_ctl00cPHtxtPhone("8287617116");
    

    TestModellerLogger.SetLastNodeGuid("5174ef6a-cbef-48ca-b0e2-f9bfda9df693");
    _pagesAdd_supplier.Enter_ctl00cPHtxtEmail("deepika@nomisma.co.uk");
    

    TestModellerLogger.SetLastNodeGuid("b15e3979-1c07-474c-8fcb-8787f9411fe2");
    _pagesAdd_supplier.Enter_ctl00cPHtxtAddress1("Edgeware road");
    

    TestModellerLogger.SetLastNodeGuid("e5396654-5240-4ed7-8140-2e02c1288983");
    _pagesAdd_supplier.Enter_ctl00cPHtxtAddress2("LOndon");
    

    TestModellerLogger.SetLastNodeGuid("cfe3f158-6da1-4936-9974-96d3fe1329d2");
    _pagesAdd_supplier.Enter_ctl00cPHtxtPostCode("E14 9PX");
    

    TestModellerLogger.SetLastNodeGuid("09c11fd7-ecbf-4924-bd1c-7379c733346f");
    _pagesAdd_supplier.Click__Save_();
    

pages.supplier_list _pagessupplier_list = new pages.supplier_list(driver);
    TestModellerLogger.SetLastNodeGuid("dfaa8212-3a84-44cb-b6c6-0a2c37dccf9b");
    _pagessupplier_list.Click_Expenditure();
    

    TestModellerLogger.SetLastNodeGuid("075a2b6e-7ac2-4183-86fa-e8dd750e40a0");
    _pagessupplier_list.Click_New_();
    

    TestModellerLogger.SetLastNodeGuid("9856c5d7-35d5-4b8e-a644-1e4df3ce5083");
    _pagessupplier_list.Click__Supplier_List_();
    

    }

}
