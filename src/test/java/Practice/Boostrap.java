package Practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Boostrap {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.jquery-az.com/materialize/demo.php?ex=58.0_2");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@class='select-dropdown dropdown-trigger']")).click();
		//List<WebElement> containt=driver.findElements(By.xpath("//ul[@class='dropdown-content select-dropdown multiple-select-dropdown']/li"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		// Without Header Xpath
		List<WebElement> containt=driver.findElements(By.xpath("//ul[@class='dropdown-content select-dropdown multiple-select-dropdown']/li[not(@class='disabled selected')]"));
		for (WebElement webElement : containt) {
			 
			String Option=webElement.getText();
			if(Option.equalsIgnoreCase("CSS")) {
			webElement.click();
			}
			System.out.println(Option);
			//webElement.click();
			}
			
//			driver.quit();
		
		}
	

}
