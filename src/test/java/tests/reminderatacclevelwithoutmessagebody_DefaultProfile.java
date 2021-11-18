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

//http://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/4ff5d9f8-d6a4-44b5-8fad-88efa61501a8
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1044, profileId = 100946)
public class reminderatacclevelwithoutmessagebody_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"a586ebc0-f631-4a82-b932-a75d4bca9abe","reminderatacclevelwithoutmessagebody","reminderatacclevelwithoutmessagebody - Default Profile"})
    @TestModellerPath(guid = "a586ebc0-f631-4a82-b932-a75d4bca9abe")
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
    

pages.reminderatacclevelwithoutmessagebody _pagesreminderatacclevelwithoutmessagebody = new pages.reminderatacclevelwithoutmessagebody(driver);
    TestModellerLogger.SetLastNodeGuid("2cc0ec5f-bbca-49a2-b10d-3aaac8443c83");
    _pagesreminderatacclevelwithoutmessagebody.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("52c390bc-5022-4a25-85bd-ce654d46fe42");
    _pagesreminderatacclevelwithoutmessagebody.Click__Self_Assessment_();
    

    TestModellerLogger.SetLastNodeGuid("596243fb-a8c6-4290-b60b-6da9a8b10c4e");
    _pagesreminderatacclevelwithoutmessagebody.Click_Dashboard();
    

    TestModellerLogger.SetLastNodeGuid("a5605eb7-cb9b-4fc6-b2b2-dc114df74fca");
    _pagesreminderatacclevelwithoutmessagebody.Click_xPath_htmlbodyformmaindiv3div3divdiv9div2divdiv1divtabletbodytr4td14();
    

    TestModellerLogger.SetLastNodeGuid("b442eb3d-fd7f-43d8-b9fe-054be04894bd");
    _pagesreminderatacclevelwithoutmessagebody.Click_Send_Reminder_();
    

    TestModellerLogger.SetLastNodeGuid("614bafa7-20b8-4976-b180-967334000863");
    _pagesreminderatacclevelwithoutmessagebody.Enter_ctl00ctl00ParentContentcPHtxtName("dummy");
    

    TestModellerLogger.SetLastNodeGuid("7ac11810-5eda-485b-9222-de71b855b186");
    _pagesreminderatacclevelwithoutmessagebody.Click__Update();
    

    TestModellerLogger.SetLastNodeGuid("a4167756-48df-4719-868b-527278b99d4a");
    _pagesreminderatacclevelwithoutmessagebody.Click__Dummy_1_();
    
//
//    TestModellerLogger.SetLastNodeGuid("dc8418a9-ecc8-4f53-a529-b5b1c1dee8e1");
//    _pagesreminderatacclevelwithoutmessagebody.Click_Next_();
//    
//
//    TestModellerLogger.SetLastNodeGuid("1c3138ce-1c26-4805-82b7-07c47c7b16ac");
//    _pagesreminderatacclevelwithoutmessagebody.Click_Next__1();
//    

//    TestModellerLogger.SetLastNodeGuid("23f90c84-a02b-4da0-8bc2-298bbd3f6afd");
//    _pagesreminderatacclevelwithoutmessagebody.Click__Error_Please_enter_message_to_send_email();
    

    }

}
