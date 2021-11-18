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

//http://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/12e131f9-2712-417a-b1e0-a5fadc08ab5d
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 133, profileId = 100094)
public class Signupprocessscenario_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"8d2aa0ec-a5a9-4d60-8b3d-4faec7070979","Sign up process scenario","Sign up process scenario - Default Profile"})
    @TestModellerPath(guid = "8d2aa0ec-a5a9-4d60-8b3d-4faec7070979")
    public void GoToUrlClickFreeTrialPositiveEnterq3namePositiveEnterq3lnamePositiveEnterq3companyPositiveEnte1()
    {
        
        pages.Sign_up_Form _pagesSign_up_Form = new pages.Sign_up_Form(driver);
    TestModellerLogger.SetLastNodeGuid("b71ab0a2-5f40-4afc-b60f-e2e3a4d1a3f3");
    _pagesSign_up_Form.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("62551e24-0c20-4889-b0c8-67661341c7aa");
    _pagesSign_up_Form.Click_Free_Trial();
    

    TestModellerLogger.SetLastNodeGuid("55340145-a527-44ee-90eb-c15606785de1");
    _pagesSign_up_Form.Enter_q3name("deepanshu");
    

    TestModellerLogger.SetLastNodeGuid("2f64121a-fc0d-425d-8ee0-259fe01d605e");
    _pagesSign_up_Form.Enter_q3lname("arora");
    

    TestModellerLogger.SetLastNodeGuid("a5fdb6f8-2115-40a0-bfed-e79a3fca1e24");
    _pagesSign_up_Form.Enter_q3company("indian bulls");
    

    TestModellerLogger.SetLastNodeGuid("1a04ef69-9ba3-4d2c-9774-1da391da3991");
    _pagesSign_up_Form.Enter_q4email("deepanshue89@gmail.com");
    

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
    TestModellerLogger.SetLastNodeGuid("b54ceaff-b81d-4d0e-b8d1-546f63cdfbed");
    _pagesemail.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("36a7a729-b063-4793-a7e4-c97aec214631");
    _pagesemail.Enter_email("deepanshue89@gmail.com");
    

    TestModellerLogger.SetLastNodeGuid("4fab2c5d-7a97-4671-ad0f-724587a174db");
    _pagesemail.Click_Next();
    

    TestModellerLogger.SetLastNodeGuid("9a63e0f2-d118-4fd4-8054-b77858074dbc");
    _pagesemail.Enter_password("deepika1989#");
    

    TestModellerLogger.SetLastNodeGuid("f109b646-3597-4212-9921-a73f59efde54");
    _pagesemail.Click_Next();
    

    TestModellerLogger.SetLastNodeGuid("aa947c77-0122-4148-aa63-9bfb6b86a0dd");
    _pagesemail.Click_Nomisma();
    

    TestModellerLogger.SetLastNodeGuid("9cd8c230-c3d9-4c62-9c3d-0ea88725ec0b");
    _pagesemail.Click_Activate();
    

pages.passwordsettings _pagespasswordsettings = new pages.passwordsettings(driver);
    TestModellerLogger.SetLastNodeGuid("aa6e3a75-e791-49d8-a008-c0345aa39f86");
    _pagespasswordsettings.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("09b2a06a-6a24-4eda-9017-85518d53f6df");
    _pagespasswordsettings.Enter_ctl00cPHtxtNewPassword("deepika");
    

    TestModellerLogger.SetLastNodeGuid("bf6d3fed-ad38-4494-83e8-7fe942603b7b");
    _pagespasswordsettings.Enter_ctl00cPHtxtRetypePassword("deepika");
    

    TestModellerLogger.SetLastNodeGuid("2a0afcfe-3411-44ca-be64-53ba2aac292c");
    _pagespasswordsettings.Click_SET_PASSWORD();
    

pages.company_selection _pagescompany_selection = new pages.company_selection(driver);
    TestModellerLogger.SetLastNodeGuid("26a29129-45e6-4826-98aa-a3c76a453b5d");
    _pagescompany_selection.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("1d430a81-60a1-4dc4-a9be-e31029969e9c");
    _pagescompany_selection.Select_ctl00cPHddlCompanyType("Limited Company");
    

    TestModellerLogger.SetLastNodeGuid("788a9979-942c-4853-b3ed-714666616eb4");
    _pagescompany_selection.Enter_ctl00cPHtxtAddress1("Edgeware road");
    

    TestModellerLogger.SetLastNodeGuid("8bc870de-761c-4472-a80b-80a9b474afd2");
    _pagescompany_selection.Enter_ctl00cPHtxtAddress2("London");
    

    TestModellerLogger.SetLastNodeGuid("c22518ed-1975-4446-ba1f-61aca81279df");
    _pagescompany_selection.Enter_ctl00cPHtxtPostCode("E14 9PX");
    

    TestModellerLogger.SetLastNodeGuid("dd0e0b06-9a48-4265-b6e8-654ba414c0ee");
    _pagescompany_selection.Enter_ctl00cPHtxtWebsite("www.gmail.com");
    

    TestModellerLogger.SetLastNodeGuid("43d20f76-5cac-439a-9b37-9fba0fd0a928");
    _pagescompany_selection.Click_Save_Changes();
    

pages.loginintoapplication _pagesloginintoapplication = new pages.loginintoapplication(driver);
    TestModellerLogger.SetLastNodeGuid("f2477d02-f18d-4952-b7cd-be6ccb5513f4");
    _pagesloginintoapplication.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("5fc019ee-2b87-4dad-a5ed-1968329f7e56");
    _pagesloginintoapplication.Enter_ctl00cPHlogin("deepanshue89@gmail.com");
    

    TestModellerLogger.SetLastNodeGuid("64840e3d-0bf1-4d65-b506-ff81d7b8fefe");
    _pagesloginintoapplication.Enter_ctl00cPHpass("deepika");
    

    TestModellerLogger.SetLastNodeGuid("d9d34469-3843-42cf-8151-389e45df96fe");
    _pagesloginintoapplication.Click_Login();
    

    TestModellerLogger.SetLastNodeGuid("133e6c90-65b3-4928-b292-d7a39a83b246");
    _pagesloginintoapplication.Click_Skip();
    

    TestModellerLogger.SetLastNodeGuid("766c26f6-c968-41f6-9748-d2d91654b140");
    _pagesloginintoapplication.Click_Skip_1();
    

    }

    @Test  (groups= {"9c65baf4-3e90-461c-9580-08eb4700067b","Sign up process scenario","Sign up process scenario - Default Profile"}, enabled=false)
    @TestModellerPath(guid = "9c65baf4-3e90-461c-9580-08eb4700067b")
    public void GoToUrlClickFreeTrialPositiveEnterq3namePositiveEnterq3lnamePositiveEnterq3companyPositiveEnte2()
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
    

