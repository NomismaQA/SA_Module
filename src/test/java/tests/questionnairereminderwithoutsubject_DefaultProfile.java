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

//http://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/f1f81018-94e2-4835-b749-217c7d18e8b6
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 960, profileId = 100776)
public class questionnairereminderwithoutsubject_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"cd4b69ad-0241-47dc-8a89-34a7e743deaf","questionnaire reminder without subject","questionnaire reminder without subject - Default Profile"})
    @TestModellerPath(guid = "cd4b69ad-0241-47dc-8a89-34a7e743deaf")
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
//pages.questionnaire_reminder_without_subject _pagesquestionnaire_reminder_without_subject = new pages.questionnaire_reminder_without_subject(driver);
//    TestModellerLogger.SetLastNodeGuid("125314bf-3386-477d-bca8-eeab605f6fcb");
//    _pagesquestionnaire_reminder_without_subject.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("361858fc-44e8-404d-9ca4-274405a28f90");
//    _pagesquestionnaire_reminder_without_subject.Click_Self_Assessment();
//    
//
//    TestModellerLogger.SetLastNodeGuid("0da94e7e-8b60-459f-8d00-a24b9e828a7e");
//    _pagesquestionnaire_reminder_without_subject.Click_Dashboard();
//    
//
//    TestModellerLogger.SetLastNodeGuid("a6c85d13-c7b6-4b36-85ca-a154b8bd5cf7");
//    _pagesquestionnaire_reminder_without_subject.Click__Tax_Questionnaire_Reminder_();
//    
//
//    TestModellerLogger.SetLastNodeGuid("cc6a2db0-be28-485f-92c6-8bbbe5ee1663");
//    _pagesquestionnaire_reminder_without_subject.Enter_ctl00ctl00ParentContentcPHtxtName("deepika");
//    
//
//    TestModellerLogger.SetLastNodeGuid("eb832afb-42c2-420c-bd84-c4b924815190");
//    _pagesquestionnaire_reminder_without_subject.Click__Update();
//    
//
//    TestModellerLogger.SetLastNodeGuid("e9a282fc-d375-43e9-94cc-27a84fda1a25");
//    _pagesquestionnaire_reminder_without_subject.Click__David_Smith_();
//    
//
//    TestModellerLogger.SetLastNodeGuid("209b8900-52eb-42e5-a49c-d3ea8d33d7a4");
//    _pagesquestionnaire_reminder_without_subject.Click_Next_();
//    
//
//    TestModellerLogger.SetLastNodeGuid("2f42c84b-2677-4451-8284-7759d63e3e9f");
//    _pagesquestionnaire_reminder_without_subject.Enter_ctl00ctl00ParentContentcPHtxtSubject("");
//    
//
//    TestModellerLogger.SetLastNodeGuid("5d283a6f-897c-4e1b-813b-935da54fa007");
//    _pagesquestionnaire_reminder_without_subject.Click_Next__1();
//    
//
////    TestModellerLogger.SetLastNodeGuid("586e2f4a-a0cf-486a-9882-7c7ad9d4e659");
////    _pagesquestionnaire_reminder_without_subject.Click__Error_Please_enter_subject_to_send_email();
    

    }

}
