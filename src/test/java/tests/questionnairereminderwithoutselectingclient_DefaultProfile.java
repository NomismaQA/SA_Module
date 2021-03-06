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

//http://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/2a41a96d-7eb9-42f4-a825-b2fff5edb275
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 956, profileId = 100781)
public class questionnairereminderwithoutselectingclient_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"2e428766-f48a-445e-b717-f6fbd47ace97","questionnaire reminder without selecting client","questionnaire reminder without selecting client - Default Profile"})
    @TestModellerPath(guid = "2e428766-f48a-445e-b717-f6fbd47ace97")
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
//pages.questionnaire_reminder_without_selecting_client _pagesquestionnaire_reminder_without_selecting_client = new pages.questionnaire_reminder_without_selecting_client(driver);
//    TestModellerLogger.SetLastNodeGuid("3dc61b08-dc8a-4beb-89d1-b92abcbb9437");
//    _pagesquestionnaire_reminder_without_selecting_client.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("02a1e730-b791-4378-91fa-b7a5c2b751cf");
//    _pagesquestionnaire_reminder_without_selecting_client.Click_Self_Assessment();
//    
//
//    TestModellerLogger.SetLastNodeGuid("88bc61a9-91bf-4dac-ab92-292241ae040e");
//    _pagesquestionnaire_reminder_without_selecting_client.Click_Dashboard();
//    
//
//    TestModellerLogger.SetLastNodeGuid("02543c99-3158-45c9-8857-3a4d7bb032f1");
//    _pagesquestionnaire_reminder_without_selecting_client.Click__Tax_Questionnaire_Reminder_();
//    
//
//    TestModellerLogger.SetLastNodeGuid("02e22fed-60ab-42ab-bfe6-06caaca3c139");
//    _pagesquestionnaire_reminder_without_selecting_client.Enter_ctl00ctl00ParentContentcPHtxtName("deepika");
//    
//
//    TestModellerLogger.SetLastNodeGuid("f5d2c896-5df5-4e01-b9f8-b838d9a3cb67");
//    _pagesquestionnaire_reminder_without_selecting_client.Click__Update();
//    
//
//    TestModellerLogger.SetLastNodeGuid("1060306f-8ca1-4d7e-985b-d5e93eeceb21");
//    _pagesquestionnaire_reminder_without_selecting_client.Click_Next_();
//    
//
////    TestModellerLogger.SetLastNodeGuid("07d7fd2c-3515-455b-afcf-435aa828bc57");
////    _pagesquestionnaire_reminder_without_selecting_client.Click__Error_Please_select_at_least_one_client_to_send_email();
//    
//
  }
//
}
    
