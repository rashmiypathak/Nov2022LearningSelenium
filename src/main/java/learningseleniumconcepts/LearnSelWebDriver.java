package learningseleniumconcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LearnSelWebDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Decide and Launch browser
		String browser = "Chrome";
		WebDriver driver = null;
		
		switch (browser) {
		case "Chrome":
			driver = new ChromeDriver();
			break;
			
		case "Firefox":
			driver = new FirefoxDriver();
			break;
			
		case "Edge":
			driver = new EdgeDriver();
			break;

		default:
			System.out.println("-----Browser not found, please enter correct browser!-----");
			break;
		}
		
		//Open amazon application
		driver.get("https://www.amazon.com");
		
		//Get Title
		String actualTitle = driver.getTitle();
		System.out.println("Browser Title = " +actualTitle);
		
		if(actualTitle.contains("Amazon")) {
			System.out.println("PASS");
		}
		else {
			System.out.println("FAIL");
		}
		
		//close browser
		driver.quit();
		

	}

}
