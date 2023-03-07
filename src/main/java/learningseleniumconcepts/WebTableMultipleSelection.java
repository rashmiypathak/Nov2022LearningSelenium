package learningseleniumconcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WebTableMultipleSelection {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://datatables.net/extensions/select/examples/initialisation/checkbox.html");
		Thread.sleep(3000);
		String country = "London";
		//String multipleCheckbox = "(//table[@id='tablepress-1']//td[text()='India'])/preceding-sibling::td/input[@type='checkbox']";
		String multiCheckBox = "(//table[@id='example']/tbody//td[text()='"+country+"'])/preceding-sibling::td[contains(@class, 'checkbox')]";
		Actions act = new Actions(driver);

		while(true) {
			
				List<WebElement> checkBoxClick = driver.findElements(By.xpath(multiCheckBox));
				WebElement nextBtnXpath = driver.findElement(By.xpath("//a[text()='Next']"));
				List<WebElement> disabledNextBtn = driver.findElements(By.xpath("//a[contains(@class, 'next disabled')]"));
				
				System.out.println("Total checkbox for selection based on country: " + checkBoxClick.size());
				for(WebElement e : checkBoxClick) {
					act.keyDown(Keys.CONTROL).build().perform();
					e.click();
					act.keyUp(Keys.CONTROL).build().perform();
				}
				if(disabledNextBtn.size()>0) {
				break;
				}
				else {
					nextBtnXpath.click();
				}
			}
		WebElement selectionCount = driver.findElement(By.xpath("//div[@id='example_info']//span"));
		System.out.println(selectionCount.getText());
				
		}	
	}



