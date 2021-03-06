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

//http://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/102af8c2-af1d-469c-b41e-84ea41529f58
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1045, profileId = 100947)
public class reminderatacclevelwithoutsubject_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"b3478f98-233b-4ed9-8417-adfd430aa4bb","reminderatacclevelwithoutsubject","reminderatacclevelwithoutsubject - Default Profile"})
    @TestModellerPath(guid = "b3478f98-233b-4ed9-8417-adfd430aa4bb")
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
    

pages.Agentpage _pagesAgentpage = new pages.Agentpage(driver);
    TestModellerLogger.SetLastNodeGuid("9997b1d2-129f-42d2-af0e-07df9cc61552");
    _pagesAgentpage.Enter_ctl00cPHFiltertxtAgentName("demo agent");
    

    TestModellerLogger.SetLastNodeGuid("fa144c29-3a61-4cdb-b63c-5ff85ebcb4fe");
    _pagesAgentpage.Click_Search();
    

    TestModellerLogger.SetLastNodeGuid("f896ef3b-136e-4806-9356-ff59cdaaf858");
    _pagesAgentpage.Click__Demo_();
    

    TestModellerLogger.SetLastNodeGuid("5f95e59c-c587-41d9-a33b-6f3971dc9518");
    _pagesAgentpage.Switch_Tab();
    

pages.reminderatacclevelwithoutsubject _pagesreminderatacclevelwithoutsubject = new pages.reminderatacclevelwithoutsubject(driver);
    TestModellerLogger.SetLastNodeGuid("c409621e-f2ee-4658-84f4-260280ee1841");
    _pagesreminderatacclevelwithoutsubject.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("b7490927-c31d-47b4-abf5-881aa24aabbe");
    _pagesreminderatacclevelwithoutsubject.Click__Self_Assessment_();
    

    TestModellerLogger.SetLastNodeGuid("05d7e3be-b042-4c54-a2cf-199616ce0a2a");
    _pagesreminderatacclevelwithoutsubject.Click_Dashboard();
    

    TestModellerLogger.SetLastNodeGuid("01298741-21ba-46e6-94e5-53482f36716d");
    _pagesreminderatacclevelwithoutsubject.Click_xPath_htmlbodyformmaindiv3div3divdiv9div2divdiv1divtabletbodytr4td14();
    
//
//    TestModellerLogger.SetLastNodeGuid("aba155fe-b8cd-4032-978e-97b2e015c07c");
//    _pagesreminderatacclevelwithoutsubject.Click_Send_Reminder_();
//    
//
//    TestModellerLogger.SetLastNodeGuid("28dce1c9-4adf-44b6-974e-37f6266e8a4c");
//    _pagesreminderatacclevelwithoutsubject.Enter_ctl00ctl00ParentContentcPHtxtName("dummy");
//    
//
//    TestModellerLogger.SetLastNodeGuid("c5713a0a-aa50-4933-8cee-3c7c5caa892a");
//    _pagesreminderatacclevelwithoutsubject.Click__Update();
//    
//
//    TestModellerLogger.SetLastNodeGuid("9d48735e-8d37-4aa9-b5d0-94da030b6987");
//    _pagesreminderatacclevelwithoutsubject.Click__Dummy_1_();
    

//    TestModellerLogger.SetLastNodeGuid("a9d31344-ffbb-4236-98bc-d01ab263e788");
//    _pagesreminderatacclevelwithoutsubject.Click_Next_();
//    
//
//    TestModellerLogger.SetLastNodeGuid("c1d9bcc0-7340-469c-91b7-2be92ee55a12");
//    _pagesreminderatacclevelwithoutsubject.Enter_ctl00ctl00ParentContentcPHtxtSubject("");
//    
//
//    TestModellerLogger.SetLastNodeGuid("d6246c18-c799-4e56-9a87-9ecf73dc9125");
//    _pagesreminderatacclevelwithoutsubject.Click_Next__1();
    

//    TestModellerLogger.SetLastNodeGuid("4e08a1df-db3d-4b04-99a7-8dd4d532fa17");
//    _pagesreminderatacclevelwithoutsubject.Click__Error_Please_enter_subject_to_send_email();
    

    }

}
