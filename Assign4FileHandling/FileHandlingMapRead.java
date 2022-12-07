package Assign4FileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FileHandlingMapRead {

	public static void main(String[] args) throws IOException {
		
		
		String filepath = "C:\\Users\\Pavitra\\Desktop\\Sample2.xlsx";
		
		FileInputStream fis = new FileInputStream(filepath);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sh = wb.getSheet("java");
		
		Map<String, String> map1 = new HashMap<String, String>();
		
		
		
		for (int row = 0; row<=sh.getLastRowNum();row++) {
			
			XSSFRow r = sh.getRow(row);
			
							
			String Keydata = sh.getRow(row).getCell(0).getStringCellValue();
			String KeyValue = sh.getRow(row).getCell(1).getStringCellValue();
				
				map1.put(Keydata, KeyValue);
		}
		
		for(Map.Entry<String, String> entry : map1.entrySet()) {
			
			System.out.println(entry.getKey()+" "+entry.getValue());
		}

}}
