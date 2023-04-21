package Practice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Arrays;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PracticeAll {

	public static void main(String[] args) throws InterruptedException, AWTException {
		ChromeOptions option = new ChromeOptions();
//		option.setExperimentalOption("excludeSwitches", Arrays.asList("enable-automation"));
		option.setExperimentalOption("excludeSwitches", Arrays.asList("enable-automation"));
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Thread.sleep(2000);
		driver.navigate().back();
		driver.get("https://testng.org/doc/");
		WebElement clicks = driver.findElement(By.xpath("//a[normalize-space()='Welcome']"));

//		JavaScriptExicutors Interface
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click", clicks);
		executor.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(5000);
		driver.switchTo().newWindow(WindowType.TAB);
//		driver.get("https://search.yahoo.com/search?fr=mcafee&type=E211US885G0&p=testng");
		driver.get(
				"https://www.easemytrip.com/?adgroupid=1161085082876294&msclkid=8402913374821daf17e1f28e71b61047&utm_source=bing&utm_medium=cpc&utm_campaign=Non%20Brand%20(Flights%20Booking)_Desktop&utm_term=airline%20tickets&utm_content=Keywords-Ticket_EM");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.alertIsPresent());

//		Alerts class
		Alert alert = driver.switchTo().alert();
		alert.accept();
		Thread.sleep(5000);

//		Action Class
		Actions action = new Actions(driver);
		action.sendKeys(Keys.DOWN).build().perform();
		action.click(driver.findElement(By.xpath("//li[@id='rtrip']")));

//		FileUpload
		driver.get("https://demoqa.com/automation-practice-form");

		driver.manage().window().maximize();
		Actions SS = new Actions(driver);

		SS.sendKeys(Keys.DOWN).build().perform();
		SS.sendKeys(Keys.DOWN).build().perform();
		SS.sendKeys(Keys.DOWN).build().perform();
		SS.sendKeys(Keys.DOWN).build().perform();
		WebElement Files = driver.findElement(By.xpath("//input[@id='uploadPicture']"));

		JavascriptExecutor vp = (JavascriptExecutor) driver;

		vp.executeScript("arguments[0].click", Files);
		StringSelection selection = new StringSelection("./Screenshot/phptravels.png");

		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);

		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);

	}

}
