package Practice;

import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FileDownloaded2 {

	public static void main(String[] args) {
		ChromeOptions option = new ChromeOptions();
		HashMap<String, Object> value = new HashMap<>();
		value.put("plugins.always_open_pdf_externally", true);
		value.put("download.default_directory", "C:\\Drive");
		option.setExperimentalOption("prefs", value);

		WebDriver driver = new ChromeDriver(option);
		driver.navigate().to("https://file-examples.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath(
				"//a[@href='https://file-examples.com/index.php/sample-documents-download/'][normalize-space()='Browse']"))
				.click();
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[3]/a[1]"))
				.click();
	
		driver.findElement(By.xpath("//tbody/tr[1]/td[5]/a[1]")).click();
		
		driver.close();
	}

}
