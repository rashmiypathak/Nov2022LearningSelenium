package learningseleniumconcepts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class ActionsClassMoveToElement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("disable-geolocation");
//		
//		DesiredCapabilities cap = new DesiredCapabilities();
//		cap.setCapability(ChromeOptions.CAPABILITY, options);
//		cap = cap.merge(DesiredCapabilities.chrome());
//		driver = new ChromeDriver(cap);

		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		Actions act = new Actions(driver);
		
		
		driver.manage().window().maximize();
		WebElement addOn = driver.findElement(By.xpath("//div[text()='Add-ons']"));
		//act.moveToElement(addOn).build().perform();
		
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
		Thread.sleep(3000);
		addOn.click();
		driver.findElement(By.xpath("//div[text()='Activities']")).click();
		
		

	}

}
