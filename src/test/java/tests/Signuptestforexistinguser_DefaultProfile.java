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

//http://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/2f1b1056-a2d8-4afc-9bfc-d68ee3eb33df
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 222, profileId = 100176)
public class Signuptestforexistinguser_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"061287e4-ddec-4bbd-928a-6c0db40d2608","Signup test for existing user","Signup test for existing user - Default Profile"})
    @TestModellerPath(guid = "061287e4-ddec-4bbd-928a-6c0db40d2608")
    public void GoToUrlClickFreeTrialPositiveEnterq3namePositiveEnterq3lnamePositiveEnterq3companyPositiveEnte()
    {
        
        pages.Sign_up_Form _pagesSign_up_Form = new pages.Sign_up_Form(driver);
    TestModellerLogger.SetLastNodeGuid("b71ab0a2-5f40-4afc-b60f-e2e3a4d1a3f3");
    _pagesSign_up_Form.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("62551e24-0c20-4889-b0c8-67661341c7aa");
    _pagesSign_up_Form.Click_Free_Trial();
    

    TestModellerLogger.SetLastNodeGuid("55340145-a527-44ee-90eb-c15606785de1");
    _pagesSign_up_Form.Enter_q3name("roshni");
    

    TestModellerLogger.SetLastNodeGuid("2f64121a-fc0d-425d-8ee0-259fe01d605e");
    _pagesSign_up_Form.Enter_q3lname("sharma");
    

    TestModellerLogger.SetLastNodeGuid("a5fdb6f8-2115-40a0-bfed-e79a3fca1e24");
    _pagesSign_up_Form.Enter_q3company("qa infotech");
    

    TestModellerLogger.SetLastNodeGuid("1a04ef69-9ba3-4d2c-9774-1da391da3991");
    _pagesSign_up_Form.Enter_q4email("rs9314157+16@gmail.com");
    

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
    

pages.email _pagesemail = new pages.email(driver);
    TestModellerLogger.SetLastNodeGuid("a7d3ce96-6caf-48ee-bbd8-c45f609bd1c4");
    _pagesemail.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("0d196af8-4cfb-4758-a88d-37e224549c92");
    _pagesemail.Enter_email("rs9314157@gmail.com");
    

    TestModellerLogger.SetLastNodeGuid("b735d837-edf4-43a9-888e-7f885a9c4800");
    _pagesemail.Click_Next();
    

    TestModellerLogger.SetLastNodeGuid("faece326-09cc-430e-9092-bf44e4e4ca7b");
    _pagesemail.Enter_password("deepika1989#");
    

    TestModellerLogger.SetLastNodeGuid("5cf78aeb-bb6b-4ce2-a464-a1236d6af434");
    _pagesemail.Click_Next();
    

    TestModellerLogger.SetLastNodeGuid("2f326f8e-fc94-4bbe-aa1e-d82293d5e414");
    _pagesemail.Click_Nomisma();
    

    TestModellerLogger.SetLastNodeGuid("284c27a5-6205-486e-a7f8-2c3a6f999618");
    _pagesemail.Click_Activate();
    

pages.email_verification _pagesemail_verification = new pages.email_verification(driver);
    TestModellerLogger.SetLastNodeGuid("af2c62a8-09a7-422a-a3f2-3f32c24969c7");
    _pagesemail_verification.Switch_Tab();
    

pages.Exisitng_user _pagesExisitng_user = new pages.Exisitng_user(driver);
    TestModellerLogger.SetLastNodeGuid("06e32acc-b4b6-4a2e-8ffc-d66f316a7c2c");
    _pagesExisitng_user.GoToUrl();
    

    //TestModellerLogger.SetLastNodeGuid("cbd5dddc-b2fc-42c5-84c2-14b778e5a57b");
    //_pagesExisitng_user.Click__A_User_with_same_Login_Name_already_exists_();
    

//    TestModellerLogger.SetLastNodeGuid("54dbc9ff-5472-459e-882f-570f71035c8e");
//    _pagesExisitng_user.Click_Log_in();
//    
//
//    TestModellerLogger.SetLastNodeGuid("12606556-00b9-41cc-86ea-48500c80843a");
//    _pagesExisitng_user.Enter_ctl00cPHlogin("rs9314157+16@gmail.com");
//    
//
//    TestModellerLogger.SetLastNodeGuid("3d40085f-350d-4507-a73d-f524eb241362");
//    _pagesExisitng_user.Enter_ctl00cPHpass("deepika");
//    
//
//    TestModellerLogger.SetLastNodeGuid("4e0a7fa4-fa1e-401a-ac18-f1237f0beab9");
//    _pagesExisitng_user.Click_Login();
    

    }

}
