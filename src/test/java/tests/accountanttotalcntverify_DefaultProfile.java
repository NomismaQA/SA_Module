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

//http://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/43c5f59a-0ba6-4554-85e5-ca047b4aea4a
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 982, profileId = 100874)
public class accountanttotalcntverify_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"104c81c1-8f0e-4f05-88ef-4234c6c7bb0c","accountanttotalcntverify","accountanttotalcntverify - Default Profile"})
    @TestModellerPath(guid = "104c81c1-8f0e-4f05-88ef-4234c6c7bb0c")
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
//pages.accountanttotalcntverify _pagesaccountanttotalcntverify = new pages.accountanttotalcntverify(driver);
//    TestModellerLogger.SetLastNodeGuid("3dc01fe6-467e-4fe2-89da-c7f1faa01f67");
//    _pagesaccountanttotalcntverify.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("cce751ab-e957-407f-89c9-7fc93c90eda2");
//    _pagesaccountanttotalcntverify.Click__Self_Assessment_();
//    
//
//    TestModellerLogger.SetLastNodeGuid("bea23db3-8c9c-455a-987f-1e434426e70f");
//    _pagesaccountanttotalcntverify.Click_Dashboard();
//    
//
//    TestModellerLogger.SetLastNodeGuid("f98bfe06-689f-4337-b84c-1da5d52ddfd6");
//    _pagesaccountanttotalcntverify.Select_ctl00ctl00ParentContentcPHddlTaxYear("6 April 2019 to 5 April 2020");
//    
//
//    TestModellerLogger.SetLastNodeGuid("bb01f90a-87d7-479f-96ff-55ae38c725a3");
//    _pagesaccountanttotalcntverify.Select_ctl00ctl00ParentContentcPHAccountantList("Deepika Arora");
//  
//  TestModellerLogger.SetLastNodeGuid("9cfd859e-70c3-4cd1-8cc6-ce6f9e13d9e3");
//    _pagesaccountanttotalcntverify.Click__2();
//    
//
//    TestModellerLogger.SetLastNodeGuid("4d123da9-958b-44af-9a90-0625f901dc66");
//    _pagesaccountanttotalcntverify.Click_Deepika_Arora();
//    
//
//    TestModellerLogger.SetLastNodeGuid("37f9006f-232f-4464-a684-6f8238d27507");
//    _pagesaccountanttotalcntverify.Click_UTR_No();
//    

    }

}
