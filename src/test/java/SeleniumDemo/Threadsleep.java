package SeleniumDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Threadsleep {

	public static void main(String[] args) {
		WebDriver Vinod = new ChromeDriver();
		Vinod.manage().window().fullscreen();
		String Vinod2 = "https://www.google.com/";
		String Vinod3 = "https://web.whatsapp.com/";
		Vinod.navigate().to(Vinod2);
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {

		}
		Vinod.navigate().to(Vinod3);
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {

		}

		Vinod.navigate().back();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {

		}
		Vinod.navigate().forward();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {

		}
		Vinod.navigate().refresh();

	}

}
