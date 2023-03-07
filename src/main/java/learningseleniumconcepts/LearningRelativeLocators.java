package learningseleniumconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class LearningRelativeLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		WebElement ele = driver.findElement(By.xpath("//label[@for = 'input-email']"));
		System.out.println(ele.getText());
		
		//get below element
		WebElement belowEle = driver.findElement(with(By.tagName("input")).below(ele));
		System.out.println("Below element is :" + belowEle.getAttribute("name"));
		
		//get above element
		WebElement aboveEle = driver.findElement(with(By.tagName("p")).above(ele));
		System.out.println("Above element is :" + aboveEle.getText());

		//get left element
		WebElement leftEle = driver.findElement(with(By.tagName("h2")).toLeftOf(ele));
		System.out.println("Left element is :" + leftEle.getText());
		
		driver.quit();
	}

}
