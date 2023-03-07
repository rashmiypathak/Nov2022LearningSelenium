package learningseleniumconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationTestPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String browser = "chrome";
		String URL = "https://naveenautomationlabs.com/opencart/index.php?route=account/login";
		
		WebBrowserUtil wb = new WebBrowserUtil();
		WebDriver driver = wb.launchBrowser(browser);
		
		wb.openURL(URL);
		String title = wb.fetchCurrentTitle();
		System.out.println("Current Title: " +title);
		
	
		ElementUtil e = new ElementUtil(driver);
		By registerLink = By.linkText("Register");
		By orderLink = By.linkText("Order History");
		e.doClick(registerLink);
		
		
		By firstName = By.name("firstname");
		By lastName = By.id("input-lastname");
		By email = By.xpath("//*[@id=\"input-email\"]");
		By telephone = By.cssSelector("#input-telephone");
		By password = By.id("input-password");
		By confirmPassword = By.id("input-confirm");
		By privacyPolicy = By.name("agree");
		By continueBtn = By.xpath("//*[@id=\"content\"]/form/div/div/input[2]");
		
		//Registration Steps	
		e.doSendKeys(firstName, "Rash");
		e.doSendKeys(lastName, "Pathak");
		e.doSendKeys(email, "rash@gmail.com");
		e.doSendKeys(telephone, "9856321047");
		e.doSendKeys(password, "Pass@123");
		e.doSendKeys(confirmPassword, "Pass@123");
		e.doClick(privacyPolicy);
		e.doClick(continueBtn);
		
		By confirmMsg = By.tagName("h1");
		String msg = e.doGetText(confirmMsg);
		if(msg.equalsIgnoreCase("Your Account Has Been Created!")) {
			System.out.println("Registration Successfull!!!");
		}
		else {
			System.out.println("Registration Failed!!!");
		}
		
		//Click on order history link
		e.doClick(orderLink);
		By confirmOrderPage = By.tagName("h1");
		String orderConfirmMsg = e.doGetText(confirmOrderPage);
		if(orderConfirmMsg.equalsIgnoreCase("Order History")){
			System.out.println("You successfully navigated to order history page!!!" +orderConfirmMsg);
		}
		else
			System.out.println("Navigation Failed!!!");
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
