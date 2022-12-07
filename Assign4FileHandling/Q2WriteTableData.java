package Assign4FileHandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Q2WriteTableData {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String writefilepath = "C:\\Users\\Pavitra\\Desktop\\Assign2.xlsx";
		
		FileOutputStream fos = new FileOutputStream(writefilepath);
		
		XSSFWorkbook wb = new XSSFWorkbook();
		
		XSSFSheet sh = wb.createSheet("q2");
		
		XSSFRow r = sh.createRow(0);
		
		r.createCell(0).setCellValue("TEAM");
		r.createCell(1).setCellValue("W");
		r.createCell(2).setCellValue("L");
		r.createCell(3).setCellValue("PCT");
		r.createCell(4).setCellValue("GB");
		r.createCell(5).setCellValue("CONF");
		r.createCell(6).setCellValue("HOME");
		r.createCell(7).setCellValue("AWAY");
		r.createCell(8).setCellValue("L10");
		r.createCell(9).setCellValue("STK");
		
		for(int row = 1;row<=5;row++) {
						
			XSSFRow r1 = sh.createRow(row);
			System.out.println("enter the values for the row "+row);
			
			for(int col = 0; col<=9;col++)
			
			{
				
				Scanner sc = new Scanner(System.in);
				//System.out.println("enter the values for the row "+ r.getCell(col));
						r1.createCell(col).setCellValue(sc.nextLine());
		
		
			}
				}
		
		wb.write(fos);
		wb.close();
		System.out.println("done");
		
		
	}

}
