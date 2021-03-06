package tests;

import reports.TestNGListener;

import ie.curiositysoftware.testmodeller.TestModellerPath;
import ie.curiositysoftware.testmodeller.TestModellerSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utilities.testmodeller.TestModellerLogger;

//http://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/4eba1e7d-9ec7-42cb-b74c-87b3770949de
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 253, profileId = 100212)
public class Reimbursementscenario2_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"9b44e576-c181-49cd-9539-658bdfd53616","Reimbursement scenario 2","Reimbursement scenario 2 - Default Profile"})
    @TestModellerPath(guid = "9b44e576-c181-49cd-9539-658bdfd53616")
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
    

pages.Add_allowance _pagesAdd_allowance = new pages.Add_allowance(driver);
    TestModellerLogger.SetLastNodeGuid("5363729d-0e57-4aa5-a4e0-ff42ef0ee869");
    _pagesAdd_allowance.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("4fabdc32-e0bf-4ea0-9af4-25a7d266f4a2");
    _pagesAdd_allowance.Click_xPath_htmlbodyformmaindiv10div3div1div4divdiv2div1divdiv5divdivtabl();
    

    TestModellerLogger.SetLastNodeGuid("ae54886a-5c15-46d4-bd1a-7487f1011891");
    _pagesAdd_allowance.Select_ctl00cPHddlentryType("Allowance");
    

    TestModellerLogger.SetLastNodeGuid("668a6241-74fd-492b-ae90-ee2ec4a0f57e");
    _pagesAdd_allowance.Enter_ctl00cPHrptrRecordctl00txtDate("30-04-2020");
    

    TestModellerLogger.SetLastNodeGuid("d6f876a1-05f5-4051-89cd-8bfc6cd7f20a");
    _pagesAdd_allowance.Select_ctl00cPHrptrRecordctl00ddExpenseHead("2 meal rate ?10");
    

    TestModellerLogger.SetLastNodeGuid("9e6e3358-4a21-46fe-ad0d-69e020c4297a");
    _pagesAdd_allowance.Enter_ctl00cPHrptrRecordctl00txtDescription("abc");
    

    TestModellerLogger.SetLastNodeGuid("ebd9979d-4408-4de3-a2f7-d4a05093471c");
    _pagesAdd_allowance.Enter_ctl00cPHrptrRecordctl00txtAmount("100");
    
    TestModellerLogger.SetLastNodeGuid("b7ae7c34-380a-48b5-a66f-0f9aa3a8fb3c");
    _pagesAdd_allowance.Click__Save_();

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

