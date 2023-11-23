package com.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

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
public static void takescreenshot(String filename,WebDriver driver) {		
		
	    try {
	    	File destination = new File(filename);
	    	
	    	 FileUtils.copyFile(((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE), destination);
	    	
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
}
}