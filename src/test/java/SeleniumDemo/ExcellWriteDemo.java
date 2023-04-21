package SeleniumDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcellWriteDemo {

	public static void main(String[] args) throws IOException {
		FileInputStream file=new FileInputStream("D:\\ScreenSchot\\WriteExcellDemo.xlsx");

		XSSFWorkbook book =new XSSFWorkbook(file);
		XSSFSheet Sheet=book.getSheetAt(0);
		
		Sheet.createRow(0);

		Sheet.getRow(0).createCell(0).setCellValue("Hello");
		Sheet.getRow(0).createCell(1).setCellValue("Vinod");
		Sheet.getRow(0).createCell(2).setCellValue("Potdar");
		
		FileOutputStream output= new FileOutputStream("D:\\ScreenSchot\\WriteExcellDemo.xlsx");
		
		book.write(output);
		
		
		System.out.println("**** ExcellFile Written done ****");
		
		
	}

}
