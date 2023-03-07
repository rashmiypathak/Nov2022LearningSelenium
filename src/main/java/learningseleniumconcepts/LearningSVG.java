package learningseleniumconcepts;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LearningSVG {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://petdiseasealerts.org/forecast-map/#/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		String selectedState = "Texas";
		
		
		//switch to frame
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id, 'map-instance')]")));
		
		//capture svg xpath
		String svgXpath = "//*[local-name()='svg' and  @id='map-svg']//*[name()='g' and @id='regions']//*[name()='path']";
		List<WebElement> stateList = driver.findElements(By.xpath(svgXpath));
		WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(10));		

		
		int stateCount = stateList.size();
		System.out.println("State count: " +stateCount);
		for(WebElement e : stateList) {
			String stateName = e.getAttribute("name");
			System.out.println("State name: " +stateName);

			Actions act = new Actions(driver);
			if(stateName.equals(selectedState)) {
				if(stateName.equals("Hawaii")) {
					int height = e.getSize().getHeight();
					int width = e.getSize().getWidth();
					System.out.println("Hawaii height:" +height+ " Hawaii width:" +width);
					act.moveToElement(e, (width/2)-15, (height/2)-12).click().build().perform();
					break;
				}

				else if(selectedState.equals("Florida")) {
					int height = e.getSize().getHeight();
					int width = e.getSize().getWidth();
					System.out.println("Florida height:" +height+ " Florida width:" +width);
					act.moveToElement(e, (width/2)-40, 0).click().build().perform();
					break;
				}

				else {		
						System.out.println("Selected state in else loop: "+stateName);
						//act.scrollToElement(e).click().build().perform();
						e.click();
						WebElement stateLabel = driver.findElement(By.xpath("//span[text()='"+selectedState+"']"));
						wait.until(ExpectedConditions.visibilityOf(stateLabel));						
						break;
					}
				}
			}	
			////*[local-name()='svg' and @id ='map-svg']//*[name() = 'g' and @id='new-york']//*[name()='g' and @class = 'subregion']//*[name()='path']
			String countyXpath = "//*[local-name()='svg' and @id ='map-svg']//*[name() = 'path' and @name = '"+selectedState+"']/../..//*[name()='g' and @class='subregion']//*[name()='path']";
			List<WebElement> countyList = driver.findElements(By.xpath(countyXpath));
			System.out.println("County counts for " +selectedState+ " is " +countyList.size());

			for(WebElement e : countyList) {
				String countyName = e.getAttribute("name");
				System.out.println("county name: " +countyName);
			}
			driver.quit();
		}
	}
