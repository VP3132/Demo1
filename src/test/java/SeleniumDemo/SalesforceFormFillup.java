package SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SalesforceFormFillup {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumSource\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		String URL1 = "https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk";
		driver.get(URL1);
		driver.manage().window().maximize();

		String Title = driver.getTitle();
		System.out.println("Title of webpage is;" + Title);

		driver.findElement(By.name("UserFirstName")).sendKeys("Vinod");

		driver.findElement(By.name("UserLastName")).sendKeys("Potdar");
		driver.findElement(By.name("UserEmail")).sendKeys("PotdarVinod3132@gmail.com");
		WebElement US = driver.findElement(By.name("UserTitle"));
		driver.findElement(By.name("CompanyName")).sendKeys("Brain Vision technology");
		Select Title2 = new Select(US);
		Title2.selectByIndex(7);
		WebElement Employe = driver.findElement(By.name("CompanyEmployees"));

		Select EMP = new Select(Employe);
		EMP.selectByIndex(1);

		driver.findElement(By.name("UserPhone")).sendKeys("8669138779");

		WebElement Country = driver.findElement(By.name("CompanyCountry"));

		Select Region = new Select(Country);
		Region.selectByIndex(10);
		driver.findElement(By.className("checkbox-ui")).click();
		driver.findElement(By.name("start my free trial")).click();

	}

}
