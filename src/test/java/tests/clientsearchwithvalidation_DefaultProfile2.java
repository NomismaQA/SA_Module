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

//http://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/ae4e6b2b-fb26-4707-b016-fc164bad3b6b
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 945, profileId = 100837)
public class clientsearchwithvalidation_DefaultProfile2 extends TestBase
{
    

    
    @Test  (groups= {"5a7af3e8-423f-47db-b1bb-eb055de0556a","client search with validation","client search with validation - Default Profile"})
    @TestModellerPath(guid = "5a7af3e8-423f-47db-b1bb-eb055de0556a")
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

//    TestModellerLogger.SetLastNodeGuid("f896ef3b-136e-4806-9356-ff59cdaaf858");
//    _pagesAgentpage.Click__Demo_();
//    
//
//    TestModellerLogger.SetLastNodeGuid("5f95e59c-c587-41d9-a33b-6f3971dc9518");
//    _pagesAgentpage.Switch_Tab();
//    
//
//pages.client_search_with_validation _pagesclient_search_with_validation = new pages.client_search_with_validation(driver);
//  TestModellerLogger.SetLastNodeGuid("2569d8d0-5d1b-426f-b4d1-9eac7bc2552f");
//  _pagesclient_search_with_validation.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("c7ab0f57-b5ae-4c4c-8cf5-143926154542");
//    _pagesclient_search_with_validation.Click_Self_Assessment();
//    
//
//    TestModellerLogger.SetLastNodeGuid("0551dfbd-09c1-4cb9-a5bb-c3ea72502ca7");
//    _pagesclient_search_with_validation.Click_Dashboard();
//    
//
//    TestModellerLogger.SetLastNodeGuid("f267b3b0-2746-45e4-a4dc-ea449dea676a");
//    _pagesclient_search_with_validation.Enter_Client_Search("dee");
//    
//
////pages.button _pagesbutton = new pages.button(driver);
////    TestModellerLogger.SetLastNodeGuid("e27a2323-47a6-4c01-90ba-31eafb7141c3");
////    _pagesbutton.Click__();
//    
//
//    TestModellerLogger.SetLastNodeGuid("41169e2c-6b44-4aab-bc5c-22546e882ada");
//    _pagesclient_search_with_validation.Click__Error_Please_select_individual_client_name_from_the_search_list();
    

    }

}
