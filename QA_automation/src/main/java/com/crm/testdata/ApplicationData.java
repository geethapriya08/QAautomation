package com.crm.testdata;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ApplicationData {
	public FileInputStream fis;
	XSSFWorkbook wb = null;
	XSSFSheet sh = null;
	
	public XSSFSheet appData(String sname){
		
		try {
			fis = new FileInputStream("src\\test\\resources\\TestData\\TestData.xlsx");
			 wb = new XSSFWorkbook(fis);
			 sh = wb.getSheet(sname);
		} 
		catch (Exception e) {
						
			e.printStackTrace();
		}
		return sh;
	}
}
