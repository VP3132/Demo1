package Practice2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcellRead {

	public static void main(String[] args) throws IOException {
		File location = new File("D:\\ScreenSchot\\DemoExcell.xlsx");
		FileInputStream file = new FileInputStream(location);
		XSSFWorkbook book = new XSSFWorkbook(file);
		XSSFSheet sheet = book.getSheetAt(0);

		int rowcount = sheet.getPhysicalNumberOfRows();
		for (int i = 0; i < rowcount; i++) {

			XSSFRow row = sheet.getRow(i);
			int cellcount = row.getPhysicalNumberOfCells();

			for (int j = 0; j < cellcount; j++) {
				XSSFCell cell = row.getCell(j);
				System.out.print("| |" + getcellValue(cell) + "| |");
			}
			System.out.println();
		}
		book.close();
		file.close();
	}

	public static String getcellValue(XSSFCell cell) {

		switch (cell.getCellType()) {
		case NUMERIC:
			return String.valueOf(cell.getNumericCellValue());

		case BOOLEAN:
			return String.valueOf(cell.getBooleanCellValue());
		case STRING:
			return String.valueOf(cell.getStringCellValue());

		default:
			return cell.getStringCellValue();

		}

	}

}
