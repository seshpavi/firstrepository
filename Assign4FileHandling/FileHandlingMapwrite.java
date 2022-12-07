package Assign4FileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FileHandlingMapwrite {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String writefilePath ="C:\\Users\\Pavitra\\Desktop\\sample2.xlsx";
				
			
		FileOutputStream fos = new FileOutputStream(writefilePath);
		
		XSSFWorkbook wb = new XSSFWorkbook();
		
		XSSFSheet sh = wb.createSheet("java");
		
		Map<String, String> map = new HashMap<String, String>();
		
		map.put("kiwi", "34");
		map.put("grapes", "40");
		map.put("berry", "8");
		map.put("apple", "3");
		
		int row =0;
		
		for (Map.Entry<String, String>entry:map.entrySet()) {
			
					
			XSSFRow r = sh.createRow(row++);
			
			r.createCell(0).setCellValue(entry.getKey());
			r.createCell(1).setCellValue(entry.getValue());
					
			
		}
		
		wb.write(fos);
		wb.close();
		
		System.out.println("write done");
	}

}