pages.email _pagesemail = new pages.email(driver);
    TestModellerLogger.SetLastNodeGuid("b54ceaff-b81d-4d0e-b8d1-546f63cdfbed");
    _pagesemail.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("36a7a729-b063-4793-a7e4-c97aec214631");
    _pagesemail.Enter_email("deepikaaryaofficial@gmail.com");
    

    TestModellerLogger.SetLastNodeGuid("4fab2c5d-7a97-4671-ad0f-724587a174db");
    _pagesemail.Click_Next();
    

    TestModellerLogger.SetLastNodeGuid("9a63e0f2-d118-4fd4-8054-b77858074dbc");
    _pagesemail.Enter_password("deepika1989");
    

    TestModellerLogger.SetLastNodeGuid("f109b646-3597-4212-9921-a73f59efde54");
    _pagesemail.Click_Next();
    

    TestModellerLogger.SetLastNodeGuid("aa947c77-0122-4148-aa63-9bfb6b86a0dd");
    _pagesemail.Click_Nomisma();
    

    TestModellerLogger.SetLastNodeGuid("9cd8c230-c3d9-4c62-9c3d-0ea88725ec0b");
    _pagesemail.Click_Activate();
    

pages.passwordsettings _pagespasswordsettings = new pages.passwordsettings(driver);
    TestModellerLogger.SetLastNodeGuid("aa6e3a75-e791-49d8-a008-c0345aa39f86");
    _pagespasswordsettings.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("09b2a06a-6a24-4eda-9017-85518d53f6df");
    _pagespasswordsettings.Enter_ctl00cPHtxtNewPassword("deepika");
    

    TestModellerLogger.SetLastNodeGuid("bf6d3fed-ad38-4494-83e8-7fe942603b7b");
    _pagespasswordsettings.Enter_ctl00cPHtxtRetypePassword("deepika");
    

    TestModellerLogger.SetLastNodeGuid("2a0afcfe-3411-44ca-be64-53ba2aac292c");
    _pagespasswordsettings.Click_SET_PASSWORD();
    

