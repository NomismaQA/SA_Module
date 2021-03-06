package tests;

import reports.TestNGListener;
import ie.curiositysoftware.testmodeller.TestModellerPath;
import ie.curiositysoftware.testmodeller.TestModellerSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utilities.testmodeller.TestModellerLogger;

//http://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/692a616e-45ad-4112-be3c-157f423a00f3
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 221, profileId = 100103)
public class fullprocesssubscribe_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"39d4652c-8126-4634-9fa9-af699a158d49","full process subscribe","full process subscribe - Default Profile"})
    @TestModellerPath(guid = "39d4652c-8126-4634-9fa9-af699a158d49")
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
    _pagesSign_up_Form.Enter_q3company("QA Infotech");
    

    TestModellerLogger.SetLastNodeGuid("1a04ef69-9ba3-4d2c-9774-1da391da3991");
    _pagesSign_up_Form.Enter_q4email("rs9314157+47@gmail.com");
    

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
    

pages.passwordsettings _pagespasswordsettings = new pages.passwordsettings(driver);
    TestModellerLogger.SetLastNodeGuid("42cbb920-381e-4c69-a8e0-5227b35bd2dd");
    _pagespasswordsettings.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("c27085c9-aae1-4e1b-a5fe-e9f8537447f1");
    _pagespasswordsettings.Enter_ctl00cPHtxtNewPassword("deepika");
    

    TestModellerLogger.SetLastNodeGuid("8572a7fc-e288-4769-abf7-16d6661dc496");
    _pagespasswordsettings.Enter_ctl00cPHtxtRetypePassword("deepika");
    

    TestModellerLogger.SetLastNodeGuid("6a4d2c58-9a4b-43a9-bdac-f683abca518c");
    _pagespasswordsettings.Click_SET_PASSWORD();
    

    TestModellerLogger.SetLastNodeGuid("e6606a44-fe92-4fc8-a8aa-b31077578feb");
    _pagespasswordsettings.Click_Skip();
    

pages.loginintoapplication _pagesloginintoapplication = new pages.loginintoapplication(driver);
    TestModellerLogger.SetLastNodeGuid("f2477d02-f18d-4952-b7cd-be6ccb5513f4");
    _pagesloginintoapplication.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("5fc019ee-2b87-4dad-a5ed-1968329f7e56");
    _pagesloginintoapplication.Enter_ctl00cPHlogin("rs9314157+47@gmail.com");
    

    TestModellerLogger.SetLastNodeGuid("64840e3d-0bf1-4d65-b506-ff81d7b8fefe");
    _pagesloginintoapplication.Enter_ctl00cPHpass("deepika");
    

    TestModellerLogger.SetLastNodeGuid("d9d34469-3843-42cf-8151-389e45df96fe");
    _pagesloginintoapplication.Click_Login();
    

    TestModellerLogger.SetLastNodeGuid("133e6c90-65b3-4928-b292-d7a39a83b246");
    _pagesloginintoapplication.Click_Skip();
    

    TestModellerLogger.SetLastNodeGuid("766c26f6-c968-41f6-9748-d2d91654b140");
    _pagesloginintoapplication.Click_Skip_1();
    

pages.subscribe _pagessubscribe = new pages.subscribe(driver);
    TestModellerLogger.SetLastNodeGuid("0e29423d-498c-4815-87c1-8e9c97810cd2");
    _pagessubscribe.GoToUrl();
    
//
//    TestModellerLogger.SetLastNodeGuid("bd3e4321-b823-42be-a8e4-532997da4838");
//    _pagessubscribe.Click__Subscribe();
//    
//
//    TestModellerLogger.SetLastNodeGuid("def36c02-7563-475c-98f5-92f4784e887e");
//    _pagessubscribe.Click__5_VAT();
    

    }

}
