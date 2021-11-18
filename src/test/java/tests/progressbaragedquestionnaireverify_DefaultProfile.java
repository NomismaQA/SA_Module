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

//http://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/a8967f33-4045-4223-94f8-956a2339b995
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1054, profileId = 100956)
public class progressbaragedquestionnaireverify_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"7dd40c1e-ea93-4d10-9dd4-d89097fc247f","progressbaragedquestionnaireverify","progressbaragedquestionnaireverify - Default Profile"})
    @TestModellerPath(guid = "7dd40c1e-ea93-4d10-9dd4-d89097fc247f")
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
//pages.progressbaragedquestionnaireverify _pagesprogressbaragedquestionnaireverify = new pages.progressbaragedquestionnaireverify(driver);
//    TestModellerLogger.SetLastNodeGuid("3be8416c-0602-48bf-b2f6-754c797a779c");
//    _pagesprogressbaragedquestionnaireverify.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("a3a60e81-de1b-4862-80d5-2b23ac8f9c5d");
//    _pagesprogressbaragedquestionnaireverify.Click__Self_Assessment_();
//    
//
//    TestModellerLogger.SetLastNodeGuid("99fe7dbd-2859-4c79-b06c-10800c59a042");
//    _pagesprogressbaragedquestionnaireverify.Click_Dashboard();
//    
//
//    TestModellerLogger.SetLastNodeGuid("15f32def-c8f5-44c3-974b-235472496f1e");
//    _pagesprogressbaragedquestionnaireverify.Select_ctl00ctl00ParentContentcPHddlTaxYear("6 April 2019 to 5 April 2020");
//    
//
//    TestModellerLogger.SetLastNodeGuid("6b7b5525-cfd4-4bab-9ae6-fd0b5461549e");
//    _pagesprogressbaragedquestionnaireverify.Select_ctl00ctl00ParentContentcPHAccountantList("Deepika Arora");
//    
//
//    TestModellerLogger.SetLastNodeGuid("782909db-6d20-4944-ab24-ac9e1647df17");
//    _pagesprogressbaragedquestionnaireverify.Click__Update_();
//    
//
//    TestModellerLogger.SetLastNodeGuid("41ca0c8b-d1be-4438-9bcb-e98219c0959f");
//    _pagesprogressbaragedquestionnaireverify.Click__30_();
//    
//
//    TestModellerLogger.SetLastNodeGuid("2e21be74-a9ae-4dc8-8621-fb2fe1f55b4e");
//    _pagesprogressbaragedquestionnaireverify.Click_more_();
//    
//
//    TestModellerLogger.SetLastNodeGuid("0281bbd8-a084-47d9-9db8-74479d729615");
//    _pagesprogressbaragedquestionnaireverify.Click_UTR_No();
    

    }

}
