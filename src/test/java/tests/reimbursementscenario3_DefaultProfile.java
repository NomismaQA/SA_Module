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

//http://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/916e963f-2756-4e66-bd4b-04c8ff47257a
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 254, profileId = 100213)
public class reimbursementscenario3_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"2bf99eb4-d9df-43aa-a175-77b60d0e165a","reimbursement scenario 3","reimbursement scenario 3 - Default Profile"})
    @TestModellerPath(guid = "2bf99eb4-d9df-43aa-a175-77b60d0e165a")
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
    

pages.Add_payment _pagesAdd_payment = new pages.Add_payment(driver);
    TestModellerLogger.SetLastNodeGuid("79de1c6e-50e6-457b-b574-e815e216acae");
    _pagesAdd_payment.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("1345cf6d-8845-440c-9fb8-ee89d90be9f7");
    _pagesAdd_payment.Click_xPath_htmlbodyformmaindiv10div3div1div4divdiv2div1divdiv5divdivtabl();
    

    TestModellerLogger.SetLastNodeGuid("235e53ea-1f95-4f7f-aa02-f8791ede239a");
    _pagesAdd_payment.Select_ctl00cPHddlentryType("Payment");
    

    TestModellerLogger.SetLastNodeGuid("902914e0-dd69-4a18-802c-abb99f2acf9d");
    _pagesAdd_payment.Enter_ctl00cPHrptrPaymentctl00txtDate("30-04-2020");
    

    TestModellerLogger.SetLastNodeGuid("1a00bdc9-bfc7-4eb2-aa62-07c3b34d68ee");
    _pagesAdd_payment.Select_ctl00cPHrptrPaymentctl00ddAccount("Corporation tax payable");
    

    TestModellerLogger.SetLastNodeGuid("e85ed246-a0e3-493b-8409-3508f190cb4a");
    _pagesAdd_payment.Enter_ctl00cPHrptrPaymentctl00txtDescription("test");
    

    TestModellerLogger.SetLastNodeGuid("64e8105b-bcb3-451e-aeab-a8f67f563fc3");
    _pagesAdd_payment.Enter_ctl00cPHrptrPaymentctl00txtAmount("100");
    

    TestModellerLogger.SetLastNodeGuid("d092614f-4921-4a82-a2cf-5d87aacf885f");
    _pagesAdd_payment.Click__Save_();
    

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
    

    }}

