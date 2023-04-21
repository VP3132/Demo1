package Practice2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class writedropdoenvalue {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.guru99.com/introduction-to-selenium.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.xpath("//li[@id='menu-item-3173']/a/span/span")).click();
		List<WebElement> list = driver.findElements(By.xpath("//ul[@id='primary-menu']/li[2]/ul/li"));
		int count = 0;
		for (WebElement webElement : list) {
			String value = webElement.getText();
			count++;
			System.out.print(count + " " + value + " ");

		
		}
		driver.findElement(By.xpath("//li[@id='menu-item-3174']/a/span/span")).click();
		List<WebElement> list1=driver.findElements(By.xpath("//ul[@class='sub-menu clicked']/li"));
		int count2=0;
		for (WebElement webElement1 : list1) {
			String value2=webElement1.getText();
			count2++;
			System.out.print(count + " " + value2 + " ");
			
			
		}
		
		driver.close();
	}

}
