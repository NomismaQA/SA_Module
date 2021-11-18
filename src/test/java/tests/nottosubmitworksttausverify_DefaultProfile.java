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

//http://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/a89e1bbb-3d7e-4b0d-b84c-adaa0dc14e57
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1022, profileId = 100924)
public class nottosubmitworksttausverify_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"e5015e1d-f427-48fe-b492-ce1e4ed3d0c8","nottosubmitworksttausverify","nottosubmitworksttausverify - Default Profile"})
    @TestModellerPath(guid = "e5015e1d-f427-48fe-b492-ce1e4ed3d0c8")
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
//pages.nototsubmitwrkstatusverify _pagesnototsubmitwrkstatusverify = new pages.nototsubmitwrkstatusverify(driver);
//    TestModellerLogger.SetLastNodeGuid("aab33baf-1e4b-437f-9fea-15794a9cb814");
//    _pagesnototsubmitwrkstatusverify.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("2c6c5713-344d-4be0-ac88-7d934860d5e0");
//    _pagesnototsubmitwrkstatusverify.Click__Self_Assessment_();
//    
//
//    TestModellerLogger.SetLastNodeGuid("629ebbd6-d932-47e9-9ffc-57e07177e0d9");
//    _pagesnototsubmitwrkstatusverify.Click_Dashboard();
//    
//
//    TestModellerLogger.SetLastNodeGuid("c988c28d-7e7f-4ca3-84c7-53371143ad21");
//    _pagesnototsubmitwrkstatusverify.Select_ctl00ctl00ParentContentcPHddlTaxYear("6 April 2019 to 5 April 2020");
//    
//
//    TestModellerLogger.SetLastNodeGuid("e779d7ca-8556-4e68-8bb5-644ee9be24b3");
//    _pagesnototsubmitwrkstatusverify.Select_ctl00ctl00ParentContentcPHAccountantList("Deepika Arora");
//    
//
//    TestModellerLogger.SetLastNodeGuid("5801419e-80ef-441c-b2f8-04d20ea57494");
//    _pagesnototsubmitwrkstatusverify.Click__Update_();
//    
//
//    TestModellerLogger.SetLastNodeGuid("a22e42af-dcd1-4a38-afd9-471633d5955d");
//    _pagesnototsubmitwrkstatusverify.Click__0();
//    
//
//    TestModellerLogger.SetLastNodeGuid("f4115fef-4927-43cc-87a5-f4aa4e5721a9");
//    _pagesnototsubmitwrkstatusverify.Click_UTR_No();
//    

    }

}
