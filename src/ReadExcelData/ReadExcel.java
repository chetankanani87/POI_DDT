package ReadExcelData;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws Exception {
		File src = new File("C:\\Chetan\\Softs\\SeleniumSuite\\ExcelData\\Book1.xlsx");
		FileInputStream fis = new FileInputStream(src);
		/*If we are using .xlsx file then here in this script we use XSSFWorkbook class and
		 * If we are using .xls file then we will use HSSFWorkbook class, other process will be same.*/
		XSSFWorkbook wb = new XSSFWorkbook(fis); 
		XSSFSheet sheet1 = wb.getSheetAt(0);
		String data0 = sheet1.getRow(0).getCell(0).getStringCellValue();
		System.out.println("Data from Excel is " + data0);
		wb.close();
	}
	
}
