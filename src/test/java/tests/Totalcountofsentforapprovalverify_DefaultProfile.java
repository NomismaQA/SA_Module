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

//http://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/dc5a689e-fe56-40ad-b654-50f3373c42a5
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1070, profileId = 100970)
public class Totalcountofsentforapprovalverify_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"99337f8c-6aff-4ad2-ace2-c1f98b4836a7","Total count of sent for approval verify","Total count of sent for approval verify - Default Profile"})
    @TestModellerPath(guid = "99337f8c-6aff-4ad2-ace2-c1f98b4836a7")
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
//pages.Total_countSent_for_approval_verify _pagesTotal_countSent_for_approval_verify = new pages.Total_countSent_for_approval_verify(driver);
//    TestModellerLogger.SetLastNodeGuid("defb3158-ba68-4ef1-bd8c-71f24d0e0c8f");
//    _pagesTotal_countSent_for_approval_verify.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("b98d68b3-a341-46d3-8e7d-ee63a52debdc");
//    _pagesTotal_countSent_for_approval_verify.Click__Self_Assessment_();
//    
//
//    TestModellerLogger.SetLastNodeGuid("aac90754-deab-48fa-bb10-707bfbdec3e7");
//    _pagesTotal_countSent_for_approval_verify.Click_Dashboard();
//    
//
//    TestModellerLogger.SetLastNodeGuid("b048dd3e-b499-4fee-940e-2e0ff35bf1f9");
//    _pagesTotal_countSent_for_approval_verify.Select_ctl00ctl00ParentContentcPHddlTaxYear("6 April 2019 to 5 April 2020");
//    
//
//    TestModellerLogger.SetLastNodeGuid("1ce026a0-cae7-4cb4-9f01-f3d72515f7d2");
//    _pagesTotal_countSent_for_approval_verify.Select_ctl00ctl00ParentContentcPHAccountantList("Show All");
//    
//
//    TestModellerLogger.SetLastNodeGuid("0d807779-8548-453a-84e4-6101173af0bd");
//    _pagesTotal_countSent_for_approval_verify.Click__Update_();
//    
//
//    TestModellerLogger.SetLastNodeGuid("26eeffb2-e729-4b06-be1b-41ae8d48dd72");
//    _pagesTotal_countSent_for_approval_verify.Click_xPath_idctl00_ctl00_ParentContent_cPH_PageUC1_rptrPager_ctl03_lnkNext();
//    
//
//    TestModellerLogger.SetLastNodeGuid("c3816784-93ae-4e80-8d3f-5b498a1cd7a6");
//    _pagesTotal_countSent_for_approval_verify.Click__0();
//    
//
//    TestModellerLogger.SetLastNodeGuid("fd0ff3d8-bc45-44b2-b510-688df82cd027");
//    _pagesTotal_countSent_for_approval_verify.Click__1_();
//    

    }

}
