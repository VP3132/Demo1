package SeleniumDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiselectDemo2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\SeleniumSource\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver Commands = new ChromeDriver();
		Commands.manage().window().maximize();
		Commands.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice");
		Select Comand=new Select(Commands.findElement(By.name("selenium_commands")));
          if(Comand.isMultiple()) {
    	  
    	  System.out.println("Yes it is multi select table");
      }
          List<WebElement>Demo=Comand.getOptions();
          for(WebElement option:Demo) {
        	  
        	  System.out.println(option.getText());
          }
          
	}

}