pages.company_selection _pagescompany_selection = new pages.company_selection(driver);
    TestModellerLogger.SetLastNodeGuid("26a29129-45e6-4826-98aa-a3c76a453b5d");
    _pagescompany_selection.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("1d430a81-60a1-4dc4-a9be-e31029969e9c");
    _pagescompany_selection.Select_ctl00cPHddlCompanyType("Sole Trader");
    

    TestModellerLogger.SetLastNodeGuid("788a9979-942c-4853-b3ed-714666616eb4");
    _pagescompany_selection.Enter_ctl00cPHtxtAddress1("Edgeware road");
    

    TestModellerLogger.SetLastNodeGuid("8bc870de-761c-4472-a80b-80a9b474afd2");
    _pagescompany_selection.Enter_ctl00cPHtxtAddress2("London");
    

    TestModellerLogger.SetLastNodeGuid("c22518ed-1975-4446-ba1f-61aca81279df");
    _pagescompany_selection.Enter_ctl00cPHtxtPostCode("E14 9PX");
    

    TestModellerLogger.SetLastNodeGuid("dd0e0b06-9a48-4265-b6e8-654ba414c0ee");
    _pagescompany_selection.Enter_ctl00cPHtxtWebsite("www.gmail.com");
    

    TestModellerLogger.SetLastNodeGuid("43d20f76-5cac-439a-9b37-9fba0fd0a928");
    _pagescompany_selection.Click_Save_Changes();
    

pages.loginintoapplication _pagesloginintoapplication = new pages.loginintoapplication(driver);
    TestModellerLogger.SetLastNodeGuid("f2477d02-f18d-4952-b7cd-be6ccb5513f4");
    _pagesloginintoapplication.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("5fc019ee-2b87-4dad-a5ed-1968329f7e56");
    _pagesloginintoapplication.Enter_ctl00cPHlogin("dummye89@gmail.com");
    

    TestModellerLogger.SetLastNodeGuid("64840e3d-0bf1-4d65-b506-ff81d7b8fefe");
    _pagesloginintoapplication.Enter_ctl00cPHpass("deepika");
    

    TestModellerLogger.SetLastNodeGuid("d9d34469-3843-42cf-8151-389e45df96fe");
    _pagesloginintoapplication.Click_Login();
    

    TestModellerLogger.SetLastNodeGuid("133e6c90-65b3-4928-b292-d7a39a83b246");
    _pagesloginintoapplication.Click_Skip();
    

    TestModellerLogger.SetLastNodeGuid("766c26f6-c968-41f6-9748-d2d91654b140");
    _pagesloginintoapplication.Click_Skip_1();
    

    }

    @Test  (groups= {"6b7d2cfb-fe56-46d2-b090-bbc7e555d82e","Sign up process scenario","Sign up process scenario - Default Profile"},enabled=false)
    @TestModellerPath(guid = "6b7d2cfb-fe56-46d2-b090-bbc7e555d82e")
    public void GoToUrlClickFreeTrialPositiveEnterq3namePositiveEnterq3lnamePositiveEnterq3companyPositiveEnte3()
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
    

