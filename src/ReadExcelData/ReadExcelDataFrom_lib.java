package ReadExcelData;

import lib.ExcelDataConfig;

public class ReadExcelDataFrom_lib {

	public static void main(String[] args) throws Exception {
		ExcelDataConfig excel = new ExcelDataConfig("C:\\Chetan\\Softs\\SeleniumSuite\\ExcelData\\Book1.xlsx");
		System.out.println(excel.getData(4, 0, 0));
		System.out.println(excel.getRowCount(0));
	}

}
