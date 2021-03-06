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

//http://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/a4a418b8-dbec-4453-9be0-a5b5ed50920a
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 252, profileId = 100206)
public class reimbursementscenario1_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"ad8fb86e-68aa-4059-96a7-80b097abfe5a","reimbursement scenario 1","reimbursement scenario 1 - Default Profile"})
    @TestModellerPath(guid = "ad8fb86e-68aa-4059-96a7-80b097abfe5a")
    public void GoToUrlpositiveenterusernamepositiveenterpasswordClickLoginsuccessGoToUrlpositiveagentnameCl1()
    {
        
        pages.login _pageslogin = new pages.login(driver);
    TestModellerLogger.SetLastNodeGuid("854a1118-4615-4409-996b-51f957f4b121");
    _pageslogin.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("5f78d4ec-ef66-42ec-80d3-bff428d78f7b");
    _pageslogin.Enter_ctl00cPHlogin("admin");
    

    TestModellerLogger.SetLastNodeGuid("98e3f377-efb7-4010-8f3a-04d5a7749cae");
    _pageslogin.Enter_ctl00cPHpass("nomisma@testr");
    

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
    

pages.Add_expense _pagesAdd_expense = new pages.Add_expense(driver);
    TestModellerLogger.SetLastNodeGuid("9642d1e3-ef00-4831-9cb7-b78ae04c063f");
    _pagesAdd_expense.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("38014894-580c-4d46-b323-4c70a2dd9eca");
    _pagesAdd_expense.Click_xPath_htmlbodyformmaindiv10div3div1div4divdiv2div1divdiv5divdivtabl();
    

    TestModellerLogger.SetLastNodeGuid("09108e66-6879-4386-923a-96bb9d8fef3c");
    _pagesAdd_expense.Select_ctl00cPHddlentryType("Mileage");
    

    TestModellerLogger.SetLastNodeGuid("7db68c7b-ed23-4427-878d-f406db67af01");
    _pagesAdd_expense.Enter_ctl00cPHrptrRecordctl00txtDate("30-04-2020");
    

    TestModellerLogger.SetLastNodeGuid("65e1319d-2b68-4d0b-83bc-a4dc1c944b4e");
    _pagesAdd_expense.Select_ctl00cPHrptrRecordctl00ddVehicleType("Cars and vans");
    

    TestModellerLogger.SetLastNodeGuid("0cac190a-ce2c-4d85-b3d0-8b1748a1761e");
    _pagesAdd_expense.Enter_ctl00cPHrptrRecordctl00txtDescription("Mileage testing");
    

    TestModellerLogger.SetLastNodeGuid("b201cd4a-3d90-482e-9388-9888fcacb0c2");
    _pagesAdd_expense.Enter_ctl00cPHrptrRecordctl00txtMileage("100");
    

    TestModellerLogger.SetLastNodeGuid("d9f684d0-d74d-40f1-86e7-c2b4f5dbdce1");
    _pagesAdd_expense.Enter_ctl00cPHrptrRecordctl00txtVATAmount("100");
    

    TestModellerLogger.SetLastNodeGuid("b7ae7c34-380a-48b5-a66f-0f9aa3a8fb3c");
    _pagesAdd_expense.Click__Save_();
    

pages.Expense_reimbursement _pagesExpense_reimbursement = new pages.Expense_reimbursement(driver);
    TestModellerLogger.SetLastNodeGuid("ee1fe0ff-f180-45f6-8cbc-f11971fa11c3");
    _pagesExpense_reimbursement.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("27db8869-ac7f-4ac7-8eee-e9e26082a5a8");
    _pagesExpense_reimbursement.Click_Expenditure();
    

    TestModellerLogger.SetLastNodeGuid("5d6bf358-e1c3-4c35-8cb1-fe75cfbc8960");
    _pagesExpense_reimbursement.Click_New_();
    

    TestModellerLogger.SetLastNodeGuid("473134d7-20c2-4815-9591-116c83e66fce");
    _pagesExpense_reimbursement.Click_Expense_Reimbursement();
    

    }}

