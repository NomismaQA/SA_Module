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

//http://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/ed971529-39f6-4a52-9a83-c6a40c4e38cd
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 119, profileId = 100071)
public class Signupform_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"f8cb275d-abfa-4910-bbca-f3d47a13e363","Sign up form","Sign up form - Default Profile"})
    @TestModellerPath(guid = "f8cb275d-abfa-4910-bbca-f3d47a13e363")
    public void GoToUrlClickFreeTrialPositiveEnterq3namePositiveEnterq3lnamePositiveEnterq3companyPositiveEnte()
    {
        
        pages.Sign_up_Form _pagesSign_up_Form = new pages.Sign_up_Form(driver);
    TestModellerLogger.SetLastNodeGuid("b71ab0a2-5f40-4afc-b60f-e2e3a4d1a3f3");
    _pagesSign_up_Form.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("62551e24-0c20-4889-b0c8-67661341c7aa");
    _pagesSign_up_Form.Click_Free_Trial();
    

    TestModellerLogger.SetLastNodeGuid("55340145-a527-44ee-90eb-c15606785de1");
    _pagesSign_up_Form.Enter_q3name("deepika");
    

    TestModellerLogger.SetLastNodeGuid("2f64121a-fc0d-425d-8ee0-259fe01d605e");
    _pagesSign_up_Form.Enter_q3lname("arora");
    

    TestModellerLogger.SetLastNodeGuid("a5fdb6f8-2115-40a0-bfed-e79a3fca1e24");
    _pagesSign_up_Form.Enter_q3company("indian bulls");
    

    TestModellerLogger.SetLastNodeGuid("1a04ef69-9ba3-4d2c-9774-1da391da3991");
    _pagesSign_up_Form.Enter_q4email("deepikaaryaofficial@gmail.com");
    

    TestModellerLogger.SetLastNodeGuid("e5ed1e3b-5769-4374-9cc9-4368ca8ffb72");
    _pagesSign_up_Form.Enter_q7phone("8287617116");
    

    TestModellerLogger.SetLastNodeGuid("abcc35d3-e721-4cd8-a464-deb8ee169453");
    _pagesSign_up_Form.Click__Please_dont_send_me_any_marketing_communications_();
    

    TestModellerLogger.SetLastNodeGuid("d152c7c9-94e6-43f4-ab0e-93556d763687");
    _pagesSign_up_Form.Click__I_have_read_and_agree_to_Nomismas_terms_and_privacy_pol();
    

    TestModellerLogger.SetLastNodeGuid("2ded9643-5afa-487d-bd83-36cd4e883d5c");
    _pagesSign_up_Form.Click_Get_Started();
    

    TestModellerLogger.SetLastNodeGuid("de6f2a7c-8184-4ca0-8889-273f555d2bc0");
    _pagesSign_up_Form.Switch_Tab();
    

    }

}
