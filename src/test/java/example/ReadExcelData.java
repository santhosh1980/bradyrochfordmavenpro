package example;

import lib.ExcelDataConfig;

public class ReadExcelData {

	public static void main(String[] args) {
		
		ExcelDataConfig excel= new ExcelDataConfig("C:\\Users\\U35035\\eclipse-workspace\\Data\\TestData.xlsx");
		
		System.out.println(excel.getData(1, 0, 0));
		
	}

}
