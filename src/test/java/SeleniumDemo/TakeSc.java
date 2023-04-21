package SeleniumDemo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeSc {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.linkedin.com/feed/");
		TakesScreenshot ts = (TakesScreenshot) driver;
		File Sc = ts.getScreenshotAs(OutputType.FILE);
		File location = new File("D:\\ScreenSchot\\Screen.png");

		FileUtils.copyFile(Sc, location);
		driver.close();

	}

}
