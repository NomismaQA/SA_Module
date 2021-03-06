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

//http://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/d17e0c5e-6af1-4a8d-91c0-a9cc60b1ba65
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1074, profileId = 100974)
public class totalcountverificationofnottosubmitstatus_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"fedeff06-ff2b-477b-840c-edb20b63c21c","total count verification of not to submit status","total count verification of not to submit status - Default Profile"})
    @TestModellerPath(guid = "fedeff06-ff2b-477b-840c-edb20b63c21c")
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
//pages.Total_countnot_to_submit_status_verification _pagesTotal_countnot_to_submit_status_verification = new pages.Total_countnot_to_submit_status_verification(driver);
//    TestModellerLogger.SetLastNodeGuid("2ad17761-312f-4914-8cc0-2a373e69e7c2");
//    _pagesTotal_countnot_to_submit_status_verification.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("10759aab-482e-479a-8914-b8efc790f08a");
//    _pagesTotal_countnot_to_submit_status_verification.Click__Self_Assessment_();
//    
//
//    TestModellerLogger.SetLastNodeGuid("b44c6be0-2a9e-41db-9445-23b88e31711a");
//    _pagesTotal_countnot_to_submit_status_verification.Click_Dashboard();
//    
//
//    TestModellerLogger.SetLastNodeGuid("03a0652c-6a67-4bd8-821e-ee3b760f570d");
//    _pagesTotal_countnot_to_submit_status_verification.Select_ctl00ctl00ParentContentcPHddlTaxYear("6 April 2019 to 5 April 2020");
//    
//
//    TestModellerLogger.SetLastNodeGuid("851013ef-9d4d-47df-bf54-cefe3609118f");
//    _pagesTotal_countnot_to_submit_status_verification.Select_ctl00ctl00ParentContentcPHAccountantList("Show All");
//    
//
//    TestModellerLogger.SetLastNodeGuid("3570f248-e65f-41b1-91ac-9b4ccb481c0a");
//    _pagesTotal_countnot_to_submit_status_verification.Click__Update_();
//    
//
//    TestModellerLogger.SetLastNodeGuid("290679e6-2300-4340-a065-6cd50c493add");
//    _pagesTotal_countnot_to_submit_status_verification.Click_xPath_idctl00_ctl00_ParentContent_cPH_PageUC1_rptrPager_ctl03_lnkNext();
//    
//
//    TestModellerLogger.SetLastNodeGuid("f8072ff1-56b5-44f1-b35d-b712afde8228");
//    _pagesTotal_countnot_to_submit_status_verification.Click__0();
//    
//
//    TestModellerLogger.SetLastNodeGuid("fce82f30-9d50-4647-a9ed-3de21f1e1d9d");
//    _pagesTotal_countnot_to_submit_status_verification.Click__0_1();
    

    }

}
