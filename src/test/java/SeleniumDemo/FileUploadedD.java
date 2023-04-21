package SeleniumDemo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileUploadedD {

	public static void main(String[] args) throws AWTException {
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.foundit.in/rio/login");
		
				
				// click on upload resume btn
				
		WebElement UploadResumebtn=driver.findElement(By.xpath("//a[@title='Click to upload your resume']"));
		UploadResumebtn.click();
			
			//Thread.sleep(5000);
			
			
			// click on inner upload file btn
			
			WebElement innerbtn =driver.findElement(By.xpath("//input[@id='file-upload']"));
			//innerbtn.click();   //    invalid Argument exception 
			
			//   now as we are getting invalid Argument exception we have to find 2nd approch of clicking any element 
			
			// click using JavaScript Executor 
			
			JavascriptExecutor js = (JavascriptExecutor)driver;
			
			js.executeScript("arguments[0].click()", innerbtn);
			
			
			System.out.println("click successfully done");
			
			
			// declare robot class 
			
			Robot rb = new Robot();
			
			rb.delay(3000);  // similar to thread.sleep to hault the xecution for handling windpws opeartion 
			
			
			// copy file location in a string using interface "Stringselection"
			
			StringSelection ss = new StringSelection("D:\\MY Document\\Vinod.pdf");
			
			// copy the above file stored in ss into clipboard
			
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
			
			// bydefault cursor in blinking in filename , lets paste contents copied in clipboard 
			
			// paste ctrl +V
			
			
			rb.keyPress(KeyEvent.VK_CONTROL);
			rb.keyPress(KeyEvent.VK_V);
			
			rb.keyRelease(KeyEvent.VK_CONTROL);
			rb.keyRelease(KeyEvent.VK_V);
			
			
			System.out.println("pasted successfully ");
			
			
			// press on enter 
			
			rb.keyPress(KeyEvent.VK_ENTER);
			rb.keyRelease(KeyEvent.VK_ENTER);
			
			// apply some delay so that submit button gets visible 
			
			rb.delay(6000);
			
			// clicking on submit button
			driver.findElement(By.xpath("//input[@id='pop_upload']")).click();
			
			}

}


	


