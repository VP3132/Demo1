package Practice;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class CreateExcell {

	public static void main(String[] args) throws IOException {
		HSSFWorkbook workbook = new HSSFWorkbook();
		HSSFSheet sheet = workbook.createSheet();
		sheet.createRow(0);
		sheet.getRow(0).createCell(0).setCellValue("HelloDada");
		sheet.getRow(0).createCell(1).setCellValue("How r You?");

		FileOutputStream file = new FileOutputStream("D:\\Excell\\TestData.xls");

		workbook.write(file);
		workbook.close();

	}

}
