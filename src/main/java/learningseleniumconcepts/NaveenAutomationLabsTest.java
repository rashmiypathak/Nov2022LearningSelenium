package learningseleniumconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NaveenAutomationLabsTest {

	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		driver = new ChromeDriver();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		driver.manage().window().maximize();
		
		//Approach 1
		/*
		 * driver.findElement(By.id("input-firstname")).sendKeys("Rashmi");
		 * driver.findElement(By.id("input-lastname")).sendKeys("Pathak");
		 * driver.findElement(By.id("input-email")).sendKeys("rashmi@gmail.com");
		 * driver.findElement(By.id("input-telephone")).sendKeys("9632587412");
		 * driver.findElement(By.id("input-password")).sendKeys("Password@123");
		 * driver.findElement(By.id("input-confirm")).sendKeys("Password@123");
		 */
		
		//Approach 2
//		
//		WebElement firstName = driver.findElement(By.id("input-firstname"));
//		WebElement lastName = driver.findElement(By.id("input-lastname")); 
//		WebElement email = driver.findElement(By.id("input-email"));
//		WebElement telephone = driver.findElement(By.id("input-telephone"));
//		WebElement password = driver.findElement(By.id("input-password"));
//		WebElement confirmPassword = driver.findElement(By.id("input-confirm"));
//		
//		firstName.sendKeys("Rashmi");
//		lastName.sendKeys("Pathak");
//		email.sendKeys("rashmi@gmail.com");
//		telephone.sendKeys("9632587410");
//		password.sendKeys("Password@123");
//		confirmPassword.sendKeys("Password@123");
//		
		//Approach 3
//		By firstName = By.id("input-firstname");
//		By lastName = By.id("input-lastname");
//		By email = By.id("input-email");
//		By telephone = By.id("input-telephone");
//		By password = By.id("input-password");
//		By confirmPassword = By.id("input-confirm");
//		
//		WebElement fname = driver.findElement(firstName);
//		WebElement lname = driver.findElement(lastName);
//		WebElement em = driver.findElement(email);
//		WebElement phone = driver.findElement(telephone);
//		WebElement pass = driver.findElement(password);
//		WebElement conPass = driver.findElement(confirmPassword);
//		
//		fname.sendKeys("Rashmi");
//		lname.sendKeys("Pathak");
//		em.sendKeys("rashmi@test.com");
//		phone.sendKeys("9632587410");
//		pass.sendKeys("Password@123");
//		conPass.sendKeys("Password@123");
		
		//Approach 4
//		By firstName = By.id("input-firstname");
//		By lastName = By.id("input-lastname");
//		By email = By.id("input-email");
//		By telephone = By.id("input-telephone");
//		By password = By.id("input-password");
//		By confirmPassword = By.id("input-confirm");
//		
//		getElement(firstName).sendKeys("Rashmi");
//		getElement(lastName).sendKeys("Pathak");
//		getElement(email).sendKeys("Rashmi@gmail.com");
//		getElement(telephone).sendKeys("3698152001");
//		getElement(password).sendKeys("Password@123");
//		getElement(confirmPassword).sendKeys("Password@123");
		
		//Approach 5
		By firstName = By.id("input-firstname");
		By lastName = By.id("input-lastname");
		By email = By.id("input-email");
		By telephone = By.id("input-telephone");
		By password = By.id("input-password");
		By confirmPassword = By.id("input-confirm");
		
		doSendKeys(firstName, "Rashmi");
		doSendKeys(lastName, "Pathak");
		doSendKeys(email, "Rashmi@gmail.com");
		doSendKeys(telephone, "8523697415");
		doSendKeys(password, "Password@123");
		doSendKeys(confirmPassword, "Password@123");
			
		
	}	
	//Approach 4
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
		
	}
	
	//Approach 5
	public static void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}
	

}