pages.email _pagesemail = new pages.email(driver);
    TestModellerLogger.SetLastNodeGuid("b54ceaff-b81d-4d0e-b8d1-546f63cdfbed");
    _pagesemail.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("36a7a729-b063-4793-a7e4-c97aec214631");
    _pagesemail.Enter_email("deepikaaryaofficial@gmail.com");
    

    TestModellerLogger.SetLastNodeGuid("4fab2c5d-7a97-4671-ad0f-724587a174db");
    _pagesemail.Click_Next();
    

    TestModellerLogger.SetLastNodeGuid("9a63e0f2-d118-4fd4-8054-b77858074dbc");
    _pagesemail.Enter_password("deepika1989");
    

    TestModellerLogger.SetLastNodeGuid("f109b646-3597-4212-9921-a73f59efde54");
    _pagesemail.Click_Next();
    

    TestModellerLogger.SetLastNodeGuid("aa947c77-0122-4148-aa63-9bfb6b86a0dd");
    _pagesemail.Click_Nomisma();
    

    TestModellerLogger.SetLastNodeGuid("9cd8c230-c3d9-4c62-9c3d-0ea88725ec0b");
    _pagesemail.Click_Activate();
    

pages.passwordsettings _pagespasswordsettings = new pages.passwordsettings(driver);
    TestModellerLogger.SetLastNodeGuid("aa6e3a75-e791-49d8-a008-c0345aa39f86");
    _pagespasswordsettings.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("09b2a06a-6a24-4eda-9017-85518d53f6df");
    _pagespasswordsettings.Enter_ctl00cPHtxtNewPassword("deepika");
    

    TestModellerLogger.SetLastNodeGuid("bf6d3fed-ad38-4494-83e8-7fe942603b7b");
    _pagespasswordsettings.Enter_ctl00cPHtxtRetypePassword("deepika");
    

    TestModellerLogger.SetLastNodeGuid("2a0afcfe-3411-44ca-be64-53ba2aac292c");
    _pagespasswordsettings.Click_SET_PASSWORD();
    

pages.company_selection _pagescompany_selection = new pages.company_selection(driver);
    TestModellerLogger.SetLastNodeGuid("26a29129-45e6-4826-98aa-a3c76a453b5d");
    _pagescompany_selection.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("1d430a81-60a1-4dc4-a9be-e31029969e9c");
    _pagescompany_selection.Select_ctl00cPHddlCompanyType("Partnership");
    

    TestModellerLogger.SetLastNodeGuid("788a9979-942c-4853-b3ed-714666616eb4");
    _pagescompany_selection.Enter_ctl00cPHtxtAddress1("Edgeware road");
    

    TestModellerLogger.SetLastNodeGuid("8bc870de-761c-4472-a80b-80a9b474afd2");
    _pagescompany_selection.Enter_ctl00cPHtxtAddress2("London");
    

    TestModellerLogger.SetLastNodeGuid("c22518ed-1975-4446-ba1f-61aca81279df");
    _pagescompany_selection.Enter_ctl00cPHtxtPostCode("E14 9PX");
    

    TestModellerLogger.SetLastNodeGuid("dd0e0b06-9a48-4265-b6e8-654ba414c0ee");
    _pagescompany_selection.Enter_ctl00cPHtxtWebsite("www.gmail.com");
    

    TestModellerLogger.SetLastNodeGuid("43d20f76-5cac-439a-9b37-9fba0fd0a928");
    _pagescompany_selection.Click_Save_Changes();
    

