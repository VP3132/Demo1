package SeleniumDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExclipityWait {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"D:\\\\SeleniumSource\\\\chromedriver_win32 (3)\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.olx.in/");

		Actions Rav = new Actions(driver);
		Rav.sendKeys(Keys.PAGE_DOWN).build().perform();

		driver.findElement(By.xpath("//span[normalize-space()='Login']")).click();
//		driver.findElement(By.xpath("//span[contains(text(),'Login with Email')]")).click();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Login with Email')]")))
				.click();
		driver.findElement(By.xpath("//input[@id='email_input_field']")).sendKeys("PotdarVinod3132@gmail.com");

		WebDriverWait Clicks = new WebDriverWait(driver, Duration.ofSeconds(10));
		Clicks.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='Next']"))).click();

	}

}