//    @Test  (groups= {"8aed120a-8772-47f0-b059-a0f4b3da383f","Reimbursement scenario 2","Reimbursement scenario 2 - Default Profile"},enabled=false)
//    @TestModellerPath(guid = "8aed120a-8772-47f0-b059-a0f4b3da383f")
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
//pages.Add_allowance _pagesAdd_allowance = new pages.Add_allowance(driver);
//    TestModellerLogger.SetLastNodeGuid("5363729d-0e57-4aa5-a4e0-ff42ef0ee869");
//    _pagesAdd_allowance.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("4fabdc32-e0bf-4ea0-9af4-25a7d266f4a2");
//    _pagesAdd_allowance.Click_xPath_htmlbodyformmaindiv10div3div1div4divdiv2div1divdiv5divdivtabl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("ae54886a-5c15-46d4-bd1a-7487f1011891");
//    _pagesAdd_allowance.Select_ctl00cPHddlentryType("Allowance");
//    
//
//    TestModellerLogger.SetLastNodeGuid("668a6241-74fd-492b-ae90-ee2ec4a0f57e");
//    _pagesAdd_allowance.Enter_ctl00cPHrptrRecordctl00txtDate("44061");
//    
//
//    TestModellerLogger.SetLastNodeGuid("d6f876a1-05f5-4051-89cd-8bfc6cd7f20a");
//    _pagesAdd_allowance.Select_ctl00cPHrptrRecordctl00ddExpenseHead("Annual function allowance upto ??150");
//    
//
//    TestModellerLogger.SetLastNodeGuid("9e6e3358-4a21-46fe-ad0d-69e020c4297a");
//    _pagesAdd_allowance.Enter_ctl00cPHrptrRecordctl00txtDescription("abc");
//    
//
//    TestModellerLogger.SetLastNodeGuid("ebd9979d-4408-4de3-a2f7-d4a05093471c");
//    _pagesAdd_allowance.Enter_ctl00cPHrptrRecordctl00txtAmount("100");
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
//    @Test  (groups= {"42a31d11-3f6a-4e2a-82eb-301b0d5e8085","Reimbursement scenario 2","Reimbursement scenario 2 - Default Profile"},enabled=false)
//    @TestModellerPath(guid = "42a31d11-3f6a-4e2a-82eb-301b0d5e8085")
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
//pages.Add_allowance _pagesAdd_allowance = new pages.Add_allowance(driver);
//    TestModellerLogger.SetLastNodeGuid("5363729d-0e57-4aa5-a4e0-ff42ef0ee869");
//    _pagesAdd_allowance.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("4fabdc32-e0bf-4ea0-9af4-25a7d266f4a2");
//    _pagesAdd_allowance.Click_xPath_htmlbodyformmaindiv10div3div1div4divdiv2div1divdiv5divdivtabl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("ae54886a-5c15-46d4-bd1a-7487f1011891");
//    _pagesAdd_allowance.Select_ctl00cPHddlentryType("Allowance");
//    
//
//    TestModellerLogger.SetLastNodeGuid("668a6241-74fd-492b-ae90-ee2ec4a0f57e");
//    _pagesAdd_allowance.Enter_ctl00cPHrptrRecordctl00txtDate("44061");
//    
//
//    TestModellerLogger.SetLastNodeGuid("d6f876a1-05f5-4051-89cd-8bfc6cd7f20a");
//    _pagesAdd_allowance.Select_ctl00cPHrptrRecordctl00ddExpenseHead("Breakfast rate ??5");
//    
//
//    TestModellerLogger.SetLastNodeGuid("9e6e3358-4a21-46fe-ad0d-69e020c4297a");
//    _pagesAdd_allowance.Enter_ctl00cPHrptrRecordctl00txtDescription("abc");
//    
//
//    TestModellerLogger.SetLastNodeGuid("ebd9979d-4408-4de3-a2f7-d4a05093471c");
//    _pagesAdd_allowance.Enter_ctl00cPHrptrRecordctl00txtAmount("100");
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
//    @Test  (groups= {"e75c270d-6636-4675-8ead-e449ea2afec5","Reimbursement scenario 2","Reimbursement scenario 2 - Default Profile"},enabled=false)
//    @TestModellerPath(guid = "e75c270d-6636-4675-8ead-e449ea2afec5")
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
//pages.Add_allowance _pagesAdd_allowance = new pages.Add_allowance(driver);
//    TestModellerLogger.SetLastNodeGuid("5363729d-0e57-4aa5-a4e0-ff42ef0ee869");
//    _pagesAdd_allowance.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("4fabdc32-e0bf-4ea0-9af4-25a7d266f4a2");
//    _pagesAdd_allowance.Click_xPath_htmlbodyformmaindiv10div3div1div4divdiv2div1divdiv5divdivtabl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("ae54886a-5c15-46d4-bd1a-7487f1011891");
//    _pagesAdd_allowance.Select_ctl00cPHddlentryType("Allowance");
//    
//
//    TestModellerLogger.SetLastNodeGuid("668a6241-74fd-492b-ae90-ee2ec4a0f57e");
//    _pagesAdd_allowance.Enter_ctl00cPHrptrRecordctl00txtDate("44061");
//    
//
//    TestModellerLogger.SetLastNodeGuid("d6f876a1-05f5-4051-89cd-8bfc6cd7f20a");
//    _pagesAdd_allowance.Select_ctl00cPHrptrRecordctl00ddExpenseHead("Equipment expensed");
//    
//
//    TestModellerLogger.SetLastNodeGuid("9e6e3358-4a21-46fe-ad0d-69e020c4297a");
//    _pagesAdd_allowance.Enter_ctl00cPHrptrRecordctl00txtDescription("abc");
//    
//
//    TestModellerLogger.SetLastNodeGuid("ebd9979d-4408-4de3-a2f7-d4a05093471c");
//    _pagesAdd_allowance.Enter_ctl00cPHrptrRecordctl00txtAmount("100");
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
//    @Test  (groups= {"7616fa9e-7a68-47d5-84d8-0e7f851f9dcc","Reimbursement scenario 2","Reimbursement scenario 2 - Default Profile"},enabled=false)
//    @TestModellerPath(guid = "7616fa9e-7a68-47d5-84d8-0e7f851f9dcc")
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
//pages.Add_allowance _pagesAdd_allowance = new pages.Add_allowance(driver);
//    TestModellerLogger.SetLastNodeGuid("5363729d-0e57-4aa5-a4e0-ff42ef0ee869");
//    _pagesAdd_allowance.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("4fabdc32-e0bf-4ea0-9af4-25a7d266f4a2");
//    _pagesAdd_allowance.Click_xPath_htmlbodyformmaindiv10div3div1div4divdiv2div1divdiv5divdivtabl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("ae54886a-5c15-46d4-bd1a-7487f1011891");
//    _pagesAdd_allowance.Select_ctl00cPHddlentryType("Allowance");
//    
//
//    TestModellerLogger.SetLastNodeGuid("668a6241-74fd-492b-ae90-ee2ec4a0f57e");
//    _pagesAdd_allowance.Enter_ctl00cPHrptrRecordctl00txtDate("44061");
//    
//
//    TestModellerLogger.SetLastNodeGuid("d6f876a1-05f5-4051-89cd-8bfc6cd7f20a");
//    _pagesAdd_allowance.Select_ctl00cPHrptrRecordctl00ddExpenseHead("Incidental overnight exp outside UK ??10");
//    
//
//    TestModellerLogger.SetLastNodeGuid("9e6e3358-4a21-46fe-ad0d-69e020c4297a");
//    _pagesAdd_allowance.Enter_ctl00cPHrptrRecordctl00txtDescription("abc");
//    
//
//    TestModellerLogger.SetLastNodeGuid("ebd9979d-4408-4de3-a2f7-d4a05093471c");
//    _pagesAdd_allowance.Enter_ctl00cPHrptrRecordctl00txtAmount("100");
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
//    @Test  (groups= {"c11bace1-88be-424d-a7a9-c1d841f5b467","Reimbursement scenario 2","Reimbursement scenario 2 - Default Profile"},enabled=false)
//    @TestModellerPath(guid = "c11bace1-88be-424d-a7a9-c1d841f5b467")
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
//pages.Add_allowance _pagesAdd_allowance = new pages.Add_allowance(driver);
//    TestModellerLogger.SetLastNodeGuid("5363729d-0e57-4aa5-a4e0-ff42ef0ee869");
//    _pagesAdd_allowance.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("4fabdc32-e0bf-4ea0-9af4-25a7d266f4a2");
//    _pagesAdd_allowance.Click_xPath_htmlbodyformmaindiv10div3div1div4divdiv2div1divdiv5divdivtabl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("ae54886a-5c15-46d4-bd1a-7487f1011891");
//    _pagesAdd_allowance.Select_ctl00cPHddlentryType("Allowance");
//    
//
//    TestModellerLogger.SetLastNodeGuid("668a6241-74fd-492b-ae90-ee2ec4a0f57e");
//    _pagesAdd_allowance.Enter_ctl00cPHrptrRecordctl00txtDate("44061");
//    
//
//    TestModellerLogger.SetLastNodeGuid("d6f876a1-05f5-4051-89cd-8bfc6cd7f20a");
//    _pagesAdd_allowance.Select_ctl00cPHrptrRecordctl00ddExpenseHead("Incidental overnight expenses UK ??5");
//    
//
//    TestModellerLogger.SetLastNodeGuid("9e6e3358-4a21-46fe-ad0d-69e020c4297a");
//    _pagesAdd_allowance.Enter_ctl00cPHrptrRecordctl00txtDescription("abc");
//    
//
//    TestModellerLogger.SetLastNodeGuid("ebd9979d-4408-4de3-a2f7-d4a05093471c");
//    _pagesAdd_allowance.Enter_ctl00cPHrptrRecordctl00txtAmount("100");
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
//    @Test  (groups= {"710771af-8fcf-4673-bdb6-6ab1452971d6","Reimbursement scenario 2","Reimbursement scenario 2 - Default Profile"},enabled=false)
//    @TestModellerPath(guid = "710771af-8fcf-4673-bdb6-6ab1452971d6")
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
//pages.Add_allowance _pagesAdd_allowance = new pages.Add_allowance(driver);
//    TestModellerLogger.SetLastNodeGuid("5363729d-0e57-4aa5-a4e0-ff42ef0ee869");
//    _pagesAdd_allowance.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("4fabdc32-e0bf-4ea0-9af4-25a7d266f4a2");
//    _pagesAdd_allowance.Click_xPath_htmlbodyformmaindiv10div3div1div4divdiv2div1divdiv5divdivtabl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("ae54886a-5c15-46d4-bd1a-7487f1011891");
//    _pagesAdd_allowance.Select_ctl00cPHddlentryType("Allowance");
//    
//
//    TestModellerLogger.SetLastNodeGuid("668a6241-74fd-492b-ae90-ee2ec4a0f57e");
//    _pagesAdd_allowance.Enter_ctl00cPHrptrRecordctl00txtDate("44061");
//    
//
//    TestModellerLogger.SetLastNodeGuid("d6f876a1-05f5-4051-89cd-8bfc6cd7f20a");
//    _pagesAdd_allowance.Select_ctl00cPHrptrRecordctl00ddExpenseHead("Late evening meal rate - ??15");
//    
//
//    TestModellerLogger.SetLastNodeGuid("9e6e3358-4a21-46fe-ad0d-69e020c4297a");
//    _pagesAdd_allowance.Enter_ctl00cPHrptrRecordctl00txtDescription("abc.");
//    
//
//    TestModellerLogger.SetLastNodeGuid("ebd9979d-4408-4de3-a2f7-d4a05093471c");
//    _pagesAdd_allowance.Enter_ctl00cPHrptrRecordctl00txtAmount("100");
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
//    @Test  (groups= {"72a9b5b7-d395-43ec-ad69-08f9026bcfc2","Reimbursement scenario 2","Reimbursement scenario 2 - Default Profile"},enabled=false)
//    @TestModellerPath(guid = "72a9b5b7-d395-43ec-ad69-08f9026bcfc2")
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
//pages.Add_allowance _pagesAdd_allowance = new pages.Add_allowance(driver);
//    TestModellerLogger.SetLastNodeGuid("5363729d-0e57-4aa5-a4e0-ff42ef0ee869");
//    _pagesAdd_allowance.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("4fabdc32-e0bf-4ea0-9af4-25a7d266f4a2");
//    _pagesAdd_allowance.Click_xPath_htmlbodyformmaindiv10div3div1div4divdiv2div1divdiv5divdivtabl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("ae54886a-5c15-46d4-bd1a-7487f1011891");
//    _pagesAdd_allowance.Select_ctl00cPHddlentryType("Allowance");
//    
//
//    TestModellerLogger.SetLastNodeGuid("668a6241-74fd-492b-ae90-ee2ec4a0f57e");
//    _pagesAdd_allowance.Enter_ctl00cPHrptrRecordctl00txtDate("44061");
//    
//
//    TestModellerLogger.SetLastNodeGuid("d6f876a1-05f5-4051-89cd-8bfc6cd7f20a");
//    _pagesAdd_allowance.Select_ctl00cPHrptrRecordctl00ddExpenseHead("One meal rate ??5");
//    
//
//    TestModellerLogger.SetLastNodeGuid("9e6e3358-4a21-46fe-ad0d-69e020c4297a");
//    _pagesAdd_allowance.Enter_ctl00cPHrptrRecordctl00txtDescription("abc");
//    
//
//    TestModellerLogger.SetLastNodeGuid("ebd9979d-4408-4de3-a2f7-d4a05093471c");
//    _pagesAdd_allowance.Enter_ctl00cPHrptrRecordctl00txtAmount("100");
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
//    @Test  (groups= {"93344aa7-0aff-40a3-b5e8-d375f5521920","Reimbursement scenario 2","Reimbursement scenario 2 - Default Profile"},enabled=false)
//    @TestModellerPath(guid = "93344aa7-0aff-40a3-b5e8-d375f5521920")
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
//pages.Add_allowance _pagesAdd_allowance = new pages.Add_allowance(driver);
//    TestModellerLogger.SetLastNodeGuid("5363729d-0e57-4aa5-a4e0-ff42ef0ee869");
//    _pagesAdd_allowance.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("4fabdc32-e0bf-4ea0-9af4-25a7d266f4a2");
//    _pagesAdd_allowance.Click_xPath_htmlbodyformmaindiv10div3div1div4divdiv2div1divdiv5divdivtabl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("ae54886a-5c15-46d4-bd1a-7487f1011891");
//    _pagesAdd_allowance.Select_ctl00cPHddlentryType("Allowance");
//    
//
//    TestModellerLogger.SetLastNodeGuid("668a6241-74fd-492b-ae90-ee2ec4a0f57e");
//    _pagesAdd_allowance.Enter_ctl00cPHrptrRecordctl00txtDate("44061");
//    
//
//    TestModellerLogger.SetLastNodeGuid("d6f876a1-05f5-4051-89cd-8bfc6cd7f20a");
//    _pagesAdd_allowance.Select_ctl00cPHrptrRecordctl00ddExpenseHead("Overseas allowance");
//    
//
//    TestModellerLogger.SetLastNodeGuid("9e6e3358-4a21-46fe-ad0d-69e020c4297a");
//    _pagesAdd_allowance.Enter_ctl00cPHrptrRecordctl00txtDescription("abc");
//    
//
//    TestModellerLogger.SetLastNodeGuid("ebd9979d-4408-4de3-a2f7-d4a05093471c");
//    _pagesAdd_allowance.Enter_ctl00cPHrptrRecordctl00txtAmount("100");
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
//    @Test  (groups= {"6eb81e52-e562-4b83-b00a-2d0eca373281","Reimbursement scenario 2","Reimbursement scenario 2 - Default Profile"},enabled=false)
//    @TestModellerPath(guid = "6eb81e52-e562-4b83-b00a-2d0eca373281")
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
//pages.Add_allowance _pagesAdd_allowance = new pages.Add_allowance(driver);
//    TestModellerLogger.SetLastNodeGuid("5363729d-0e57-4aa5-a4e0-ff42ef0ee869");
//    _pagesAdd_allowance.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("4fabdc32-e0bf-4ea0-9af4-25a7d266f4a2");
//    _pagesAdd_allowance.Click_xPath_htmlbodyformmaindiv10div3div1div4divdiv2div1divdiv5divdivtabl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("ae54886a-5c15-46d4-bd1a-7487f1011891");
//    _pagesAdd_allowance.Select_ctl00cPHddlentryType("Allowance");
//    
//
//    TestModellerLogger.SetLastNodeGuid("668a6241-74fd-492b-ae90-ee2ec4a0f57e");
//    _pagesAdd_allowance.Enter_ctl00cPHrptrRecordctl00txtDate("44061");
//    
//
//    TestModellerLogger.SetLastNodeGuid("d6f876a1-05f5-4051-89cd-8bfc6cd7f20a");
//    _pagesAdd_allowance.Select_ctl00cPHrptrRecordctl00ddExpenseHead("Relocation allowance upto ??8000");
//    
//
//    TestModellerLogger.SetLastNodeGuid("9e6e3358-4a21-46fe-ad0d-69e020c4297a");
//    _pagesAdd_allowance.Enter_ctl00cPHrptrRecordctl00txtDescription("abc");
//    
//
//    TestModellerLogger.SetLastNodeGuid("ebd9979d-4408-4de3-a2f7-d4a05093471c");
//    _pagesAdd_allowance.Enter_ctl00cPHrptrRecordctl00txtAmount("100");
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
//    @Test  (groups= {"ec535bcb-ef18-4b3a-9d7a-29e8834e16e0","Reimbursement scenario 2","Reimbursement scenario 2 - Default Profile"},enabled=false)
//    @TestModellerPath(guid = "ec535bcb-ef18-4b3a-9d7a-29e8834e16e0")
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
//pages.Add_allowance _pagesAdd_allowance = new pages.Add_allowance(driver);
//    TestModellerLogger.SetLastNodeGuid("5363729d-0e57-4aa5-a4e0-ff42ef0ee869");
//    _pagesAdd_allowance.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("4fabdc32-e0bf-4ea0-9af4-25a7d266f4a2");
//    _pagesAdd_allowance.Click_xPath_htmlbodyformmaindiv10div3div1div4divdiv2div1divdiv5divdivtabl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("ae54886a-5c15-46d4-bd1a-7487f1011891");
//    _pagesAdd_allowance.Select_ctl00cPHddlentryType("Allowance");
//    
//
//    TestModellerLogger.SetLastNodeGuid("668a6241-74fd-492b-ae90-ee2ec4a0f57e");
//    _pagesAdd_allowance.Enter_ctl00cPHrptrRecordctl00txtDate("44061");
//    
//
//    TestModellerLogger.SetLastNodeGuid("d6f876a1-05f5-4051-89cd-8bfc6cd7f20a");
//    _pagesAdd_allowance.Select_ctl00cPHrptrRecordctl00ddExpenseHead("Staff welfare");
//    
//
//    TestModellerLogger.SetLastNodeGuid("9e6e3358-4a21-46fe-ad0d-69e020c4297a");
//    _pagesAdd_allowance.Enter_ctl00cPHrptrRecordctl00txtDescription("abc");
//    
//
//    TestModellerLogger.SetLastNodeGuid("ebd9979d-4408-4de3-a2f7-d4a05093471c");
//    _pagesAdd_allowance.Enter_ctl00cPHrptrRecordctl00txtAmount("100");
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
//    @Test  (groups= {"d98f2730-b45a-4604-b078-cba4aa2db6be","Reimbursement scenario 2","Reimbursement scenario 2 - Default Profile"},enabled=false)
//    @TestModellerPath(guid = "d98f2730-b45a-4604-b078-cba4aa2db6be")
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
//pages.Add_allowance _pagesAdd_allowance = new pages.Add_allowance(driver);
//    TestModellerLogger.SetLastNodeGuid("5363729d-0e57-4aa5-a4e0-ff42ef0ee869");
//    _pagesAdd_allowance.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("4fabdc32-e0bf-4ea0-9af4-25a7d266f4a2");
//    _pagesAdd_allowance.Click_xPath_htmlbodyformmaindiv10div3div1div4divdiv2div1divdiv5divdivtabl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("ae54886a-5c15-46d4-bd1a-7487f1011891");
//    _pagesAdd_allowance.Select_ctl00cPHddlentryType("Allowance");
//    
//
//    TestModellerLogger.SetLastNodeGuid("668a6241-74fd-492b-ae90-ee2ec4a0f57e");
//    _pagesAdd_allowance.Enter_ctl00cPHrptrRecordctl00txtDate("44061");
//    
//
//    TestModellerLogger.SetLastNodeGuid("d6f876a1-05f5-4051-89cd-8bfc6cd7f20a");
//    _pagesAdd_allowance.Select_ctl00cPHrptrRecordctl00ddExpenseHead("Subsistence / food");
//    
//
//    TestModellerLogger.SetLastNodeGuid("9e6e3358-4a21-46fe-ad0d-69e020c4297a");
//    _pagesAdd_allowance.Enter_ctl00cPHrptrRecordctl00txtDescription("abc");
//    
//
//    TestModellerLogger.SetLastNodeGuid("ebd9979d-4408-4de3-a2f7-d4a05093471c");
//    _pagesAdd_allowance.Enter_ctl00cPHrptrRecordctl00txtAmount("100");
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
//    @Test  (groups= {"a21f9cd6-76d8-45a5-9d88-2d28b31aef7b","Reimbursement scenario 2","Reimbursement scenario 2 - Default Profile"},enabled=false)
//    @TestModellerPath(guid = "a21f9cd6-76d8-45a5-9d88-2d28b31aef7b")
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
//pages.Add_allowance _pagesAdd_allowance = new pages.Add_allowance(driver);
//    TestModellerLogger.SetLastNodeGuid("5363729d-0e57-4aa5-a4e0-ff42ef0ee869");
//    _pagesAdd_allowance.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("4fabdc32-e0bf-4ea0-9af4-25a7d266f4a2");
//    _pagesAdd_allowance.Click_xPath_htmlbodyformmaindiv10div3div1div4divdiv2div1divdiv5divdivtabl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("ae54886a-5c15-46d4-bd1a-7487f1011891");
//    _pagesAdd_allowance.Select_ctl00cPHddlentryType("Allowance");
//    
//
//    TestModellerLogger.SetLastNodeGuid("668a6241-74fd-492b-ae90-ee2ec4a0f57e");
//    _pagesAdd_allowance.Enter_ctl00cPHrptrRecordctl00txtDate("44061");
//    
//
//    TestModellerLogger.SetLastNodeGuid("d6f876a1-05f5-4051-89cd-8bfc6cd7f20a");
//    _pagesAdd_allowance.Select_ctl00cPHrptrRecordctl00ddExpenseHead("Use of home as office");
//    
//
//    TestModellerLogger.SetLastNodeGuid("9e6e3358-4a21-46fe-ad0d-69e020c4297a");
//    _pagesAdd_allowance.Enter_ctl00cPHrptrRecordctl00txtDescription("abc");
//    
//
//    TestModellerLogger.SetLastNodeGuid("ebd9979d-4408-4de3-a2f7-d4a05093471c");
//    _pagesAdd_allowance.Enter_ctl00cPHrptrRecordctl00txtAmount("100");
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

}
