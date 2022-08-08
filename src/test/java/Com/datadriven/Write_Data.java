package Com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_Data {
	
	public static void main(String[] args) throws IOException {
		
		File f = new File ("C:\\Users\\ADMIN\\eclipse-workspace\\March22_PB\\Test case.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		
		wb.createSheet("User_Data").createRow(0).createCell(0).setCellValue("email");
		
		wb.getSheet("User_Data").getRow(0).createCell(1).setCellValue("password");
		
		wb.getSheet("User_Data").createRow(1).createCell(0).setCellValue("nandha");
		
		wb.getSheet("User_Data").getRow(1).createCell(1).setCellValue("nandha@35");
		
		FileOutputStream fos = new FileOutputStream(f);
		
		wb.write(fos);
		
		wb.close();
		
		System.out.println("Write successfully");
		
		
		
		
	}

}
