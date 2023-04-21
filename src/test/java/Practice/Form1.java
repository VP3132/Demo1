package Practice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Form1 {

	public static void main(String[] args) throws AWTException {
		WebDriver driver=new ChromeDriver();
        driver.get("https://qavalidation.com/demo/");
        
        driver.findElement(By.xpath("//input[@id='username']")).click();
        
        StringSelection selection=new StringSelection("VinodPotdar");
        StringSelection selection1=new StringSelection("Vinod@3132");
        
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
        Robot rb=new Robot();
        
        rb.keyPress(KeyEvent.VK_CONTROL);
        rb.keyPress(KeyEvent.VK_V);
        
        rb.keyRelease(KeyEvent.VK_CONTROL);
        rb.keyRelease(KeyEvent.VK_V);
        
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection1, null);
        Robot rb1=new Robot();
        
        rb1.keyPress(KeyEvent.VK_CONTROL);
        rb1.keyPress(KeyEvent.VK_V);
        
        rb1.keyRelease(KeyEvent.VK_CONTROL);
        rb1.keyRelease(KeyEvent.VK_V);
        
        
        
        
        
//        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("VinodPotdar96@gmail.com");
//        
//        driver.findElement(By.xpath("//input[@id='tel']")).sendKeys("8669138779");
//       
//        driver.findElement(By.xpath("//input[@name='datafile']")).sendKeys("D:\\Notes\\Java.pdf");
//        
//       WebElement Vl= driver.findElement(By.xpath("//select[@name='sgender']"));
//        Select VS=new Select(Vl);
//        
//        VS.selectByIndex(0);
        
//       JavascriptExecutor JS=(JavascriptExecutor)driver;
//		JS.executeScript("window.scrollBy(0,1000)");
//		

//		/driver.findElement(By.xpath("//input[@value='four']")).click();

	}

}
