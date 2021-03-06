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

//http://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/02521cc3-1785-4415-8fc7-ce528a49551b
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1028, profileId = 100932)
public class filedstatusprogressbarverify_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"245470cf-e9dd-435a-9102-0647be70f06b","filedstatusprogressbarverify","filedstatusprogressbarverify - Default Profile"})
    @TestModellerPath(guid = "245470cf-e9dd-435a-9102-0647be70f06b")
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
//pages.filedstatusprogressbarverify _pagesfiledstatusprogressbarverify = new pages.filedstatusprogressbarverify(driver);
//    TestModellerLogger.SetLastNodeGuid("809350ec-0dd4-4f1d-b298-9a6e84041009");
//    _pagesfiledstatusprogressbarverify.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("04493162-ec34-4ed8-baf8-078708e8456f");
//    _pagesfiledstatusprogressbarverify.Click__Self_Assessment_();
//    
//
//    TestModellerLogger.SetLastNodeGuid("7c4ce2bd-9ec0-471d-a986-480ba0823080");
//    _pagesfiledstatusprogressbarverify.Click_Dashboard();
//    
//
//    TestModellerLogger.SetLastNodeGuid("8a02a1f9-23e4-4a94-9148-5a87aa05048f");
//    _pagesfiledstatusprogressbarverify.Select_ctl00ctl00ParentContentcPHAccountantList("Deepika Arora");
//    
//
//    TestModellerLogger.SetLastNodeGuid("fdf54538-1465-492d-9643-78bc734621b9");
//    _pagesfiledstatusprogressbarverify.Click__Update_();
//    
//
//    TestModellerLogger.SetLastNodeGuid("9ba50ef4-d706-4450-97c4-d2ae7555421f");
//    _pagesfiledstatusprogressbarverify.Click__1_();
//    
//
//    TestModellerLogger.SetLastNodeGuid("ddff4d83-f5db-4655-9bc7-ad651f133925");
//    _pagesfiledstatusprogressbarverify.Click_more_();
//    
//
//    TestModellerLogger.SetLastNodeGuid("29a05d3e-e7b4-4aab-8ca1-b468d245b2f2");
//    _pagesfiledstatusprogressbarverify.Click_Interest();
    

    }

}
