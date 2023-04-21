 package SeleniumDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionsclass {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new EdgeDriver();
		driver.navigate().to("https://demoqa.com/automation-practice-form");
		WebElement Name =driver.findElement(By.xpath("//*[@id=\"firstName\"]"));
        WebElement LastName=driver.findElement(By.xpath("//*[@id=\"lastName\"]"));
        WebElement Email=driver.findElement(By.xpath("//*[@id=\"userEmail\"]"));
        WebElement Gender = driver.findElement(By.xpath("//label[@for='gender-radio-1']"));
       
        Actions action=new Actions(driver);
        action.sendKeys(Keys.PAGE_DOWN).build().perform();
        action.sendKeys(Keys.PAGE_UP).build().perform();
        
        Name.sendKeys("Vinod");
        LastName.sendKeys("Potdar");
        Thread.sleep(4000);
        Email.sendKeys("VinodPotdar96@gmail.com");
        Gender.click();
        driver.findElements(By.xpath("//*[@id=\"userEmai\"]"));






	}

}
