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

//http://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/a797fe98-f338-4303-8f7a-3c0f16f3e1d6
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1016, profileId = 100916)
public class responsereceivedverify_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"1df5f16b-8b96-426c-881d-66f4c349607b","responsereceivedverify","responsereceivedverify - Default Profile"})
    @TestModellerPath(guid = "1df5f16b-8b96-426c-881d-66f4c349607b")
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
//pages.responsereceviedstatusverification _pagesresponsereceviedstatusverification = new pages.responsereceviedstatusverification(driver);
//    TestModellerLogger.SetLastNodeGuid("e0f53258-83d3-4dda-807b-f98c5bb75090");
//    _pagesresponsereceviedstatusverification.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("6ce3bf14-82f4-4211-afa0-6df01aa6a6b0");
//    _pagesresponsereceviedstatusverification.Click__Self_Assessment_();
//    
//
//    TestModellerLogger.SetLastNodeGuid("4b684234-df98-4fb6-b90c-9b9eb36f1f08");
//    _pagesresponsereceviedstatusverification.Click_Dashboard();
//    
//
//    TestModellerLogger.SetLastNodeGuid("d8665bf2-7d03-4c14-a007-f0d202370e07");
//    _pagesresponsereceviedstatusverification.Select_ctl00ctl00ParentContentcPHddlTaxYear("6 April 2019 to 5 April 2020");
//    
//
//    TestModellerLogger.SetLastNodeGuid("cc6f04e1-12a1-4463-bcde-3aa4b28acb2f");
//    _pagesresponsereceviedstatusverification.Select_ctl00ctl00ParentContentcPHAccountantList("Deepika Arora");
//    
//
//    TestModellerLogger.SetLastNodeGuid("f6fe46be-fae6-4521-9063-02c3a1f5d8c3");
//    _pagesresponsereceviedstatusverification.Click__Update_();
//    
//
//    TestModellerLogger.SetLastNodeGuid("8636e1ec-67a7-4084-a1c5-abc7ace230bf");
//    _pagesresponsereceviedstatusverification.Click__1();
//    
//
//    TestModellerLogger.SetLastNodeGuid("491f22dc-8c16-4700-83c5-6ab757d847b9");
//    _pagesresponsereceviedstatusverification.Click_UTR_No();
//    

    }

}
