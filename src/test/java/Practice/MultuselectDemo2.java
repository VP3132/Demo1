package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class MultuselectDemo2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		WebElement IDEName = driver.findElement(By.xpath("//select[@id=\"ide\"]"));
		Select select = new Select(IDEName);
		List<WebElement> list = select.getOptions();
		for (WebElement Listofelement : list) {
			String Option = Listofelement.getText();
			System.out.println(Option);
			if (!Option.equalsIgnoreCase("IntelliJ IDEA")) {
				Listofelement.click();
				Thread.sleep(2000);
			}

		}
		System.out.println("------------------------------");
//		select.deselectAll();
		List<WebElement> Selected = select.getAllSelectedOptions();
		for (WebElement SelectedValue : Selected) {
			System.out.println(SelectedValue.getText());
			SelectedValue.click();
      }
		select.deselectAll();

		for (int i = 0; i < list.size(); i++) {

		    	if (i!= 2) {
				select.selectByIndex(i);
				Thread.sleep(2000);
		}
	}

	}

}
