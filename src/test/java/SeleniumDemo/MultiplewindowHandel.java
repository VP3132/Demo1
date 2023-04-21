package SeleniumDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiplewindowHandel {

	public static void main(String[] args) throws InterruptedException {
//		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		String URL1 = "https://www.google.com/";
		String URL2 = "https://web.tel.onl/";

		driver.get(URL1);
		String Title3 = driver.getTitle();
		System.out.println(Title3);
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get(URL2);
		String Title1 = driver.getTitle();
		System.out.println(Title1);
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get(URL1);
		String Title2 = driver.getTitle();
		System.out.println(Title2);
		
//		List Of String
		Set<String> Windowhandels = driver.getWindowHandles();
		ArrayList<String> list = new ArrayList<String>(Windowhandels);
		
		for(String title:list) {
			System.out.println();
		}
		
		Iterator<String> Window = Windowhandels.iterator();
		String Fst = Window.next();
		String Snd = Window.next();
		String Trd = Window.next();

		driver.switchTo().window(Fst);

		Thread.sleep(2000);
		driver.switchTo().window(Trd);

		Thread.sleep(2000);
		driver.switchTo().window(Snd);

	}

}
