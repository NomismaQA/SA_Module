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

//http://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/8257a05f-d3e5-477c-973c-56d48b5185bd
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 950, profileId = 100767)
public class Taxquestionnairewithoutselectingclient_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"33c8867c-bdd7-42b6-8754-568b5b9929d3","Tax questionnaire without selecting client","Tax questionnaire without selecting client - Default Profile"})
    @TestModellerPath(guid = "33c8867c-bdd7-42b6-8754-568b5b9929d3")
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
    

//pages.tax_questionnaire_without_selecting_client _pagestax_questionnaire_without_selecting_client = new pages.tax_questionnaire_without_selecting_client(driver);
//    TestModellerLogger.SetLastNodeGuid("a9f123dc-42f4-4fcf-a5ee-24b9fa887985");
//    _pagestax_questionnaire_without_selecting_client.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("cb203fc4-c171-44aa-ae71-2a8b50dc1dd3");
//    _pagestax_questionnaire_without_selecting_client.Click_Self_Assessment();
//    
//
//    TestModellerLogger.SetLastNodeGuid("2f33c304-fe4d-4f36-879a-634a38182d69");
//    _pagestax_questionnaire_without_selecting_client.Click_Dashboard();
//    
//
//    TestModellerLogger.SetLastNodeGuid("749dbbd0-87ad-41e5-8250-2c4da778af5d");
//    _pagestax_questionnaire_without_selecting_client.Click__Send_Tax_Questionnaire_();
//    
//
//    TestModellerLogger.SetLastNodeGuid("1bd5f933-ed6a-463c-b6ce-d2858c053fd1");
//    _pagestax_questionnaire_without_selecting_client.Enter_ctl00ctl00ParentContentcPHtxtName("expedita");
//    
//
//    TestModellerLogger.SetLastNodeGuid("67b5d0d8-38dd-488c-afc7-65efdb50d057");
//    _pagestax_questionnaire_without_selecting_client.Click__Update();
//    
//
//    TestModellerLogger.SetLastNodeGuid("ee7b995a-65e7-42d4-a239-eca48e049acc");
//    _pagestax_questionnaire_without_selecting_client.Click_Next_();
//    

//    TestModellerLogger.SetLastNodeGuid("1d5873ef-4f11-43b6-9fb7-93e68c216482");
//    _pagestax_questionnaire_without_selecting_client.Click__Error_Please_select_at_least_one_client_to_send_email();
    

    }

}
