package com.excel.POI;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class CreateHeaderRow {
	
	static String[] HEADERs = {"Id", "RollNo", "Class", "School", "Address"};
	
public static void createHeaderRow() throws FileNotFoundException{
	
		
		Workbook workbook = new HSSFWorkbook();
		
		try(OutputStream fout = new FileOutputStream("JavaExcel.xls")) {
			
			Sheet sheet = workbook.createSheet("HeaderRow");
			
			Row row = sheet.createRow(0);
			
			for (int col = 0; col < HEADERs.length ; col++) {
				
				Cell cell = row.createCell(col);
				cell.setCellValue(HEADERs[col]);
				
			}
			
			workbook.write(fout);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
