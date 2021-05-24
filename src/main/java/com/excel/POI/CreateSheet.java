package com.excel.POI;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class CreateSheet {
	
	public static void createSheet() throws FileNotFoundException{
		
		Workbook workbook = new HSSFWorkbook();
		
		try(OutputStream fout = new FileOutputStream("JavaExcel.xls")) {
			
			Sheet sheet1 = workbook.createSheet("MySheet");
			Sheet sheet2 = workbook.createSheet("SecondSheet");
			
			workbook.write(fout);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
