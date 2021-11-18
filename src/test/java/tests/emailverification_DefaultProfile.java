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

//http://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/bf9cd429-8307-44de-800c-3d9b38c5ef70
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 122, profileId = 100075)
public class emailverification_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"9dc76ff2-28c4-4e6e-8aec-4535e1ab70b6","email; verification","email; verification - Default Profile"})
    @TestModellerPath(guid = "9dc76ff2-28c4-4e6e-8aec-4535e1ab70b6")
    public void GoToUrlPositiveEnteremailClickNextPositiveEnterpasswordClickNextClickNomismaClickActivateact()
    {
        
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
    

    }

}
