package Practice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenshot {

	public static void main(String[] args) throws IOException {
//		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.get("https://phptravels.org/register.php");

		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Vinod");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Potdar");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("VinodPotdar96@gmail.com");

		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File source = screenshot.getScreenshotAs(OutputType.FILE);
		File location = new File("./Screenshot/phptravels.png");
		FileUtils.copyFile(source, location);

	}

}
