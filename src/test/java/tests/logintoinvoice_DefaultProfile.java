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

//http://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/746d8d73-8d56-4ae8-99ba-09761f7c87bd
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 210, profileId = 100164)
public class logintoinvoice_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"2d566ed3-e8f2-41a6-9c08-5142dca962a1","login to invoice","login to invoice - Default Profile"})
    @TestModellerPath(guid = "2d566ed3-e8f2-41a6-9c08-5142dca962a1")
    public void GoToUrlpositiveenterusernamepositiveenterpasswordClickLoginsuccessGoToUrlpositiveagentnameCl()
    {
        
        pages.login _pageslogin = new pages.login(driver);
    TestModellerLogger.SetLastNodeGuid("854a1118-4615-4409-996b-51f957f4b121");
    _pageslogin.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("5f78d4ec-ef66-42ec-80d3-bff428d78f7b");
    _pageslogin.Enter_ctl00cPHlogin("admin");
    

    TestModellerLogger.SetLastNodeGuid("98e3f377-efb7-4010-8f3a-04d5a7749cae");
    _pageslogin.Enter_ctl00cPHpass("nomisma@testr");
    

    TestModellerLogger.SetLastNodeGuid("0ac50b8f-4ab4-4855-a348-232e96ddfd82");
    _pageslogin.Click_Login();
    

pages.Agent_page _pagesAgent_page = new pages.Agent_page(driver);
    TestModellerLogger.SetLastNodeGuid("5ca4399f-c2c9-4907-89c2-1f3a8c74b5e9");
    _pagesAgent_page.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("d1774d2f-8a96-4065-b7ad-7564424df697");
    _pagesAgent_page.Enter_ctl00cPHFiltertxtAgentName("deepika");
    

    TestModellerLogger.SetLastNodeGuid("12624eac-97ad-4461-a189-3bdf32926acf");
    _pagesAgent_page.Click_Search();
    

    TestModellerLogger.SetLastNodeGuid("86d6d989-b955-473d-b918-1371760f1e7f");
    _pagesAgent_page.Click__Deepika_();
    

    TestModellerLogger.SetLastNodeGuid("fe49d2c8-15b6-4831-89b7-b3aa4fe86ec1");
    _pagesAgent_page.Switch_Tab();
    

pages.Business_navigation _pagesBusiness_navigation = new pages.Business_navigation(driver);
    TestModellerLogger.SetLastNodeGuid("e4687602-1649-458e-98d6-5fd251e617a7");
    _pagesBusiness_navigation.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("814387e0-8392-4488-9a17-4455bc12fd85");
    _pagesBusiness_navigation.Click_Businesses();
    

    TestModellerLogger.SetLastNodeGuid("cc3b282b-3edd-4a58-b6a6-be910ce651c0");
    _pagesBusiness_navigation.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("lexagen");
    

    TestModellerLogger.SetLastNodeGuid("74c7935f-a457-4a02-b25b-8bc76b81847f");
    _pagesBusiness_navigation.Click_Search_();
    

    TestModellerLogger.SetLastNodeGuid("dcf609fe-ada5-48c3-b7d1-905de85570d5");
    _pagesBusiness_navigation.Click__Lexagen_properties_private_limited();
    

    TestModellerLogger.SetLastNodeGuid("5b0e541d-261f-4d1e-a3a9-98333b95f672");
    _pagesBusiness_navigation.Switch_Tab();
    

pages.new_invoice _pagesnew_invoice = new pages.new_invoice(driver);
    TestModellerLogger.SetLastNodeGuid("3c2a8f2b-0d5d-4812-a8f2-21ce404e32b5");
    _pagesnew_invoice.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("26ecc54b-887d-4271-8b36-591b6adbdac4");
    _pagesnew_invoice.Click_xPath_htmlbodyformmaindiv10div3div1div4divdiv2div1divdiv1divdivdiv(driver);
    

  TestModellerLogger.SetLastNodeGuid("2a459884-a208-44a5-bd87-b3653941b6f9");
  _pagesnew_invoice.Select_ctl00cPHddlCustomer("david");
  
  TestModellerLogger.SetLastNodeGuid("97adf95e-4e6f-4a7d-a471-bce6f72f45e0");  _pagesnew_invoice.Enter_ctl00cPHtxtInvoiceDate("6/4/2020 12:00:00 AM");
   

   TestModellerLogger.SetLastNodeGuid("e1dd5b87-7058-4f58-8b31-a6db05626712");
   _pagesnew_invoice.Select_ctl00cPHrptrProductctl00ddProduct("Sale");
   
  TestModellerLogger.SetLastNodeGuid("6bee1a6a-bc7b-4e6c-8efc-91274ea98408");
  _pagesnew_invoice.Enter_ctl00cPHrptrProductctl00txtDescription("medicines");  
  
  TestModellerLogger.SetLastNodeGuid("b7c061da-c621-42b6-a55a-94c22707e467");
  _pagesnew_invoice.Enter_ctl00cPHrptrProductctl00txtUnitPrice("5000");
  
  TestModellerLogger.SetLastNodeGuid("f41c74b4-2c1a-4c43-891e-eb8bcf8f5eaf");
 _pagesnew_invoice.Enter_ctl00cPHrptrProductctl00txtQuantity("100");
 
 TestModellerLogger.SetLastNodeGuid("43938629-432d-4191-a77e-ec9a2c4fa52f");
 _pagesnew_invoice.Click__Save_();
 
   }

}
