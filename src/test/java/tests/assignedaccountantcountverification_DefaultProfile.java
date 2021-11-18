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

//http://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/8e6e9184-adb9-4b77-a719-8c0f4447b7db
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 968, profileId = 100860)
public class assignedaccountantcountverification_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"711d96b1-87aa-4329-907b-3abc61e9ef03","assignedaccountantcountverification","assignedaccountantcountverification - Default Profile"})
    @TestModellerPath(guid = "711d96b1-87aa-4329-907b-3abc61e9ef03")
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
//pages.assigned_accountant _pagesassigned_accountant = new pages.assigned_accountant(driver);
//    TestModellerLogger.SetLastNodeGuid("6a6f9cc8-3fdb-4a52-91bb-e3c406dd621b");
//    _pagesassigned_accountant.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("05675b46-7c5b-4192-a8cb-a67005c8f062");
//    _pagesassigned_accountant.Select_ctl00ctl00ParentContentcPHddlTaxYear("6 April 2019 to 5 April 2020");
//    
//
//    TestModellerLogger.SetLastNodeGuid("43fbbf9b-d098-419c-adcd-77d71c0b8a41");
//    _pagesassigned_accountant.Select_ctl00ctl00ParentContentcPHAccountantList("Deepika Arora");
//    
//
//    TestModellerLogger.SetLastNodeGuid("3fa1bc7f-b5f4-480a-981e-ff5ff43f3602");
//    _pagesassigned_accountant.Click__Update_();
//    
//
//    TestModellerLogger.SetLastNodeGuid("6e671aac-3a9b-4f89-936f-4edccf63cd78");
//    _pagesassigned_accountant.Click_Deepika_Arora();
//    

//    TestModellerLogger.SetLastNodeGuid("547f5eb9-fce5-4385-91f1-821d521a3625");
//    _pagesassigned_accountant.Click__2();
    

    }

}
