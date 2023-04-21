package Practice2;

import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PerformanceAlert {

	public static void main(String[] args) {
		ChromeOptions option=new ChromeOptions();
		HashMap<String,Integer> contents=new HashMap<String, Integer>();
		HashMap<String, Object> Profile=new HashMap<String, Object>();
		HashMap<String, Object> Preference=new HashMap<String, Object>();
		
//		contents.put("notification",0);   // For Show 
//    	contents.put("notification", 1);  // For Allow Access
    	contents.put("notification",2);   // For Block Access
		Profile.put("managed_default_content_settings", contents);
		Preference.put("profile", Profile);
		option.setExperimentalOption("prefs", Preference);
		
		WebDriver driver=new ChromeDriver(option);
		driver.get("https://www.redbus.in/");
		driver.manage().window();
		driver.navigate().refresh();

	}

}
