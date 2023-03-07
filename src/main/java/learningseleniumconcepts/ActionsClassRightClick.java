package learningseleniumconcepts;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClassRightClick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
		
		WebElement rightClick = driver.findElement(By.xpath("//span[text()='right click me']"));
		Actions act = new Actions(driver);
		act.contextClick(rightClick).build().perform();
		Alert alert;
		List<WebElement> rightClickLists = driver.findElements(By.xpath("//ul[contains(@class, 'context-menu-root')]//span"));
		int counter = 0;
		for(WebElement e : rightClickLists) {
			
			System.out.println(e.getText());
			e.click();
			Thread.sleep(3000);
			 alert = driver.switchTo().alert();
			 String alertText = alert.getText();
			 switch (alertText) {
				case "clicked: edit":
					System.out.println("User clicked on edit");
					break;

				case "clicked: cut":
					System.out.println("User clicked on cut");
					break;

				case "clicked: copy":
					System.out.println("User clicked on copy");
					break;

				case "clicked: paste":
					System.out.println("User clicked on paste");
					break;

				case "clicked: delete":
					System.out.println("User clicked on delete");
					break;

				case "clicked: quit":
					System.out.println("User clicked on quit");
					break;

				default:
					break;
			}
			 counter++;
			 alert.accept();
			 if(counter < rightClickLists.size())
			 act.contextClick(rightClick).build().perform();
			 }
			 
		}
		
	}


