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

//http://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/e35803fa-1343-4bec-8680-778f0bd95166
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1029, profileId = 100933)
public class totalclientlcountprogressbarverify_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"170e99a7-081a-49cd-a08c-a95979c6ff50","totalclientlcountprogressbarverify","totalclientlcountprogressbarverify - Default Profile"})
    @TestModellerPath(guid = "170e99a7-081a-49cd-a08c-a95979c6ff50")
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
//pages.totalclientcountprogressbarverify _pagestotalclientcountprogressbarverify = new pages.totalclientcountprogressbarverify(driver);
//    TestModellerLogger.SetLastNodeGuid("6876b20d-7cee-4247-b44d-6874cced9697");
//    _pagestotalclientcountprogressbarverify.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("fac35281-62c4-4625-94e9-460583a6f72d");
//    _pagestotalclientcountprogressbarverify.Click__Self_Assessment_();
//    
//
//    TestModellerLogger.SetLastNodeGuid("569f8c9a-2a69-4c4f-823f-d84dd9df78ce");
//    _pagestotalclientcountprogressbarverify.Click_Dashboard();
//    
//
//    TestModellerLogger.SetLastNodeGuid("7a429311-f659-470f-83d0-981579583caf");
//    _pagestotalclientcountprogressbarverify.Select_ctl00ctl00ParentContentcPHddlTaxYear("6 April 2019 to 5 April 2020");
//    
//
//    TestModellerLogger.SetLastNodeGuid("7df1257b-3f4f-48b7-a86f-afd7783bcd29");
//    _pagestotalclientcountprogressbarverify.Select_ctl00ctl00ParentContentcPHAccountantList("Deepika Arora");
//    
//
//    TestModellerLogger.SetLastNodeGuid("5dba8a3c-c116-463d-967f-5e8062980bf5");
//    _pagestotalclientcountprogressbarverify.Click__Update_();
//    
//
//    TestModellerLogger.SetLastNodeGuid("519405db-8a42-425e-a08d-8040a6c741a6");
//    _pagestotalclientcountprogressbarverify.Click__6_();
//    
//
//    TestModellerLogger.SetLastNodeGuid("23865603-70bb-4caf-94c6-35bcac142be4");
//    _pagestotalclientcountprogressbarverify.Click_more_();
//    
//
//    TestModellerLogger.SetLastNodeGuid("e1a4f6fe-2071-47d5-a7e3-6e367d555751");
//    _pagestotalclientcountprogressbarverify.Click_UTR_No();
    

    }

}
