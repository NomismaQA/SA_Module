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

//http://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/6ab528b7-3209-45d6-ac23-8a55d9c7e2fe
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1068, profileId = 100968)
public class Totalcountofqueriessent_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"5cdc4ba4-8596-4240-8f00-5e974e89b3f9","Total count of queries sent","Total count of queries sent - Default Profile"})
    @TestModellerPath(guid = "5cdc4ba4-8596-4240-8f00-5e974e89b3f9")
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
//pages.Total_countqueries_sent_verify _pagesTotal_countqueries_sent_verify = new pages.Total_countqueries_sent_verify(driver);
//    TestModellerLogger.SetLastNodeGuid("c9fd0f18-5f9a-4e6a-95db-ea4804b509ed");
//    _pagesTotal_countqueries_sent_verify.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("1b962198-1bff-4ef8-8479-3fbc38964012");
//    _pagesTotal_countqueries_sent_verify.Click__Self_Assessment_();
//    
//
//    TestModellerLogger.SetLastNodeGuid("3abeb967-68c8-435a-9c3a-2d5da8ab440b");
//    _pagesTotal_countqueries_sent_verify.Click_Dashboard();
//    
//
//    TestModellerLogger.SetLastNodeGuid("ca1e8531-532d-4c49-8fef-5b87edae45eb");
//    _pagesTotal_countqueries_sent_verify.Select_ctl00ctl00ParentContentcPHddlTaxYear("6 April 2019 to 5 April 2020");
//    
//
//    TestModellerLogger.SetLastNodeGuid("c02699b3-8bd6-45ee-8f07-640935ee30d6");
//    _pagesTotal_countqueries_sent_verify.Select_ctl00ctl00ParentContentcPHAccountantList("Show All");
//    
//
//    TestModellerLogger.SetLastNodeGuid("307d2237-1761-42fd-8105-2e55c632d5ef");
//    _pagesTotal_countqueries_sent_verify.Click__Update_();
//    
//
//    TestModellerLogger.SetLastNodeGuid("57fe0a7b-5708-4567-872a-d353d88fad45");
//    _pagesTotal_countqueries_sent_verify.Click_xPath_idctl00_ctl00_ParentContent_cPH_PageUC1_rptrPager_ctl03_lnkNext();
//    
//
//    TestModellerLogger.SetLastNodeGuid("b2ff8e33-7402-423b-ad75-542812ed4082");
//    _pagesTotal_countqueries_sent_verify.Click__1();
//    
//
//    TestModellerLogger.SetLastNodeGuid("52711ecc-915e-4717-834c-5b65a824d21e");
//    _pagesTotal_countqueries_sent_verify.Click__2_();
//    

    }

}
