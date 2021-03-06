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

//http://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/57bbacdd-d178-4f56-a850-9133a63aa0e9
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1073, profileId = 100973)
public class totalcountverificationoftobefiledstatus_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"2e3911b5-6207-4583-8298-e9639b65ab35","total count verification of to be filed status","total count verification of to be filed status - Default Profile"})
    @TestModellerPath(guid = "2e3911b5-6207-4583-8298-e9639b65ab35")
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
//pages.Total_countto_be_filed_verification _pagesTotal_countto_be_filed_verification = new pages.Total_countto_be_filed_verification(driver);
//    TestModellerLogger.SetLastNodeGuid("ffc1f537-c832-439b-8cf0-44bebbb53dd5");
//    _pagesTotal_countto_be_filed_verification.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("215dba8c-7ce6-4233-a818-05bbdaa7d358");
//    _pagesTotal_countto_be_filed_verification.Click__Self_Assessment_();
//    
//
//    TestModellerLogger.SetLastNodeGuid("8daad8a1-5bc2-4a5d-b8df-1e33f88aecb4");
//    _pagesTotal_countto_be_filed_verification.Click_Dashboard();
//    
//
//    TestModellerLogger.SetLastNodeGuid("0c4aade2-0c80-4ba2-aea2-d103696e552c");
//    _pagesTotal_countto_be_filed_verification.Select_ctl00ctl00ParentContentcPHddlTaxYear("6 April 2019 to 5 April 2020");
//    
//
//    TestModellerLogger.SetLastNodeGuid("7eeddaf3-b0c3-40b8-8f93-422b09784e53");
//    _pagesTotal_countto_be_filed_verification.Select_ctl00ctl00ParentContentcPHAccountantList("Show All");
//    
//
//    TestModellerLogger.SetLastNodeGuid("f0e026a6-38f5-4150-895a-2b47314ae972");
//    _pagesTotal_countto_be_filed_verification.Click__Update_();
//    
//
//    TestModellerLogger.SetLastNodeGuid("9a4cf35d-62dc-4a47-ad63-e24552706978");
//    _pagesTotal_countto_be_filed_verification.Click_xPath_idctl00_ctl00_ParentContent_cPH_PageUC1_rptrPager_ctl03_lnkNext();
//    
//
//    TestModellerLogger.SetLastNodeGuid("3bc75feb-0b07-4b18-a897-d09d4664e527");
//    _pagesTotal_countto_be_filed_verification.Click__0();
//    
//
//    TestModellerLogger.SetLastNodeGuid("51e52cad-4ab6-420f-bcf2-84a2d30a2f55");
//    _pagesTotal_countto_be_filed_verification.Click__0_1();
    

    }

}
