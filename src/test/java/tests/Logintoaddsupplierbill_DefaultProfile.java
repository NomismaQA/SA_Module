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

//http://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/5dbe0738-468c-4d63-b01b-29205ce9e2d9
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 250, profileId = 100201)
public class Logintoaddsupplierbill_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"c433e9e6-ffd7-4eee-bede-dbbe77082b6c","Login to add supplier bill","Login to add supplier bill - Default Profile"})
    @TestModellerPath(guid = "c433e9e6-ffd7-4eee-bede-dbbe77082b6c")
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
    

pages.Add_supplier_bill _pagesAdd_supplier_bill = new pages.Add_supplier_bill(driver);
    TestModellerLogger.SetLastNodeGuid("27fa65bf-52c7-409d-b822-a20c9f7cfe10");
    _pagesAdd_supplier_bill.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("8cbf16c4-0129-478f-b3fc-233ef9f32d85");
    _pagesAdd_supplier_bill.Click_xPath_htmlbodyformmaindiv10div3div1div4divdiv2div1divdiv2divdivtabl();
    

    TestModellerLogger.SetLastNodeGuid("3a9dabee-dc50-4041-8f36-dd3f5dcf2ae2");
    _pagesAdd_supplier_bill.Select_ctl00cPHddlSupplier("Generic Purchase Supplier");
    

    TestModellerLogger.SetLastNodeGuid("156f8971-828f-4069-958b-42810cf25a73");
    _pagesAdd_supplier_bill.Enter_ctl00cPHtxtDate("30/04/2020");
    

    TestModellerLogger.SetLastNodeGuid("c079b156-d1f8-40c8-868b-f3a74a1d4469");
    _pagesAdd_supplier_bill.Select_ctl00cPHrptrProductctl00ddExpenseHead("Purchases");
    

    TestModellerLogger.SetLastNodeGuid("a000ee48-649a-4d9d-b106-49af3544c21c");
    _pagesAdd_supplier_bill.Enter_ctl00cPHrptrProductctl00txtDescription("material");
    

    TestModellerLogger.SetLastNodeGuid("0b46be65-b21d-4d7b-abcc-5f25d3a46273");
    _pagesAdd_supplier_bill.Enter_ctl00cPHrptrProductctl00txtUnitPrice("1500");
    

    TestModellerLogger.SetLastNodeGuid("ed2b1261-c2a9-44a1-a549-dd5175e24320");
    _pagesAdd_supplier_bill.Click__Save_();
    

pages.supplier_list _pagessupplier_list = new pages.supplier_list(driver);
    TestModellerLogger.SetLastNodeGuid("05d0643c-445d-45ae-a2b0-048127fe904e");
    _pagessupplier_list.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("28dadb14-b0fe-4487-a3cc-41f1b9663360");
    _pagessupplier_list.Click_Expenditure();
    

    }}

