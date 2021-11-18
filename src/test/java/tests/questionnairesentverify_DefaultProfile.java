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

//http://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/4adff874-9eff-44a0-b41d-19cd4286aa31
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1015, profileId = 100914)
public class questionnairesentverify_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"d90d8c82-1f68-4a18-bdcb-dc63ce761d9d","questionnairesentverify","questionnairesentverify - Default Profile"})
    @TestModellerPath(guid = "d90d8c82-1f68-4a18-bdcb-dc63ce761d9d")
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
//pages.questionnairesentworkstatusverification _pagesquestionnairesentworkstatusverification = new pages.questionnairesentworkstatusverification(driver);
//    TestModellerLogger.SetLastNodeGuid("ee380f53-5eb4-4f47-ba06-e14e5bd67eb7");
//    _pagesquestionnairesentworkstatusverification.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("a5303b7e-f202-455a-9f8e-5b4dd9b4303f");
//    _pagesquestionnairesentworkstatusverification.Click__Self_Assessment_();
//    
//
//    TestModellerLogger.SetLastNodeGuid("5552aeef-0023-4861-b4dd-02360bf8383b");
//    _pagesquestionnairesentworkstatusverification.Click_Dashboard();
//    
//
//    TestModellerLogger.SetLastNodeGuid("c500a6cd-6d68-4c20-a59c-2db88693a377");
//    _pagesquestionnairesentworkstatusverification.Select_ctl00ctl00ParentContentcPHddlTaxYear("6 April 2019 to 5 April 2020");
//    
//
//    TestModellerLogger.SetLastNodeGuid("cf69c42f-dd58-47db-9a8c-985eb6932feb");
//    _pagesquestionnairesentworkstatusverification.Select_ctl00ctl00ParentContentcPHAccountantList("Deepika Arora");
//    
//
//    TestModellerLogger.SetLastNodeGuid("70cc42bd-9ad6-4751-b4c3-90ec07a28c63");
//    _pagesquestionnairesentworkstatusverification.Click__Update_();
//    
//
//    TestModellerLogger.SetLastNodeGuid("ae92bd9f-9f63-4572-9432-e96c31ab30a5");
//    _pagesquestionnairesentworkstatusverification.Click__1();
//    
//
//    TestModellerLogger.SetLastNodeGuid("0abf57bd-7a13-41b1-bf03-5a0dfc3f9ab5");
//    _pagesquestionnairesentworkstatusverification.Click_UTR_No();
//    

    }

}
