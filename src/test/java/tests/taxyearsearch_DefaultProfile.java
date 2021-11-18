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

//http://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/f75947a7-4f17-4814-b428-2de1f2237cef
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1005, profileId = 100905)
public class taxyearsearch_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"31362092-18b5-4371-b876-4eeebf44efb4","tax year search","tax year search - Default Profile"})
    @TestModellerPath(guid = "31362092-18b5-4371-b876-4eeebf44efb4")
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
//pages.taxyearsearch _pagestaxyearsearch = new pages.taxyearsearch(driver);
//    TestModellerLogger.SetLastNodeGuid("5a81b8a8-b5f7-4e72-b2da-41639f2bb3e5");
//    _pagestaxyearsearch.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("058c71d6-5888-4874-8757-f6b360298def");
//    _pagestaxyearsearch.Click__Self_Assessment_();
//    
//
//    TestModellerLogger.SetLastNodeGuid("10fed526-0603-455b-b92d-252a25c38e4e");
//    _pagestaxyearsearch.Click_Dashboard();
//    
//
//    TestModellerLogger.SetLastNodeGuid("2342dfbf-5864-4af7-85cf-340298618610");
//    _pagestaxyearsearch.Select_ctl00ctl00ParentContentcPHddlTaxYear("6 April 2018 to 5 April 2019");
//    
//
//    TestModellerLogger.SetLastNodeGuid("b618a98d-69f4-4ce5-a3f1-1662da6138f3");
//    _pagestaxyearsearch.Select_ctl00ctl00ParentContentcPHAccountantList("Show All");
//    
//
//    TestModellerLogger.SetLastNodeGuid("a3a23f2f-a3dc-47be-903c-ecf7f1aae746");
//    _pagestaxyearsearch.Click__Update_();
    

    }

}
