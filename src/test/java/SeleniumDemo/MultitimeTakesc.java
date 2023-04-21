package SeleniumDemo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultitimeTakesc {
	static WebDriver driver;

	public static void main(String[] args) throws IOException {

		driver = new ChromeDriver();

		driver.get("https://www.freshersvoice.com/hawkins-recruitment/");
		takesscreenshot("HomePage1");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.youtube.com/watch?v=OzLagqKV3x0");
		takesscreenshot("Youtub1");

		driver.manage().window().maximize();
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://mail.google.com/");
		takesscreenshot("MailBoxPage1");

	}

	public static void takesscreenshot(String Name) throws IOException

	{
		TakesScreenshot sc = (TakesScreenshot) driver;
		File location = sc.getScreenshotAs(OutputType.FILE);
		File Source = new File("D:\\ScreenSchot" + Name + ".jpg");

		FileUtils.copyFile(location, Source);

		System.out.println("Screenshots take succefully done");
//		File SP=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		
//		FileUtils.copyFile(SP,new File("D:\\ScreenSchot"+ Name +".png"));

	}

}
