package SeleniumDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiselectDemo3 {

	public static void main(String[] args) {

		WebDriver Selenium = new ChromeDriver();

		Selenium.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice");
		Selenium.manage().window().maximize();

		Select Commands = new Select(Selenium.findElement(By.name("selenium_commands")));

		if (Commands.isMultiple()) {
			System.out.println("Yes it is multiple type value table");

		}
		List<WebElement> Com = Commands.getOptions();

		for (WebElement Option : Com) {
			System.out.println(Option.getText());

		}

		WebElement First = Commands.getFirstSelectedOption();
		{
			System.out.println(First.getText());
		}
	}
}
