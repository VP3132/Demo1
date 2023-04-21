package FormFillup;

import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DownloadFile {

	public static void main(String[] args) {
		ChromeOptions option = new ChromeOptions();
		HashMap<String, Object> preference = new HashMap<String, Object>();
		preference.put("Plugins.always_open_pdf_externally", true);
		preference.put("download.default_directory", "D:\\MY Document");

		option.setExperimentalOption("prefs", preference);
        
		WebDriver driver=new ChromeDriver(option);
		driver.get("https://file-examples.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//a[@href='https://file-examples.com/index.php/sample-documents-download/'][normalize-space()='Browse']")).click();
		driver.findElement(By.xpath("//td[normalize-space()='DOC, DOCX']/following-sibling::td/a")).click();
		driver.findElement(By.xpath("//tbody/tr[1]/td[5]/a[1]")).click();
		
		System.out.println("File Download succefully");
	}

}
