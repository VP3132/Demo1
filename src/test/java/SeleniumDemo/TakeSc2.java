package SeleniumDemo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeSc2 {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumSource\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://yourcorporatelife.com/category/jobs/softwaretesting/");
		Thread.sleep(2000);
		TakesScreenshot VD=(TakesScreenshot)driver;
		File JK=VD.getScreenshotAs(OutputType.FILE);
		
		File VK=new File("D:\\ScreenSchot\\Screen.png");
		
		
		FileUtils.copyFile(JK, VK);
		
		driver.close();

	}
	

}
