package SeleniumDemo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Practice.TakeScreenshot;

public class MultipleScreenShot2 {
      static WebDriver driver;
	public static void main(String[] args) throws IOException {
           driver=new ChromeDriver();
           driver.get("https://www.linkedin.com/");
           takescreenshot("Linkdin");
           
           driver.get("https://clearfeed.freshteam.com/");
           takescreenshot("freshteam");
	}
	public static void takescreenshot(String name) throws IOException {
		TakesScreenshot tc=(TakesScreenshot)driver;
		File location = tc.getScreenshotAs(OutputType.FILE);
		File Source=new File("D:\\ScreenSchot"+name+".png");
		FileUtils.copyDirectory(location, Source);
	}

}
