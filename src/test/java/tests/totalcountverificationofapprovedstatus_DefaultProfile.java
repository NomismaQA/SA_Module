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

//http://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/791934e6-1717-46a1-b081-fd8190a62769
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1075, profileId = 100975)
public class totalcountverificationofapprovedstatus_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"f8053253-b35d-485c-bae0-a8f8d37781d6","total count verification of approved status","total count verification of approved status - Default Profile"})
    @TestModellerPath(guid = "f8053253-b35d-485c-bae0-a8f8d37781d6")
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
//pages.total_count_approved_status_verify _pagestotal_count_approved_status_verify = new pages.total_count_approved_status_verify(driver);
//    TestModellerLogger.SetLastNodeGuid("b1fa6a90-91b3-4581-ad40-9bd8f008972f");
//    _pagestotal_count_approved_status_verify.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("80f1d867-4ad6-4064-9bae-a67f645c66f4");
//    _pagestotal_count_approved_status_verify.Click__Self_Assessment_();
//    
//
//    TestModellerLogger.SetLastNodeGuid("a8013465-0481-4e65-b437-af918ee62a1e");
//    _pagestotal_count_approved_status_verify.Click_Dashboard();
//    
//
//    TestModellerLogger.SetLastNodeGuid("c075bac0-5e1d-4f93-8222-7f9930ffafef");
//    _pagestotal_count_approved_status_verify.Select_ctl00ctl00ParentContentcPHddlTaxYear("6 April 2019 to 5 April 2020");
//    
//
//    TestModellerLogger.SetLastNodeGuid("e357b0dc-0050-4b83-8c6e-0cf94c5611bc");
//    _pagestotal_count_approved_status_verify.Select_ctl00ctl00ParentContentcPHAccountantList("Show All");
//    
//
//    TestModellerLogger.SetLastNodeGuid("d7687b1e-8d4b-46df-8c2d-4b27cae1a5d2");
//    _pagestotal_count_approved_status_verify.Click__Update_();
//    
//
//    TestModellerLogger.SetLastNodeGuid("af1c0d31-dc3e-40c0-a468-d634cbc4544c");
//    _pagestotal_count_approved_status_verify.Click_xPath_idctl00_ctl00_ParentContent_cPH_PageUC1_rptrPager_ctl03_lnkNext();
//    
//
//    TestModellerLogger.SetLastNodeGuid("36b486c5-0e53-4685-9cd8-5b66cd48d292");
//    _pagestotal_count_approved_status_verify.Click__7();
//    
//
//    TestModellerLogger.SetLastNodeGuid("bea9f5ce-d78d-49f5-a70d-bfe7c8009a48");
//    _pagestotal_count_approved_status_verify.Click__23();
//    

    }

}
