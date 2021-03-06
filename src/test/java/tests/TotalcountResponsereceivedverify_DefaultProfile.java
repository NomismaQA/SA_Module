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

//http://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/a0d3b187-6b6c-47b9-bcf8-8b4449a3cedd
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1066, profileId = 100966)
public class TotalcountResponsereceivedverify_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"7c460b9c-58c9-471b-87e8-ac50aa2fd474","Total count Response received verify","Total count Response received verify - Default Profile"})
    @TestModellerPath(guid = "7c460b9c-58c9-471b-87e8-ac50aa2fd474")
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
//pages.Total_countResponse_received_verify _pagesTotal_countResponse_received_verify = new pages.Total_countResponse_received_verify(driver);
//    TestModellerLogger.SetLastNodeGuid("f1794c7d-b6be-4e52-8855-8186c113d3a4");
//    _pagesTotal_countResponse_received_verify.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("0acb1494-d855-4d42-bc7e-5464dc6ef7a0");
//    _pagesTotal_countResponse_received_verify.Click__Self_Assessment_();
//    
//
//    TestModellerLogger.SetLastNodeGuid("c6edb7a3-5699-44c0-8349-d982e21b6187");
//    _pagesTotal_countResponse_received_verify.Click_Dashboard();
//    
//
//    TestModellerLogger.SetLastNodeGuid("19702eac-c46a-4588-8d29-fa2175712af4");
//    _pagesTotal_countResponse_received_verify.Select_ctl00ctl00ParentContentcPHddlTaxYear("6 April 2019 to 5 April 2020");
//    
//
//    TestModellerLogger.SetLastNodeGuid("f778b7e2-cc97-46ed-a53c-99597ce319a9");
//    _pagesTotal_countResponse_received_verify.Select_ctl00ctl00ParentContentcPHAccountantList("Show All");
//    
//
//    TestModellerLogger.SetLastNodeGuid("509e5a40-0313-4be3-8d64-48a684448d73");
//    _pagesTotal_countResponse_received_verify.Click__Update_();
//    
//
//    TestModellerLogger.SetLastNodeGuid("49141b65-4dbb-47b2-89b4-29c4fbfd90bc");
//    _pagesTotal_countResponse_received_verify.Click_xPath_idctl00_ctl00_ParentContent_cPH_PageUC1_rptrPager_ctl03_lnkNext();
//    
//
// TestModellerLogger.SetLastNodeGuid("35261253-d159-4670-af7e-c1c360c9cd01");
//  _pagesTotal_countResponse_received_verify.Click__0();
//    
//
//    TestModellerLogger.SetLastNodeGuid("bd83667d-2542-495d-89f6-2f16dbeebe52");
//    _pagesTotal_countResponse_received_verify.Click__2();
    

    }

}
