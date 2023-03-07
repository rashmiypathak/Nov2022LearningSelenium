package learningseleniumconcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebBrowserUtil {
	
	private WebDriver driver;
	
	//Launch Browser
	public WebDriver launchBrowser(String Browser) {
		System.out.println("Selected Browser " +Browser );
		
		switch (Browser) {
		case "chrome":
			driver = new ChromeDriver();
			break;
			
		case "firefox":
			driver = new FirefoxDriver();
			break;
			
		case "edge":
			driver = new EdgeDriver();
			break;

		default:
			System.out.println("Please pass correct browser!!!!");
			break;
		}
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		return driver;
	}
	
	//Open URL
	public void openURL(String URL) {
		driver.get(URL);
	}
	
	//Get Title
	public String fetchCurrentTitle()
	{
		String actTitle = driver.getTitle();
		return actTitle;
	}
	
	//Quit Browser
	public void quitBrowser() {
		driver.quit();
	}
	
	

}
