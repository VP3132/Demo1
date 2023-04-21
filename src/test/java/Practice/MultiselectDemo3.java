package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiselectDemo3 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		driver.findElement(By.xpath("//input[@id='justAnInputBox']")).click();
		List<WebElement> list = driver.findElements(By.xpath("//span[@class='comboTreeItemTitle']"));


		selectMyChoice(list, "choice 6 2 1","choice 6","choice 6 2 3","choice 2 1");
	}
	
	public static void selectMyChoice(List<WebElement> ele, String...value) {
		
		if(!value[0].equalsIgnoreCase("all")) {
			for (WebElement webElement : ele) {
				String eleText=webElement.getText();
				for(String val:value) {
					String myValue= val;
					if(eleText.equalsIgnoreCase(myValue)) {
						webElement.click();
						break;
					}
				}
			}
		}else {
			for (WebElement webElement : ele) {
				webElement.click();
			}
		}
		
	}

}
