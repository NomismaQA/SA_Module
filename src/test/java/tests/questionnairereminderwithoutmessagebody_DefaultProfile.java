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

//http://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/dcf6c9ae-785e-47b6-b287-7cdf5b7c06ad
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 962, profileId = 100777)
public class questionnairereminderwithoutmessagebody_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"98709821-a9bb-4a61-871a-cd3f5fab3fdf","questionnaire reminder without message body","questionnaire reminder without message body - Default Profile"})
    @TestModellerPath(guid = "98709821-a9bb-4a61-871a-cd3f5fab3fdf")
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
//pages.questionnaire_reminder_without_message_body _pagesquestionnaire_reminder_without_message_body = new pages.questionnaire_reminder_without_message_body(driver);
//    TestModellerLogger.SetLastNodeGuid("8ddc2e15-cb64-435c-94ec-a7bd1762a30d");
//    _pagesquestionnaire_reminder_without_message_body.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("b9c96679-7d21-4ad6-a72a-e793b5b50fd9");
//    _pagesquestionnaire_reminder_without_message_body.Click_Self_Assessment();
//    
//
//    TestModellerLogger.SetLastNodeGuid("48cf666c-d29b-4df6-945b-45a1caca33d6");
//    _pagesquestionnaire_reminder_without_message_body.Click_Dashboard();
//    
//
//    TestModellerLogger.SetLastNodeGuid("6c1023a2-b587-4b4b-94c8-5506b26d41da");
//    _pagesquestionnaire_reminder_without_message_body.Click__Tax_Questionnaire_Reminder_();
//    
//
//    TestModellerLogger.SetLastNodeGuid("73a6063e-0b69-4beb-b309-fec27f827674");
//    _pagesquestionnaire_reminder_without_message_body.Enter_ctl00ctl00ParentContentcPHtxtName("deepika");
//    
//
//    TestModellerLogger.SetLastNodeGuid("f9448b54-05e2-467f-bf76-80391f5c60a2");
//    _pagesquestionnaire_reminder_without_message_body.Click__Update();
//    
//
//    TestModellerLogger.SetLastNodeGuid("56785f08-3f11-4c71-bb64-f6e72b6a8cb3");
//    _pagesquestionnaire_reminder_without_message_body.Click__David_Smith_();
//    
//
//    TestModellerLogger.SetLastNodeGuid("79c67554-4c0e-435e-b0dd-a57373caa63f");
//    _pagesquestionnaire_reminder_without_message_body.Click_Next_();
//    
//
//    TestModellerLogger.SetLastNodeGuid("37b53cca-9af6-4223-81ce-5e1c882f8801");
//    _pagesquestionnaire_reminder_without_message_body.Click__();
//    
//
//    TestModellerLogger.SetLastNodeGuid("6962fabc-847b-4cd8-9d95-ebf21a8bab7a");
//    _pagesquestionnaire_reminder_without_message_body.Click_Next__1();
    

//    TestModellerLogger.SetLastNodeGuid("da33a889-b7ef-4c42-9bf4-bed08692b7f9");
//    _pagesquestionnaire_reminder_without_message_body.Click__Error_Please_enter_message_to_send_email();
   

    }

}
