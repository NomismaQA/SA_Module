package com.nomisma.generic;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
public class ExcelLibSATestCases {
	public static String[] toReadExcelData1(String sTestCaseID)
	{
		String sData[]=null;
		try
		{
		FileInputStream fis = new FileInputStream(new File(".\\src\\test\\resources\\testData\\ExcelData\\testDataSA.xlsx"));
		Workbook wb =  WorkbookFactory.create(fis);
		Sheet sht = wb.getSheet("Sheet1");
		int iRowNum= sht.getLastRowNum();
		for(int i=1; i<=iRowNum; i++)
			{
				if(sht.getRow(i).getCell(0).toString().equals(sTestCaseID))
				{
					int iCellNum=sht.getRow(i).getLastCellNum();
					sData= new String[iCellNum];
					
					for(int j=0; j<iCellNum; j++)
					{
						sData[j]=sht.getRow(i).getCell(j).getStringCellValue();
					}
					
					break;
				}
			}
		
	
		}
		
	catch(EncryptedDocumentException ex){
		ex.printStackTrace();
	}
	catch(InvalidFormatException ex){
		ex.printStackTrace();
	}
	catch(IOException ex){
		ex.printStackTrace();
	}
		return sData;
		
     }
	
	    public static String[] toReadExcelDataBK(String sTestCaseID)
        {
        String sData[]=null;
        try
         {
         FileInputStream fis = new FileInputStream(new File(".\\src\\test\\resources\\testData\\ExcelDataa\\testDataBookKeeping.xlsx"));
         Workbook wb =  WorkbookFactory.create(fis);
         Sheet sht = wb.getSheet("Sheet1");
         int iRowNum= sht.getLastRowNum();
         for(int i=1; i<=iRowNum; i++)
            {
            if(sht.getRow(i).getCell(0).toString().equals(sTestCaseID))
              {
              int iCellNum=sht.getRow(i).getLastCellNum();
              sData= new String[iCellNum];
              for(int j=0; j<iCellNum; j++)
                  {
                  sData[j]=sht.getRow(i).getCell(j).getStringCellValue();
                  }
                  break;
                  }
                  }
                  }
                  catch(EncryptedDocumentException ex){
                  ex.printStackTrace();
                  }
                  catch(InvalidFormatException ex){
                  ex.printStackTrace();
                  }
                  catch(IOException ex){
                  ex.printStackTrace();
                  }
                  return sData;
                  }

	    public static String[] toReadExcelMTRTests(String sTestCaseID)
        {
     String sData[]=null;
      try
      {
      FileInputStream fis = new FileInputStream(new File(".\\src\\test\\resources\\testData\\ExcelData\\testDataMTRSA.xlsx"));
      Workbook wb =  WorkbookFactory.create(fis);
      Sheet sht = wb.getSheet("Sheet1");
      int iRowNum= sht.getLastRowNum();                        
      for(int i=1; i<=iRowNum; i++)
         {
           if(sht.getRow(i).getCell(0).toString().equals(sTestCaseID))
              {
               int iCellNum=sht.getRow(i).getLastCellNum();
               sData= new String[iCellNum];                                                                        
               for(int j=0; j<iCellNum; j++)
                  {
                   sData[j]=sht.getRow(i).getCell(j).getStringCellValue();
                  }                                                                        
                  break;
                  }
                }
                }
                catch(EncryptedDocumentException ex){
                ex.printStackTrace();
                 }
                 catch(InvalidFormatException ex){
                 ex.printStackTrace();
                 }
                 catch(IOException ex){
               ex.printStackTrace();
                 }
                return sData;
                                        
             }
	    public static String[] toReadExcelMTRTests2019(String sTestCaseID)
        {
     String sData[]=null;
      try
      {
      FileInputStream fis = new FileInputStream(new File(".\\src\\test\\resources\\testData\\ExcelData\\testDataMTRSA2019.xlsx"));
      Workbook wb =  WorkbookFactory.create(fis);
      Sheet sht = wb.getSheet("Sheet1");
      int iRowNum= sht.getLastRowNum();                        
      for(int i=1; i<=iRowNum; i++)
         {
           if(sht.getRow(i).getCell(0).toString().equals(sTestCaseID))
              {
               int iCellNum=sht.getRow(i).getLastCellNum();
               sData= new String[iCellNum];                                                                        
               for(int j=0; j<iCellNum; j++)
                  {
                   sData[j]=sht.getRow(i).getCell(j).getStringCellValue();
                  }                                                                        
                  break;
                  }
                }
                }
                catch(EncryptedDocumentException ex){
                ex.printStackTrace();
                 }
                 catch(InvalidFormatException ex){
                 ex.printStackTrace();
                 }
                 catch(IOException ex){
               ex.printStackTrace();
                 }
                return sData;
                                        
             }
	    public static String[] toReadExcelSA2019(String sTestCaseID)
        {
     String sData[]=null;
      try
      {
      FileInputStream fis = new FileInputStream(new File(".\\src\\test\\resources\\testData\\ExcelData\\testDataSA2019.xlsx"));
      Workbook wb =  WorkbookFactory.create(fis);
      Sheet sht = wb.getSheet("Sheet1");
      int iRowNum= sht.getLastRowNum();                        
      for(int i=1; i<=iRowNum; i++)
         {
           if(sht.getRow(i).getCell(0).toString().equals(sTestCaseID))
              {
               int iCellNum=sht.getRow(i).getLastCellNum();
               sData= new String[iCellNum];                                                                        
               for(int j=0; j<iCellNum; j++)
                  {
                   sData[j]=sht.getRow(i).getCell(j).getStringCellValue();
                  }                                                                        
                  break;
                  }
                }
                }
                catch(EncryptedDocumentException ex){
                ex.printStackTrace();
                 }
                 catch(InvalidFormatException ex){
                 ex.printStackTrace();
                 }
                 catch(IOException ex){
               ex.printStackTrace();
                 }
                return sData;
                                        
             }
}
	
	
		
