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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/30ce655b-767a-4cbc-be00-e29a53010e9a
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1677, profileId = 101961)
public class Businesssignupnew_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"Business sign up new","Business sign up new - Default Profile"})
    @TestModellerPath(guid = "496a4208-4d80-42dd-a156-b4a4d60fa09c")
    public void GoToUrlClickFreeTrialPositiveEnterNameFirstPositiveEnterNameLastPositiveEnterPhoneNumbercountry()
    {
        
        pages.sign_up_form_new _sign_up_form_new = new pages.sign_up_form_new(driver);
    TestModellerLogger.SetLastNodeGuid("369539a2-a358-4804-98e3-62badd999d0a");
    _sign_up_form_new.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("8671f1b1-11fc-4eb6-a2e4-80cf8ba46bd7");
    _sign_up_form_new.Click_Free_Trial();
    
//    TestModellerLogger.SetLastNodeGuid("369539a2-a358-4804-98e3-62badd999d0a");
//    _sign_up_form_new.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("dfe9b2eb-cd71-486f-b5aa-35cd44d07f44");
    _sign_up_form_new.Enter_Name_First("sally");
    

    TestModellerLogger.SetLastNodeGuid("4b0520c0-1d90-4420-8ef1-4c7855185119");
    _sign_up_form_new.Enter_Name_Last("shah");
    

    TestModellerLogger.SetLastNodeGuid("fc1f2a47-d3fa-4d74-8c5f-809d6689a850");
    _sign_up_form_new.Enter_PhoneNumber_countrycode("0123456789");
    

    TestModellerLogger.SetLastNodeGuid("478bb9e7-0a89-4a7a-aa74-372917d95253");
    _sign_up_form_new.Enter_Email("as3354179+1@gmail.com");
    

    TestModellerLogger.SetLastNodeGuid("9765aa78-819f-4614-b5b7-daf47b3ec2da");
    _sign_up_form_new.Select_Dropdown("Other (non-accountancy)");
    

    TestModellerLogger.SetLastNodeGuid("cab3ccfb-20ed-4301-a7e5-f2b325e2cc8d");
    _sign_up_form_new.Enter_SingleLine1("Bioinfotech ltd");
    

    TestModellerLogger.SetLastNodeGuid("5899aad6-1146-4dd7-8546-d3dae2cd3356");
    _sign_up_form_new.Click_I_have_read_and_agree_to_Nomismas_terms_conditions_and_privacy_policy_();
    

    TestModellerLogger.SetLastNodeGuid("30538934-9aa1-4378-a2a0-f2ed59374aef");
    _sign_up_form_new.Click_Submit();
    

pages.email _email = new pages.email(driver);
    TestModellerLogger.SetLastNodeGuid("a7d3ce96-6caf-48ee-bbd8-c45f609bd1c4");
    _email.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("0d196af8-4cfb-4758-a88d-37e224549c92");
    _email.Enter_email("as3354179@gmail.com");
    

    TestModellerLogger.SetLastNodeGuid("b735d837-edf4-43a9-888e-7f885a9c4800");
    _email.Click_Next();
    

    TestModellerLogger.SetLastNodeGuid("faece326-09cc-430e-9092-bf44e4e4ca7b");
    _email.Enter_password("deepika1989#");
    

    TestModellerLogger.SetLastNodeGuid("5cf78aeb-bb6b-4ce2-a464-a1236d6af434");
    _email.Click_Next1();
    

//    TestModellerLogger.SetLastNodeGuid("2f326f8e-fc94-4bbe-aa1e-d82293d5e414");
//    _email.Click_Nomisma();
//    
//
//    TestModellerLogger.SetLastNodeGuid("284c27a5-6205-486e-a7f8-2c3a6f999618");
//    _email.Click_Activate();
//    
//
//pages.email_verification _email_verification = new pages.email_verification(driver);
//    TestModellerLogger.SetLastNodeGuid("af2c62a8-09a7-422a-a3f2-3f32c24969c7");
//    _email_verification.Switch_Tab();
//    
//
//pages.passwordsettings _passwordsettings = new pages.passwordsettings(driver);
//    TestModellerLogger.SetLastNodeGuid("42cbb920-381e-4c69-a8e0-5227b35bd2dd");
//    _passwordsettings.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("c27085c9-aae1-4e1b-a5fe-e9f8537447f1");
//    _passwordsettings.Enter_ctl00cPHtxtNewPassword("deepika");
//    
//
//    TestModellerLogger.SetLastNodeGuid("8572a7fc-e288-4769-abf7-16d6661dc496");
//    _passwordsettings.Enter_ctl00cPHtxtRetypePassword("deepika");
//    
//
//    TestModellerLogger.SetLastNodeGuid("6a4d2c58-9a4b-43a9-bdac-f683abca518c");
//    _passwordsettings.Click_SET_PASSWORD();
//    
//
//    TestModellerLogger.SetLastNodeGuid("e6606a44-fe92-4fc8-a8aa-b31077578feb");
//    _passwordsettings.Click_Skip();
//    
//
//pages.loginintoapplication _loginintoapplication = new pages.loginintoapplication(driver);
//    TestModellerLogger.SetLastNodeGuid("f2477d02-f18d-4952-b7cd-be6ccb5513f4");
//    _loginintoapplication.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("5fc019ee-2b87-4dad-a5ed-1968329f7e56");
//    _loginintoapplication.Enter_ctl00cPHlogin("as3354179@gmail.com");
//    
//
//    TestModellerLogger.SetLastNodeGuid("64840e3d-0bf1-4d65-b506-ff81d7b8fefe");
//    _loginintoapplication.Enter_ctl00cPHpass("deepika");
//    
//
//    TestModellerLogger.SetLastNodeGuid("d9d34469-3843-42cf-8151-389e45df96fe");
//    _loginintoapplication.Click_Login();
//    
//
//    TestModellerLogger.SetLastNodeGuid("133e6c90-65b3-4928-b292-d7a39a83b246");
//    _loginintoapplication.Click_Skip();
//    
//
//    TestModellerLogger.SetLastNodeGuid("766c26f6-c968-41f6-9748-d2d91654b140");
//    _loginintoapplication.Click_Skip_1();
//    
//
//pages.subscribe_new _subscribe_new = new pages.subscribe_new(driver);
//    TestModellerLogger.SetLastNodeGuid("1b5910a7-a8da-4855-b4f4-3383624f25f0");
//    _subscribe_new.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("dd940423-5e87-4907-b2ab-3cc12a84162a");
//    _subscribe_new.Click__Subscribe();
//    
//
//    TestModellerLogger.SetLastNodeGuid("2357883b-3431-40b3-9ad2-7a0e6ad75f30");
//    _subscribe_new.Click__Bookkeep();
//    
//
//    TestModellerLogger.SetLastNodeGuid("9bf1e6df-c02b-456b-a992-28cb40692844");
//    _subscribe_new.Enter_xPath_idfullName("sally");
//    
//
//    TestModellerLogger.SetLastNodeGuid("19352187-522f-4f95-9ea7-0a17abe53a8e");
//    _subscribe_new.Click_I_Agree();
//    
//
//    TestModellerLogger.SetLastNodeGuid("32d168da-51b7-4a64-842c-245061bfe5af");
//    _subscribe_new.Click_Pay_with_Card();
    

    }

}