pages.loginintoapplication _pagesloginintoapplication = new pages.loginintoapplication(driver);
    TestModellerLogger.SetLastNodeGuid("f2477d02-f18d-4952-b7cd-be6ccb5513f4");
    _pagesloginintoapplication.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("5fc019ee-2b87-4dad-a5ed-1968329f7e56");
    _pagesloginintoapplication.Enter_ctl00cPHlogin("dummye89@gmail.com");
    

    TestModellerLogger.SetLastNodeGuid("64840e3d-0bf1-4d65-b506-ff81d7b8fefe");
    _pagesloginintoapplication.Enter_ctl00cPHpass("deepika");
    

    TestModellerLogger.SetLastNodeGuid("d9d34469-3843-42cf-8151-389e45df96fe");
    _pagesloginintoapplication.Click_Login();
    

    TestModellerLogger.SetLastNodeGuid("133e6c90-65b3-4928-b292-d7a39a83b246");
    _pagesloginintoapplication.Click_Skip();
    

    TestModellerLogger.SetLastNodeGuid("766c26f6-c968-41f6-9748-d2d91654b140");
    _pagesloginintoapplication.Click_Skip_1();
    

    }

    @Test  (groups= {"514b6f62-b498-4161-9588-03d798fb7629","Sign up process scenario","Sign up process scenario - Default Profile"}, enabled=false)
    @TestModellerPath(guid = "514b6f62-b498-4161-9588-03d798fb7629")
    public void GoToUrlClickFreeTrialPositiveEnterq3namePositiveEnterq3lnamePositiveEnterq3companyPositiveEnte4()
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
    

pages.email _pagesemail = new pages.email(driver);
    TestModellerLogger.SetLastNodeGuid("b54ceaff-b81d-4d0e-b8d1-546f63cdfbed");
    _pagesemail.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("36a7a729-b063-4793-a7e4-c97aec214631");
    _pagesemail.Enter_email("deepikaaryaofficial@gmail.com");
    

    TestModellerLogger.SetLastNodeGuid("4fab2c5d-7a97-4671-ad0f-724587a174db");
    _pagesemail.Click_Next();
    

    TestModellerLogger.SetLastNodeGuid("9a63e0f2-d118-4fd4-8054-b77858074dbc");
    _pagesemail.Enter_password("deepika1989");
    

    TestModellerLogger.SetLastNodeGuid("f109b646-3597-4212-9921-a73f59efde54");
    _pagesemail.Click_Next();
    

    TestModellerLogger.SetLastNodeGuid("aa947c77-0122-4148-aa63-9bfb6b86a0dd");
    _pagesemail.Click_Nomisma();
    

    TestModellerLogger.SetLastNodeGuid("9cd8c230-c3d9-4c62-9c3d-0ea88725ec0b");
    _pagesemail.Click_Activate();
    

pages.passwordsettings _pagespasswordsettings = new pages.passwordsettings(driver);
    TestModellerLogger.SetLastNodeGuid("aa6e3a75-e791-49d8-a008-c0345aa39f86");
    _pagespasswordsettings.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("09b2a06a-6a24-4eda-9017-85518d53f6df");
    _pagespasswordsettings.Enter_ctl00cPHtxtNewPassword("deepika");
    

    TestModellerLogger.SetLastNodeGuid("bf6d3fed-ad38-4494-83e8-7fe942603b7b");
    _pagespasswordsettings.Enter_ctl00cPHtxtRetypePassword("deepika");
    

    TestModellerLogger.SetLastNodeGuid("2a0afcfe-3411-44ca-be64-53ba2aac292c");
    _pagespasswordsettings.Click_SET_PASSWORD();
    

pages.company_selection _pagescompany_selection = new pages.company_selection(driver);
    TestModellerLogger.SetLastNodeGuid("26a29129-45e6-4826-98aa-a3c76a453b5d");
    _pagescompany_selection.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("1d430a81-60a1-4dc4-a9be-e31029969e9c");
    _pagescompany_selection.Select_ctl00cPHddlCompanyType("LLP");
    

    TestModellerLogger.SetLastNodeGuid("788a9979-942c-4853-b3ed-714666616eb4");
    _pagescompany_selection.Enter_ctl00cPHtxtAddress1("Edgeware road");
    

    TestModellerLogger.SetLastNodeGuid("8bc870de-761c-4472-a80b-80a9b474afd2");
    _pagescompany_selection.Enter_ctl00cPHtxtAddress2("London");
    

    TestModellerLogger.SetLastNodeGuid("c22518ed-1975-4446-ba1f-61aca81279df");
    _pagescompany_selection.Enter_ctl00cPHtxtPostCode("E14 9PX");
    

    TestModellerLogger.SetLastNodeGuid("dd0e0b06-9a48-4265-b6e8-654ba414c0ee");
    _pagescompany_selection.Enter_ctl00cPHtxtWebsite("www.gmail.com");
    

    TestModellerLogger.SetLastNodeGuid("43d20f76-5cac-439a-9b37-9fba0fd0a928");
    _pagescompany_selection.Click_Save_Changes();
    

