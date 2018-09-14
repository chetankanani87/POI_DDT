package ReadExcelData;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel1 {

	public static void main(String[] args) throws Exception {
		
		File src = new File("C:\\Chetan\\Softs\\SeleniumSuite\\ExcelData\\Book1.xlsx");
		FileInputStream fis = new FileInputStream(src);
		/*If we are using .xlsx file then here in this script we use XSSFWorkbook class and
		 * If we are using .xls file then we will use HSSFWorkbook class, other process will be same.*/
		XSSFWorkbook wb = new XSSFWorkbook(fis); 
		XSSFSheet sheet1 = wb.getSheetAt(0);
		
		int rowcount = sheet1.getLastRowNum() + 1;
		System.out.println("Totle rows is " + rowcount);
		for (int i=0; i<rowcount; i++) {
			System.out.print("Data from Row " + i + " is: ");
			for (int j=0; j<2; j++) {
				String data0 = sheet1.getRow(i).getCell(j).getStringCellValue();
				System.out.print(data0+ " ");
			}
			System.out.println();
		}
		wb.close();
	}
	
}
