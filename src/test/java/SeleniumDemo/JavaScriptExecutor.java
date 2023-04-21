package SeleniumDemo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class JavaScriptExecutor {

	public static void main(String[] args) throws InterruptedException {
		
  WebDriver driver = new ChromeDriver();
  driver.navigate().to("https://demoqa.com/automation-practice-form");
  driver.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys("Vinod");
  driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Potdar");
  
  Actions action=new Actions(driver);
  action.sendKeys(Keys.PAGE_DOWN).build().perform();
  
  driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("PotdarVinod32@gmail.com");
  action.sendKeys(Keys.PAGE_DOWN).build().perform();
  
  
  Thread.sleep(2000);
  WebElement CLICK=driver.findElement(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[1]/label"));
  //Second option for click by using JavaScriptExecutor
  JavascriptExecutor Dt=(JavascriptExecutor)action; 
  Dt.executeScript("arguments[0].click", CLICK);
  Dt.executeAsyncScript("window.ScrollBy(0,100)");
  
  Dt.getClass();
  Dt.wait(2000);
  

  driver.findElement(By.xpath("//*[@id=\"userNumber\"]")).sendKeys("8669138779");
  WebElement Date =driver.findElement(By.xpath("//input[@id='dateOfBirthInput']"));
  Date.clear();
  
  //Date.click();
  //Dt.executeScript("arguments[0].removeAttribute('value');",Date);
  
  Date.sendKeys("30 Sep 1996",Keys.TAB);
  driver.findElement(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[1]/label")).click();
  driver.findElement(By.xpath("//*[@id=\"uploadPicture\"]")).sendKeys("C:\\Users\\ASUS\\Downloads");


	}

}
