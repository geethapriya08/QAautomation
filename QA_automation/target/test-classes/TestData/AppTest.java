package com.crm.testdata;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class AppTest {
	public FileInputStream fis;
	XSSFWorkbook wb=null;
	XSSFSheet sh=null;

public XSSFSheet appdata(String name) {
	try {
		fis= new FileInputStream("src//test//resources//TestData//TestData.xlsx");
		wb = new XSSFWorkbook(fis);
		sh = wb.getSheet(name);
	    
		
		
	}catch(Exception e) {
		e.printStackTrace();
		
	}
	return sh;
	
}


}
