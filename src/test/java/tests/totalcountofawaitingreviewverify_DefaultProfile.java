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

//http://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/6302657c-48a7-4ede-8c64-761943f31d0a
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1069, profileId = 100969)
public class totalcountofawaitingreviewverify_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"2cbf03c5-2fa6-4c37-a172-8b65e9116e3f","total count of awaiting review verify","total count of awaiting review verify - Default Profile"})
    @TestModellerPath(guid = "2cbf03c5-2fa6-4c37-a172-8b65e9116e3f")
    public void GoToUrlusernamepositiveinputPositiveEnterctl00cPHpassClickLoginPositiveEnterctl00cPHFiltertxtAg()
    {
        
        pages.login_page _pageslogin_page = new pages.login_page(driver);
    TestModellerLogger.SetLastNodeGuid("e145708c-be0f-41c6-9ba5-5fc0ea05ace2");
    _pageslogin_page.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("62829672-fdd5-4a0e-b034-6c32588d9b62");
    _pageslogin_page.Enter_ctl00cPHlogin("support2");
    

    TestModellerLogger.SetLastNodeGuid("202c66e2-33fa-4363-938a-876ce5c175a2");
    _pageslogin_page.Enter_ctl00cPHpass("support2@2");
    

    TestModellerLogger.SetLastNodeGuid("6c41060d-a121-4d9b-a724-9227935a194e");
    _pageslogin_page.Click_Login();
    
//
//pages.Agentpage _pagesAgentpage = new pages.Agentpage(driver);
//    TestModellerLogger.SetLastNodeGuid("9997b1d2-129f-42d2-af0e-07df9cc61552");
//    _pagesAgentpage.Enter_ctl00cPHFiltertxtAgentName("demo agent");
//    
//
//    TestModellerLogger.SetLastNodeGuid("fa144c29-3a61-4cdb-b63c-5ff85ebcb4fe");
//    _pagesAgentpage.Click_Search();
//    
//
//    TestModellerLogger.SetLastNodeGuid("f896ef3b-136e-4806-9356-ff59cdaaf858");
//    _pagesAgentpage.Click__Demo_();
//    
//
//    TestModellerLogger.SetLastNodeGuid("5f95e59c-c587-41d9-a33b-6f3971dc9518");
//    _pagesAgentpage.Switch_Tab();
//    
//
//pages.Total_countAwaiting_review_verify _pagesTotal_countAwaiting_review_verify = new pages.Total_countAwaiting_review_verify(driver);
//    TestModellerLogger.SetLastNodeGuid("0b99a8d5-f9a4-40ed-90cf-e461bc0597ad");
//    _pagesTotal_countAwaiting_review_verify.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("c0286e08-3e06-4e51-9451-e016dc92c7a6");
//    _pagesTotal_countAwaiting_review_verify.Click__Self_Assessment_();
//    
//
//    TestModellerLogger.SetLastNodeGuid("292e3dca-b7c0-44ca-9d75-6401a9228ac3");
//    _pagesTotal_countAwaiting_review_verify.Click_Dashboard();
//    
//
//    TestModellerLogger.SetLastNodeGuid("22cae0a2-5ec3-41b4-ac2e-126d226a21ea");
//    _pagesTotal_countAwaiting_review_verify.Select_ctl00ctl00ParentContentcPHddlTaxYear("6 April 2019 to 5 April 2020");
//    
//
//    TestModellerLogger.SetLastNodeGuid("e76f4d90-fddb-4dcb-bc1f-c2c3d7bd62f0");
//    _pagesTotal_countAwaiting_review_verify.Select_ctl00ctl00ParentContentcPHAccountantList("Show All");
//    
//
//    TestModellerLogger.SetLastNodeGuid("9c1153fc-5fea-4ea7-97fd-f1076d35958d");
//    _pagesTotal_countAwaiting_review_verify.Click__Update_();
//    
//
//    TestModellerLogger.SetLastNodeGuid("450b6608-f1ea-436c-ba83-a233665c448f");
//    _pagesTotal_countAwaiting_review_verify.Click_xPath_idctl00_ctl00_ParentContent_cPH_PageUC1_rptrPager_ctl03_lnkNext();
//    
//
//    TestModellerLogger.SetLastNodeGuid("bdc9152e-af6d-45f5-8d8c-1bb1d155d759");
//    _pagesTotal_countAwaiting_review_verify.Click__1();
//    
//
//    TestModellerLogger.SetLastNodeGuid("35c26130-3dc6-4eb0-92de-aecc7125ca21");
//    _pagesTotal_countAwaiting_review_verify.Click__2();
//    

    }

}
