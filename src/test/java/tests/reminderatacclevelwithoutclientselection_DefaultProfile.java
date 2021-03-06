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

//http://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/f18e3f73-a461-4460-9d35-c7010b9ef8e9
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1041, profileId = 100944)
public class reminderatacclevelwithoutclientselection_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"0fa2d655-d72e-45ce-b5ae-d4ec7fbc792a","reminderatacclevelwithoutclientselection","reminderatacclevelwithoutclientselection - Default Profile"})
    @TestModellerPath(guid = "0fa2d655-d72e-45ce-b5ae-d4ec7fbc792a")
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
    

pages.reminderatacclevelwithoutclientselection _pagesreminderatacclevelwithoutclientselection = new pages.reminderatacclevelwithoutclientselection(driver);
    TestModellerLogger.SetLastNodeGuid("6229eb3f-6ed5-4cc4-9423-e71da7bd0f75");
    _pagesreminderatacclevelwithoutclientselection.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("dc86a5fd-f0f1-4db0-8a6c-33a18d528d29");
    _pagesreminderatacclevelwithoutclientselection.Click__Self_Assessment_();
    

    TestModellerLogger.SetLastNodeGuid("faf30442-6448-4e09-9c60-1c2dfe711c94");
    _pagesreminderatacclevelwithoutclientselection.Click_Dashboard();
    
//
//    TestModellerLogger.SetLastNodeGuid("ae64f5dd-d8b4-421b-b834-f092528ab0b4");
//    _pagesreminderatacclevelwithoutclientselection.Click_xPath_htmlbodyformmaindiv3div3divdiv9div2divdiv1divtabletbodytr4td14();
//    
//
//    TestModellerLogger.SetLastNodeGuid("a99a3663-cf1d-487b-97f7-89625b995799");
//    _pagesreminderatacclevelwithoutclientselection.Click_Send_Reminder_();
//    
//
////    TestModellerLogger.SetLastNodeGuid("fedde41a-efc7-4ab2-8fa3-a94d16d79b5c");
////    _pagesreminderatacclevelwithoutclientselection.Enter_ctl00ctl00ParentContentcPHtxtName("d");
//    
////
////    TestModellerLogger.SetLastNodeGuid("731ac33d-3204-4b1f-9b0c-588b6d5077a5");
////    _pagesreminderatacclevelwithoutclientselection.Click__Update();
////    
////
//    TestModellerLogger.SetLastNodeGuid("5ae08797-f8d9-4f5b-8f00-7162d4488e7c");
//   _pagesreminderatacclevelwithoutclientselection.Click_Next_();
//    
//
////    TestModellerLogger.SetLastNodeGuid("5fe31604-9af9-4699-8853-92c630005544");
////    _pagesreminderatacclevelwithoutclientselection.Click__Error_Please_select_at_least_one_client_to_send_email();
//    

    }

}
