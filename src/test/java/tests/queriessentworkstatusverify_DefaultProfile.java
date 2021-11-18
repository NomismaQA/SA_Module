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

//http://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/5ec35d52-497a-4735-aab4-52177493b903
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1018, profileId = 100919)
public class queriessentworkstatusverify_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"0ad9774e-a54c-4c20-a75b-abdd9b710356","queriessentworkstatusverify","queriessentworkstatusverify - Default Profile"})
    @TestModellerPath(guid = "0ad9774e-a54c-4c20-a75b-abdd9b710356")
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
//pages.queriessentworkstatusverify _pagesqueriessentworkstatusverify = new pages.queriessentworkstatusverify(driver);
//    TestModellerLogger.SetLastNodeGuid("9f0c38bd-3e93-4cde-a28e-2d37dbc95285");
//    _pagesqueriessentworkstatusverify.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("b36c03f9-f135-4337-af53-cd6de59d0228");
//    _pagesqueriessentworkstatusverify.Click__Self_Assessment_();
//    
//
//    TestModellerLogger.SetLastNodeGuid("d91a0d0c-19cc-4e04-9c99-092798644729");
//    _pagesqueriessentworkstatusverify.Click_Dashboard();
//    
//
//    TestModellerLogger.SetLastNodeGuid("2ef553d6-e534-4fb3-bfdb-dee43585a835");
//    _pagesqueriessentworkstatusverify.Select_ctl00ctl00ParentContentcPHddlTaxYear("6 April 2019 to 5 April 2020");
//    
//
//    TestModellerLogger.SetLastNodeGuid("8e7e85a6-fb30-4ef5-8c53-bd24663dfdc0");
//    _pagesqueriessentworkstatusverify.Select_ctl00ctl00ParentContentcPHAccountantList("Deepika Arora");
//    
//
//    TestModellerLogger.SetLastNodeGuid("71cc84e5-0f7b-4330-8040-1ffd2c97c643");
//    _pagesqueriessentworkstatusverify.Click__Update_();
//    
//
//    TestModellerLogger.SetLastNodeGuid("12d52be4-f2cc-492a-a5e6-c809b6af909a");
//    _pagesqueriessentworkstatusverify.Click__1();
//    
//
//    TestModellerLogger.SetLastNodeGuid("19e633c4-e67e-4d67-9ca2-57592ef4bd64");
//    _pagesqueriessentworkstatusverify.Click_UTR_No();
//    

    }

}
