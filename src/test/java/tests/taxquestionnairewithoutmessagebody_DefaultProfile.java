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

//http://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/a4edfe42-0a85-4e20-98e5-e113beedf557
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 952, profileId = 100769)
public class taxquestionnairewithoutmessagebody_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"422bcb98-a320-42f9-a5db-174e2873f829","tax questionnaire without message body","tax questionnaire without message body - Default Profile"})
    @TestModellerPath(guid = "422bcb98-a320-42f9-a5db-174e2873f829")
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
    _pagesAgentpage.Enter_ctl00cPHFiltertxtAgentName("Demo agent");
    

    TestModellerLogger.SetLastNodeGuid("fa144c29-3a61-4cdb-b63c-5ff85ebcb4fe");
    _pagesAgentpage.Click_Search();
    

    TestModellerLogger.SetLastNodeGuid("f896ef3b-136e-4806-9356-ff59cdaaf858");
    _pagesAgentpage.Click__Demo_();
    

    TestModellerLogger.SetLastNodeGuid("5f95e59c-c587-41d9-a33b-6f3971dc9518");
    _pagesAgentpage.Switch_Tab();
    

pages.Tax_questionnaire_without_message_body _pagesTax_questionnaire_without_message_body = new pages.Tax_questionnaire_without_message_body(driver);
    TestModellerLogger.SetLastNodeGuid("bce84986-272c-4675-b35b-4a17be84f875");
    _pagesTax_questionnaire_without_message_body.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("0f8a125a-91d5-4210-ba8c-b6dbe2bf284c");
    _pagesTax_questionnaire_without_message_body.Click_Self_Assessment();
    

    TestModellerLogger.SetLastNodeGuid("dd0e56a9-b49a-475b-a6a6-44b9aa866dd4");
    _pagesTax_questionnaire_without_message_body.Click_Dashboard();
    
//
//    TestModellerLogger.SetLastNodeGuid("47c83731-a16e-424c-ab79-deadd6693b68");
//    _pagesTax_questionnaire_without_message_body.Click__Send_Tax_Questionnaire_();
//    
//
//    TestModellerLogger.SetLastNodeGuid("260c20c4-86fe-424b-9d93-d89b93c9cc60");
//    _pagesTax_questionnaire_without_message_body.Enter_ctl00ctl00ParentContentcPHtxtName("d");
//    
//
//    TestModellerLogger.SetLastNodeGuid("5e7d7e6c-68a1-4e19-bb0c-3e1cd6027659");
//    _pagesTax_questionnaire_without_message_body.Click__Update();
//    
//
//    TestModellerLogger.SetLastNodeGuid("2fe41dd4-abc2-4490-9bde-015d61d6dee1");
//    _pagesTax_questionnaire_without_message_body.Click__Deepika_Automation_client_();
//    
//
//    TestModellerLogger.SetLastNodeGuid("6bcd9e54-b282-48fa-8f28-421da48b725d");
//    _pagesTax_questionnaire_without_message_body.Click_Next_();
//    
//
//    TestModellerLogger.SetLastNodeGuid("945e1437-21df-4bc3-90ca-a3a11ea9bf05");
//    _pagesTax_questionnaire_without_message_body.Click_xPath_htmlbody1("Submit SA Checklist documents");
//    
//
//    TestModellerLogger.SetLastNodeGuid("d5d02be3-ea73-4d22-9f88-512bdcae01ed");
//    _pagesTax_questionnaire_without_message_body.Click_Next__1();
    

//    TestModellerLogger.SetLastNodeGuid("9b97af40-2ec5-4185-b84b-f98dbf18c09a");
//    _pagesTax_questionnaire_without_message_body.Click__Error_Please_enter_message_to_send_email();
    

    }

}
