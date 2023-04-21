package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiselect {

	public static void main(String[] args) throws InterruptedException {
//		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		WebElement IDEName=driver.findElement(By.xpath("//select[@id='ide']"));
		
		Select MultipleValue=new Select(IDEName);
		
		MultipleValue.selectByIndex(0);
		
		Thread.sleep(2000);
		
		MultipleValue.selectByValue("ij");
		Thread.sleep(2000);
		
		MultipleValue.selectByVisibleText("NetBeans");
		Thread.sleep(8000);
		
        MultipleValue.deselectAll();
        
        Thread.sleep(5000);
        
       List<WebElement> List =MultipleValue.getOptions();
       for (WebElement Element:List) {
    	   System.out.println(Element);
    	   
       }
		driver.quit();
	}

}
