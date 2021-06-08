package org.excelreadbase;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataBase {
	
	public static String excelRead(int rowNo, int cellNo) throws IOException {

		File file = new File("C:\\Users\\sundruba\\eclipse-workspace\\Sample\\ExcelData\\Data.xlsx");
	
		FileInputStream f = new FileInputStream(file);
		
		Workbook w = new XSSFWorkbook(f);
		
		Sheet s = w.getSheet("Sheet1");
		
		Row r = s.getRow(rowNo);
		
		Cell c = r.getCell(cellNo);
		
		int cellType = c.getCellType();
		
		String value = "";
		
		if (cellType == 1) {
			
			value = c.getStringCellValue();
			
		}
		else if (DateUtil.isCellDateFormatted(c)) {
			
			Date d = c.getDateCellValue();
			
			SimpleDateFormat sim = new SimpleDateFormat("dd-MM-yyyy");
			
			value = sim.format(d);
		}
		
		else {
			double dd = c.getNumericCellValue();
			
			long l = (long)dd;
			
			value = String.valueOf(l);
		}
		return value;		
		
	}


}
