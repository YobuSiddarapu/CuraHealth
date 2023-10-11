package com.utils;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Utils {
	public static String[][]Customerdata(String sheetname) throws Throwable{
		
		File file=new File("./src/main/java/com/testdata/EMPIRE.xlsx");
		FileInputStream str= new FileInputStream(file);
		XSSFWorkbook book=new XSSFWorkbook(str);
		XSSFSheet sh=book.getSheetAt(0);
		int row=sh.getPhysicalNumberOfRows();
		int cells=sh.getRow(1).getLastCellNum();
		String[][] data=(String[][]) new Object[row-1][cells];
		for(int i=1 ;i<row;i++) {//for rows
			for(int j=0;j<cells;j++) {//for cells
				DataFormatter df=new DataFormatter();
				data[i][j]=df.formatCellValue(sh.getRow(i+1).getCell(j));
				
					
			}
			
			
		}
		return data;
		
		
		
		
	}
	

}
