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

//http://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/a48c9c61-688f-485d-81df-b530cbd56731
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1063, profileId = 100964)
public class NotstartedTotalcountverify_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"9571474c-e535-48d8-b0f4-a783ed2f615e","Not started:Total count verify","Not started:Total count verify - Default Profile"})
    @TestModellerPath(guid = "9571474c-e535-48d8-b0f4-a783ed2f615e")
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
//pages.Not_startedtotal_count_verify _pagesNot_startedtotal_count_verify = new pages.Not_startedtotal_count_verify(driver);
//    TestModellerLogger.SetLastNodeGuid("13735c09-6c36-4ce1-b269-a8e3b0f47641");
//    _pagesNot_startedtotal_count_verify.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("e35199fd-a478-4626-9f5a-2b916056fe01");
//    _pagesNot_startedtotal_count_verify.Click__Self_Assessment_();
//    
//
//    TestModellerLogger.SetLastNodeGuid("2f350635-4e87-454b-a55e-a39ae4ae0152");
//    _pagesNot_startedtotal_count_verify.Click_Dashboard();
//    
//
//    TestModellerLogger.SetLastNodeGuid("dec8105d-547a-440a-9edc-c6efc9fdd1f2");
//    _pagesNot_startedtotal_count_verify.Select_ctl00ctl00ParentContentcPHddlTaxYear("6 April 2019 to 5 April 2020");
//    
//
//    TestModellerLogger.SetLastNodeGuid("d6376ac8-2cb8-49ea-8236-a2560869e78b");
//    _pagesNot_startedtotal_count_verify.Select_ctl00ctl00ParentContentcPHAccountantList("Show All");
//    
//
//    TestModellerLogger.SetLastNodeGuid("2df377a4-40c3-4d0a-8337-7430601dc67e");
//    _pagesNot_startedtotal_count_verify.Click__Update_();
//    
//
//    TestModellerLogger.SetLastNodeGuid("2c116d2e-93a7-4f9a-ba03-6044fdcb0122");
//    _pagesNot_startedtotal_count_verify.Click_xPath_idctl00_ctl00_ParentContent_cPH_PageUC1_rptrPager_ctl03_lnkNext();
//    
//
//    TestModellerLogger.SetLastNodeGuid("4190648a-f268-44fd-9648-5415f2a5e109");
//    _pagesNot_startedtotal_count_verify.Click__1();
//    
//
//    TestModellerLogger.SetLastNodeGuid("2ec26f37-5dd6-4b37-9d9e-7c83edd214a5");
//    _pagesNot_startedtotal_count_verify.Click__3();
//    

    }

}