pages.loginintoapplication _pagesloginintoapplication = new pages.loginintoapplication(driver);
    TestModellerLogger.SetLastNodeGuid("f2477d02-f18d-4952-b7cd-be6ccb5513f4");
    _pagesloginintoapplication.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("5fc019ee-2b87-4dad-a5ed-1968329f7e56");
    _pagesloginintoapplication.Enter_ctl00cPHlogin("dummye89@gmail.com");
    

    TestModellerLogger.SetLastNodeGuid("64840e3d-0bf1-4d65-b506-ff81d7b8fefe");
    _pagesloginintoapplication.Enter_ctl00cPHpass("deepika");
    

    TestModellerLogger.SetLastNodeGuid("d9d34469-3843-42cf-8151-389e45df96fe");
    _pagesloginintoapplication.Click_Login();
    

    TestModellerLogger.SetLastNodeGuid("133e6c90-65b3-4928-b292-d7a39a83b246");
    _pagesloginintoapplication.Click_Skip();
    

    TestModellerLogger.SetLastNodeGuid("766c26f6-c968-41f6-9748-d2d91654b140");
    _pagesloginintoapplication.Click_Skip_1();
    

    }

    @Test  (groups= {"1d3feaff-7a28-40b1-ab76-652b5107f979","Sign up process scenario","Sign up process scenario - Default Profile"},enabled=false)
    @TestModellerPath(guid = "1d3feaff-7a28-40b1-ab76-652b5107f979")
    public void GoToUrlClickFreeTrialPositiveEnterq3namePositiveEnterq3lnamePositiveEnterq3companyPositiveEnte5()
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
    

pages.email _pagesemail = new pages.email(driver);
    TestModellerLogger.SetLastNodeGuid("b54ceaff-b81d-4d0e-b8d1-546f63cdfbed");
    _pagesemail.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("36a7a729-b063-4793-a7e4-c97aec214631");
    _pagesemail.Enter_email("deepikaaryaofficial@gmail.com");
    

    TestModellerLogger.SetLastNodeGuid("4fab2c5d-7a97-4671-ad0f-724587a174db");
    _pagesemail.Click_Next();
    

    TestModellerLogger.SetLastNodeGuid("9a63e0f2-d118-4fd4-8054-b77858074dbc");
    _pagesemail.Enter_password("deepika1989");
    

    TestModellerLogger.SetLastNodeGuid("f109b646-3597-4212-9921-a73f59efde54");
    _pagesemail.Click_Next();
    

    TestModellerLogger.SetLastNodeGuid("aa947c77-0122-4148-aa63-9bfb6b86a0dd");
    _pagesemail.Click_Nomisma();
    

    TestModellerLogger.SetLastNodeGuid("9cd8c230-c3d9-4c62-9c3d-0ea88725ec0b");
    _pagesemail.Click_Activate();
    

pages.passwordsettings _pagespasswordsettings = new pages.passwordsettings(driver);
    TestModellerLogger.SetLastNodeGuid("aa6e3a75-e791-49d8-a008-c0345aa39f86");
    _pagespasswordsettings.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("09b2a06a-6a24-4eda-9017-85518d53f6df");
    _pagespasswordsettings.Enter_ctl00cPHtxtNewPassword("deepika");
    

    TestModellerLogger.SetLastNodeGuid("bf6d3fed-ad38-4494-83e8-7fe942603b7b");
    _pagespasswordsettings.Enter_ctl00cPHtxtRetypePassword("deepika");
    

    TestModellerLogger.SetLastNodeGuid("2a0afcfe-3411-44ca-be64-53ba2aac292c");
    _pagespasswordsettings.Click_SET_PASSWORD();
    

