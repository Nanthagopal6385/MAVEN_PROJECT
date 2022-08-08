package Com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class All_property {
	public static void main(String[] args)throws IOException {
		
	
	File f = new File("C:\\Users\\ADMIN\\eclipse-workspace\\March22_PB\\Test case.xlsx");
	
	FileInputStream fis=new FileInputStream(f);
	
	Workbook wb = new XSSFWorkbook(fis);
	
	Sheet s = wb.getSheetAt(0);
	
	Row r = s.getRow(0);
	
	for(int i=0; i<s.getPhysicalNumberOfRows();i++);
	Row r1 = s.getRow(0);
	
	for(int j=0; j<r1.getPhysicalNumberOfCells();j++);
	{
		Cell c = r.getCell(1);
		CellType c1 = c.getCellType();
		
		Cell c2 = r.getCell(0);
		
		CellType type = c.getCellType();
		
		if(type.equals(CellType.STRING));
		{
			String value = c.getStringCellValue();
			{
				System.out.println(value);
			}
			 if (type.equals(CellType.NUMERIC));
			
			{
			   double numericValue = c.getNumericCellValue();
				String value1 = String.valueOf(numericValue);
				System.out.println(value);
				
				}
			}
			
		}
	
	      wb.close();
		
	}
	
	
	

}
