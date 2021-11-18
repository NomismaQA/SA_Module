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

//http://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/471e7296-ad78-4c54-9213-12bc8e6f9dc7
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1065, profileId = 100965)
public class totalcountquestionnairesentverify_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"9f04fbc6-92d7-4740-97bf-e8aca9e61da9","total count:questionnaire sent verify","total count:questionnaire sent verify - Default Profile"})
    @TestModellerPath(guid = "9f04fbc6-92d7-4740-97bf-e8aca9e61da9")
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
//pages.total_countquestionnaire_sent_verify _pagestotal_countquestionnaire_sent_verify = new pages.total_countquestionnaire_sent_verify(driver);
//    TestModellerLogger.SetLastNodeGuid("3adc8133-88ec-4e78-9699-3e3bf92299ce");
//    _pagestotal_countquestionnaire_sent_verify.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("4cc1d4dc-ff3d-4bf8-8984-50723094eed9");
//    _pagestotal_countquestionnaire_sent_verify.Click__Self_Assessment_();
//    
//
//    TestModellerLogger.SetLastNodeGuid("55cc8d21-bbc7-4263-bf69-1011b7c085b0");
//    _pagestotal_countquestionnaire_sent_verify.Click_Dashboard();
//    
//
//    TestModellerLogger.SetLastNodeGuid("ae225ad9-3fda-496c-810b-3172bd1e0a82");
//    _pagestotal_countquestionnaire_sent_verify.Select_ctl00ctl00ParentContentcPHddlTaxYear("6 April 2019 to 5 April 2020");
//    
//
//    TestModellerLogger.SetLastNodeGuid("0999959b-6d3d-4267-a727-147748ad7fc3");
//    _pagestotal_countquestionnaire_sent_verify.Select_ctl00ctl00ParentContentcPHAccountantList("Show All");
//    
//
//    TestModellerLogger.SetLastNodeGuid("75686c19-c45a-4142-8710-1b33171ef147");
//    _pagestotal_countquestionnaire_sent_verify.Click__Update_();
//    
//
//    TestModellerLogger.SetLastNodeGuid("04ade3ef-5d03-4490-b2c8-0d745f005b74");
//    _pagestotal_countquestionnaire_sent_verify.Click_xPath_idctl00_ctl00_ParentContent_cPH_PageUC1_rptrPager_ctl03_lnkNext();
//    
//
//    TestModellerLogger.SetLastNodeGuid("66d27bce-eb00-460d-960e-8884dcc927c2");
//    _pagestotal_countquestionnaire_sent_verify.Click__18();
//    
//
//    TestModellerLogger.SetLastNodeGuid("aaa4a5ce-1e7d-4493-8ee7-391ed1977018");
//    _pagestotal_countquestionnaire_sent_verify.Click__42_();
//    

    }

}
