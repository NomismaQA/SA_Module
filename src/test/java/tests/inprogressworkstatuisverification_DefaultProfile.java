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

//http://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/9b849a9c-0c9e-45d5-aadf-276cf75cce0a
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1002, profileId = 100901)
public class inprogressworkstatuisverification_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"a02e783d-b616-4ede-b20b-2eafa7036d0a","inprogressworkstatuisverification","inprogressworkstatuisverification - Default Profile"})
    @TestModellerPath(guid = "a02e783d-b616-4ede-b20b-2eafa7036d0a")
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
//pages.inprogressworkstatusverification _pagesinprogressworkstatusverification = new pages.inprogressworkstatusverification(driver);
//    TestModellerLogger.SetLastNodeGuid("145d07e1-c1d3-4d93-83e1-40540701899b");
//    _pagesinprogressworkstatusverification.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("fe7d19c6-f2e4-4087-8b07-b58fd1f0004f");
//    _pagesinprogressworkstatusverification.Click__Self_Assessment_();
//    
//
//    TestModellerLogger.SetLastNodeGuid("8008ef82-6599-4a73-a413-58a9ca5a3141");
//    _pagesinprogressworkstatusverification.Click_Dashboard();
//    
//
//    TestModellerLogger.SetLastNodeGuid("806f5a85-61e8-4e94-b97c-1e4100c5d571");
//    _pagesinprogressworkstatusverification.Select_ctl00ctl00ParentContentcPHddlTaxYear("6 April 2019 to 5 April 2020");
//    
//
//    TestModellerLogger.SetLastNodeGuid("f967812d-f182-4404-b366-75954acf136f");
//    _pagesinprogressworkstatusverification.Select_ctl00ctl00ParentContentcPHAccountantList("Deepika Arora");
//    
//
//    TestModellerLogger.SetLastNodeGuid("370b7a12-138a-4de6-aa89-63aee1265dc9");
//    _pagesinprogressworkstatusverification.Click__Update_();
//    
//
//    TestModellerLogger.SetLastNodeGuid("219ed651-c653-4333-8d90-ffe8659b15b8");
//    _pagesinprogressworkstatusverification.Click__0();
//    
//
//    TestModellerLogger.SetLastNodeGuid("c59ad58f-8379-413c-913b-9791cb36f61e");
//    _pagesinprogressworkstatusverification.Click_UTR_No();
//    

    }

}