pages.company_selection _pagescompany_selection = new pages.company_selection(driver);
    TestModellerLogger.SetLastNodeGuid("26a29129-45e6-4826-98aa-a3c76a453b5d");
    _pagescompany_selection.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("1d430a81-60a1-4dc4-a9be-e31029969e9c");
    _pagescompany_selection.Select_ctl00cPHddlCompanyType("PLC");
    

    TestModellerLogger.SetLastNodeGuid("788a9979-942c-4853-b3ed-714666616eb4");
    _pagescompany_selection.Enter_ctl00cPHtxtAddress1("Edgeware road");
    

    TestModellerLogger.SetLastNodeGuid("8bc870de-761c-4472-a80b-80a9b474afd2");
    _pagescompany_selection.Enter_ctl00cPHtxtAddress2("London");
    

    TestModellerLogger.SetLastNodeGuid("c22518ed-1975-4446-ba1f-61aca81279df");
    _pagescompany_selection.Enter_ctl00cPHtxtPostCode("E14 9PX");
    

    TestModellerLogger.SetLastNodeGuid("dd0e0b06-9a48-4265-b6e8-654ba414c0ee");
    _pagescompany_selection.Enter_ctl00cPHtxtWebsite("www.gmail.com");
    

    TestModellerLogger.SetLastNodeGuid("43d20f76-5cac-439a-9b37-9fba0fd0a928");
    _pagescompany_selection.Click_Save_Changes();
    

pages.loginintoapplication _pagesloginintoapplication = new pages.loginintoapplication(driver);
    TestModellerLogger.SetLastNodeGuid("f2477d02-f18d-4952-b7cd-be6ccb5513f4");
    _pagesloginintoapplication.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("5fc019ee-2b87-4dad-a5ed-1968329f7e56");
    _pagesloginintoapplication.Enter_ctl00cPHlogin("dummye89@gmail.com");
    

    TestModellerLogger.SetLastNodeGuid("64840e3d-0bf1-4d65-b506-ff81d7b8fefe");
    _pagesloginintoapplication.Enter_ctl00cPHpass("deepika");
    

    TestModellerLogger.SetLastNodeGuid("d9d34469-3843-42cf-8151-389e45df96fe");
    _pagesloginintoapplication.Click_Login();
    

    TestModellerLogger.SetLastNodeGuid("133e6c90-65b3-4928-b292-d7a39a83b246");
    _pagesloginintoapplication.Click_Skip();
    

    TestModellerLogger.SetLastNodeGuid("766c26f6-c968-41f6-9748-d2d91654b140");
    _pagesloginintoapplication.Click_Skip_1();
    

    }

    @Test  (groups= {"94b7647f-6200-4223-b086-c908c178b2ec","Sign up process scenario","Sign up process scenario - Default Profile"},enabled=false)
    @TestModellerPath(guid = "94b7647f-6200-4223-b086-c908c178b2ec")
    public void GoToUrlClickFreeTrialPositiveEnterq3namePositiveEnterq3lnamePositiveEnterq3companyPositiveEnte6()
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
    

pages.email _pagesemail = new pages.email(driver);
    TestModellerLogger.SetLastNodeGuid("b54ceaff-b81d-4d0e-b8d1-546f63cdfbed");
    _pagesemail.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("36a7a729-b063-4793-a7e4-c97aec214631");
    _pagesemail.Enter_email("deepikaaryaofficial@gmail.com");
    

    TestModellerLogger.SetLastNodeGuid("4fab2c5d-7a97-4671-ad0f-724587a174db");
    _pagesemail.Click_Next();
    

    TestModellerLogger.SetLastNodeGuid("9a63e0f2-d118-4fd4-8054-b77858074dbc");
    _pagesemail.Enter_password("deepika1989");
    

    TestModellerLogger.SetLastNodeGuid("f109b646-3597-4212-9921-a73f59efde54");
    _pagesemail.Click_Next();
    

    TestModellerLogger.SetLastNodeGuid("aa947c77-0122-4148-aa63-9bfb6b86a0dd");
    _pagesemail.Click_Nomisma();
    

    TestModellerLogger.SetLastNodeGuid("9cd8c230-c3d9-4c62-9c3d-0ea88725ec0b");
    _pagesemail.Click_Activate();
    

