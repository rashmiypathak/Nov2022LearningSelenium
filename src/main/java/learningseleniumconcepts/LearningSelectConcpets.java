package learningseleniumconcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearningSelectConcpets {
	
	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		driver.get("https://www.indianrail.gov.in/enquiry/SEAT/SeatAvailability.html?locale=en");
		
		By trainNo = By.xpath("//input[@id='trainNo']");
		By sourceStation = By.xpath("//input[@id='sourceStation']");
		By destinationStation = By.xpath("//input[@id='destinationStation']");
		By trainClass = By.id("class");
		//By ticketQuota = By.id("quota");
		
		WebElement ticketClassName = driver.findElement(By.id("class"));
		WebElement ticketQuota = driver.findElement(By.id("quota"));
		
		//fetch all values from class dropdown
		Select select = new Select(ticketClassName);
		
		select.selectByVisibleText("THIRD AC");
		List<WebElement> classList = select.getOptions();
		System.out.println("---List of class---");
		for(WebElement e : classList) {
			System.out.println(e.getText());
		}
		
		
		//fetch all values from quota dropdown
		Select quotaSelect = new Select(ticketQuota);
		
		List<WebElement> quotaList = quotaSelect.getOptions();
		System.out.println("---List of all quotas---");
		for(WebElement e : quotaList) {
			System.out.println(e.getText());
		}
		
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	

}
