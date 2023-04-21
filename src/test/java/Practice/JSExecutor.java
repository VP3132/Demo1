package Practice;
import java.util.Arrays;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JSExecutor {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option=new ChromeOptions();
//		option.setExperimentalOption("excludeSwitches", Arrays.asList("enable-automation"));
		option.setExperimentalOption("excludeSwitches",Arrays.asList("enable-automation"));
		WebDriver driver=new ChromeDriver(option);
		driver.get("https://search.yahoo.com/search?fr=mcafee&type=E211US885G0&p=google");
		
		WebElement Sign=driver.findElement(By.xpath("//a[contains(text(),'Sign in - Google Accounts')]"));
        JavascriptExecutor Js=(JavascriptExecutor) driver;
        Js.executeScript("alert('Hello')");
        Alert alt=driver.switchTo().alert();
        alt.accept();
//      Js.executeScript("arguments[0].value=www.google.com", Send);
        Js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        Thread.sleep(2000);
        Js.executeScript("Sign.scrollIntoView()");
        
	}

}
