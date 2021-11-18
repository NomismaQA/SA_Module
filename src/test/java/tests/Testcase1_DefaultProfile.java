package tests;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import ie.curiositysoftware.testmodeller.TestModellerPath;
import ie.curiositysoftware.testmodeller.TestModellerSuite;
import reports.TestNGListener;
import utilities.testmodeller.TestModellerLogger;

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/5b33112d-6221-4ad4-8f48-1b1d592dcc97
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1430, profileId = 101304)
public class Testcase1_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"5cecbffc-0b7b-48d8-af43-aad336f4a463","Testcase 1","Testcase 1 - Default Profile"})
    @TestModellerPath(guid = "5cecbffc-0b7b-48d8-af43-aad336f4a463")
    public void GoToUrlusernamepositiveinputPositiveEnterctl00cPHpassClickLoginPositiveEnterctl00cPHFiltertxtAg()
    {
        
        pages.login_page _pageslogin_page = new pages.login_page(driver);
    TestModellerLogger.SetLastNodeGuid("e145708c-be0f-41c6-9ba5-5fc0ea05ace2");
    _pageslogin_page.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("62829672-fdd5-4a0e-b034-6c32588d9b62");
    _pageslogin_page.Enter_ctl00cPHlogin("admin");
    

    TestModellerLogger.SetLastNodeGuid("202c66e2-33fa-4363-938a-876ce5c175a2");
    _pageslogin_page.Enter_ctl00cPHpass("admin1@1");
    

    TestModellerLogger.SetLastNodeGuid("6c41060d-a121-4d9b-a724-9227935a194e");
    _pageslogin_page.Click_Login();
    

pages.Agentpage _pagesAgentpage = new pages.Agentpage(driver);
    TestModellerLogger.SetLastNodeGuid("9997b1d2-129f-42d2-af0e-07df9cc61552");
    _pagesAgentpage.Enter_ctl00cPHFiltertxtAgentName("MTRTestcases2020");
    

    TestModellerLogger.SetLastNodeGuid("fa144c29-3a61-4cdb-b63c-5ff85ebcb4fe");
    _pagesAgentpage.Click_Search();
    

    TestModellerLogger.SetLastNodeGuid("f896ef3b-136e-4806-9356-ff59cdaaf858");
    _pagesAgentpage.Click__Demo_();
    

    TestModellerLogger.SetLastNodeGuid("5f95e59c-c587-41d9-a33b-6f3971dc9518");
    _pagesAgentpage.Switch_Tab();
    

pages.SA_Left_menu _pagesSA_Left_menu = new pages.SA_Left_menu(driver);
    TestModellerLogger.SetLastNodeGuid("e64ae0fd-282c-4e09-a92d-edd268a58fdb");
    _pagesSA_Left_menu.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("78256cf4-21fe-4630-96ae-fedef1a39710");
    _pagesSA_Left_menu.Click__Self_Assessment_();
    

    TestModellerLogger.SetLastNodeGuid("3cd95de6-9e7d-440a-82ad-69700ce012f3");
    _pagesSA_Left_menu.Click_Client_List();
    

    TestModellerLogger.SetLastNodeGuid("430092f7-aa2f-434a-8d7b-d84f8d8e8a7b");
    _pagesSA_Left_menu.Enter_ctl00ctl00ParentContentcPHFiltertxtFirstName("Testcase1");
    

    TestModellerLogger.SetLastNodeGuid("9dc3a37c-5463-4003-9355-e1e74c828d52");
    _pagesSA_Left_menu.Click_Update();
    

    TestModellerLogger.SetLastNodeGuid("4dcfee82-0a93-4025-91cb-805ac33e7876");
    _pagesSA_Left_menu.Click__MTRTestCase1_SA();
    

    TestModellerLogger.SetLastNodeGuid("f2bf6f0a-0c88-4300-857d-2a071c37b8d7");
    _pagesSA_Left_menu.Switch_Tab();
    

pages.employment _pagesemployment = new pages.employment(driver);
//    TestModellerLogger.SetLastNodeGuid("1a162461-f448-4745-a983-0f945b9d659e");
//    _pagesemployment.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("d244c9b0-9f03-46e2-85d3-f0a85dd97560");
    _pagesemployment.Select_ctl00ddlTaxYear("6 April 2020 to 5 April 2021");

//    TestModellerLogger.SetLastNodeGuid("e7e6ed12-42b4-41fa-98fe-2e064c042e5a");
//    _pagesemployment.Click_SA102_Employment();
//    
//
//    TestModellerLogger.SetLastNodeGuid("3f3dd5dc-7a0e-4fdb-be17-1efcfa9b28f8");
//    _pagesemployment.Click__Add_Employment_Income();
//    
//
//    TestModellerLogger.SetLastNodeGuid("6667d80c-ab51-471b-86cc-0d2445c15fed");
//    _pagesemployment.Enter_ctl00cPHtxtEmployer("abc");
//    
//
//    TestModellerLogger.SetLastNodeGuid("65cbf184-0701-48e5-884c-3ad0e79c03d6");
//    _pagesemployment.Enter_ctl00cPHtxtEmployerPAYEReference("120/abc");
//    
//
//    TestModellerLogger.SetLastNodeGuid("4d2ad08f-fa62-4cbf-8d21-6de2520aa6fe");
//    _pagesemployment.Enter_ctl00cPHtxtPayFromEmployment("50000");
//    
//
//    TestModellerLogger.SetLastNodeGuid("7c68db6e-3567-4338-a723-bfcb4da583ff");
//    _pagesemployment.Enter_ctl00cPHtxtTaxTakenOffPay("7500");
    

//    TestModellerLogger.SetLastNodeGuid("68bc1e88-46d8-46bb-8a19-0f8194789c78");
//    _pagesemployment.Click_Benefits();
//    
//
//    TestModellerLogger.SetLastNodeGuid("832d8685-5fd7-4954-a4a7-fd0e6da7eea1");
//    _pagesemployment.Enter_ctl00cPHtxtCompanyCarsAndVansBenefit("Rippin - Russel");
//    
//
//    TestModellerLogger.SetLastNodeGuid("73e75647-d0f0-4090-bb06-e6242fc4b431");
//    _pagesemployment.Enter_ctl00cPHtxtFuelForCarsAndVans("100");
//    
//
//    TestModellerLogger.SetLastNodeGuid("13aab319-bc28-437a-8d42-cf9c04cbdb5d");
//    _pagesemployment.Enter_ctl00cPHtxtPrivateMedicalDentalInsurance("100");
//    
//
//    TestModellerLogger.SetLastNodeGuid("8923b21e-2c8c-477d-a903-cbf0ed66987e");
//    _pagesemployment.Enter_ctl00cPHtxtVouchersCreditCardsExcessMileageAllowance("100");
//    
//
//    TestModellerLogger.SetLastNodeGuid("7d81e6f7-b2a1-4145-b677-8ef717a189ec");
//    _pagesemployment.Enter_ctl00cPHtxtGoodsEtcProvidedByEmployer("100");
//    
//
//    TestModellerLogger.SetLastNodeGuid("5c381ae9-886d-4da4-b023-311e042a7ea8");
//    _pagesemployment.Enter_ctl00cPHtxtAccommodationProvidedByEmployer("100");
//    
//
//    TestModellerLogger.SetLastNodeGuid("cb1ba3e0-f0d9-45cc-b6fc-9d61161b3dcb");
//    _pagesemployment.Enter_ctl00cPHtxtOtherBenefits("100");
//    
//
//    TestModellerLogger.SetLastNodeGuid("879149fd-9731-4809-beeb-ad062a26dded");
//    _pagesemployment.Enter_ctl00cPHtxtExpensesPaymentsReceived("100");
//    
//
//    TestModellerLogger.SetLastNodeGuid("a8858871-c6b9-46a6-9206-3ded8d764855");
//    _pagesemployment.Click_Expenses();
//    
//
//    TestModellerLogger.SetLastNodeGuid("2b442961-5142-4bdd-8306-a11efd7928d6");
//    _pagesemployment.Enter_ctl00cPHtxtBusinessTravelAndSubsistence("100");
//    
//
//    TestModellerLogger.SetLastNodeGuid("c9b8d0b4-6861-4eeb-92e9-589ccf7590f3");
//    _pagesemployment.Enter_ctl00cPHtxtFixedExpensesDeductions("100");
//    
//
//    TestModellerLogger.SetLastNodeGuid("3b2b0116-8d78-46f5-ade2-8d0ec6f0b907");
//    _pagesemployment.Enter_ctl00cPHtxtProfessionalFeesAndSubscriptions("100");
//    
//
//    TestModellerLogger.SetLastNodeGuid("146b1702-c14f-4652-8be0-db45a0e229b4");
//    _pagesemployment.Enter_ctl00cPHtxtOtherExpensesAndCapitalAllowances("100");
    
//
//    TestModellerLogger.SetLastNodeGuid("1479dc29-c4a3-4584-893b-7087a14962d1");
//    _pagesemployment.Click__Save();
//    
//
//    TestModellerLogger.SetLastNodeGuid("c1ffde5d-ca14-42b9-b0d9-71de81c39a2c");
//    _pagesemployment.Click___1();
    

pages.Testcase1 _pagesTestcase1 = new pages.Testcase1(driver);
//    TestModellerLogger.SetLastNodeGuid("f6db1abd-1300-43e5-bfdd-c949856ac8d8");
//    _pagesTestcase1.Click__Dashboard_();
//    
//
//    TestModellerLogger.SetLastNodeGuid("605d457c-00d0-497c-a24c-99caac7e4a3c");
//    _pagesTestcase1.Click_SA100_Interest_from_Banks_building_societies();
//    
//
//    TestModellerLogger.SetLastNodeGuid("ed467455-278b-459d-b008-492af35e50df");
//    _pagesTestcase1.Click__Edit();
//    
//
//    TestModellerLogger.SetLastNodeGuid("24890008-bf18-46fa-93de-47b80a45192f");
//    _pagesTestcase1.Enter_ctl00cPHtbContainerctl00txtUntaxedUKinterest("18.0");
//    
//
//    TestModellerLogger.SetLastNodeGuid("57a894e8-31b9-4028-a11c-274937b4e6ca");
//    _pagesTestcase1.Click_Save();
//    
//
//    TestModellerLogger.SetLastNodeGuid("1256a994-068d-4021-a89d-1f36a4a38ca1");
//    _pagesTestcase1.Click__Dashboard_();
//    
//
//    TestModellerLogger.SetLastNodeGuid("314f9da1-b621-4f8e-8f7f-4482bfae6ec1");
//    _pagesTestcase1.Click_SA100_Pension_Contributions();
//    
//
//    TestModellerLogger.SetLastNodeGuid("9bdccf36-eec6-4a33-a7ea-bb05e7fa944a");
//    _pagesTestcase1.Click__Edit();
//    
//
//    TestModellerLogger.SetLastNodeGuid("ec23a68d-1f03-4e01-b475-843edc01e137");
//    _pagesTestcase1.Enter_ctl00cPHtbContainerctl00txtPensionSchemes("19014.0");
//    
//
//    TestModellerLogger.SetLastNodeGuid("9e7fcb0f-e855-40b2-bf20-a4fb7f3ea69c");
//    _pagesTestcase1.Click__Save_1();
//    
//
//    TestModellerLogger.SetLastNodeGuid("7c8e014e-fbdd-41c5-97c8-5e7e6adb3e35");
//    _pagesTestcase1.Click__Review_File_();
    

    TestModellerLogger.SetLastNodeGuid("7c986d88-b700-4ed4-8903-2708a5994db4");
    _pagesTestcase1.Click_Review_Tax_Calculation_();
    

//    TestModellerLogger.SetLastNodeGuid("0db81048-5267-4f0c-a7de-3b2ca95b1733");
//    _pagesTestcase1.Click__000();
    

    }

}
