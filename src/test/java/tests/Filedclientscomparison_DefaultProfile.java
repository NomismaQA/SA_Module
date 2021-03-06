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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/86f02b94-bfaf-42c4-9e2d-98a781e9ee57
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1158, profileId = 101051)
public class Filedclientscomparison_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"a7f5a384-b9f7-4172-97ed-d63d15f7fdb8","Filedclientscomparison","Filedclientscomparison - Default Profile"})
    @TestModellerPath(guid = "a7f5a384-b9f7-4172-97ed-d63d15f7fdb8")
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
//pages.Filedcclientscomaprison _pagesFiledcclientscomaprison = new pages.Filedcclientscomaprison(driver);
//    TestModellerLogger.SetLastNodeGuid("40992eaf-dc8e-4551-999c-35fa3d3b11a2");
//    _pagesFiledcclientscomaprison.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("d29af39c-a1af-441c-a52e-ee27365f18f3");
//    _pagesFiledcclientscomaprison.Click__Self_Assessment_();
//    
//
//    TestModellerLogger.SetLastNodeGuid("b3e14563-ec32-4acd-ad9e-187455a00352");
//    _pagesFiledcclientscomaprison.Click_Dashboard();
//    
//
//    TestModellerLogger.SetLastNodeGuid("06bb3fde-0072-40f0-b0d8-35620d86794d");
//    _pagesFiledcclientscomaprison.Select_ctl00ctl00ParentContentcPHddlTaxYear("6 April 2019 to 5 April 2020");
//    
//
//    TestModellerLogger.SetLastNodeGuid("ba6e867f-2f84-4758-92b6-a53ee55aed94");
//    _pagesFiledcclientscomaprison.Click__Update_();
//    
//
//    TestModellerLogger.SetLastNodeGuid("3b3d4364-a48c-4b25-b2f4-59d431f5f2d1");
//    _pagesFiledcclientscomaprison.Click__12_();
//    
//
//    TestModellerLogger.SetLastNodeGuid("9e24ad9b-4a73-46b8-a77f-80eff2f592e9");
//    _pagesFiledcclientscomaprison.Select_ctl00ctl00ParentContentcPHddlTaxYear("6 April 2018 to 5 April 2019");
//    
//
//    TestModellerLogger.SetLastNodeGuid("6aa77969-ac68-49ae-9f5c-36b9e2262f88");
//    _pagesFiledcclientscomaprison.Click__Update_();
//    
//
//    TestModellerLogger.SetLastNodeGuid("38614251-e4ce-4850-9f1a-958e80fcd207");
//    _pagesFiledcclientscomaprison.Click__Elem1();
//    

    }

}
