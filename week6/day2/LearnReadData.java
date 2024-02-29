package week6.day2;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class LearnReadData {

	public  String[][] excelData() throws IOException {
		
		XSSFWorkbook book = new XSSFWorkbook("./data/Lead data.xlsx");
		XSSFSheet sheet = book.getSheet("Sheet1");
		
		int rowwCount = sheet.getLastRowNum();
		System.out.println("row count is : " + rowwCount);
		
		short colomnCount = sheet.getRow(0).getLastCellNum();
		
		System.out.println("column count is : " + colomnCount);
		
		String[][] d1 = new String[rowwCount][colomnCount];
		
		for (int i = 1; i <= rowwCount; i++) {
			for (int j = 0; j < colomnCount; j++) {
				String stringCellValue = sheet.getRow(i).getCell(j).getStringCellValue();
				d1[i-1][j]=stringCellValue;
				System.out.println(stringCellValue);
			}
		}
		
		return d1;
		

	}

}
