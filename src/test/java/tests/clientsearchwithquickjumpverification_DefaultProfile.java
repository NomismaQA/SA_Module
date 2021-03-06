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

//http://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/08de81b2-188c-4e68-b289-b1813029faf9
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 948, profileId = 100846)
public class clientsearchwithquickjumpverification_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"177f9258-4f52-420a-a879-46a1f0d7b258","client_search with quick jump verification","client_search with quick jump verification - Default Profile"})
    @TestModellerPath(guid = "177f9258-4f52-420a-a879-46a1f0d7b258")
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
//pages.client_search_with_quick_jump_verification _pagesclient_search_with_quick_jump_verification = new pages.client_search_with_quick_jump_verification(driver);
//    TestModellerLogger.SetLastNodeGuid("5a878f44-5c17-4cd1-8c3f-95cdb2280d60");
//    _pagesclient_search_with_quick_jump_verification.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("21f463d0-70ba-4df6-acde-a80f45c1aa66");
//    _pagesclient_search_with_quick_jump_verification.Click_Self_Assessment();
//    
//
//    TestModellerLogger.SetLastNodeGuid("10bd7130-3e3f-438f-9fac-813b3832c5f7");
//    _pagesclient_search_with_quick_jump_verification.Click_Dashboard();
//    
//
//    TestModellerLogger.SetLastNodeGuid("4feee4fd-d01c-4dce-abbc-3c294f6ba4b8");
//    _pagesclient_search_with_quick_jump_verification.Enter_Client_Search("dee");
//  
//
//    TestModellerLogger.SetLastNodeGuid("bf93ddad-741b-47d1-b5f9-d1fadd2456dd");
//    _pagesclient_search_with_quick_jump_verification.Click_Deepika_Arya();
//    

    }

}