//    @Test  (groups= {"363b9945-ff87-4c1a-a056-9d18a09b5445","reimbursement scenario 3","reimbursement scenario 3 - Default Profile"})
//    @TestModellerPath(guid = "363b9945-ff87-4c1a-a056-9d18a09b5445")
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
//pages.Add_payment _pagesAdd_payment = new pages.Add_payment(driver);
//    TestModellerLogger.SetLastNodeGuid("79de1c6e-50e6-457b-b574-e815e216acae");
//    _pagesAdd_payment.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("1345cf6d-8845-440c-9fb8-ee89d90be9f7");
//    _pagesAdd_payment.Click_xPath_htmlbodyformmaindiv10div3div1div4divdiv2div1divdiv5divdivtabl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("235e53ea-1f95-4f7f-aa02-f8791ede239a");
//    _pagesAdd_payment.Select_ctl00cPHddlentryType("Payment");
//    
//
//    TestModellerLogger.SetLastNodeGuid("902914e0-dd69-4a18-802c-abb99f2acf9d");
//    _pagesAdd_payment.Enter_ctl00cPHrptrPaymentctl00txtDate("44061");
//    
//
//    TestModellerLogger.SetLastNodeGuid("1a00bdc9-bfc7-4eb2-aa62-07c3b34d68ee");
//    _pagesAdd_payment.Select_ctl00cPHrptrPaymentctl00ddAccount("VAT");
//    
//
//    TestModellerLogger.SetLastNodeGuid("e85ed246-a0e3-493b-8409-3508f190cb4a");
//    _pagesAdd_payment.Enter_ctl00cPHrptrPaymentctl00txtDescription("test1");
//    
//
//    TestModellerLogger.SetLastNodeGuid("64e8105b-bcb3-451e-aeab-a8f67f563fc3");
//    _pagesAdd_payment.Enter_ctl00cPHrptrPaymentctl00txtAmount("100");
//    
//
//    TestModellerLogger.SetLastNodeGuid("d092614f-4921-4a82-a2cf-5d87aacf885f");
//    _pagesAdd_payment.Click__Save_();
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
//    @Test  (groups= {"d7d5e286-cf58-467c-b7b5-7b19918a20fc","reimbursement scenario 3","reimbursement scenario 3 - Default Profile"},enabled=false)
//    @TestModellerPath(guid = "d7d5e286-cf58-467c-b7b5-7b19918a20fc")
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
//pages.Add_payment _pagesAdd_payment = new pages.Add_payment(driver);
//    TestModellerLogger.SetLastNodeGuid("79de1c6e-50e6-457b-b574-e815e216acae");
//    _pagesAdd_payment.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("1345cf6d-8845-440c-9fb8-ee89d90be9f7");
//    _pagesAdd_payment.Click_xPath_htmlbodyformmaindiv10div3div1div4divdiv2div1divdiv5divdivtabl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("235e53ea-1f95-4f7f-aa02-f8791ede239a");
//    _pagesAdd_payment.Select_ctl00cPHddlentryType("Payment");
//    
//
//    TestModellerLogger.SetLastNodeGuid("902914e0-dd69-4a18-802c-abb99f2acf9d");
//    _pagesAdd_payment.Enter_ctl00cPHrptrPaymentctl00txtDate("44061");
//    
//
//    TestModellerLogger.SetLastNodeGuid("1a00bdc9-bfc7-4eb2-aa62-07c3b34d68ee");
//    _pagesAdd_payment.Select_ctl00cPHrptrPaymentctl00ddAccount("Wages tax");
//    
//
//    TestModellerLogger.SetLastNodeGuid("e85ed246-a0e3-493b-8409-3508f190cb4a");
//    _pagesAdd_payment.Enter_ctl00cPHrptrPaymentctl00txtDescription("test2");
//    
//
//    TestModellerLogger.SetLastNodeGuid("64e8105b-bcb3-451e-aeab-a8f67f563fc3");
//    _pagesAdd_payment.Enter_ctl00cPHrptrPaymentctl00txtAmount("100");
//    
//
//    TestModellerLogger.SetLastNodeGuid("d092614f-4921-4a82-a2cf-5d87aacf885f");
//    _pagesAdd_payment.Click__Save_();
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
//    @Test  (groups= {"f97df073-007c-400c-9d38-3fd870c2415a","reimbursement scenario 3","reimbursement scenario 3 - Default Profile"},enabled=false)
//    @TestModellerPath(guid = "f97df073-007c-400c-9d38-3fd870c2415a")
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
//pages.Add_payment _pagesAdd_payment = new pages.Add_payment(driver);
//    TestModellerLogger.SetLastNodeGuid("79de1c6e-50e6-457b-b574-e815e216acae");
//    _pagesAdd_payment.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("1345cf6d-8845-440c-9fb8-ee89d90be9f7");
//    _pagesAdd_payment.Click_xPath_htmlbodyformmaindiv10div3div1div4divdiv2div1divdiv5divdivtabl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("235e53ea-1f95-4f7f-aa02-f8791ede239a");
//    _pagesAdd_payment.Select_ctl00cPHddlentryType("Payment");
//    
//
//    TestModellerLogger.SetLastNodeGuid("902914e0-dd69-4a18-802c-abb99f2acf9d");
//    _pagesAdd_payment.Enter_ctl00cPHrptrPaymentctl00txtDate("44061");
//    
//
//    TestModellerLogger.SetLastNodeGuid("1a00bdc9-bfc7-4eb2-aa62-07c3b34d68ee");
//    _pagesAdd_payment.Select_ctl00cPHrptrPaymentctl00ddAccount("Aiman Private limited");
//    
//
//    TestModellerLogger.SetLastNodeGuid("e85ed246-a0e3-493b-8409-3508f190cb4a");
//    _pagesAdd_payment.Enter_ctl00cPHrptrPaymentctl00txtDescription("test3");
//    
//
//    TestModellerLogger.SetLastNodeGuid("64e8105b-bcb3-451e-aeab-a8f67f563fc3");
//    _pagesAdd_payment.Enter_ctl00cPHrptrPaymentctl00txtAmount("100");
//    
//
//    TestModellerLogger.SetLastNodeGuid("d092614f-4921-4a82-a2cf-5d87aacf885f");
//    _pagesAdd_payment.Click__Save_();
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
//    @Test  (groups= {"a8b4778d-71a3-4440-9d43-83bb76419bbb","reimbursement scenario 3","reimbursement scenario 3 - Default Profile"})
//    @TestModellerPath(guid = "a8b4778d-71a3-4440-9d43-83bb76419bbb")
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
//pages.Add_payment _pagesAdd_payment = new pages.Add_payment(driver);
//    TestModellerLogger.SetLastNodeGuid("79de1c6e-50e6-457b-b574-e815e216acae");
//    _pagesAdd_payment.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("1345cf6d-8845-440c-9fb8-ee89d90be9f7");
//    _pagesAdd_payment.Click_xPath_htmlbodyformmaindiv10div3div1div4divdiv2div1divdiv5divdivtabl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("235e53ea-1f95-4f7f-aa02-f8791ede239a");
//    _pagesAdd_payment.Select_ctl00cPHddlentryType("Payment");
//    
//
//    TestModellerLogger.SetLastNodeGuid("902914e0-dd69-4a18-802c-abb99f2acf9d");
//    _pagesAdd_payment.Enter_ctl00cPHrptrPaymentctl00txtDate("44061");
//    
//
//    TestModellerLogger.SetLastNodeGuid("1a00bdc9-bfc7-4eb2-aa62-07c3b34d68ee");
//    _pagesAdd_payment.Select_ctl00cPHrptrPaymentctl00ddAccount("Generic Purchase Supplier");
//    
//
//    TestModellerLogger.SetLastNodeGuid("e85ed246-a0e3-493b-8409-3508f190cb4a");
//    _pagesAdd_payment.Enter_ctl00cPHrptrPaymentctl00txtDescription("test4");
//    
//
//    TestModellerLogger.SetLastNodeGuid("64e8105b-bcb3-451e-aeab-a8f67f563fc3");
//    _pagesAdd_payment.Enter_ctl00cPHrptrPaymentctl00txtAmount("100");
//    
//
//    TestModellerLogger.SetLastNodeGuid("d092614f-4921-4a82-a2cf-5d87aacf885f");
//    _pagesAdd_payment.Click__Save_();
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
