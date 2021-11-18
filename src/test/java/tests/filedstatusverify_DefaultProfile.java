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

//http://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/950c223b-ea16-46cb-966e-266dc8665ebf
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1025, profileId = 100928)
public class filedstatusverify_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"db25624e-79d0-4245-b0df-3dc46f026ea3","filedstatusverify","filedstatusverify - Default Profile"})
    @TestModellerPath(guid = "db25624e-79d0-4245-b0df-3dc46f026ea3")
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
//pages.filedstatusverify _pagesfiledstatusverify = new pages.filedstatusverify(driver);
//    TestModellerLogger.SetLastNodeGuid("96b5a3fc-cf8c-4c3a-bdc4-b39383b57897");
//    _pagesfiledstatusverify.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("09ed1f6a-667e-49ed-90ef-2f9b8bdeba8d");
//    _pagesfiledstatusverify.Click__Self_Assessment_();
//    
//
//    TestModellerLogger.SetLastNodeGuid("7349d6d2-8591-4d8a-aa08-20d1c4fee5dd");
//    _pagesfiledstatusverify.Click_Dashboard();
//    
//
//    TestModellerLogger.SetLastNodeGuid("090b89ab-f0fa-43a8-96e3-48df6c1b6754");
//    _pagesfiledstatusverify.Select_ctl00ctl00ParentContentcPHddlTaxYear("6 April 2019 to 5 April 2020");
//    
//    TestModellerLogger.SetLastNodeGuid("c49ad122-13ee-4368-bc9c-024863f238f1");
//    _pagesfiledstatusverify.Select_ctl00ctl00ParentContentcPHAccountantList("Deepika Arora");
//    
//
//    TestModellerLogger.SetLastNodeGuid("ce354b9e-9eb6-4dca-8a0b-5387115b590e");
//    _pagesfiledstatusverify.Click__Update_();
//    
//
//    TestModellerLogger.SetLastNodeGuid("bffac504-7794-479f-a065-7731b1e0ac25");
//    _pagesfiledstatusverify.Click__1();
//    
//
//    TestModellerLogger.SetLastNodeGuid("b897062e-9698-4ee7-a7fd-11369ef9393a");
//    _pagesfiledstatusverify.Click_UTR_No();
    

    }

}
