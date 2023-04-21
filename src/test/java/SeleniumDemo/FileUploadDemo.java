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

public class FileUploadDemo {

	public static void main(String[] args) throws AWTException, InterruptedException {

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.foundit.in/rio/login");
		
		driver.manage().window().maximize();
		
		WebElement UploadResumebtn=driver.findElement(By.xpath("//a[@title='Click to upload your resume']"));
		UploadResumebtn.click();
		
		//Thread.sleep(10);
		WebElement InnerUploadBtn=driver.findElement(By.xpath("//input[@id='file-upload']"));
	
//		InnerUploadBtn.click();
	     // When getting InvalidArgumentException that time use JavascriptExecuter class
		JavascriptExecutor AS=(JavascriptExecutor)driver;
		AS.executeScript("window.scrollBy(0,1000)");
		AS.executeScript("arguments[0].click",InnerUploadBtn);
		//Thread.sleep(10);
	    System.out.println("Innerbtn is working");
	    
	    Robot vp=new Robot();
	    
	    vp.delay(3000);
	    
	    StringSelection ss = new StringSelection("D:\\MY Document\\Vinod.pdf");
	    
	    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss,null);
	    
	    // bydefault cursore is blinging in filename
	    
	    vp.keyPress(KeyEvent.VK_CONTROL);
	    vp.keyPress(KeyEvent.VK_V);
	    
	    
	    vp.keyRelease(KeyEvent.VK_CONTROL);
	    vp.keyRelease(KeyEvent.VK_V);
	    
	    System.out.println("File Uploaded Succefully");
	    
	    vp.keyPress(KeyEvent.VK_ENTER);
		vp.keyRelease(KeyEvent.VK_ENTER);
	   // driver.findElement(By.xpath("//input[@id='pop_upload']")).click();
	    System.out.println("........");
	    
	}
	
	
	
	

}
