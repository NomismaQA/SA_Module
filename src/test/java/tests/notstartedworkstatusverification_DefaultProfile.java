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

//http://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/9105cb8d-ebbc-44f3-88a8-f726c2ec2aca
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1001, profileId = 100900)
public class notstartedworkstatusverification_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"7f39ee0c-4983-4a86-b3b3-0f6726ffc9ed","notstartedworkstatusverification","notstartedworkstatusverification - Default Profile"})
    @TestModellerPath(guid = "7f39ee0c-4983-4a86-b3b3-0f6726ffc9ed")
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
//pages.notstartedworkstatusverification _pagesnotstartedworkstatusverification = new pages.notstartedworkstatusverification(driver);
//    TestModellerLogger.SetLastNodeGuid("9bbe472f-a27b-432a-b2de-69acdd439087");
//    _pagesnotstartedworkstatusverification.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("9c6ffc58-c376-4219-87c4-265bdda19717");
//    _pagesnotstartedworkstatusverification.Click__Self_Assessment_();
//    
//
//    TestModellerLogger.SetLastNodeGuid("aba998fd-a43e-4ac8-b5be-8eab6fce9fa0");
//    _pagesnotstartedworkstatusverification.Click_Dashboard();
//    
//
//    TestModellerLogger.SetLastNodeGuid("b25f1cfa-8589-48cf-a695-1f4fa6a630ca");
//    _pagesnotstartedworkstatusverification.Select_ctl00ctl00ParentContentcPHddlTaxYear("6 April 2019 to 5 April 2020");
//    
//
//    TestModellerLogger.SetLastNodeGuid("0151ef19-562a-4ea1-b301-fe33d6b77847");
//    _pagesnotstartedworkstatusverification.Select_ctl00ctl00ParentContentcPHAccountantList("Deepika Arora");
//    
//
//    TestModellerLogger.SetLastNodeGuid("4d23a812-eaec-4f7f-96ed-84d876449f68");
//    _pagesnotstartedworkstatusverification.Click__Update_();
//    
//
//    TestModellerLogger.SetLastNodeGuid("173d2a62-4dbe-4c2d-988c-a96a1262100a");
//    _pagesnotstartedworkstatusverification.Click__0();
//    
//
//    TestModellerLogger.SetLastNodeGuid("e72fb25e-dca5-41b1-be0e-5a99acc9a1b9");
//    _pagesnotstartedworkstatusverification.Click_UTR_No();
//    

    }

}
