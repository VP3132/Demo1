package SeleniumDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcellWrite2 {

	public static void main(String[] args) throws IOException {
		FileInputStream file = new FileInputStream("D:\\ScreenSchot\\WriteExcellDemo.xlsx");

		XSSFWorkbook book = new XSSFWorkbook(file);

		XSSFSheet sheet = book.getSheetAt(0);

		Row row = sheet.createRow(0);
		sheet.createRow(0).createCell(0).setCellValue("Hi Hello how are you...");
		sheet.createRow(0).createCell(1).setCellValue("Vinod");

		FileOutputStream VP = new FileOutputStream("D:\\ScreenSchot\\WriteExcellDemo.xlsx");

		book.write(VP);

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		///// ..... Java Basic.......
		int a = 13;
		int b = 14;

		System.out.println("Addition of two values" + (a + b));
		System.out.println("Multipication of two values" + (a * b));
		System.out.println("Substraction of two values are" + (a - b));
		System.out.println(b / a);

		long merafunda = 76767;
		byte merabyte = (byte) merafunda;

		System.out.println(merafunda);

		Scanner vinod = new Scanner(System.in);

		System.out.println("Bhaitumhara nam batawo");

		int str;
		str = vinod.nextInt();

		System.out.println("Bhaitumhara nam batawo:" + str);

	}

}
