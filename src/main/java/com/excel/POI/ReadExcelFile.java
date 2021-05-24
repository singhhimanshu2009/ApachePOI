package com.excel.POI;

import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class ReadExcelFile {
	
	public static void readExcelFile() {
		
		try {
			
			FileInputStream fis = new FileInputStream(new File("/home/himanshu/MyExcel.xls"));
			
			//Create workbook instance holding reference to xls file
			HSSFWorkbook workbook = new HSSFWorkbook(fis);
			
			//Get sheet from the workbook
			HSSFSheet sheet = workbook.getSheetAt(0);
			
			//Iterate through each row one by one
			Iterator<Row> rowIterator = sheet.iterator();
			
			while (rowIterator.hasNext()) {
				Row row = rowIterator.next();
				
				//For each row, iterate through all the columns
				Iterator<Cell> cellIterator = row.cellIterator();
				
				while (cellIterator.hasNext()) {
					Cell cell = cellIterator.next();
					
					
					//Check the cell type and format
					switch (cell.getCellType()) {
					
					case Cell.CELL_TYPE_NUMERIC:
						System.out.print(cell.getNumericCellValue() + "  ");
						break;
						
					case Cell.CELL_TYPE_STRING:
					System.out.print(cell.getStringCellValue() + "  ");
						break;
						
					}
					
				}
				
				System.out.println("");
				
			}
			
			fis.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
}
