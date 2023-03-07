package learningseleniumconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PracticeTestWithUtils {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String browser = "chrome";
		String URL = "https://naveenautomationlabs.com/opencart/index.php?route=account/register";
		
		WebBrowserUtil wb = new WebBrowserUtil();
		WebDriver driver = wb.launchBrowser(browser);
		
		wb.openURL(URL);
		System.out.println(wb.fetchCurrentTitle());
		
		ElementUtil e = new ElementUtil(driver);
		
		By firstName = By.id("input-firstname");
		By lastName = By.id("input-lastname");
		By email = By.id("input-email");
		By telephone = By.id("input-telephone");
		By password = By.id("input-password");
		By confirmPassword = By.id("input-confirm");
		
		e.doSendKeys(firstName, "Rashmi");
		e.doSendKeys(lastName, "Pathak");
		e.doSendKeys(email, "Rashmi@gmail.com");
		e.doSendKeys(telephone, "8523697415");
		e.doSendKeys(password, "Password@123");
		e.doSendKeys(confirmPassword, "Password@123");
		
		wb.quitBrowser();
		
		
	}

}
