package SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumFormFill {

	public static void main(String[] args) {
		WebDriver Selenium = new ChromeDriver();

		Selenium.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");

		Selenium.manage().window().maximize();

		WebElement FirstName = Selenium.findElement(By.xpath("//input[@name='firstname']"));
		FirstName.sendKeys("Vinod");
		WebElement LastName = Selenium.findElement(By.xpath("//input[@name='lastname']"));
		LastName.sendKeys("Potdar");

		Selenium.findElement(By.xpath("//input[@value='Male']")).click();
		// Select Sexs=new Select(SS);
		// Sexs.selectByValue("Male");

		WebElement Experiance = Selenium.findElement(By.xpath("//input[@value='3']"));
		Select Experiances = new Select(Experiance);
		Experiances.selectByVisibleText("3");
		WebElement Date = Selenium.findElement(By.xpath("//tbody/tr[5]/td[2]/input[1]"));
		Date.sendKeys("30-09-1996");
		WebElement Profession = Selenium.findElement(By.xpath("//strong[normalize-space()='Profession:']"));
		Select Professions = new Select(Profession);
		Professions.selectByValue("Manual Tester");

	}

}
