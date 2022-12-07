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

public class FileHandlingMapAppend {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Map<String, String> map2 = new HashMap<String,String>();
		
		map2.put("mango", " 38");
		map2.put("banana", " 42");
		map2.put("orange", " 51");
		
		String filepath = "C:\\Users\\Pavitra\\Desktop\\sample2.xlsx";
		
		FileInputStream fis = new FileInputStream(filepath);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sh = wb.getSheetAt(0);
		
		int row = sh.getLastRowNum();
		
		for(Map.Entry<String, String> entry: map2.entrySet()) {
			
			XSSFRow r = sh.createRow(++row);
			
			r.createCell(0).setCellValue(entry.getKey());	
			r.createCell(1).setCellValue(entry.getValue());
		}
		
	fis.close();
	
	FileOutputStream fos = new FileOutputStream (filepath);
	
	wb.write(fos);
	wb.close();
	
	System.out.println("appaend done ");
		
	}

}
