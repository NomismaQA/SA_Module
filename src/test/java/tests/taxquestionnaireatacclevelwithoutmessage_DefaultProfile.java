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

//http://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/e8599e40-85d1-4b91-b419-dd50cd2a244b
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1035, profileId = 100938)
public class taxquestionnaireatacclevelwithoutmessage_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"0c042922-e5f1-40eb-acbc-998e7c950169","taxquestionnaireatacclevelwithoutmessage","taxquestionnaireatacclevelwithoutmessage - Default Profile"})
    @TestModellerPath(guid = "0c042922-e5f1-40eb-acbc-998e7c950169")
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
    

pages.taxquestionnaireatacclevelwithout_messagebody_of_email _pagestaxquestionnaireatacclevelwithout_messagebody_of_email = new pages.taxquestionnaireatacclevelwithout_messagebody_of_email(driver);
    TestModellerLogger.SetLastNodeGuid("07ab31ab-6770-4ecc-8f9a-927740351498");
    _pagestaxquestionnaireatacclevelwithout_messagebody_of_email.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("3f59db69-2552-4f75-a3af-20a8a969fdeb");
    _pagestaxquestionnaireatacclevelwithout_messagebody_of_email.Click__Self_Assessment_();
    
//
//    TestModellerLogger.SetLastNodeGuid("56cedd6d-d4c5-4e86-b26c-35bf0bec440e");
//    _pagestaxquestionnaireatacclevelwithout_messagebody_of_email.Click_Dashboard();
//    
//
//    TestModellerLogger.SetLastNodeGuid("23cacb9e-d183-4e29-84d0-f901653d74af");
//    _pagestaxquestionnaireatacclevelwithout_messagebody_of_email.Click_xPath_htmlbodyformmaindiv3div3divdiv9div2divdiv1divtabletbodytr1td14();
//    
//
//    TestModellerLogger.SetLastNodeGuid("cfc81d9a-f811-415e-8e66-a386eaf211db");
//    _pagestaxquestionnaireatacclevelwithout_messagebody_of_email.Click_Send_Questionnaire_();
//    
//
//    TestModellerLogger.SetLastNodeGuid("b21e31da-ffa1-42e1-a40e-3365fe774648");
//    _pagestaxquestionnaireatacclevelwithout_messagebody_of_email.Click__Deepika_Automation_client_();
//    
//
//    TestModellerLogger.SetLastNodeGuid("19ae8e76-2e16-4e46-9c7e-a64478812ab7");
//    _pagestaxquestionnaireatacclevelwithout_messagebody_of_email.Click_Next_();
//    
//
//    TestModellerLogger.SetLastNodeGuid("f866dfe1-7cbb-42b3-9c71-6a66b5e9cd02");
//    _pagestaxquestionnaireatacclevelwithout_messagebody_of_email.Click_Dear_CLIENTNAME_SelfAssessment_Tax_Return_Year_ended_TAXYEAR_();
    

//    TestModellerLogger.SetLastNodeGuid("05aaff63-7d6a-4268-80bc-06c34b1ad2df");
//    _pagestaxquestionnaireatacclevelwithout_messagebody_of_email.Click_Next__1();
    

    }

}
