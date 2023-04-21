package Practice;

import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class FileDownload {

	public static void main(String[] args) {

		// For ChromeDriver Browser

//	   ChromeOptions option= new ChromeOptions();
//	   
//	   HashMap<String, Object> Preference=new HashMap<String, Object>();
//	   Preference.put("plugins.always_open_pdf_externally", true);
//	   Preference.put("download.default_directory", "D:\\TestFile");
//	   option.setExperimentalOption("prefs", Preference);
//	   WebDriver driver=new ChromeDriver(option);
//		
		// For EdgeBrowser
		
		EdgeOptions option= new EdgeOptions();
		 HashMap<String, Object> Preference=new HashMap<String, Object>();
		   Preference.put("plugins.always_open_pdf_externally", true);
		   Preference.put("download.default_directory", "D:\\TestFile");
		   option.setExperimentalOption("prefs", Preference);
		  WebDriver driver=new EdgeDriver(option);

//		// For FirefoxBrowser
//		FirefoxOptions option = new FirefoxOptions();
//		FirefoxProfile Profile = new FirefoxProfile();
//		Profile.setPreference("pdfjs.disabled", true);
//		Profile.setPreference("browser.helperApps.neverAsk.saveToDisk",
//				"aapplication/doc,application/ms-doc,application/msword,application/vnd.openxmlformats-officedocument.wordprocessingml.document");
//		Profile.setPreference("browser.download.dir", "D:\\\\TestFile");
//		Profile.setPreference("browser.download.folderList", 2);
//		option.setProfile(Profile);
//		WebDriverManager.firefoxdriver().setup();
//		WebDriver driver = new FirefoxDriver(option);

		driver.get("https://file-examples.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//h3[text()='Documents']/following-sibling::a")).click();
		String FILETYPE = "PDF";
		String FileType = "DOC, DOCX";
		String FileSize = "500kB";
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//td[text()='" + FileType + "']/following-sibling::td/a")).click();
		driver.findElement(By.xpath("//td[text()='" + FileSize + "']//following-sibling::td/a")).click();

	}

}
