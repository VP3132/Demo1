package SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumSource\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver MB = new ChromeDriver();

		MB.navigate().to("https://www.airindia.in/");
		MB.manage().window().maximize();
		WebElement RoundTrip = MB.findElement(By.xpath("//label[@id='lblRoundTrip']"));
		WebElement From = MB.findElement(By.xpath("//input[@id='from']"));
		WebElement To = MB.findElement(By.xpath("//input[@id='to']"));
//		WebElement Departing=MB.findElement(By.name("Departing"));
//		Select Date=new Select(Departing);
//		Date.selectByValue("11");
		WebElement NAdult = MB.findElement(By.xpath("//select[@id='ddladult1']"));
		WebElement Childrean = MB.findElement(By.xpath("//select[@id='ddlchildren1']"));
		WebElement Infant = MB.findElement(By.xpath("//select[@id='ddlinfants1']"));
		WebElement TravelType = MB.findElement(By.xpath("//select[@id='concessionaryType1']"));
		WebElement Economy = MB.findElement(By.id("_classType1"));
		WebElement eligibilityCriteria = MB.findElement(By.xpath("//a[@title='Eligibility Rules']"));
		WebElement Search = MB.findElement(By.xpath("//input[@id='btnbooking']"));
		RoundTrip.click();
		From.sendKeys("Pune");
		To.sendKeys("Chennai");
		Select Adult = new Select(NAdult);
		Adult.selectByIndex(8);
		Select Childrens = new Select(Childrean);
		Childrens.selectByIndex(2);
		Select Infants = new Select(Infant);
		Infants.selectByIndex(2);
		Select TravelTypes = new Select(TravelType);
		TravelTypes.selectByVisibleText("War Widow");
		Select Economys = new Select(Economy);
		Economys.selectByValue("Economy");
		eligibilityCriteria.click();
		Search.sendKeys("416312");
		
	}

}
