package Practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo {

	public static void main(String[] args) throws InterruptedException {
//		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");

		// Alert Box
//		driver.findElement(By.xpath("//button[@id='alertBox']")).click();
//		Alert alertBox=driver.switchTo().alert();
//		System.out.println(alertBox.getText());
//		//Thread.sleep(2000);
//		alertBox.accept();
//		System.out.println("Alert button is succesfully accepted");
     
//		ConformBox

//		driver.findElement(By.xpath("//button[@id='confirmBox']")).click();
//		Alert ConformBox = driver.switchTo().alert();
//		System.out.println(ConformBox.getText());
//		ConformBox.accept();
//		// Thread.sleep(2000);
//		System.out.println("Conformation Button button is succesfully accepted");

//		Promot Box
		driver.findElement(By.xpath("//button[@id='promptBox']")).click();
		Alert promptBox = driver.switchTo().alert();
		System.out.println(promptBox.getText());
		promptBox.sendKeys("Vinod Potdar");
		promptBox.accept();
		
		// Thread.sleep(2000);
		System.out.println("promptBox  is succesfully accepted");
		
	}

}
