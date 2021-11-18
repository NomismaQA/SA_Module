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

//http://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/010ef53c-b3dd-4600-b4c1-66da896f7ed0
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1059, profileId = 100961)
public class totalcountverify_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"eb680836-be69-49b0-804e-b3fd82186c31","totalcountverify","totalcountverify - Default Profile"})
    @TestModellerPath(guid = "eb680836-be69-49b0-804e-b3fd82186c31")
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
//pages.totalcountverify _pagestotalcountverify = new pages.totalcountverify(driver);
//    TestModellerLogger.SetLastNodeGuid("a6d262dd-e68f-4e11-b1f5-b504b5619ff1");
//    _pagestotalcountverify.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("b632b2ed-7a16-47d9-a248-d725435ef0b8");
//    _pagestotalcountverify.Click__Self_Assessment_();
//    
//
//    TestModellerLogger.SetLastNodeGuid("3712cb91-575b-4e40-bd1e-76501a8976b9");
//    _pagestotalcountverify.Click_Dashboard();
//    
//
//    TestModellerLogger.SetLastNodeGuid("f9c954bd-b14e-42aa-bdc0-bdddafde9ed9");
//    _pagestotalcountverify.Select_ctl00ctl00ParentContentcPHddlTaxYear("6 April 2019 to 5 April 2020");
//    
//
//    TestModellerLogger.SetLastNodeGuid("618d010f-4a58-4f46-9a6e-fb44a912591c");
//    _pagestotalcountverify.Select_ctl00ctl00ParentContentcPHAccountantList("Show All");
//    
//
//    TestModellerLogger.SetLastNodeGuid("924e86e6-7eb7-44b9-9793-498ebb66dc85");
//    _pagestotalcountverify.Click__Update_();
//    
//
//   TestModellerLogger.SetLastNodeGuid("b6c16dd6-a91a-4bd4-90e1-7741a74561b0");
//    _pagestotalcountverify.Click_xPath_idctl00_ctl00_ParentContent_cPH_PageUC1_rptrPager_ctl03_lnkNext();
//    
//
//    TestModellerLogger.SetLastNodeGuid("108fcbcf-3d8b-42ce-88bf-4d20848583d0");
//    _pagestotalcountverify.Click__88();
//    
//
//    TestModellerLogger.SetLastNodeGuid("242a025f-2d29-4d6b-b025-4c764f3ac37e");
//    _pagestotalcountverify.Click_Total();
//    

    }

}
