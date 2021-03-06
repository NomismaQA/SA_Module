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

//http://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/68282ac1-1c98-4894-a9e0-d8b3fd3e3de2
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1067, profileId = 100967)
public class TOtalcountofinprogressstatusverify_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"997ad3f5-0a8e-4928-9653-ebacb76ffb78","TOtal count of in progress status verify","TOtal count of in progress status verify - Default Profile"})
    @TestModellerPath(guid = "997ad3f5-0a8e-4928-9653-ebacb76ffb78")
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
//pages.total_countIn_progress_verify _pagestotal_countIn_progress_verify = new pages.total_countIn_progress_verify(driver);
//    TestModellerLogger.SetLastNodeGuid("540923cb-bead-48f5-b154-268e278bf136");
//    _pagestotal_countIn_progress_verify.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("cbe81675-3938-4862-8554-28c691e24310");
//    _pagestotal_countIn_progress_verify.Click__Self_Assessment_();
//    
//
//    TestModellerLogger.SetLastNodeGuid("cdbae32b-56f1-4579-aa57-53b8f22af236");
//    _pagestotal_countIn_progress_verify.Click_Dashboard();
//    
//
//    TestModellerLogger.SetLastNodeGuid("40d4e111-6fcd-4fea-8ae7-4c510e09d5f5");
//    _pagestotal_countIn_progress_verify.Select_ctl00ctl00ParentContentcPHddlTaxYear("6 April 2019 to 5 April 2020");
//    
//
//    TestModellerLogger.SetLastNodeGuid("f5f1c51a-f599-4acc-b280-3742d7fbc476");
//    _pagestotal_countIn_progress_verify.Select_ctl00ctl00ParentContentcPHAccountantList("Show All");
//    
//
//    TestModellerLogger.SetLastNodeGuid("23767bde-2848-469d-851e-577e7d514e51");
//    _pagestotal_countIn_progress_verify.Click__Update_();
//    
//
//    TestModellerLogger.SetLastNodeGuid("88dbcaf4-e215-4eb4-838d-5271f904c965");
//    _pagestotal_countIn_progress_verify.Click_xPath_idctl00_ctl00_ParentContent_cPH_PageUC1_rptrPager_ctl03_lnkNext();
//    
//
//    TestModellerLogger.SetLastNodeGuid("8ab74162-a2e2-44ce-81d6-73b930528adf");
//    _pagestotal_countIn_progress_verify.Click__1();
//    
//
//    TestModellerLogger.SetLastNodeGuid("9f29dd78-6cd1-4fc6-a923-683756c99d29");
//    _pagestotal_countIn_progress_verify.Click__2();
//    

    }

}
