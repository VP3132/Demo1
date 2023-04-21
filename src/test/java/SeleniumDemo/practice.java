package SeleniumDemo;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class practice {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		Actions action = new Actions(driver);
		action.sendKeys(Keys.DOWN).build().perform();
		
		Thread.sleep(20000);
		
		
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("https://testng.org/doc/");
		list.add("https://www.naukri.com/");
		list.add("https://facebook.com");
		list.add("https://twitter.com");
		list.add("https://Netflix.com");
		
		
		for (int i = 0; i < list.size(); i++) {
			driver.switchTo().newWindow(WindowType.TAB);
			driver.get(list.get(i));

		}
		Set<String> windows = driver.getWindowHandles();
		ArrayList<String> lists = new ArrayList<String>(windows);

		for (String ID : lists) {

			driver.switchTo().window(ID);
			String Title = driver.getTitle();

			if (Title.contains("Facebook")) {
				System.out.println("Current window title_" + driver.getTitle());
				break;
			} else {
				System.out.println(driver.getTitle());
			}
 
		}

	}

}
