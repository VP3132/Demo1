package Practice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchWindow {

	public static void main(String[] args) throws InterruptedException {
//	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	String Youtub="https://www.youtube.com/";
	String Telegram ="https://web.tel.onl/";
	
	driver.get(Youtub);
	driver.switchTo().newWindow(WindowType.TAB);
	
	driver.get(Telegram);
	driver.switchTo().newWindow(WindowType.TAB);
	
	driver.get(Youtub);
	driver.switchTo().newWindow(WindowType.TAB);
	
	driver.get(Telegram);
	String Window=driver.getWindowHandle();
	
	Thread.sleep(2000);
	
	Set <String> Multiplewd=driver.getWindowHandles();
	 for(String handel:Multiplewd) {
		 System.out.println(Multiplewd);
	 }
   Iterator<String> Windows=Multiplewd.iterator();
   String st=Windows.next();
   String nd=Windows.next();
   String rd=Windows.next();
   
   driver.switchTo().window(st);
   Thread.sleep(2000);
   driver.switchTo().window(nd);
   Thread.sleep(2000);
   driver.switchTo().window(rd);
   driver.quit();
//   driver.close();
   
   
   
		   
	}

}
