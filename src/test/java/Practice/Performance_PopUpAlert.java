package Practice;

import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Performance_PopUpAlert {

	public static void main(String[] args) {
		ChromeOptions option=new ChromeOptions();
		HashMap<String, Integer> Content=new HashMap<String, Integer>();
		HashMap<String, Object> Profile=new HashMap<String, Object>();
		HashMap<String, Object> Preferrence=new HashMap<String, Object>();
		
		Content.put("notification", 2);
		Profile.put("managed_default_content_settings", Content);
		Preferrence.put("profile", Profile);
		option.setExperimentalOption("prefs", Preferrence);
	
		
		
//		option.addArguments("disable-notifications");
		WebDriver driver=new ChromeDriver(option);
		driver.get("https://www.redbus.in/");
        driver.manage().window().maximize();
		driver.navigate().refresh();
	

	}

}
