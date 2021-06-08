package org.sample;

import java.io.File; 
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Data {
	
	public static void main(String[] args) throws IOException {
		
		File file = new File("C:\\Users\\sundruba\\eclipse-workspace\\Sample\\ExcelData\\Data.xlsx");
	
		FileInputStream f = new FileInputStream(file);
		
		Workbook w = new XSSFWorkbook(f);
		
		Sheet s = w.getSheet("Sheet1");
	
		Row r = s.getRow(1);
	
		int physicalNumberOfRows = s.getPhysicalNumberOfRows();
		System.out.println(physicalNumberOfRows);
		
		int physicalNumberOfCells = r.getPhysicalNumberOfCells();
		System.out.println(physicalNumberOfCells);
		
		}

}
