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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/131ba474-7054-457d-92ca-ed45a3bed3de
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1154, profileId = 101048)
public class Topperformerverification_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"d7e7b4eb-c09d-4e6c-a229-b6b2ff1c929f","Topperformerverification","Topperformerverification - Default Profile"})
    @TestModellerPath(guid = "d7e7b4eb-c09d-4e6c-a229-b6b2ff1c929f")
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
    

pages.Agentpage _pagesAgentpage = new pages.Agentpage(driver);
    TestModellerLogger.SetLastNodeGuid("9997b1d2-129f-42d2-af0e-07df9cc61552");
    _pagesAgentpage.Enter_ctl00cPHFiltertxtAgentName("demo agent");
    

    TestModellerLogger.SetLastNodeGuid("fa144c29-3a61-4cdb-b63c-5ff85ebcb4fe");
    _pagesAgentpage.Click_Search();
    

    TestModellerLogger.SetLastNodeGuid("f896ef3b-136e-4806-9356-ff59cdaaf858");
    _pagesAgentpage.Click__Demo_();
    

    TestModellerLogger.SetLastNodeGuid("5f95e59c-c587-41d9-a33b-6f3971dc9518");
    _pagesAgentpage.Switch_Tab();
    

pages.Toperformerverification _pagesToperformerverification = new pages.Toperformerverification(driver);
    TestModellerLogger.SetLastNodeGuid("cbf17c81-652f-4e2e-820b-b96cfcd068ae");
    _pagesToperformerverification.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("afff3272-6e43-4a95-aab6-a44e4b955e22");
    _pagesToperformerverification.Click__Self_Assessment_();
    

    TestModellerLogger.SetLastNodeGuid("9bf757da-9f13-4075-9b0e-f1d3444b2c53");
    _pagesToperformerverification.Click_Dashboard();
    

    TestModellerLogger.SetLastNodeGuid("209dd570-5504-4fcf-9e2e-d1a7c2166cf8");
    _pagesToperformerverification.Select_ctl00ctl00ParentContentcPHddlTaxYear("6 April 2019 to 5 April 2020");
    

    TestModellerLogger.SetLastNodeGuid("ed89993e-0678-40cf-9775-ac1c78d1d3ba");
    _pagesToperformerverification.Select_ctl00ctl00ParentContentcPHAccountantList("Show All");
    

    TestModellerLogger.SetLastNodeGuid("0ab2a497-4e56-456c-a5b3-f9896abdc05f");
    _pagesToperformerverification.Click__Update_();
    

    TestModellerLogger.SetLastNodeGuid("1addbe61-5b03-4a8c-9a08-64926f6aad9a");
    _pagesToperformerverification.Click__Demo_Demo_();
    

    TestModellerLogger.SetLastNodeGuid("ab58c63a-89b0-4dc8-9e36-7edaaeb0418d");
    _pagesToperformerverification.Click__1();
    

    TestModellerLogger.SetLastNodeGuid("bf540c27-7a04-45f8-9fb9-8c1e780dd3d7");
    _pagesToperformerverification.Click_xPath_idctl00_ctl00_ParentContent_cPH_PageUC1_rptrPager_ctl03_lnkNext();
    

    TestModellerLogger.SetLastNodeGuid("30d8b11b-28fc-4de5-968d-ba3b98370b1f");
    _pagesToperformerverification.Click_Filed();
    

    }

}
