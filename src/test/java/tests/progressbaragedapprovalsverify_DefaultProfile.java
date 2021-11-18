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

//http://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/bf746f0b-92eb-4c6b-b11a-562ba2420e53
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1049, profileId = 100950)
public class progressbaragedapprovalsverify_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"ead068a9-8972-48e4-8a29-650eef8c9f6b","progressbaragedapprovalsverify","progressbaragedapprovalsverify - Default Profile"})
    @TestModellerPath(guid = "ead068a9-8972-48e4-8a29-650eef8c9f6b")
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
//pages.agedapprovalsverify _pagesagedapprovalsverify = new pages.agedapprovalsverify(driver);
//    TestModellerLogger.SetLastNodeGuid("1fca400f-85b6-483a-a97e-5460ff068237");
//    _pagesagedapprovalsverify.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("d7cc1668-5369-450c-ba4e-29f309f94145");
//    _pagesagedapprovalsverify.Click__Self_Assessment_();
//    
//
//    TestModellerLogger.SetLastNodeGuid("fa30717a-91d8-4184-8cde-5fd578bb6116");
//    _pagesagedapprovalsverify.Click_Dashboard();
//    
//
//    TestModellerLogger.SetLastNodeGuid("0ac63075-cbe3-4210-98a0-b890def6ec4c");
//    _pagesagedapprovalsverify.Select_ctl00ctl00ParentContentcPHddlTaxYear("6 April 2019 to 5 April 2020");
//    
//
//    TestModellerLogger.SetLastNodeGuid("26383a57-0f47-41e2-bc51-03aa0900585a");
//    _pagesagedapprovalsverify.Select_ctl00ctl00ParentContentcPHAccountantList("Deepika Arora");
//    
//
//    TestModellerLogger.SetLastNodeGuid("93805bce-bee6-449c-a794-01551dd073ce");
//    _pagesagedapprovalsverify.Click__Update_();
//    
//
//    TestModellerLogger.SetLastNodeGuid("f3e5a55e-7e25-4c48-b1e8-46f92033f0ee");
//    _pagesagedapprovalsverify.Click__0_();
//    
//
//    TestModellerLogger.SetLastNodeGuid("f2fdfa80-df15-4165-89ad-d02ffa7e9d76");
//    _pagesagedapprovalsverify.Click_more_();
//    
//
//    TestModellerLogger.SetLastNodeGuid("79199173-b436-4162-87f6-48e92c69a6cf");
//    _pagesagedapprovalsverify.Click_UTR_No();
//    

    }

}
