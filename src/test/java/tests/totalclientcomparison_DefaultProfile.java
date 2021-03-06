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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/2a718f11-d312-4382-ae92-f26ee9ec1cd0
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1155, profileId = 101050)
public class totalclientcomparison_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"733768e3-5115-4910-9fbe-796409633f3a","totalclientcomparison","totalclientcomparison - Default Profile"})
    @TestModellerPath(guid = "733768e3-5115-4910-9fbe-796409633f3a")
    public void GoToUrlusernamepositiveinputPositiveEnterctl00cPHpassClickLoginPositiveEnterctl00cPHFiltertxtAg()
    {
        
        pages.login_page _pageslogin_page = new pages.login_page(driver);
    TestModellerLogger.SetLastNodeGuid("e145708c-be0f-41c6-9ba5-5fc0ea05ace2");
    _pageslogin_page.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("62829672-fdd5-4a0e-b034-6c32588d9b62");
    _pageslogin_page.Enter_ctl00cPHlogin("support2");
    

    TestModellerLogger.SetLastNodeGuid("202c66e2-33fa-4363-938a-876ce5c175a2");
    _pageslogin_page.Enter_ctl00cPHpass("live@admin");
    

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
//pages.totalclientcomparisonin_progressbar _pagestotalclientcomparisonin_progressbar = new pages.totalclientcomparisonin_progressbar(driver);
//    TestModellerLogger.SetLastNodeGuid("3fe3af91-bbe2-48cc-ba6b-663ee2245010");
//    _pagestotalclientcomparisonin_progressbar.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("76171e5a-faf4-4099-98bc-1c611455ea2f");
//    _pagestotalclientcomparisonin_progressbar.Click__Self_Assessment_();
//    
//
//    TestModellerLogger.SetLastNodeGuid("ad8e8963-d427-4229-a112-12e24ee452e6");
//    _pagestotalclientcomparisonin_progressbar.Click_Dashboard();
//    
//
//    TestModellerLogger.SetLastNodeGuid("049d629d-3e26-41e1-ba14-a56cd46991d5");
//    _pagestotalclientcomparisonin_progressbar.Select_ctl00ctl00ParentContentcPHAccountantList("Show All");
//    
//
//    TestModellerLogger.SetLastNodeGuid("6e71a74e-929f-4980-84d2-f479ebb31e11");
//    _pagestotalclientcomparisonin_progressbar.Click__Update_();
//    
//
//    TestModellerLogger.SetLastNodeGuid("9b7cbe61-5369-471e-bca1-c4dfe1defa8b");
//    _pagestotalclientcomparisonin_progressbar.Click__73_();
//    
//
//    TestModellerLogger.SetLastNodeGuid("8966ba66-f463-4fcd-9a47-56f21cd493fb");
//    _pagestotalclientcomparisonin_progressbar.Select_ctl00ctl00ParentContentcPHddlTaxYear("6 April 2018 to 5 April 2019");
//    
//
//    TestModellerLogger.SetLastNodeGuid("e986acb8-3319-4506-82d3-fd4e13acab2e");
//    _pagestotalclientcomparisonin_progressbar.Click__Update_();
//    
//
//    TestModellerLogger.SetLastNodeGuid("f9974efd-1913-492d-ae40-9904ed0d8d9b");
//    _pagestotalclientcomparisonin_progressbar.Click__Elem1();
//    

    }

}
