package SeleniumDemo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumSource\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.navigate().to("https://demoqa.com/alerts");

		driver.findElement(By.xpath("//button[@id='alertButton']")).click();

		Alert Popup = driver.switchTo().alert();
		Thread.sleep(2000);
		Popup.accept();

		driver.close();

	}

}
