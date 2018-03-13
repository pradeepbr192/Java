package com.test.automation.uiautomation.excelReader;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Reader {
	
	
public String path;
public FileOutputStream fileout= null;
public FileInputStream fis;
//It's a global variable so that it can be accessed by other methods also
public XSSFWorkbook workbook;
public XSSFSheet sheet;
public Excel_Reader(String path) {
	
	this.path=path;
			try {
	fis=new FileInputStream(path);
	workbook = new XSSFWorkbook(fis);
}
	catch(Exception e) {
		e.printStackTrace();
	}
	
}

@SuppressWarnings({ "deprecation", "static-access" })
public String[][] getDatafromsheet(String sheetName,String ExcelName){
	
	String[][] dataset=null;
	try {
		
		XSSFSheet sheet = workbook.getSheet(sheetName);
		//To get the total number of rows in the sheet. Since array starts from 0, +1 is done
		int totalrow= sheet.getLastRowNum() + 1;
		//count active columns in a row
		int totalcolumn= sheet.getRow(0).getLastCellNum();
		
		//Create array of row and column
		dataset = new String [totalrow - 1][totalcolumn];
		
		for(int i=1 ; i < totalrow ;i++) {
			XSSFRow row= sheet.getRow(i);
		for (int j=0;j<totalcolumn;j++) {
			XSSFCell cell=row.getCell(j);
			
		if (cell.getCellType() == cell.CELL_TYPE_STRING)
			dataset[i-1][j]=cell.getStringCellValue();
			
		else if(cell.getCellType() == Cell.CELL_TYPE_NUMERIC) {
			
		dataset[i-1][j]=String.valueOf(Cell.CELL_TYPE_STRING);
		}
		
		else
			dataset[i-1][j]=String.valueOf(cell.CELL_TYPE_BOOLEAN);
			
		}
		}
		return dataset;
		
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	return dataset;
}


@SuppressWarnings({ "deprecation", "static-access" })
public String getcellnumber(String sheetName,String colName, int rowNum) {
	try {
		int col_num=0;
		int index=workbook.getSheetIndex(sheetName);
		sheet=workbook.getSheetAt(index);
		XSSFRow row= sheet.getRow(0);
		for(int i =0;i<row.getLastCellNum();i++) {
			if(row.getCell(i).getStringCellValue().equals(colName)) {
				col_num=i;
				break;
			}
		}
	
		row=sheet.getRow(rowNum - 1);
		XSSFCell cell  =row.getCell(col_num);	
		if(cell.getCellType()==Cell.CELL_TYPE_STRING) {
			return cell.getStringCellValue();
		}
		else if (cell.getCellType()==cell.CELL_TYPE_BLANK) {
			return "";
		}
		
		} catch(Exception e) {
			e.printStackTrace();	
	}
	
	return null;
	}
}
