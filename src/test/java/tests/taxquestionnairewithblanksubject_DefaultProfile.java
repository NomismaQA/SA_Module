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

//http://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/6d2d91e5-c5a0-43ed-a0f8-43a28930926e
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 954, profileId = 100779)
public class taxquestionnairewithblanksubject_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"01e78e77-1060-4dc5-bead-96bb18003e35","tax questionnaire with blank subject","tax questionnaire with blank subject - Default Profile"})
    @TestModellerPath(guid = "01e78e77-1060-4dc5-bead-96bb18003e35")
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
    

pages.tax_questionnaire_with_subject_blank _pagestax_questionnaire_with_subject_blank = new pages.tax_questionnaire_with_subject_blank(driver);
    TestModellerLogger.SetLastNodeGuid("123ef743-cc9e-46b2-bca2-2712eced81d6");
    _pagestax_questionnaire_with_subject_blank.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("e7244b6f-1626-4ef9-86a5-1072f9ce7f23");
    _pagestax_questionnaire_with_subject_blank.Click_Self_Assessment();
    

    TestModellerLogger.SetLastNodeGuid("ac24b90b-8918-4608-8aab-872ae7c69240");
    _pagestax_questionnaire_with_subject_blank.Click_Dashboard();
    

    TestModellerLogger.SetLastNodeGuid("3a2f0905-cad4-482b-80fa-03455230dd32");
    _pagestax_questionnaire_with_subject_blank.Click__Send_Tax_Questionnaire_();
//    
//
//    TestModellerLogger.SetLastNodeGuid("9cb0c9ba-982f-4c01-a59f-9eea22d5e075");
//    _pagestax_questionnaire_with_subject_blank.Enter_ctl00ctl00ParentContentcPHtxtName("d");
//    
//
//    TestModellerLogger.SetLastNodeGuid("b911ccb9-3e72-42bb-bc8e-1be75289a5a9");
//    _pagestax_questionnaire_with_subject_blank.Click__Update();
//    
//
//    TestModellerLogger.SetLastNodeGuid("8ba21e37-9ebc-4a58-b541-65f681254569");
//    _pagestax_questionnaire_with_subject_blank.Click__Deepika_Automation_client_();
//    
//
//    TestModellerLogger.SetLastNodeGuid("12c264a0-8f1e-4155-b89b-2fe637a58779");
//    _pagestax_questionnaire_with_subject_blank.Click_Next_();
//    
//
//    TestModellerLogger.SetLastNodeGuid("fab9d59c-06c3-4282-8773-d3beff5716f5");
//    _pagestax_questionnaire_with_subject_blank.Enter_ctl00ctl00ParentContentcPHtxtSubject("");
//    
//
//    TestModellerLogger.SetLastNodeGuid("f4ee0a7f-e4eb-4827-ab72-6f27d317fc56");
//    _pagestax_questionnaire_with_subject_blank.Click_Next__1();
//    

//    TestModellerLogger.SetLastNodeGuid("e2bd4d17-4020-459f-9467-a9bfef953747");
//    _pagestax_questionnaire_with_subject_blank.Click__Error_Please_enter_subject_to_send_email();
    

    }

}
