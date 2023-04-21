package Practice2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiselectDemo {

	public static void main(String[] args) {
		
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		WebElement IDEName = driver.findElement(By.xpath("//select[@id=\"ide\"]"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		Select select=new Select(IDEName);
		List<WebElement> list=select.getOptions();
		for (WebElement webElement : list) {
			System.out.println(webElement.getText());
		}
		
		for(int i=0;i<list.size();i++) {
			if(i!=3) {
			select.selectByIndex(i);
			}
			
		}
		
		
		

	}


}
