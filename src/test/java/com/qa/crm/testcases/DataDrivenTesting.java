package com.qa.crm.testcases;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDrivenTesting {
	
	public static void main(String[] args) throws Exception {
	
		File file = new File("E:\\FreeCRMTest\\src\\main\\java\\com\\qa\\crm\\testdata\\Test1.xlsx");
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheetAt(0);
		String abc = sheet.getRow(1).getCell(1).getStringCellValue();
		System.out.println(abc);
		
		//System.out.println("done");
		
	}
	
	

}
