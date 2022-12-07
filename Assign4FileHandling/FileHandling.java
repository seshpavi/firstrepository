package Assign4FileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xslf.usermodel.XSLFSheet;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FileHandling {

	public static void main(String[] args) throws IOException {
	
		
		String filePath ="C:\\Users\\Pavitra\\Desktop\\Name.xlsx";
		
		FileInputStream fis = new FileInputStream(filePath);
		
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		
		for(int i = 0;i<=sheet.getLastRowNum();i++) {
			
			XSSFRow r1 = sheet.getRow(i);
			
			for(int j = 0; j<r1.getLastCellNum();j++) {
		
				System.out.print(r1.getCell(j));
	}
			System.out.println(" ");
	}
		
		
		//write excel file 
		
		
		
		String writefilePath ="C:\\Users\\Pavitra\\Desktop\\sample1.xlsx";
		
		FileOutputStream fos = new FileOutputStream(writefilePath);
		
		XSSFWorkbook wb = new XSSFWorkbook();
		
		XSSFSheet sh = wb.createSheet("java");
		for(int row = 0; row<3; row++ ) {
			
			XSSFRow r = sh.createRow(row);
			System.out.println("enter the values for row " +row);
		
			for(int col = 0; col<3; col++) {
				
				Scanner sc = new Scanner (System.in);
											
				r.createCell(col).setCellValue(sc.nextLine());
				
				}
			}
		
		wb.write(fos);
		
		wb.close();
		System.out.println("write complete");

}}
