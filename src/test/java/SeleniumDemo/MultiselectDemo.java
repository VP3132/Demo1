package SeleniumDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiselectDemo {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://demoqa.com/select-menu");

		driver.manage().window().maximize();
		Select select = new Select(driver.findElement(By.id("cars")));

		if (select.isMultiple()) {

			System.out.println("Yes It is multiselected value table");
		}
		List<WebElement> options = select.getOptions();

		for (WebElement option : options) {
			System.out.println(option.getText());
			option.click();

		}
	}

}
