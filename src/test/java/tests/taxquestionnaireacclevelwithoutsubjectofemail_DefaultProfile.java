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

//http://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/5cdd8e54-e16a-4bb2-b9f0-4c4322126bd9
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1036, profileId = 100940)
public class taxquestionnaireacclevelwithoutsubjectofemail_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"4d2a9d9f-b837-4ca7-bb71-a04157fd28b1","taxquestionnaireacclevelwithoutsubjectofemail","taxquestionnaireacclevelwithoutsubjectofemail - Default Profile"})
    @TestModellerPath(guid = "4d2a9d9f-b837-4ca7-bb71-a04157fd28b1")
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
    

//    TestModellerLogger.SetLastNodeGuid("5f95e59c-c587-41d9-a33b-6f3971dc9518");
//    _pagesAgentpage.Switch_Tab();
//    
//
//pages.taxquesatacclevelwithoutsubject _pagestaxquesatacclevelwithoutsubject = new pages.taxquesatacclevelwithoutsubject(driver);
//    TestModellerLogger.SetLastNodeGuid("f96adb41-94ad-4c79-84fe-e732eade5964");
//    _pagestaxquesatacclevelwithoutsubject.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("941b0874-275d-4b28-acfa-bce5ca6979a4");
//    _pagestaxquesatacclevelwithoutsubject.Click__Self_Assessment_();
//    
//
//    TestModellerLogger.SetLastNodeGuid("11b337a1-0485-4ed1-82b0-e31bf1ed45ec");
//    _pagestaxquesatacclevelwithoutsubject.Click_Dashboard();
//    
//
//    TestModellerLogger.SetLastNodeGuid("a47314eb-a016-40ed-969a-e65384de8b0d");
//    _pagestaxquesatacclevelwithoutsubject.Click_xPath_htmlbodyformmaindiv3div3divdiv9div2divdiv1divtabletbodytr1td14();
//    
//
//    TestModellerLogger.SetLastNodeGuid("2c188fd5-b66f-44be-bfb9-03411381d587");
//    _pagestaxquesatacclevelwithoutsubject.Click_Send_Questionnaire_();
//    
//
//    TestModellerLogger.SetLastNodeGuid("9d701a1f-0171-4c96-acc0-7ccbfe8c1fa7");
//    _pagestaxquesatacclevelwithoutsubject.Click__Deepika_Automation_client_();
//    
//
//    TestModellerLogger.SetLastNodeGuid("63dcb15e-2ce8-434c-829c-06ac234f0f87");
//    _pagestaxquesatacclevelwithoutsubject.Click_Next_();
//    
//
//    TestModellerLogger.SetLastNodeGuid("23ec2a00-0313-4ea2-9f82-46245ad04e73");
//    _pagestaxquesatacclevelwithoutsubject.Enter_ctl00ctl00ParentContentcPHtxtSubject("");
//
//    TestModellerLogger.SetLastNodeGuid("87ab3c79-f972-471d-8874-ea26d68f2013");
//    _pagestaxquesatacclevelwithoutsubject.Click_Next__1();
//    

//    TestModellerLogger.SetLastNodeGuid("2260a9e3-71eb-4a4e-848b-ddd99873db36");
//    _pagestaxquesatacclevelwithoutsubject.Click__Error_Please_enter_subject_to_send_email();
    

    }

}
