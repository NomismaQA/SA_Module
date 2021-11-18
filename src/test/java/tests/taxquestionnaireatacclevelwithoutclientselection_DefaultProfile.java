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

//http://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/c2a47f64-bdc9-40aa-9d00-f2c8df166395
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1034, profileId = 100937)
public class taxquestionnaireatacclevelwithoutclientselection_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"718abc9b-a172-42e4-ad0d-b84662a2167a","taxquestionnaireatacclevelwithoutclientselection","taxquestionnaireatacclevelwithoutclientselection - Default Profile"})
    @TestModellerPath(guid = "718abc9b-a172-42e4-ad0d-b84662a2167a")
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
    

pages.taxquesatacclevel_without_selection_of_client _pagestaxquesatacclevel_without_selection_of_client = new pages.taxquesatacclevel_without_selection_of_client(driver);
    TestModellerLogger.SetLastNodeGuid("509dd80e-a92e-459c-a766-dedf842d0fde");
    _pagestaxquesatacclevel_without_selection_of_client.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("9d231850-1aa8-48e4-b89f-d3090228523c");
    _pagestaxquesatacclevel_without_selection_of_client.Click__Self_Assessment_();
    
//
//    TestModellerLogger.SetLastNodeGuid("7d6f621e-61f3-45dc-b1ef-f267c08acf8c");
//    _pagestaxquesatacclevel_without_selection_of_client.Click_Dashboard();
//    
//
//    TestModellerLogger.SetLastNodeGuid("7f7a0297-64cf-4229-a557-0b70fb09ddd4");
//    _pagestaxquesatacclevel_without_selection_of_client.Click_xPath_htmlbodyformmaindiv3div3divdiv9div2divdiv1divtabletbodytr1td14();
//    
//
//    TestModellerLogger.SetLastNodeGuid("b0c336b6-165d-4fd6-8eed-f0305b459319");
//    _pagestaxquesatacclevel_without_selection_of_client.Click_Send_Questionnaire_();
//    
//
//    TestModellerLogger.SetLastNodeGuid("09ac444e-da44-4e5e-839e-29f462696542");
//    _pagestaxquesatacclevel_without_selection_of_client.Click_Next_();
//    

//    TestModellerLogger.SetLastNodeGuid("6a5fb97f-a006-4cfd-83f7-143718012a0d");
//    _pagestaxquesatacclevel_without_selection_of_client.Click__Error_Please_select_at_least_one_client_to_send_email();
    

    }

}