pages.passwordsettings _pagespasswordsettings = new pages.passwordsettings(driver);
    TestModellerLogger.SetLastNodeGuid("aa6e3a75-e791-49d8-a008-c0345aa39f86");
    _pagespasswordsettings.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("09b2a06a-6a24-4eda-9017-85518d53f6df");
    _pagespasswordsettings.Enter_ctl00cPHtxtNewPassword("deepika");
    

    TestModellerLogger.SetLastNodeGuid("bf6d3fed-ad38-4494-83e8-7fe942603b7b");
    _pagespasswordsettings.Enter_ctl00cPHtxtRetypePassword("deepika");
    

    TestModellerLogger.SetLastNodeGuid("2a0afcfe-3411-44ca-be64-53ba2aac292c");
    _pagespasswordsettings.Click_SET_PASSWORD();
    

pages.company_selection _pagescompany_selection = new pages.company_selection(driver);
    TestModellerLogger.SetLastNodeGuid("26a29129-45e6-4826-98aa-a3c76a453b5d");
    _pagescompany_selection.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("1d430a81-60a1-4dc4-a9be-e31029969e9c");
    _pagescompany_selection.Select_ctl00cPHddlCompanyType("Limited Company");
    

    TestModellerLogger.SetLastNodeGuid("788a9979-942c-4853-b3ed-714666616eb4");
    _pagescompany_selection.Enter_ctl00cPHtxtAddress1("Edgeware road");
    

    TestModellerLogger.SetLastNodeGuid("8bc870de-761c-4472-a80b-80a9b474afd2");
    _pagescompany_selection.Enter_ctl00cPHtxtAddress2("London");
    

    TestModellerLogger.SetLastNodeGuid("c22518ed-1975-4446-ba1f-61aca81279df");
    _pagescompany_selection.Enter_ctl00cPHtxtPostCode("E14 9PX");
    

    TestModellerLogger.SetLastNodeGuid("dd0e0b06-9a48-4265-b6e8-654ba414c0ee");
    _pagescompany_selection.Enter_ctl00cPHtxtWebsite("www.gmail.com");
    

    TestModellerLogger.SetLastNodeGuid("43d20f76-5cac-439a-9b37-9fba0fd0a928");
    _pagescompany_selection.Click_Save_Changes();
    

pages.loginintoapplication _pagesloginintoapplication = new pages.loginintoapplication(driver);
    TestModellerLogger.SetLastNodeGuid("f2477d02-f18d-4952-b7cd-be6ccb5513f4");
    _pagesloginintoapplication.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("5fc019ee-2b87-4dad-a5ed-1968329f7e56");
    _pagesloginintoapplication.Enter_ctl00cPHlogin("dummye89@gmail.com");
    

    TestModellerLogger.SetLastNodeGuid("64840e3d-0bf1-4d65-b506-ff81d7b8fefe");
    _pagesloginintoapplication.Enter_ctl00cPHpass("deepika");
    

    TestModellerLogger.SetLastNodeGuid("d9d34469-3843-42cf-8151-389e45df96fe");
    _pagesloginintoapplication.Click_Login();
    

    TestModellerLogger.SetLastNodeGuid("133e6c90-65b3-4928-b292-d7a39a83b246");
    _pagesloginintoapplication.Click_Skip();
    

    TestModellerLogger.SetLastNodeGuid("766c26f6-c968-41f6-9748-d2d91654b140");
    _pagesloginintoapplication.Click_Skip_1();
    

    }

}
