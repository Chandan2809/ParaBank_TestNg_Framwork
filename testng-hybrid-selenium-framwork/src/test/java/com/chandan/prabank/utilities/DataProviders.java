package com.chandan.prabank.utilities;


import org.testng.annotations.DataProvider;

public class DataProviders {
	
	
String dir = System.getProperty("user.dir");
	
	@DataProvider(name="ParabankLoginData")
	public String[][] AlldataProvider ()
	{
		String filename = dir +"\\src\\testdata\\data.xlsx";
		int totalRowCount = ReadExcelFile.getRowCount(filename, "Sheet1");
		int totalColCount = ReadExcelFile.getColCount(filename, "Sheet1");
		String userData[][]= new String[totalRowCount-1][totalColCount];
		for(int rowNo = 1; rowNo<totalRowCount; rowNo++)
        {
            for(int colNo=0; colNo<totalColCount; colNo++)
            {
                userData[rowNo-1][colNo] = ReadExcelFile.getCellValue(filename, "Sheet1", rowNo, colNo);
            }
            
        }
        return userData;
		
	}

}
