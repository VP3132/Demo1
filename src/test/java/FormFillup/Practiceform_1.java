package FormFillup;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practiceform_1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumSource\\chromedriver_win32 (3)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.techlistic.com/p/selenium-practice-form.html");

		driver.manage().window().maximize();

		WebElement Name = driver.findElement(By.xpath("//input[@name='firstname']"));
		Name.sendKeys("Vinod");

		WebElement LastName = driver.findElement(By.xpath("//input[@name='lastname']"));
		LastName.sendKeys("Potdar");

		WebElement Gender = driver.findElement(By.xpath("//input[@id='sex-0']"));
		Gender.click();

		WebElement Experiance = driver.findElement(By.xpath("//input[@id='exp-0']"));
		Experiance.click();

		JavascriptExecutor JS = (JavascriptExecutor) driver;
		JS.executeScript("window.scrollBy(0,1000)");

		// JS.executeScript("window.scrollBy(X Axis,Y Axis)"

		WebElement Date = driver.findElement(By.xpath("//input[@id='datepicker']"));
		Date.sendKeys("12-06-2022");

		WebElement Profession = driver.findElement(By.xpath("//input[@id='profession-0']"));
		Profession.click();

		WebElement Tool = driver.findElement(By.xpath("//input[@id='tool-2']"));
		Tool.click();

		WebElement Con = driver.findElement(By.xpath("//select[@id='continents']"));

		Select continents = new Select(Con);
		continents.selectByIndex(1);
		JavascriptExecutor hS = (JavascriptExecutor) driver;
		hS.executeScript("window.scrollBy(0,9000)");

		WebElement SeleniumCommands = driver.findElement(By.xpath("//select[@id='selenium_commands']"));
		Select Commands = new Select(SeleniumCommands);
		Commands.selectByVisibleText("Navigation Commands");

		WebElement UploadPic = driver.findElement(By.xpath("//input[@id='photo']"));
		UploadPic.sendKeys("D:\\MY Document\\BSc Marklist.pdf");

		WebElement Submite = driver.findElement(By.xpath("//button[@id='submit']"));
		Submite.click();
		JavascriptExecutor KS = (JavascriptExecutor) driver;
		KS.executeScript("window.scrollBy(0,10000)");
//		Thread.sleep(20000);

//		driver.close();

	}

}
