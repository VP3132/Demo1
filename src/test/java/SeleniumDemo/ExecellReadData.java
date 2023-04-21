package SeleniumDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExecellReadData {

	public static void main(String[] args) throws IOException {

		FileInputStream file = new FileInputStream("D:\\ScreenSchot\\FileRead.xlsx");

		// Add WorkBook

		XSSFWorkbook workbook = new XSSFWorkbook(file);

		// Navigate Sheet

		XSSFSheet sheet = workbook.getSheetAt(0);

		System.out.println(sheet.getRow(0).getCell(1));

		// Row 3 & Cell 3
		System.out.println(sheet.getRow(3).getCell(3));
		// Row 3 & Cell 4
		System.out.println(sheet.getRow(3).getCell(4));
		// Row 3 & Cell 1
		System.out.println(sheet.getRow(3).getCell(1));
		// Row 2 & Cell 3
		System.out.println(sheet.getRow(2).getCell(3));
	}

}
