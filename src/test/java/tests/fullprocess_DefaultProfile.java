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

//http://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/fcbab2df-878e-495e-a6eb-7641fb886776
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 125, profileId = 100085)
public class fullprocess_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"5ed51306-33e9-475b-8558-c35a57d11845","full process","full process - Default Profile"})
    @TestModellerPath(guid = "5ed51306-33e9-475b-8558-c35a57d11845")
    public void GoToUrlClickFreeTrialPositiveEnterq3namePositiveEnterq3lnamePositiveEnterq3companyPositiveEnte()
    {
        
        pages.Sign_up_Form _pagesSign_up_Form = new pages.Sign_up_Form(driver);
    TestModellerLogger.SetLastNodeGuid("b71ab0a2-5f40-4afc-b60f-e2e3a4d1a3f3");
    _pagesSign_up_Form.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("62551e24-0c20-4889-b0c8-67661341c7aa");
    _pagesSign_up_Form.Click_Free_Trial(); 
    

    TestModellerLogger.SetLastNodeGuid("55340145-a527-44ee-90eb-c15606785de1");
    _pagesSign_up_Form.Enter_q3name("rashmi");
    

    TestModellerLogger.SetLastNodeGuid("2f64121a-fc0d-425d-8ee0-259fe01d605e");
    _pagesSign_up_Form.Enter_q3lname("sharma");
    

    TestModellerLogger.SetLastNodeGuid("a5fdb6f8-2115-40a0-bfed-e79a3fca1e24");
    _pagesSign_up_Form.Enter_q3company("indian bulls");
    

    TestModellerLogger.SetLastNodeGuid("1a04ef69-9ba3-4d2c-9774-1da391da3991");
    _pagesSign_up_Form.Enter_q4email("rs9314157+1@gmail.com");
    

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
    _pagesemail.Enter_email("rs9314157@gmail.com");
    

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
//    TestModellerLogger.SetLastNodeGuid("42cbb920-381e-4c69-a8e0-5227b35bd2dd");
//    _pagespasswordsettings.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("c27085c9-aae1-4e1b-a5fe-e9f8537447f1");
//    _pagespasswordsettings.Enter_ctl00cPHtxtNewPassword("deepika");
//    
//
//    TestModellerLogger.SetLastNodeGuid("8572a7fc-e288-4769-abf7-16d6661dc496");
//    _pagespasswordsettings.Enter_ctl00cPHtxtRetypePassword("deepika");
//    
//
//    TestModellerLogger.SetLastNodeGuid("6a4d2c58-9a4b-43a9-bdac-f683abca518c");
//    _pagespasswordsettings.Click_SET_PASSWORD();
//    
//
//    TestModellerLogger.SetLastNodeGuid("e6606a44-fe92-4fc8-a8aa-b31077578feb");
//    _pagespasswordsettings.Click_Skip();
//    
//
//pages.loginintoapplication _pagesloginintoapplication = new pages.loginintoapplication(driver);
//    TestModellerLogger.SetLastNodeGuid("f2477d02-f18d-4952-b7cd-be6ccb5513f4");
//    _pagesloginintoapplication.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("5fc019ee-2b87-4dad-a5ed-1968329f7e56");
//    _pagesloginintoapplication.Enter_ctl00cPHlogin("rs9314157+1@gmail.com");
//    
//
//    TestModellerLogger.SetLastNodeGuid("64840e3d-0bf1-4d65-b506-ff81d7b8fefe");
//    _pagesloginintoapplication.Enter_ctl00cPHpass("deepika");
//    
//
//    TestModellerLogger.SetLastNodeGuid("d9d34469-3843-42cf-8151-389e45df96fe");
//    _pagesloginintoapplication.Click_Login();
//    
//
//    TestModellerLogger.SetLastNodeGuid("133e6c90-65b3-4928-b292-d7a39a83b246");
//    _pagesloginintoapplication.Click_Skip();
//    
//
//    TestModellerLogger.SetLastNodeGuid("766c26f6-c968-41f6-9748-d2d91654b140");
//    _pagesloginintoapplication.Click_Skip_1();
//    
//
  }

}
