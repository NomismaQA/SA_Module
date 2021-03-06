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

//http://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/b13d6883-fc27-453f-8709-ee3233c340f3
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1076, profileId = 100976)
public class totalcountverificationoffiledstatus_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"ac1196f4-8476-4f34-9ef0-440580b847e7","total count verification of filed status","total count verification of filed status - Default Profile"})
    @TestModellerPath(guid = "ac1196f4-8476-4f34-9ef0-440580b847e7")
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
//pages.Total_countfiled_status_verififcation _pagesTotal_countfiled_status_verififcation = new pages.Total_countfiled_status_verififcation(driver);
//    TestModellerLogger.SetLastNodeGuid("c3ba208c-2b49-4b9d-9547-cc35a71d7bed");
//    _pagesTotal_countfiled_status_verififcation.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("65ef7e98-997f-400d-9470-2e9aa9e6c3ca");
//    _pagesTotal_countfiled_status_verififcation.Click__Self_Assessment_();
//    
//
//    TestModellerLogger.SetLastNodeGuid("760aaf00-e288-475f-8a6d-e3e02baa6b6d");
//    _pagesTotal_countfiled_status_verififcation.Click_Dashboard();
//    
//
//    TestModellerLogger.SetLastNodeGuid("32917303-283a-481f-a9a1-786d7c41f8a4");
//    _pagesTotal_countfiled_status_verififcation.Select_ctl00ctl00ParentContentcPHddlTaxYear("6 April 2019 to 5 April 2020");
//    
//
//    TestModellerLogger.SetLastNodeGuid("091f7f1a-11d0-4ed4-8a72-3fcc9d17d3c3");
//    _pagesTotal_countfiled_status_verififcation.Click__Update_();
//    
//
//    TestModellerLogger.SetLastNodeGuid("062f1605-4faf-4c73-9ed2-2614b897edf4");
//    _pagesTotal_countfiled_status_verififcation.Click_xPath_idctl00_ctl00_ParentContent_cPH_PageUC1_rptrPager_ctl03_lnkNext();
//    
//
//    TestModellerLogger.SetLastNodeGuid("172539b3-f05b-4ccc-8322-69a4997b3d5b");
//    _pagesTotal_countfiled_status_verififcation.Click__5();
//    
//
//    TestModellerLogger.SetLastNodeGuid("1e39a2cb-2fcf-425a-90f1-910316e5046a");
//    _pagesTotal_countfiled_status_verififcation.Click__12();
//    

    }

}
