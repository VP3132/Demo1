package SeleniumDemo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TSc_Demo {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\\\SeleniumSource\\\\chromedriver_win32 (3)\\\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.freshersvoice.com/hawkins-recruitment/");
		
		driver.manage().window().maximize();
		
		TakesScreenshot sc=(TakesScreenshot)driver;
		
		File source=sc.getScreenshotAs(OutputType.FILE);
		
		File Location=new File("D:\\ScreenSchot\\fvoice.jpg");
		
		FileUtils.copyFile(source, Location);
		
		driver.close();
		
		System.out.println("WebhomePage ScreenShot Take Succefully ");
		
	}

}

