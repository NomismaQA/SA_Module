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

//http://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/ab05aab9-66c0-4e4f-8fca-3521e02f3e21
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1003, profileId = 100902)
public class awaitingrevieworkstatusverification_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"4cd9561b-2403-4de5-a441-76f7eccf964c","awaitingrevieworkstatusverification","awaitingrevieworkstatusverification - Default Profile"})
    @TestModellerPath(guid = "4cd9561b-2403-4de5-a441-76f7eccf964c")
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
//pages.awaitingreviewworkstatusverification _pagesawaitingreviewworkstatusverification = new pages.awaitingreviewworkstatusverification(driver);
//    TestModellerLogger.SetLastNodeGuid("f6264c87-3591-4c99-9974-22d195593f88");
//    _pagesawaitingreviewworkstatusverification.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("8ab8e32e-da4e-497b-a05d-d69ece63b8d6");
//    _pagesawaitingreviewworkstatusverification.Click__Self_Assessment_();
//    
//
//    TestModellerLogger.SetLastNodeGuid("23d48f19-1a0d-4718-bdac-4eedf240437c");
//    _pagesawaitingreviewworkstatusverification.Click_Dashboard();
//    
//
//    TestModellerLogger.SetLastNodeGuid("f72dd7de-820e-413c-88a7-de84da165d12");
//    _pagesawaitingreviewworkstatusverification.Select_ctl00ctl00ParentContentcPHddlTaxYear("6 April 2019 to 5 April 2020");
//    
//
//    TestModellerLogger.SetLastNodeGuid("c49ad122-13ee-4368-bc9c-024863f238f1");
//    _pagesawaitingreviewworkstatusverification.Select_ctl00ctl00ParentContentcPHAccountantList("Deepika Arora");
//    
//
//    TestModellerLogger.SetLastNodeGuid("9265b9bc-35cf-44c3-a49a-4362a7984d89");
//    _pagesawaitingreviewworkstatusverification.Click__Update_();
//    
//
//    TestModellerLogger.SetLastNodeGuid("dbdca8a5-6abe-4d00-81d9-ab564dbdf1db");
//    _pagesawaitingreviewworkstatusverification.Click__0();
//    
//
//    TestModellerLogger.SetLastNodeGuid("ed605e99-1886-458e-afd0-32ddc893c39e");
//    _pagesawaitingreviewworkstatusverification.Click_UTR_No();
    

    }

}