//    @Test  (groups= {"e7190349-448a-45fa-b23d-2d6dcbe2054c","Login to add supplier bill","Login to add supplier bill - Default Profile"})
//    @TestModellerPath(guid = "e7190349-448a-45fa-b23d-2d6dcbe2054c")
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
//pages.Add_supplier_bill _pagesAdd_supplier_bill = new pages.Add_supplier_bill(driver);
//    TestModellerLogger.SetLastNodeGuid("27fa65bf-52c7-409d-b822-a20c9f7cfe10");
//    _pagesAdd_supplier_bill.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("8cbf16c4-0129-478f-b3fc-233ef9f32d85");
//    _pagesAdd_supplier_bill.Click_xPath_htmlbodyformmaindiv10div3div1div4divdiv2div1divdiv2divdivtabl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("3a9dabee-dc50-4041-8f36-dd3f5dcf2ae2");
//    _pagesAdd_supplier_bill.Select_ctl00cPHddlSupplier("Generic Purchase Supplier");
//    
//
//    TestModellerLogger.SetLastNodeGuid("156f8971-828f-4069-958b-42810cf25a73");
//    _pagesAdd_supplier_bill.Enter_ctl00cPHtxtDate("44061");
//    
//
//    TestModellerLogger.SetLastNodeGuid("c079b156-d1f8-40c8-868b-f3a74a1d4469");
//    _pagesAdd_supplier_bill.Select_ctl00cPHrptrProductctl00ddExpenseHead("Subcontractors");
//    
//
//    TestModellerLogger.SetLastNodeGuid("a000ee48-649a-4d9d-b106-49af3544c21c");
//    _pagesAdd_supplier_bill.Enter_ctl00cPHrptrProductctl00txtDescription("material");
//    
//
//    TestModellerLogger.SetLastNodeGuid("0b46be65-b21d-4d7b-abcc-5f25d3a46273");
//    _pagesAdd_supplier_bill.Enter_ctl00cPHrptrProductctl00txtUnitPrice("1500");
//    
//
//    TestModellerLogger.SetLastNodeGuid("ed2b1261-c2a9-44a1-a549-dd5175e24320");
//    _pagesAdd_supplier_bill.Click__Save_();
//    
//
//pages.supplier_list _pagessupplier_list = new pages.supplier_list(driver);
//    TestModellerLogger.SetLastNodeGuid("05d0643c-445d-45ae-a2b0-048127fe904e");
//    _pagessupplier_list.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("28dadb14-b0fe-4487-a3cc-41f1b9663360");
//    _pagessupplier_list.Click_Expenditure();
//    
//
//    }
//
//    @Test  (groups= {"855c0b82-12d4-47bf-b83d-0a479c486871","Login to add supplier bill","Login to add supplier bill - Default Profile"},enabled=false)
//    @TestModellerPath(guid = "855c0b82-12d4-47bf-b83d-0a479c486871")
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
//pages.Add_supplier_bill _pagesAdd_supplier_bill = new pages.Add_supplier_bill(driver);
//    TestModellerLogger.SetLastNodeGuid("27fa65bf-52c7-409d-b822-a20c9f7cfe10");
//    _pagesAdd_supplier_bill.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("8cbf16c4-0129-478f-b3fc-233ef9f32d85");
//    _pagesAdd_supplier_bill.Click_xPath_htmlbodyformmaindiv10div3div1div4divdiv2div1divdiv2divdivtabl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("3a9dabee-dc50-4041-8f36-dd3f5dcf2ae2");
//    _pagesAdd_supplier_bill.Select_ctl00cPHddlSupplier("Generic Purchase Supplier");
//    
//
//    TestModellerLogger.SetLastNodeGuid("156f8971-828f-4069-958b-42810cf25a73");
//    _pagesAdd_supplier_bill.Enter_ctl00cPHtxtDate("44061");
//    
//
//    TestModellerLogger.SetLastNodeGuid("c079b156-d1f8-40c8-868b-f3a74a1d4469");
//    _pagesAdd_supplier_bill.Select_ctl00cPHrptrProductctl00ddExpenseHead("Accountancy fee");
//    
//
//    TestModellerLogger.SetLastNodeGuid("a000ee48-649a-4d9d-b106-49af3544c21c");
//    _pagesAdd_supplier_bill.Enter_ctl00cPHrptrProductctl00txtDescription("material");
//    
//
//    TestModellerLogger.SetLastNodeGuid("0b46be65-b21d-4d7b-abcc-5f25d3a46273");
//    _pagesAdd_supplier_bill.Enter_ctl00cPHrptrProductctl00txtUnitPrice("1500");
//    
//
//    TestModellerLogger.SetLastNodeGuid("ed2b1261-c2a9-44a1-a549-dd5175e24320");
//    _pagesAdd_supplier_bill.Click__Save_();
//    
//
//pages.supplier_list _pagessupplier_list = new pages.supplier_list(driver);
//    TestModellerLogger.SetLastNodeGuid("05d0643c-445d-45ae-a2b0-048127fe904e");
//    _pagessupplier_list.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("28dadb14-b0fe-4487-a3cc-41f1b9663360");
//    _pagessupplier_list.Click_Expenditure();
//    
//
//    }
//
//    @Test  (groups= {"3579d635-86fa-4a68-aeaf-f6fc41318ff9","Login to add supplier bill","Login to add supplier bill - Default Profile"},enabled=false)
//    @TestModellerPath(guid = "3579d635-86fa-4a68-aeaf-f6fc41318ff9")
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
//pages.Add_supplier_bill _pagesAdd_supplier_bill = new pages.Add_supplier_bill(driver);
//    TestModellerLogger.SetLastNodeGuid("27fa65bf-52c7-409d-b822-a20c9f7cfe10");
//    _pagesAdd_supplier_bill.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("8cbf16c4-0129-478f-b3fc-233ef9f32d85");
//    _pagesAdd_supplier_bill.Click_xPath_htmlbodyformmaindiv10div3div1div4divdiv2div1divdiv2divdivtabl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("3a9dabee-dc50-4041-8f36-dd3f5dcf2ae2");
//    _pagesAdd_supplier_bill.Select_ctl00cPHddlSupplier("Generic Purchase Supplier");
//    
//
//    TestModellerLogger.SetLastNodeGuid("156f8971-828f-4069-958b-42810cf25a73");
//    _pagesAdd_supplier_bill.Enter_ctl00cPHtxtDate("44061");
//    
//
//    TestModellerLogger.SetLastNodeGuid("c079b156-d1f8-40c8-868b-f3a74a1d4469");
//    _pagesAdd_supplier_bill.Select_ctl00cPHrptrProductctl00ddExpenseHead("Advertising, sales promotion, marketing");
//    
//
//    TestModellerLogger.SetLastNodeGuid("a000ee48-649a-4d9d-b106-49af3544c21c");
//    _pagesAdd_supplier_bill.Enter_ctl00cPHrptrProductctl00txtDescription("material");
//    
//
//    TestModellerLogger.SetLastNodeGuid("0b46be65-b21d-4d7b-abcc-5f25d3a46273");
//    _pagesAdd_supplier_bill.Enter_ctl00cPHrptrProductctl00txtUnitPrice("1500");
//    
//
//    TestModellerLogger.SetLastNodeGuid("ed2b1261-c2a9-44a1-a549-dd5175e24320");
//    _pagesAdd_supplier_bill.Click__Save_();
//    
//
//pages.supplier_list _pagessupplier_list = new pages.supplier_list(driver);
//    TestModellerLogger.SetLastNodeGuid("05d0643c-445d-45ae-a2b0-048127fe904e");
//    _pagessupplier_list.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("28dadb14-b0fe-4487-a3cc-41f1b9663360");
//    _pagessupplier_list.Click_Expenditure();
//    
//
//    }
//
//    @Test  (groups= {"115dc1bb-ab6e-4aeb-bcfd-24a4d85095d0","Login to add supplier bill","Login to add supplier bill - Default Profile"},enabled=false)
//    @TestModellerPath(guid = "115dc1bb-ab6e-4aeb-bcfd-24a4d85095d0")
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
//pages.Add_supplier_bill _pagesAdd_supplier_bill = new pages.Add_supplier_bill(driver);
//    TestModellerLogger.SetLastNodeGuid("27fa65bf-52c7-409d-b822-a20c9f7cfe10");
//    _pagesAdd_supplier_bill.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("8cbf16c4-0129-478f-b3fc-233ef9f32d85");
//    _pagesAdd_supplier_bill.Click_xPath_htmlbodyformmaindiv10div3div1div4divdiv2div1divdiv2divdivtabl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("3a9dabee-dc50-4041-8f36-dd3f5dcf2ae2");
//    _pagesAdd_supplier_bill.Select_ctl00cPHddlSupplier("Generic Purchase Supplier");
//    
//
//    TestModellerLogger.SetLastNodeGuid("156f8971-828f-4069-958b-42810cf25a73");
//    _pagesAdd_supplier_bill.Enter_ctl00cPHtxtDate("44061");
//    
//
//    TestModellerLogger.SetLastNodeGuid("c079b156-d1f8-40c8-868b-f3a74a1d4469");
//    _pagesAdd_supplier_bill.Select_ctl00cPHrptrProductctl00ddExpenseHead("Bank, card and overdraft charges");
//    
//
//    TestModellerLogger.SetLastNodeGuid("a000ee48-649a-4d9d-b106-49af3544c21c");
//    _pagesAdd_supplier_bill.Enter_ctl00cPHrptrProductctl00txtDescription("material");
//    
//
//    TestModellerLogger.SetLastNodeGuid("0b46be65-b21d-4d7b-abcc-5f25d3a46273");
//    _pagesAdd_supplier_bill.Enter_ctl00cPHrptrProductctl00txtUnitPrice("1500");
//    
//
//    TestModellerLogger.SetLastNodeGuid("ed2b1261-c2a9-44a1-a549-dd5175e24320");
//    _pagesAdd_supplier_bill.Click__Save_();
//    
//
//pages.supplier_list _pagessupplier_list = new pages.supplier_list(driver);
//    TestModellerLogger.SetLastNodeGuid("05d0643c-445d-45ae-a2b0-048127fe904e");
//    _pagessupplier_list.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("28dadb14-b0fe-4487-a3cc-41f1b9663360");
//    _pagessupplier_list.Click_Expenditure();
//    
//
//    }
//
//    @Test  (groups= {"aa49d959-4b8c-4895-addc-cd54513095ac","Login to add supplier bill","Login to add supplier bill - Default Profile"})
//    @TestModellerPath(guid = "aa49d959-4b8c-4895-addc-cd54513095ac")
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
//pages.Add_supplier_bill _pagesAdd_supplier_bill = new pages.Add_supplier_bill(driver);
//    TestModellerLogger.SetLastNodeGuid("27fa65bf-52c7-409d-b822-a20c9f7cfe10");
//    _pagesAdd_supplier_bill.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("8cbf16c4-0129-478f-b3fc-233ef9f32d85");
//    _pagesAdd_supplier_bill.Click_xPath_htmlbodyformmaindiv10div3div1div4divdiv2div1divdiv2divdivtabl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("3a9dabee-dc50-4041-8f36-dd3f5dcf2ae2");
//    _pagesAdd_supplier_bill.Select_ctl00cPHddlSupplier("Generic Purchase Supplier");
//    
//
//    TestModellerLogger.SetLastNodeGuid("156f8971-828f-4069-958b-42810cf25a73");
//    _pagesAdd_supplier_bill.Enter_ctl00cPHtxtDate("44061");
//    
//
//    TestModellerLogger.SetLastNodeGuid("c079b156-d1f8-40c8-868b-f3a74a1d4469");
//    _pagesAdd_supplier_bill.Select_ctl00cPHrptrProductctl00ddExpenseHead("Business entertaining");
//    
//
//    TestModellerLogger.SetLastNodeGuid("a000ee48-649a-4d9d-b106-49af3544c21c");
//    _pagesAdd_supplier_bill.Enter_ctl00cPHrptrProductctl00txtDescription("material");
//    
//
//    TestModellerLogger.SetLastNodeGuid("0b46be65-b21d-4d7b-abcc-5f25d3a46273");
//    _pagesAdd_supplier_bill.Enter_ctl00cPHrptrProductctl00txtUnitPrice("1500");
//    
//
//    TestModellerLogger.SetLastNodeGuid("ed2b1261-c2a9-44a1-a549-dd5175e24320");
//    _pagesAdd_supplier_bill.Click__Save_();
//    
//
//pages.supplier_list _pagessupplier_list = new pages.supplier_list(driver);
//    TestModellerLogger.SetLastNodeGuid("05d0643c-445d-45ae-a2b0-048127fe904e");
//    _pagessupplier_list.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("28dadb14-b0fe-4487-a3cc-41f1b9663360");
//    _pagessupplier_list.Click_Expenditure();
//    
//
//    }
//
//    @Test  (groups= {"24ab8d9c-2551-4444-b29f-f81d8d533b5c","Login to add supplier bill","Login to add supplier bill - Default Profile"})
//    @TestModellerPath(guid = "24ab8d9c-2551-4444-b29f-f81d8d533b5c")
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
//pages.Add_supplier_bill _pagesAdd_supplier_bill = new pages.Add_supplier_bill(driver);
//    TestModellerLogger.SetLastNodeGuid("27fa65bf-52c7-409d-b822-a20c9f7cfe10");
//    _pagesAdd_supplier_bill.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("8cbf16c4-0129-478f-b3fc-233ef9f32d85");
//    _pagesAdd_supplier_bill.Click_xPath_htmlbodyformmaindiv10div3div1div4divdiv2div1divdiv2divdivtabl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("3a9dabee-dc50-4041-8f36-dd3f5dcf2ae2");
//    _pagesAdd_supplier_bill.Select_ctl00cPHddlSupplier("Generic Purchase Supplier");
//    
//
//    TestModellerLogger.SetLastNodeGuid("156f8971-828f-4069-958b-42810cf25a73");
//    _pagesAdd_supplier_bill.Enter_ctl00cPHtxtDate("44061");
//    
//
//    TestModellerLogger.SetLastNodeGuid("c079b156-d1f8-40c8-868b-f3a74a1d4469");
//    _pagesAdd_supplier_bill.Select_ctl00cPHrptrProductctl00ddExpenseHead("Equipment expensed");
//    
//
//    TestModellerLogger.SetLastNodeGuid("a000ee48-649a-4d9d-b106-49af3544c21c");
//    _pagesAdd_supplier_bill.Enter_ctl00cPHrptrProductctl00txtDescription("material");
//    
//
//    TestModellerLogger.SetLastNodeGuid("0b46be65-b21d-4d7b-abcc-5f25d3a46273");
//    _pagesAdd_supplier_bill.Enter_ctl00cPHrptrProductctl00txtUnitPrice("1500");
//    
//
//    TestModellerLogger.SetLastNodeGuid("ed2b1261-c2a9-44a1-a549-dd5175e24320");
//    _pagesAdd_supplier_bill.Click__Save_();
//    
//
//pages.supplier_list _pagessupplier_list = new pages.supplier_list(driver);
//    TestModellerLogger.SetLastNodeGuid("05d0643c-445d-45ae-a2b0-048127fe904e");
//    _pagessupplier_list.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("28dadb14-b0fe-4487-a3cc-41f1b9663360");
//    _pagessupplier_list.Click_Expenditure();
//    
//
//    }
//
//    @Test  (groups= {"2388cd95-d084-44f8-bc66-9ea54faf4130","Login to add supplier bill","Login to add supplier bill - Default Profile"})
//    @TestModellerPath(guid = "2388cd95-d084-44f8-bc66-9ea54faf4130")
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
//pages.Add_supplier_bill _pagesAdd_supplier_bill = new pages.Add_supplier_bill(driver);
//    TestModellerLogger.SetLastNodeGuid("27fa65bf-52c7-409d-b822-a20c9f7cfe10");
//    _pagesAdd_supplier_bill.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("8cbf16c4-0129-478f-b3fc-233ef9f32d85");
//    _pagesAdd_supplier_bill.Click_xPath_htmlbodyformmaindiv10div3div1div4divdiv2div1divdiv2divdivtabl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("3a9dabee-dc50-4041-8f36-dd3f5dcf2ae2");
//    _pagesAdd_supplier_bill.Select_ctl00cPHddlSupplier("Generic Purchase Supplier");
//    
//
//    TestModellerLogger.SetLastNodeGuid("156f8971-828f-4069-958b-42810cf25a73");
//    _pagesAdd_supplier_bill.Enter_ctl00cPHtxtDate("44061");
//    
//
//    TestModellerLogger.SetLastNodeGuid("c079b156-d1f8-40c8-868b-f3a74a1d4469");
//    _pagesAdd_supplier_bill.Select_ctl00cPHrptrProductctl00ddExpenseHead("Insurance");
//    
//
//    TestModellerLogger.SetLastNodeGuid("a000ee48-649a-4d9d-b106-49af3544c21c");
//    _pagesAdd_supplier_bill.Enter_ctl00cPHrptrProductctl00txtDescription("material");
//    
//
//    TestModellerLogger.SetLastNodeGuid("0b46be65-b21d-4d7b-abcc-5f25d3a46273");
//    _pagesAdd_supplier_bill.Enter_ctl00cPHrptrProductctl00txtUnitPrice("1500");
//    
//
//    TestModellerLogger.SetLastNodeGuid("ed2b1261-c2a9-44a1-a549-dd5175e24320");
//    _pagesAdd_supplier_bill.Click__Save_();
//    
//
//pages.supplier_list _pagessupplier_list = new pages.supplier_list(driver);
//    TestModellerLogger.SetLastNodeGuid("05d0643c-445d-45ae-a2b0-048127fe904e");
//    _pagessupplier_list.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("28dadb14-b0fe-4487-a3cc-41f1b9663360");
//    _pagessupplier_list.Click_Expenditure();
//    
//
//    }
//
//    @Test  (groups= {"e3d26e80-6ecc-4043-a43a-84612ee55ec5","Login to add supplier bill","Login to add supplier bill - Default Profile"})
//    @TestModellerPath(guid = "e3d26e80-6ecc-4043-a43a-84612ee55ec5")
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
//pages.Add_supplier_bill _pagesAdd_supplier_bill = new pages.Add_supplier_bill(driver);
//    TestModellerLogger.SetLastNodeGuid("27fa65bf-52c7-409d-b822-a20c9f7cfe10");
//    _pagesAdd_supplier_bill.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("8cbf16c4-0129-478f-b3fc-233ef9f32d85");
//    _pagesAdd_supplier_bill.Click_xPath_htmlbodyformmaindiv10div3div1div4divdiv2div1divdiv2divdivtabl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("3a9dabee-dc50-4041-8f36-dd3f5dcf2ae2");
//    _pagesAdd_supplier_bill.Select_ctl00cPHddlSupplier("Generic Purchase Supplier");
//    
//
//    TestModellerLogger.SetLastNodeGuid("156f8971-828f-4069-958b-42810cf25a73");
//    _pagesAdd_supplier_bill.Enter_ctl00cPHtxtDate("44061");
//    
//
//    TestModellerLogger.SetLastNodeGuid("c079b156-d1f8-40c8-868b-f3a74a1d4469");
//    _pagesAdd_supplier_bill.Select_ctl00cPHrptrProductctl00ddExpenseHead("Membership and subscriptions");
//    
//
//    TestModellerLogger.SetLastNodeGuid("a000ee48-649a-4d9d-b106-49af3544c21c");
//    _pagesAdd_supplier_bill.Enter_ctl00cPHrptrProductctl00txtDescription("material");
//    
//
//    TestModellerLogger.SetLastNodeGuid("0b46be65-b21d-4d7b-abcc-5f25d3a46273");
//    _pagesAdd_supplier_bill.Enter_ctl00cPHrptrProductctl00txtUnitPrice("1500");
//    
//
//    TestModellerLogger.SetLastNodeGuid("ed2b1261-c2a9-44a1-a549-dd5175e24320");
//    _pagesAdd_supplier_bill.Click__Save_();
//    
//
//pages.supplier_list _pagessupplier_list = new pages.supplier_list(driver);
//    TestModellerLogger.SetLastNodeGuid("05d0643c-445d-45ae-a2b0-048127fe904e");
//    _pagessupplier_list.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("28dadb14-b0fe-4487-a3cc-41f1b9663360");
//    _pagessupplier_list.Click_Expenditure();
//    
//
//    }
//
//    @Test  (groups= {"3eb149ab-c89e-4c01-ab90-40c97d939425","Login to add supplier bill","Login to add supplier bill - Default Profile"})
//    @TestModellerPath(guid = "3eb149ab-c89e-4c01-ab90-40c97d939425")
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
//pages.Add_supplier_bill _pagesAdd_supplier_bill = new pages.Add_supplier_bill(driver);
//    TestModellerLogger.SetLastNodeGuid("27fa65bf-52c7-409d-b822-a20c9f7cfe10");
//    _pagesAdd_supplier_bill.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("8cbf16c4-0129-478f-b3fc-233ef9f32d85");
//    _pagesAdd_supplier_bill.Click_xPath_htmlbodyformmaindiv10div3div1div4divdiv2div1divdiv2divdivtabl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("3a9dabee-dc50-4041-8f36-dd3f5dcf2ae2");
//    _pagesAdd_supplier_bill.Select_ctl00cPHddlSupplier("Generic Purchase Supplier");
//    
//
//    TestModellerLogger.SetLastNodeGuid("156f8971-828f-4069-958b-42810cf25a73");
//    _pagesAdd_supplier_bill.Enter_ctl00cPHtxtDate("44061");
//    
//
//    TestModellerLogger.SetLastNodeGuid("c079b156-d1f8-40c8-868b-f3a74a1d4469");
//    _pagesAdd_supplier_bill.Select_ctl00cPHrptrProductctl00ddExpenseHead("Postage, stationery, office supplies");
//    
//
//    TestModellerLogger.SetLastNodeGuid("a000ee48-649a-4d9d-b106-49af3544c21c");
//    _pagesAdd_supplier_bill.Enter_ctl00cPHrptrProductctl00txtDescription("material");
//    
//
//    TestModellerLogger.SetLastNodeGuid("0b46be65-b21d-4d7b-abcc-5f25d3a46273");
//    _pagesAdd_supplier_bill.Enter_ctl00cPHrptrProductctl00txtUnitPrice("1500");
//    
//
//    TestModellerLogger.SetLastNodeGuid("ed2b1261-c2a9-44a1-a549-dd5175e24320");
//    _pagesAdd_supplier_bill.Click__Save_();
//    
//
//pages.supplier_list _pagessupplier_list = new pages.supplier_list(driver);
//    TestModellerLogger.SetLastNodeGuid("05d0643c-445d-45ae-a2b0-048127fe904e");
//    _pagessupplier_list.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("28dadb14-b0fe-4487-a3cc-41f1b9663360");
//    _pagessupplier_list.Click_Expenditure();
//    
//
//    }
//
//    @Test  (groups= {"8453197e-30c6-487d-942e-10c88cf38a68","Login to add supplier bill","Login to add supplier bill - Default Profile"})
//    @TestModellerPath(guid = "8453197e-30c6-487d-942e-10c88cf38a68")
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
//pages.Add_supplier_bill _pagesAdd_supplier_bill = new pages.Add_supplier_bill(driver);
//    TestModellerLogger.SetLastNodeGuid("27fa65bf-52c7-409d-b822-a20c9f7cfe10");
//    _pagesAdd_supplier_bill.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("8cbf16c4-0129-478f-b3fc-233ef9f32d85");
//    _pagesAdd_supplier_bill.Click_xPath_htmlbodyformmaindiv10div3div1div4divdiv2div1divdiv2divdivtabl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("3a9dabee-dc50-4041-8f36-dd3f5dcf2ae2");
//    _pagesAdd_supplier_bill.Select_ctl00cPHddlSupplier("Generic Purchase Supplier");
//    
//
//    TestModellerLogger.SetLastNodeGuid("156f8971-828f-4069-958b-42810cf25a73");
//    _pagesAdd_supplier_bill.Enter_ctl00cPHtxtDate("44061");
//    
//
//    TestModellerLogger.SetLastNodeGuid("c079b156-d1f8-40c8-868b-f3a74a1d4469");
//    _pagesAdd_supplier_bill.Select_ctl00cPHrptrProductctl00ddExpenseHead("Professional, consultancy and legal fees");
//    
//
//    TestModellerLogger.SetLastNodeGuid("a000ee48-649a-4d9d-b106-49af3544c21c");
//    _pagesAdd_supplier_bill.Enter_ctl00cPHrptrProductctl00txtDescription("material");
//    
//
//    TestModellerLogger.SetLastNodeGuid("0b46be65-b21d-4d7b-abcc-5f25d3a46273");
//    _pagesAdd_supplier_bill.Enter_ctl00cPHrptrProductctl00txtUnitPrice("1500");
//    
//
//    TestModellerLogger.SetLastNodeGuid("ed2b1261-c2a9-44a1-a549-dd5175e24320");
//    _pagesAdd_supplier_bill.Click__Save_();
//    
//
//pages.supplier_list _pagessupplier_list = new pages.supplier_list(driver);
//    TestModellerLogger.SetLastNodeGuid("05d0643c-445d-45ae-a2b0-048127fe904e");
//    _pagessupplier_list.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("28dadb14-b0fe-4487-a3cc-41f1b9663360");
//    _pagessupplier_list.Click_Expenditure();
//    
//
//    }
//
//    @Test  (groups= {"b028639d-c227-44c6-8c13-6e138cd519e1","Login to add supplier bill","Login to add supplier bill - Default Profile"})
//    @TestModellerPath(guid = "b028639d-c227-44c6-8c13-6e138cd519e1")
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
//pages.Add_supplier_bill _pagesAdd_supplier_bill = new pages.Add_supplier_bill(driver);
//    TestModellerLogger.SetLastNodeGuid("27fa65bf-52c7-409d-b822-a20c9f7cfe10");
//    _pagesAdd_supplier_bill.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("8cbf16c4-0129-478f-b3fc-233ef9f32d85");
//    _pagesAdd_supplier_bill.Click_xPath_htmlbodyformmaindiv10div3div1div4divdiv2div1divdiv2divdivtabl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("3a9dabee-dc50-4041-8f36-dd3f5dcf2ae2");
//    _pagesAdd_supplier_bill.Select_ctl00cPHddlSupplier("Generic Purchase Supplier");
//    
//
//    TestModellerLogger.SetLastNodeGuid("156f8971-828f-4069-958b-42810cf25a73");
//    _pagesAdd_supplier_bill.Enter_ctl00cPHtxtDate("44061");
//    
//
//    TestModellerLogger.SetLastNodeGuid("c079b156-d1f8-40c8-868b-f3a74a1d4469");
//    _pagesAdd_supplier_bill.Select_ctl00cPHrptrProductctl00ddExpenseHead("Staff welfare");
//    
//
//    TestModellerLogger.SetLastNodeGuid("a000ee48-649a-4d9d-b106-49af3544c21c");
//    _pagesAdd_supplier_bill.Enter_ctl00cPHrptrProductctl00txtDescription("material");
//    
//
//    TestModellerLogger.SetLastNodeGuid("0b46be65-b21d-4d7b-abcc-5f25d3a46273");
//    _pagesAdd_supplier_bill.Enter_ctl00cPHrptrProductctl00txtUnitPrice("1500");
//    
//
//    TestModellerLogger.SetLastNodeGuid("ed2b1261-c2a9-44a1-a549-dd5175e24320");
//    _pagesAdd_supplier_bill.Click__Save_();
//    
//
//pages.supplier_list _pagessupplier_list = new pages.supplier_list(driver);
//    TestModellerLogger.SetLastNodeGuid("05d0643c-445d-45ae-a2b0-048127fe904e");
//    _pagessupplier_list.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("28dadb14-b0fe-4487-a3cc-41f1b9663360");
//    _pagessupplier_list.Click_Expenditure();
//    
//
//    }
//
//    @Test  (groups= {"3418ef40-d6c4-4f3e-bd5f-7c17b48af706","Login to add supplier bill","Login to add supplier bill - Default Profile"})
//    @TestModellerPath(guid = "3418ef40-d6c4-4f3e-bd5f-7c17b48af706")
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
//pages.Add_supplier_bill _pagesAdd_supplier_bill = new pages.Add_supplier_bill(driver);
//    TestModellerLogger.SetLastNodeGuid("27fa65bf-52c7-409d-b822-a20c9f7cfe10");
//    _pagesAdd_supplier_bill.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("8cbf16c4-0129-478f-b3fc-233ef9f32d85");
//    _pagesAdd_supplier_bill.Click_xPath_htmlbodyformmaindiv10div3div1div4divdiv2div1divdiv2divdivtabl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("3a9dabee-dc50-4041-8f36-dd3f5dcf2ae2");
//    _pagesAdd_supplier_bill.Select_ctl00cPHddlSupplier("Generic Purchase Supplier");
//    
//
//    TestModellerLogger.SetLastNodeGuid("156f8971-828f-4069-958b-42810cf25a73");
//    _pagesAdd_supplier_bill.Enter_ctl00cPHtxtDate("44061");
//    
//
//    TestModellerLogger.SetLastNodeGuid("c079b156-d1f8-40c8-868b-f3a74a1d4469");
//    _pagesAdd_supplier_bill.Select_ctl00cPHrptrProductctl00ddExpenseHead("Sundry expenses");
//    
//
//    TestModellerLogger.SetLastNodeGuid("a000ee48-649a-4d9d-b106-49af3544c21c");
//    _pagesAdd_supplier_bill.Enter_ctl00cPHrptrProductctl00txtDescription("material");
//    
//
//    TestModellerLogger.SetLastNodeGuid("0b46be65-b21d-4d7b-abcc-5f25d3a46273");
//    _pagesAdd_supplier_bill.Enter_ctl00cPHrptrProductctl00txtUnitPrice("1500");
//    
//
//    TestModellerLogger.SetLastNodeGuid("ed2b1261-c2a9-44a1-a549-dd5175e24320");
//    _pagesAdd_supplier_bill.Click__Save_();
//    
//
//pages.supplier_list _pagessupplier_list = new pages.supplier_list(driver);
//    TestModellerLogger.SetLastNodeGuid("05d0643c-445d-45ae-a2b0-048127fe904e");
//    _pagessupplier_list.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("28dadb14-b0fe-4487-a3cc-41f1b9663360");
//    _pagessupplier_list.Click_Expenditure();
//    
//
//    }
//
//    @Test  (groups= {"5df7e55e-c582-4ca6-80dd-d44bfa445d46","Login to add supplier bill","Login to add supplier bill - Default Profile"})
//    @TestModellerPath(guid = "5df7e55e-c582-4ca6-80dd-d44bfa445d46")
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
//pages.Add_supplier_bill _pagesAdd_supplier_bill = new pages.Add_supplier_bill(driver);
//    TestModellerLogger.SetLastNodeGuid("27fa65bf-52c7-409d-b822-a20c9f7cfe10");
//    _pagesAdd_supplier_bill.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("8cbf16c4-0129-478f-b3fc-233ef9f32d85");
//    _pagesAdd_supplier_bill.Click_xPath_htmlbodyformmaindiv10div3div1div4divdiv2div1divdiv2divdivtabl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("3a9dabee-dc50-4041-8f36-dd3f5dcf2ae2");
//    _pagesAdd_supplier_bill.Select_ctl00cPHddlSupplier("Generic Purchase Supplier");
//    
//
//    TestModellerLogger.SetLastNodeGuid("156f8971-828f-4069-958b-42810cf25a73");
//    _pagesAdd_supplier_bill.Enter_ctl00cPHtxtDate("44061");
//    
//
//    TestModellerLogger.SetLastNodeGuid("c079b156-d1f8-40c8-868b-f3a74a1d4469");
//    _pagesAdd_supplier_bill.Select_ctl00cPHrptrProductctl00ddExpenseHead("Telephone, internet and broadband");
//    
//
//    TestModellerLogger.SetLastNodeGuid("a000ee48-649a-4d9d-b106-49af3544c21c");
//    _pagesAdd_supplier_bill.Enter_ctl00cPHrptrProductctl00txtDescription("material");
//    
//
//    TestModellerLogger.SetLastNodeGuid("0b46be65-b21d-4d7b-abcc-5f25d3a46273");
//    _pagesAdd_supplier_bill.Enter_ctl00cPHrptrProductctl00txtUnitPrice("1500");
//    
//
//    TestModellerLogger.SetLastNodeGuid("ed2b1261-c2a9-44a1-a549-dd5175e24320");
//    _pagesAdd_supplier_bill.Click__Save_();
//    
//
//pages.supplier_list _pagessupplier_list = new pages.supplier_list(driver);
//    TestModellerLogger.SetLastNodeGuid("05d0643c-445d-45ae-a2b0-048127fe904e");
//    _pagessupplier_list.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("28dadb14-b0fe-4487-a3cc-41f1b9663360");
//    _pagessupplier_list.Click_Expenditure();
//    
//
//    }
//
//    @Test  (groups= {"98cd5c70-767d-4e84-bec2-0b6e3e4d66be","Login to add supplier bill","Login to add supplier bill - Default Profile"})
//    @TestModellerPath(guid = "98cd5c70-767d-4e84-bec2-0b6e3e4d66be")
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
//pages.Add_supplier_bill _pagesAdd_supplier_bill = new pages.Add_supplier_bill(driver);
//    TestModellerLogger.SetLastNodeGuid("27fa65bf-52c7-409d-b822-a20c9f7cfe10");
//    _pagesAdd_supplier_bill.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("8cbf16c4-0129-478f-b3fc-233ef9f32d85");
//    _pagesAdd_supplier_bill.Click_xPath_htmlbodyformmaindiv10div3div1div4divdiv2div1divdiv2divdivtabl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("3a9dabee-dc50-4041-8f36-dd3f5dcf2ae2");
//    _pagesAdd_supplier_bill.Select_ctl00cPHddlSupplier("Generic Purchase Supplier");
//    
//
//    TestModellerLogger.SetLastNodeGuid("156f8971-828f-4069-958b-42810cf25a73");
//    _pagesAdd_supplier_bill.Enter_ctl00cPHtxtDate("44061");
//    
//
//    TestModellerLogger.SetLastNodeGuid("c079b156-d1f8-40c8-868b-f3a74a1d4469");
//    _pagesAdd_supplier_bill.Select_ctl00cPHrptrProductctl00ddExpenseHead("Travel and overseas travelling");
//    
//
//    TestModellerLogger.SetLastNodeGuid("a000ee48-649a-4d9d-b106-49af3544c21c");
//    _pagesAdd_supplier_bill.Enter_ctl00cPHrptrProductctl00txtDescription("material");
//    
//
//    TestModellerLogger.SetLastNodeGuid("0b46be65-b21d-4d7b-abcc-5f25d3a46273");
//    _pagesAdd_supplier_bill.Enter_ctl00cPHrptrProductctl00txtUnitPrice("1500");
//    
//
//    TestModellerLogger.SetLastNodeGuid("ed2b1261-c2a9-44a1-a549-dd5175e24320");
//    _pagesAdd_supplier_bill.Click__Save_();
//    
//
//pages.supplier_list _pagessupplier_list = new pages.supplier_list(driver);
//    TestModellerLogger.SetLastNodeGuid("05d0643c-445d-45ae-a2b0-048127fe904e");
//    _pagessupplier_list.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("28dadb14-b0fe-4487-a3cc-41f1b9663360");
//    _pagessupplier_list.Click_Expenditure();
//    
//
//    }
//
//    @Test  (groups= {"eefbc6fb-a307-4ed7-a9ae-71d89bf89433","Login to add supplier bill","Login to add supplier bill - Default Profile"})
//    @TestModellerPath(guid = "eefbc6fb-a307-4ed7-a9ae-71d89bf89433")
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
//pages.Add_supplier_bill _pagesAdd_supplier_bill = new pages.Add_supplier_bill(driver);
//    TestModellerLogger.SetLastNodeGuid("27fa65bf-52c7-409d-b822-a20c9f7cfe10");
//    _pagesAdd_supplier_bill.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("8cbf16c4-0129-478f-b3fc-233ef9f32d85");
//    _pagesAdd_supplier_bill.Click_xPath_htmlbodyformmaindiv10div3div1div4divdiv2div1divdiv2divdivtabl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("3a9dabee-dc50-4041-8f36-dd3f5dcf2ae2");
//    _pagesAdd_supplier_bill.Select_ctl00cPHddlSupplier("Generic Purchase Supplier");
//    
//
//    TestModellerLogger.SetLastNodeGuid("156f8971-828f-4069-958b-42810cf25a73");
//    _pagesAdd_supplier_bill.Enter_ctl00cPHtxtDate("44061");
//    
//
//    TestModellerLogger.SetLastNodeGuid("c079b156-d1f8-40c8-868b-f3a74a1d4469");
//    _pagesAdd_supplier_bill.Select_ctl00cPHrptrProductctl00ddExpenseHead("Commercial vehicles additions");
//    
//
//    TestModellerLogger.SetLastNodeGuid("a000ee48-649a-4d9d-b106-49af3544c21c");
//    _pagesAdd_supplier_bill.Enter_ctl00cPHrptrProductctl00txtDescription("material");
//    
//
//    TestModellerLogger.SetLastNodeGuid("0b46be65-b21d-4d7b-abcc-5f25d3a46273");
//    _pagesAdd_supplier_bill.Enter_ctl00cPHrptrProductctl00txtUnitPrice("1500");
//    
//
//    TestModellerLogger.SetLastNodeGuid("ed2b1261-c2a9-44a1-a549-dd5175e24320");
//    _pagesAdd_supplier_bill.Click__Save_();
//    
//
//pages.supplier_list _pagessupplier_list = new pages.supplier_list(driver);
//    TestModellerLogger.SetLastNodeGuid("05d0643c-445d-45ae-a2b0-048127fe904e");
//    _pagessupplier_list.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("28dadb14-b0fe-4487-a3cc-41f1b9663360");
//    _pagessupplier_list.Click_Expenditure();
//    
//
//    }
//
//    @Test  (groups= {"62be8079-6dac-45ac-a1ac-0af1e834b623","Login to add supplier bill","Login to add supplier bill - Default Profile"})
//    @TestModellerPath(guid = "62be8079-6dac-45ac-a1ac-0af1e834b623")
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
//pages.Add_supplier_bill _pagesAdd_supplier_bill = new pages.Add_supplier_bill(driver);
//    TestModellerLogger.SetLastNodeGuid("27fa65bf-52c7-409d-b822-a20c9f7cfe10");
//    _pagesAdd_supplier_bill.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("8cbf16c4-0129-478f-b3fc-233ef9f32d85");
//    _pagesAdd_supplier_bill.Click_xPath_htmlbodyformmaindiv10div3div1div4divdiv2div1divdiv2divdivtabl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("3a9dabee-dc50-4041-8f36-dd3f5dcf2ae2");
//    _pagesAdd_supplier_bill.Select_ctl00cPHddlSupplier("Generic Purchase Supplier");
//    
//
//    TestModellerLogger.SetLastNodeGuid("156f8971-828f-4069-958b-42810cf25a73");
//    _pagesAdd_supplier_bill.Enter_ctl00cPHtxtDate("44061");
//    
//
//    TestModellerLogger.SetLastNodeGuid("c079b156-d1f8-40c8-868b-f3a74a1d4469");
//    _pagesAdd_supplier_bill.Select_ctl00cPHrptrProductctl00ddExpenseHead("Commercial vehicles cost b/f");
//    
//
//    TestModellerLogger.SetLastNodeGuid("a000ee48-649a-4d9d-b106-49af3544c21c");
//    _pagesAdd_supplier_bill.Enter_ctl00cPHrptrProductctl00txtDescription("material");
//    
//
//    TestModellerLogger.SetLastNodeGuid("0b46be65-b21d-4d7b-abcc-5f25d3a46273");
//    _pagesAdd_supplier_bill.Enter_ctl00cPHrptrProductctl00txtUnitPrice("1500");
//    
//
//    TestModellerLogger.SetLastNodeGuid("ed2b1261-c2a9-44a1-a549-dd5175e24320");
//    _pagesAdd_supplier_bill.Click__Save_();
//    
//
//pages.supplier_list _pagessupplier_list = new pages.supplier_list(driver);
//    TestModellerLogger.SetLastNodeGuid("05d0643c-445d-45ae-a2b0-048127fe904e");
//    _pagessupplier_list.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("28dadb14-b0fe-4487-a3cc-41f1b9663360");
//    _pagessupplier_list.Click_Expenditure();
//    
//
//    }
//
//    @Test  (groups= {"89aae11c-3116-45e5-b20b-c3dbfc5b3ffe","Login to add supplier bill","Login to add supplier bill - Default Profile"})
//    @TestModellerPath(guid = "89aae11c-3116-45e5-b20b-c3dbfc5b3ffe")
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
//pages.Add_supplier_bill _pagesAdd_supplier_bill = new pages.Add_supplier_bill(driver);
//    TestModellerLogger.SetLastNodeGuid("27fa65bf-52c7-409d-b822-a20c9f7cfe10");
//    _pagesAdd_supplier_bill.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("8cbf16c4-0129-478f-b3fc-233ef9f32d85");
//    _pagesAdd_supplier_bill.Click_xPath_htmlbodyformmaindiv10div3div1div4divdiv2div1divdiv2divdivtabl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("3a9dabee-dc50-4041-8f36-dd3f5dcf2ae2");
//    _pagesAdd_supplier_bill.Select_ctl00cPHddlSupplier("Generic Purchase Supplier");
//    
//
//    TestModellerLogger.SetLastNodeGuid("156f8971-828f-4069-958b-42810cf25a73");
//    _pagesAdd_supplier_bill.Enter_ctl00cPHtxtDate("44061");
//    
//
//    TestModellerLogger.SetLastNodeGuid("c079b156-d1f8-40c8-868b-f3a74a1d4469");
//    _pagesAdd_supplier_bill.Select_ctl00cPHrptrProductctl00ddExpenseHead("Commercial vehicles depreciation");
//    
//
//    TestModellerLogger.SetLastNodeGuid("a000ee48-649a-4d9d-b106-49af3544c21c");
//    _pagesAdd_supplier_bill.Enter_ctl00cPHrptrProductctl00txtDescription("material");
//    
//
//    TestModellerLogger.SetLastNodeGuid("0b46be65-b21d-4d7b-abcc-5f25d3a46273");
//    _pagesAdd_supplier_bill.Enter_ctl00cPHrptrProductctl00txtUnitPrice("1500");
//    
//
//    TestModellerLogger.SetLastNodeGuid("ed2b1261-c2a9-44a1-a549-dd5175e24320");
//    _pagesAdd_supplier_bill.Click__Save_();
//    
//
//pages.supplier_list _pagessupplier_list = new pages.supplier_list(driver);
//    TestModellerLogger.SetLastNodeGuid("05d0643c-445d-45ae-a2b0-048127fe904e");
//    _pagessupplier_list.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("28dadb14-b0fe-4487-a3cc-41f1b9663360");
//    _pagessupplier_list.Click_Expenditure();
//    
//
//    }
//
//    @Test  (groups= {"46cee803-f75d-4c50-a94f-c40e27eb6e3f","Login to add supplier bill","Login to add supplier bill - Default Profile"})
//    @TestModellerPath(guid = "46cee803-f75d-4c50-a94f-c40e27eb6e3f")
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
//pages.Add_supplier_bill _pagesAdd_supplier_bill = new pages.Add_supplier_bill(driver);
//    TestModellerLogger.SetLastNodeGuid("27fa65bf-52c7-409d-b822-a20c9f7cfe10");
//    _pagesAdd_supplier_bill.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("8cbf16c4-0129-478f-b3fc-233ef9f32d85");
//    _pagesAdd_supplier_bill.Click_xPath_htmlbodyformmaindiv10div3div1div4divdiv2div1divdiv2divdivtabl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("3a9dabee-dc50-4041-8f36-dd3f5dcf2ae2");
//    _pagesAdd_supplier_bill.Select_ctl00cPHddlSupplier("Generic Purchase Supplier");
//    
//
//    TestModellerLogger.SetLastNodeGuid("156f8971-828f-4069-958b-42810cf25a73");
//    _pagesAdd_supplier_bill.Enter_ctl00cPHtxtDate("44061");
//    
//
//    TestModellerLogger.SetLastNodeGuid("c079b156-d1f8-40c8-868b-f3a74a1d4469");
//    _pagesAdd_supplier_bill.Select_ctl00cPHrptrProductctl00ddExpenseHead("Commercial vehicles depreciation b/f");
//    
//
//    TestModellerLogger.SetLastNodeGuid("a000ee48-649a-4d9d-b106-49af3544c21c");
//    _pagesAdd_supplier_bill.Enter_ctl00cPHrptrProductctl00txtDescription("material");
//    
//
//    TestModellerLogger.SetLastNodeGuid("0b46be65-b21d-4d7b-abcc-5f25d3a46273");
//    _pagesAdd_supplier_bill.Enter_ctl00cPHrptrProductctl00txtUnitPrice("1500");
//    
//
//    TestModellerLogger.SetLastNodeGuid("ed2b1261-c2a9-44a1-a549-dd5175e24320");
//    _pagesAdd_supplier_bill.Click__Save_();
//    
//
//pages.supplier_list _pagessupplier_list = new pages.supplier_list(driver);
//    TestModellerLogger.SetLastNodeGuid("05d0643c-445d-45ae-a2b0-048127fe904e");
//    _pagessupplier_list.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("28dadb14-b0fe-4487-a3cc-41f1b9663360");
//    _pagessupplier_list.Click_Expenditure();
//    
//
//    }
//
//    @Test  (groups= {"b71564e7-6d9b-4065-9512-88afff6f94f3","Login to add supplier bill","Login to add supplier bill - Default Profile"})
//    @TestModellerPath(guid = "b71564e7-6d9b-4065-9512-88afff6f94f3")
//    public void GoToUrlpositiveenterusernamepositiveenterpasswordClickLoginsuccessGoToUrlpositiveagentnameC20()
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
//pages.Add_supplier_bill _pagesAdd_supplier_bill = new pages.Add_supplier_bill(driver);
//    TestModellerLogger.SetLastNodeGuid("27fa65bf-52c7-409d-b822-a20c9f7cfe10");
//    _pagesAdd_supplier_bill.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("8cbf16c4-0129-478f-b3fc-233ef9f32d85");
//    _pagesAdd_supplier_bill.Click_xPath_htmlbodyformmaindiv10div3div1div4divdiv2div1divdiv2divdivtabl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("3a9dabee-dc50-4041-8f36-dd3f5dcf2ae2");
//    _pagesAdd_supplier_bill.Select_ctl00cPHddlSupplier("Generic Purchase Supplier");
//    
//
//    TestModellerLogger.SetLastNodeGuid("156f8971-828f-4069-958b-42810cf25a73");
//    _pagesAdd_supplier_bill.Enter_ctl00cPHtxtDate("44061");
//    
//
//    TestModellerLogger.SetLastNodeGuid("c079b156-d1f8-40c8-868b-f3a74a1d4469");
//    _pagesAdd_supplier_bill.Select_ctl00cPHrptrProductctl00ddExpenseHead("Commercial vehicles depreciation disposa");
//    
//
//    TestModellerLogger.SetLastNodeGuid("a000ee48-649a-4d9d-b106-49af3544c21c");
//    _pagesAdd_supplier_bill.Enter_ctl00cPHrptrProductctl00txtDescription("material");
//    
//
//    TestModellerLogger.SetLastNodeGuid("0b46be65-b21d-4d7b-abcc-5f25d3a46273");
//    _pagesAdd_supplier_bill.Enter_ctl00cPHrptrProductctl00txtUnitPrice("1500");
//    
//
//    TestModellerLogger.SetLastNodeGuid("ed2b1261-c2a9-44a1-a549-dd5175e24320");
//    _pagesAdd_supplier_bill.Click__Save_();
//    
//
//pages.supplier_list _pagessupplier_list = new pages.supplier_list(driver);
//    TestModellerLogger.SetLastNodeGuid("05d0643c-445d-45ae-a2b0-048127fe904e");
//    _pagessupplier_list.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("28dadb14-b0fe-4487-a3cc-41f1b9663360");
//    _pagessupplier_list.Click_Expenditure();
//    
//
//    }
//
//    @Test  (groups= {"25b80d6e-4af3-44c7-afb5-40682ecf2c21","Login to add supplier bill","Login to add supplier bill - Default Profile"})
//    @TestModellerPath(guid = "25b80d6e-4af3-44c7-afb5-40682ecf2c21")
//    public void GoToUrlpositiveenterusernamepositiveenterpasswordClickLoginsuccessGoToUrlpositiveagentnameC21()
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
//pages.Add_supplier_bill _pagesAdd_supplier_bill = new pages.Add_supplier_bill(driver);
//    TestModellerLogger.SetLastNodeGuid("27fa65bf-52c7-409d-b822-a20c9f7cfe10");
//    _pagesAdd_supplier_bill.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("8cbf16c4-0129-478f-b3fc-233ef9f32d85");
//    _pagesAdd_supplier_bill.Click_xPath_htmlbodyformmaindiv10div3div1div4divdiv2div1divdiv2divdivtabl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("3a9dabee-dc50-4041-8f36-dd3f5dcf2ae2");
//    _pagesAdd_supplier_bill.Select_ctl00cPHddlSupplier("Generic Purchase Supplier");
//    
//
//    TestModellerLogger.SetLastNodeGuid("156f8971-828f-4069-958b-42810cf25a73");
//    _pagesAdd_supplier_bill.Enter_ctl00cPHtxtDate("44061");
//    
//
//    TestModellerLogger.SetLastNodeGuid("c079b156-d1f8-40c8-868b-f3a74a1d4469");
//    _pagesAdd_supplier_bill.Select_ctl00cPHrptrProductctl00ddExpenseHead("Commercial vehicles depreciation revalua");
//    
//
//    TestModellerLogger.SetLastNodeGuid("a000ee48-649a-4d9d-b106-49af3544c21c");
//    _pagesAdd_supplier_bill.Enter_ctl00cPHrptrProductctl00txtDescription("material");
//    
//
//    TestModellerLogger.SetLastNodeGuid("0b46be65-b21d-4d7b-abcc-5f25d3a46273");
//    _pagesAdd_supplier_bill.Enter_ctl00cPHrptrProductctl00txtUnitPrice("1500");
//    
//
//    TestModellerLogger.SetLastNodeGuid("ed2b1261-c2a9-44a1-a549-dd5175e24320");
//    _pagesAdd_supplier_bill.Click__Save_();
//    
//
//pages.supplier_list _pagessupplier_list = new pages.supplier_list(driver);
//    TestModellerLogger.SetLastNodeGuid("05d0643c-445d-45ae-a2b0-048127fe904e");
//    _pagessupplier_list.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("28dadb14-b0fe-4487-a3cc-41f1b9663360");
//    _pagessupplier_list.Click_Expenditure();
//    
//
//    }
//
//    @Test  (groups= {"fc009b0f-74d1-4a61-8180-f1cf0f056d95","Login to add supplier bill","Login to add supplier bill - Default Profile"})
//    @TestModellerPath(guid = "fc009b0f-74d1-4a61-8180-f1cf0f056d95")
//    public void GoToUrlpositiveenterusernamepositiveenterpasswordClickLoginsuccessGoToUrlpositiveagentnameC22()
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
//pages.Add_supplier_bill _pagesAdd_supplier_bill = new pages.Add_supplier_bill(driver);
//    TestModellerLogger.SetLastNodeGuid("27fa65bf-52c7-409d-b822-a20c9f7cfe10");
//    _pagesAdd_supplier_bill.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("8cbf16c4-0129-478f-b3fc-233ef9f32d85");
//    _pagesAdd_supplier_bill.Click_xPath_htmlbodyformmaindiv10div3div1div4divdiv2div1divdiv2divdivtabl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("3a9dabee-dc50-4041-8f36-dd3f5dcf2ae2");
//    _pagesAdd_supplier_bill.Select_ctl00cPHddlSupplier("Generic Purchase Supplier");
//    
//
//    TestModellerLogger.SetLastNodeGuid("156f8971-828f-4069-958b-42810cf25a73");
//    _pagesAdd_supplier_bill.Enter_ctl00cPHtxtDate("44061");
//    
//
//    TestModellerLogger.SetLastNodeGuid("c079b156-d1f8-40c8-868b-f3a74a1d4469");
//    _pagesAdd_supplier_bill.Select_ctl00cPHrptrProductctl00ddExpenseHead("Commercial vehicles depreciation transfe");
//    
//
//    TestModellerLogger.SetLastNodeGuid("a000ee48-649a-4d9d-b106-49af3544c21c");
//    _pagesAdd_supplier_bill.Enter_ctl00cPHrptrProductctl00txtDescription("material");
//    
//
//    TestModellerLogger.SetLastNodeGuid("0b46be65-b21d-4d7b-abcc-5f25d3a46273");
//    _pagesAdd_supplier_bill.Enter_ctl00cPHrptrProductctl00txtUnitPrice("1500");
//    
//
//    TestModellerLogger.SetLastNodeGuid("ed2b1261-c2a9-44a1-a549-dd5175e24320");
//    _pagesAdd_supplier_bill.Click__Save_();
//    
//
//pages.supplier_list _pagessupplier_list = new pages.supplier_list(driver);
//    TestModellerLogger.SetLastNodeGuid("05d0643c-445d-45ae-a2b0-048127fe904e");
//    _pagessupplier_list.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("28dadb14-b0fe-4487-a3cc-41f1b9663360");
//    _pagessupplier_list.Click_Expenditure();
//    
//
//    }
//
//    @Test  (groups= {"b8a06bfb-e733-41ec-b641-f48a75603ff3","Login to add supplier bill","Login to add supplier bill - Default Profile"},enabled=false)
//    @TestModellerPath(guid = "b8a06bfb-e733-41ec-b641-f48a75603ff3")
//    public void GoToUrlpositiveenterusernamepositiveenterpasswordClickLoginsuccessGoToUrlpositiveagentnameC23()
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
//pages.Add_supplier_bill _pagesAdd_supplier_bill = new pages.Add_supplier_bill(driver);
//    TestModellerLogger.SetLastNodeGuid("27fa65bf-52c7-409d-b822-a20c9f7cfe10");
//    _pagesAdd_supplier_bill.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("8cbf16c4-0129-478f-b3fc-233ef9f32d85");
//    _pagesAdd_supplier_bill.Click_xPath_htmlbodyformmaindiv10div3div1div4divdiv2div1divdiv2divdivtabl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("3a9dabee-dc50-4041-8f36-dd3f5dcf2ae2");
//    _pagesAdd_supplier_bill.Select_ctl00cPHddlSupplier("Generic Purchase Supplier");
//    
//
//    TestModellerLogger.SetLastNodeGuid("156f8971-828f-4069-958b-42810cf25a73");
//    _pagesAdd_supplier_bill.Enter_ctl00cPHtxtDate("44061");
//    
//
//    TestModellerLogger.SetLastNodeGuid("c079b156-d1f8-40c8-868b-f3a74a1d4469");
//    _pagesAdd_supplier_bill.Select_ctl00cPHrptrProductctl00ddExpenseHead("Commercial vehicles disposals");
//    
//
//    TestModellerLogger.SetLastNodeGuid("a000ee48-649a-4d9d-b106-49af3544c21c");
//    _pagesAdd_supplier_bill.Enter_ctl00cPHrptrProductctl00txtDescription("material");
//    
//
//    TestModellerLogger.SetLastNodeGuid("0b46be65-b21d-4d7b-abcc-5f25d3a46273");
//    _pagesAdd_supplier_bill.Enter_ctl00cPHrptrProductctl00txtUnitPrice("1500");
//    
//
//    TestModellerLogger.SetLastNodeGuid("ed2b1261-c2a9-44a1-a549-dd5175e24320");
//    _pagesAdd_supplier_bill.Click__Save_();
//    
//
//pages.supplier_list _pagessupplier_list = new pages.supplier_list(driver);
//    TestModellerLogger.SetLastNodeGuid("05d0643c-445d-45ae-a2b0-048127fe904e");
//    _pagessupplier_list.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("28dadb14-b0fe-4487-a3cc-41f1b9663360");
//    _pagessupplier_list.Click_Expenditure();
//    
//
//    }
//
//    @Test  (groups= {"1e6278d5-3bf2-446b-b1cb-52e5e9c4a84b","Login to add supplier bill","Login to add supplier bill - Default Profile"})
//    @TestModellerPath(guid = "1e6278d5-3bf2-446b-b1cb-52e5e9c4a84b")
//    public void GoToUrlpositiveenterusernamepositiveenterpasswordClickLoginsuccessGoToUrlpositiveagentnameC24()
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
//pages.Add_supplier_bill _pagesAdd_supplier_bill = new pages.Add_supplier_bill(driver);
//    TestModellerLogger.SetLastNodeGuid("27fa65bf-52c7-409d-b822-a20c9f7cfe10");
//    _pagesAdd_supplier_bill.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("8cbf16c4-0129-478f-b3fc-233ef9f32d85");
//    _pagesAdd_supplier_bill.Click_xPath_htmlbodyformmaindiv10div3div1div4divdiv2div1divdiv2divdivtabl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("3a9dabee-dc50-4041-8f36-dd3f5dcf2ae2");
//    _pagesAdd_supplier_bill.Select_ctl00cPHddlSupplier("Generic Purchase Supplier");
//    
//
//    TestModellerLogger.SetLastNodeGuid("156f8971-828f-4069-958b-42810cf25a73");
//    _pagesAdd_supplier_bill.Enter_ctl00cPHtxtDate("44061");
//    
//
//    TestModellerLogger.SetLastNodeGuid("c079b156-d1f8-40c8-868b-f3a74a1d4469");
//    _pagesAdd_supplier_bill.Select_ctl00cPHrptrProductctl00ddExpenseHead("Commercial vehicles revaluation");
//    
//
//    TestModellerLogger.SetLastNodeGuid("a000ee48-649a-4d9d-b106-49af3544c21c");
//    _pagesAdd_supplier_bill.Enter_ctl00cPHrptrProductctl00txtDescription("material");
//    
//
//    TestModellerLogger.SetLastNodeGuid("0b46be65-b21d-4d7b-abcc-5f25d3a46273");
//    _pagesAdd_supplier_bill.Enter_ctl00cPHrptrProductctl00txtUnitPrice("1500");
//    
//
//    TestModellerLogger.SetLastNodeGuid("ed2b1261-c2a9-44a1-a549-dd5175e24320");
//    _pagesAdd_supplier_bill.Click__Save_();
//    
//
//pages.supplier_list _pagessupplier_list = new pages.supplier_list(driver);
//    TestModellerLogger.SetLastNodeGuid("05d0643c-445d-45ae-a2b0-048127fe904e");
//    _pagessupplier_list.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("28dadb14-b0fe-4487-a3cc-41f1b9663360");
//    _pagessupplier_list.Click_Expenditure();
//    
//
//    }
//
//}
