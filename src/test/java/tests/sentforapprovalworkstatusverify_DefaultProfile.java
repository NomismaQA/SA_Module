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

//http://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/bc42bbbf-7c1c-42ab-816d-2492fe5df108
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1020, profileId = 100920)
public class sentforapprovalworkstatusverify_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"42696021-e173-4155-af69-b454bd60247e","sentforapprovalworkstatusverify","sentforapprovalworkstatusverify - Default Profile"})
    @TestModellerPath(guid = "42696021-e173-4155-af69-b454bd60247e")
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
//pages.sentforapprovalworkstatusverify _pagessentforapprovalworkstatusverify = new pages.sentforapprovalworkstatusverify(driver);
//    TestModellerLogger.SetLastNodeGuid("8f48f15a-5832-4665-8a5a-8a80e6de220a");
//    _pagessentforapprovalworkstatusverify.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("d6ab303c-ec6d-4196-90c4-b8a5e328742d");
//    _pagessentforapprovalworkstatusverify.Click__Self_Assessment_();
//    
//
//    TestModellerLogger.SetLastNodeGuid("984d6408-e72c-44bc-a6a0-5e05495d0ca3");
//    _pagessentforapprovalworkstatusverify.Click_Dashboard();
//    
//
//    TestModellerLogger.SetLastNodeGuid("65683c8d-47f6-4acd-b097-6eca5aa5bc52");
//    _pagessentforapprovalworkstatusverify.Select_ctl00ctl00ParentContentcPHddlTaxYear("6 April 2019 to 5 April 2020");
//    
//    TestModellerLogger.SetLastNodeGuid("cc6f04e1-12a1-4463-bcde-3aa4b28acb2f");
//    _pagessentforapprovalworkstatusverify.Select_ctl00ctl00ParentContentcPHAccountantList("Deepika Arora");
//    
//
//    TestModellerLogger.SetLastNodeGuid("2d7d42d8-baea-4582-9889-01caa6a82546");
//    _pagessentforapprovalworkstatusverify.Click__Update_();
//    
//
//    TestModellerLogger.SetLastNodeGuid("5a9bf718-9008-49f8-b07e-562c3f3cf9ce");
//    _pagessentforapprovalworkstatusverify.Click__0();
//    
//
//    TestModellerLogger.SetLastNodeGuid("1a3d6087-6474-4444-b5fd-a8af72125bae");
//    _pagessentforapprovalworkstatusverify.Click_UTR_No();
    

    }

}
