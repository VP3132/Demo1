package SeleniumDemo;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windows_Switch {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumSource\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String URL1 = "https://login.salesforce.com/";
		String URL2 = "https://www.google.co.in/";

		driver.get(URL2);
		String Title1 = driver.getTitle();
		// input[@title='Search']
		WebElement ED = driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']//input[@name='btnI']"));
		boolean AS = ED.isDisplayed(); // Displayed Value
		System.out.println("Status of displayed is" + AS);
		System.out.println("Title of the Window:" + Title1);
		driver.manage().window().maximize();

		Thread.sleep(4000);

		driver.switchTo().newWindow(WindowType.TAB); // Switch Window Parent to child
		driver.get(URL1);
		String Title2 = driver.getTitle();
		WebElement LGNBTN = driver.findElement(By.xpath("//input[@id='Login']"));
		boolean IS = LGNBTN.isDisplayed();
		System.out.println("Status of login disply button is;" + IS);
		System.out.println("Title of 2nd window is;" + Title2);
//	    driver.switchTo().window(URL2);  // Switch to child to parent

		driver.switchTo().newWindow(WindowType.TAB);
		driver.get(URL2);

//	    driver.switchTo().window(URL1);

		Thread.sleep(10000);

//	    driver.switchTo().window(URL2);
		// driver.close();

		String Id2 = driver.getWindowHandle();
//	    System.out.println(Id2);

		Set<String> DH = driver.getWindowHandles();
		for (String ID : DH) {
			System.out.println(ID);
		}

		Iterator<String> HG = DH.iterator();
		String StWindow = HG.next();
		String NdWindow = HG.next();
		String RDWindow = HG.next();

		driver.switchTo().window(StWindow);

		Thread.sleep(4000);

		driver.switchTo().window(NdWindow);

		Thread.sleep(4000);

		driver.switchTo().window(RDWindow);

		Thread.sleep(4000);

		driver.switchTo().window(NdWindow);
		driver.quit();

	}

}
