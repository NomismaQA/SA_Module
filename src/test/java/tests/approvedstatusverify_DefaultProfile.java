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

//http://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/61b5e575-4de1-4448-bccc-d39c3d5b4073
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1024, profileId = 100927)
public class approvedstatusverify_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"66d2c10a-9bf7-48d4-88cb-e9539fe942ce","approvedstatusverify","approvedstatusverify - Default Profile"})
    @TestModellerPath(guid = "66d2c10a-9bf7-48d4-88cb-e9539fe942ce")
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
//pages.approvedstatusverification _pagesapprovedstatusverification = new pages.approvedstatusverification(driver);
//    TestModellerLogger.SetLastNodeGuid("da9cdd35-dee7-4c34-add6-ee5640fc3ff2");
//    _pagesapprovedstatusverification.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("65abb1b2-124a-4a59-bfe8-377633018395");
//    _pagesapprovedstatusverification.Click__Self_Assessment_();
//    
//
//    TestModellerLogger.SetLastNodeGuid("a6deae50-3550-4961-952a-96943af8f6e2");
//    _pagesapprovedstatusverification.Click_Dashboard();
//    
//
//    TestModellerLogger.SetLastNodeGuid("3705bfc4-fc28-4413-be18-434aca6b6dc4");
//    _pagesapprovedstatusverification.Select_ctl00ctl00ParentContentcPHddlTaxYear("6 April 2019 to 5 April 2020");
//    
//
//    TestModellerLogger.SetLastNodeGuid("036812d8-1371-4141-a22e-5810f90e3919");
//    _pagesapprovedstatusverification.Select_ctl00ctl00ParentContentcPHAccountantList("Deepika Arora");
//    
//
//    TestModellerLogger.SetLastNodeGuid("141fff6c-82a7-43a6-b6cc-1b596b53eb5e");
//    _pagesapprovedstatusverification.Click__Update_();
//    
//
//    TestModellerLogger.SetLastNodeGuid("092bc479-8500-4ded-8e35-089e6de4e1f7");
//    _pagesapprovedstatusverification.Click__1();
//    
//
//    TestModellerLogger.SetLastNodeGuid("33e7a9c6-29ed-4da7-874b-8939420e9fca");
//    _pagesapprovedstatusverification.Click_UTR_No();
//    

    }

}
