package com.excel.POI;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class CreateCell {
	
	public static void createCell() throws FileNotFoundException{
		
		Workbook workbook = new HSSFWorkbook();
		
		try(OutputStream fout = new FileOutputStream("JavaExcel.xls")) {
			
			Sheet sheet = workbook.createSheet("CreateCell");
			
			Row row = sheet.createRow(0);
			Cell cell = row.createCell(0);
			
			cell.setCellValue("First Cell Value");
			workbook.write(fout);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
