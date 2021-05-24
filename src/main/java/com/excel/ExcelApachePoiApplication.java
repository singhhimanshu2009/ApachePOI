package com.excel;

import java.io.FileNotFoundException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.excel.POI.CreateCell;
import com.excel.POI.CreateHeaderRow;
import com.excel.POI.CreateSheet;
import com.excel.POI.ReadExcelFile;
import com.excel.POI.WriteExcelFile;

@SpringBootApplication
public class ExcelApachePoiApplication {

	public static void main(String[] args) throws FileNotFoundException {
		SpringApplication.run(ExcelApachePoiApplication.class, args);
		
		//Create sheet in excel file
		//CreateSheet.createSheet();
		
		
		
		//Create cell in excel file
		//CreateCell.createCell();
		
		
		//Create Heacer Row
		//CreateHeaderRow.createHeaderRow();
		
		//Write excel file
		//WriteExcelFile.wirteExcelFile();
		
		//Read excel file
		ReadExcelFile.readExcelFile();
		
		
	}

}