//    @Test  (groups= {"b93e695b-6a16-4053-8048-a1caea769795","reimbursement scenario 1","reimbursement scenario 1 - Default Profile"})
//    @TestModellerPath(guid = "b93e695b-6a16-4053-8048-a1caea769795")
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
//pages.Add_expense _pagesAdd_expense = new pages.Add_expense(driver);
//    TestModellerLogger.SetLastNodeGuid("9642d1e3-ef00-4831-9cb7-b78ae04c063f");
//    _pagesAdd_expense.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("38014894-580c-4d46-b323-4c70a2dd9eca");
//    _pagesAdd_expense.Click_xPath_htmlbodyformmaindiv10div3div1div4divdiv2div1divdiv5divdivtabl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("09108e66-6879-4386-923a-96bb9d8fef3c");
//    _pagesAdd_expense.Select_ctl00cPHddlentryType("Mileage");
//    
//
//    TestModellerLogger.SetLastNodeGuid("7db68c7b-ed23-4427-878d-f406db67af01");
//    _pagesAdd_expense.Enter_ctl00cPHrptrRecordctl00txtDate("30-05-2020");
//    
//
//    TestModellerLogger.SetLastNodeGuid("65e1319d-2b68-4d0b-83bc-a4dc1c944b4e");
//    _pagesAdd_expense.Select_ctl00cPHrptrRecordctl00ddVehicleType("Motor cycles");
//    
//
//    TestModellerLogger.SetLastNodeGuid("0cac190a-ce2c-4d85-b3d0-8b1748a1761e");
//    _pagesAdd_expense.Enter_ctl00cPHrptrRecordctl00txtDescription("Mileage testing");
//    
//
//    TestModellerLogger.SetLastNodeGuid("b201cd4a-3d90-482e-9388-9888fcacb0c2");
//    _pagesAdd_expense.Enter_ctl00cPHrptrRecordctl00txtMileage("200");
//    
//
//    TestModellerLogger.SetLastNodeGuid("d9f684d0-d74d-40f1-86e7-c2b4f5dbdce1");
//    _pagesAdd_expense.Enter_ctl00cPHrptrRecordctl00txtVATAmount("100");
//    
//
//    TestModellerLogger.SetLastNodeGuid("b7ae7c34-380a-48b5-a66f-0f9aa3a8fb3c");
//    _pagesAdd_expense.Click__Save_();
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
//    @Test  (groups= {"15dc0da0-6a39-476d-9e02-537cb2d158b2","reimbursement scenario 1","reimbursement scenario 1 - Default Profile"})
//    @TestModellerPath(guid = "15dc0da0-6a39-476d-9e02-537cb2d158b2")
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
//pages.Add_expense _pagesAdd_expense = new pages.Add_expense(driver);
//    TestModellerLogger.SetLastNodeGuid("9642d1e3-ef00-4831-9cb7-b78ae04c063f");
//    _pagesAdd_expense.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("38014894-580c-4d46-b323-4c70a2dd9eca");
//    _pagesAdd_expense.Click_xPath_htmlbodyformmaindiv10div3div1div4divdiv2div1divdiv5divdivtabl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("09108e66-6879-4386-923a-96bb9d8fef3c");
//    _pagesAdd_expense.Select_ctl00cPHddlentryType("Mileage");
//    
//
//    TestModellerLogger.SetLastNodeGuid("7db68c7b-ed23-4427-878d-f406db67af01");
//    _pagesAdd_expense.Enter_ctl00cPHrptrRecordctl00txtDate("30-05-2020");
//    
//
//    TestModellerLogger.SetLastNodeGuid("65e1319d-2b68-4d0b-83bc-a4dc1c944b4e");
//    _pagesAdd_expense.Select_ctl00cPHrptrRecordctl00ddVehicleType("Bicycles");
//    
//
//    TestModellerLogger.SetLastNodeGuid("0cac190a-ce2c-4d85-b3d0-8b1748a1761e");
//    _pagesAdd_expense.Enter_ctl00cPHrptrRecordctl00txtDescription("Mileage testing");
//    
//
//    TestModellerLogger.SetLastNodeGuid("b201cd4a-3d90-482e-9388-9888fcacb0c2");
//    _pagesAdd_expense.Enter_ctl00cPHrptrRecordctl00txtMileage("100");
//    
//
//    TestModellerLogger.SetLastNodeGuid("d9f684d0-d74d-40f1-86e7-c2b4f5dbdce1");
//    _pagesAdd_expense.Enter_ctl00cPHrptrRecordctl00txtVATAmount("100");
//    
//
//    TestModellerLogger.SetLastNodeGuid("b7ae7c34-380a-48b5-a66f-0f9aa3a8fb3c");
//    _pagesAdd_expense.Click__Save_();
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
