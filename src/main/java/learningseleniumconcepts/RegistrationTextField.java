package learningseleniumconcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegistrationTextField {

	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		List<WebElement> textList =  driver.findElements(By.className("form-control"));	
		
		List<WebElement> footerLink = driver.findElements(By.xpath("//footer//a"));
		
		//total textboxes on page
		int textBoxCount= textList.size();
		System.out.println("Total textbox on page -->" +textBoxCount);
		
		for(WebElement e : textList) {
			System.out.println(e.getAttribute("name"));
		}
		
		//total footer links on page
		int footerLinkCount = footerLink.size();
		System.out.println("Total links in footer -->" +footerLinkCount);
		
		for(WebElement e : footerLink) {
			System.out.println(e.getText());
		}
		
		driver.quit();
	}

}
