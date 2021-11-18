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

//http://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/4f3f5643-490d-4c93-99af-efcfcca7ea19
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 990, profileId = 100884)
public class accountanttotalverify_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"6e85f12c-158a-4997-b64c-5333ca984e59","accountanttotalverify","accountanttotalverify - Default Profile"})
    @TestModellerPath(guid = "6e85f12c-158a-4997-b64c-5333ca984e59")
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
//pages.Accountanttotalverify _pagesAccountanttotalverify = new pages.Accountanttotalverify(driver);
//    TestModellerLogger.SetLastNodeGuid("69cabee8-f849-4282-9bfb-48b2bec6ad74");
//    _pagesAccountanttotalverify.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("a45557c5-ba0a-46c4-86b4-b4c0f1128e43");
//    _pagesAccountanttotalverify.Click__Self_Assessment_();
//    
//
//    TestModellerLogger.SetLastNodeGuid("87f16440-b70f-420a-be09-4846ba6a00ad");
//    _pagesAccountanttotalverify.Click_Dashboard();
//    
//
//    TestModellerLogger.SetLastNodeGuid("07be789f-781d-4904-bbdc-1d57b9b89ae5");
//    _pagesAccountanttotalverify.Select_ctl00ctl00ParentContentcPHddlTaxYear("6 April 2019 to 5 April 2020");
//    
//
//    TestModellerLogger.SetLastNodeGuid("9e5676dc-6004-4cf7-a854-b6f993c59e44");
//    _pagesAccountanttotalverify.Select_ctl00ctl00ParentContentcPHAccountantList("Deepika Arora");
//    
//
//    TestModellerLogger.SetLastNodeGuid("dfe210c7-f67e-41d5-aede-b249749e52bb");
//    _pagesAccountanttotalverify.Click__Update_();
//    
//
//  TestModellerLogger.SetLastNodeGuid("c06c2ace-58f2-44e9-8782-8a0b6c9107b4");
// _pagesAccountanttotalverify.Click__2();
//    
//
//    TestModellerLogger.SetLastNodeGuid("aaa20740-957f-4c9b-97ee-d3e0fb617512");
//    _pagesAccountanttotalverify.Click_Deepika_Arora();
//    
//
//    TestModellerLogger.SetLastNodeGuid("a668d571-afdf-486e-96ec-3c7974e88269");
//    _pagesAccountanttotalverify.Click_UTR_No();
    

    }

}
