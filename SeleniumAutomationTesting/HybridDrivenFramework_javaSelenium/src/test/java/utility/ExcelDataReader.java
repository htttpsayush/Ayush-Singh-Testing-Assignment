package utility;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataReader {
	
	org.apache.poi.xssf.usermodel.XSSFWorkbook wb;
	
	public ExcelDataReader() {
		
		File src = new File("./TestData/TestData.xlsx");
		try {
			FileInputStream fis = new FileInputStream(src);
			wb = new XSSFWorkbook(fis);
		} catch(Exception e){
			System.out.println("Unable to load Xls file "+ e.getMessage());
		}
		
	}
	
	public String getStringData(int sheetIndex, int row, int coloum) {
		return wb.getSheetAt(sheetIndex).getRow(row).getCell(coloum).getStringCellValue();
	}
	
	public String getStringData(String sheetName, int row, int coloum) {
		return wb.getSheet(sheetName).getRow(row).getCell(coloum).getStringCellValue();
	}
	
	public double getNumericData(String sheetName, int row, int coloum) {
		return wb.getSheet(sheetName).getRow(row).getCell(coloum).getNumericCellValue();
	}

}
