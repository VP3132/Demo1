package SeleniumDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcellRead {

	public static void main(String[] args) throws IOException {

		// Desktop-->Workbook-->Sheet-->rows-->Cells

		FileInputStream file = new FileInputStream("D:\\ScreenSchot\\FileRead.xlsx");

		XSSFWorkbook Book = new XSSFWorkbook(file);

		XSSFSheet sheet = Book.getSheetAt(0);

		System.out.println(sheet.getRow(3).getCell(2));
		System.out.println(sheet.getRow(2).getCell(2));
		System.out.println(sheet.getRow(3).getCell(1));

	}

}
