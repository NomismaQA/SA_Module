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

//http://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/6a6187b3-2390-467f-bfd1-20e6749791e1
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1021, profileId = 100923)
public class tobefiledworkstatusverify_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"aec1d165-eca9-46a2-b853-b2f5911d5d8e","tobefiledworkstatusverify","tobefiledworkstatusverify - Default Profile"})
    @TestModellerPath(guid = "aec1d165-eca9-46a2-b853-b2f5911d5d8e")
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
//pages.tobefilledworkstatusverify _pagestobefilledworkstatusverify = new pages.tobefilledworkstatusverify(driver);
//    TestModellerLogger.SetLastNodeGuid("f3708c92-ef33-452c-9ce9-cfe254d64463");
//    _pagestobefilledworkstatusverify.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("8fb2b504-9ae7-4824-9968-77d3d22c3acd");
//    _pagestobefilledworkstatusverify.Click__Self_Assessment_();
//    
//
//    TestModellerLogger.SetLastNodeGuid("72f884ff-eb8f-4573-8c6c-2e68b85527a8");
//    _pagestobefilledworkstatusverify.Click_Dashboard();
//    
//
//    TestModellerLogger.SetLastNodeGuid("61579a24-86ae-482a-b14e-7399c60aaba5");
//    _pagestobefilledworkstatusverify.Select_ctl00ctl00ParentContentcPHddlTaxYear("6 April 2019 to 5 April 2020");
//    
//
//    TestModellerLogger.SetLastNodeGuid("6128fa11-1f53-4bef-a770-ffd6012e9655");
//    _pagestobefilledworkstatusverify.Select_ctl00ctl00ParentContentcPHAccountantList("Deepika Arora");
//    
//
//    TestModellerLogger.SetLastNodeGuid("2f50f719-8418-44e3-8cd2-cd3a0913b813");
//    _pagestobefilledworkstatusverify.Click__Update_();
//    
//
//    TestModellerLogger.SetLastNodeGuid("828ad2fe-a1fb-42be-bee9-380fc51fb477");
//    _pagestobefilledworkstatusverify.Click__0();
//    
//
//    TestModellerLogger.SetLastNodeGuid("dc251412-8e24-445b-9a7f-aa2ccc28335e");
//    _pagestobefilledworkstatusverify.Click_UTR_No();
    

    }

}
