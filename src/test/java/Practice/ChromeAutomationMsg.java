package Practice;

import java.util.Arrays;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeAutomationMsg {

	public static void main(String[] args) {
	
  ChromeOptions option=new ChromeOptions();
//  option.setExperimentalOption("excludeSwitches",new String[] {"enable-automation"});
    option.setExperimentalOption("excludeSwitches", Arrays.asList("enable-automation"));
  WebDriver driver=new ChromeDriver(option);
  driver.get("https://www.google.com/");
	}

}
