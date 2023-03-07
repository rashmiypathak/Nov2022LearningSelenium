package learningseleniumconcepts;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowHandling {
	
	static WebDriver driver;
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		System.out.println("Parent Window Title" + driver.getTitle());
		String parentHandle = driver.getWindowHandle();
		
		WebElement linkedLink = driver.findElement(By.xpath("//a[contains(@href, 'linkedin')]"));
		WebElement facebookLink = driver.findElement(By.xpath("//a[contains(@href, 'facebook')]"));
		WebElement twitterLink = driver.findElement(By.xpath("//a[contains(@href, 'twitter')]"));
		WebElement youtubeLink = driver.findElement(By.xpath("//a[contains(@href, 'youtube')]"));
		
		//click on linkedin-->get title and close
		linkedLink.click();
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		String parentWindowID = it.next(); //will get parent window ID
		System.out.println("parent window id :" + parentWindowID + "and parent window title :" + driver.getTitle());
		
		String childWindowID = it.next(); //will get child Window ID
		driver.switchTo().window(childWindowID);
		System.out.println("child window id :" + childWindowID + "and child window title :" + driver.getTitle());
		Thread.sleep(3000);
		driver.close();
		driver.switchTo().window(parentWindowID);
				
		// click on facebook-->get title and close
		facebookLink.click();
		handles = driver.getWindowHandles();
		it = handles.iterator();
		parentWindowID = it.next(); // will get parent window ID
		System.out.println("parent window id :" + parentWindowID + "and parent window title :" + driver.getTitle());

		childWindowID = it.next(); // will get child Window ID
		driver.switchTo().window(childWindowID);
		System.out.println("child window id :" + childWindowID + "and child window title :" + driver.getTitle());
		Thread.sleep(3000);
		driver.close();
		driver.switchTo().window(parentWindowID);
		
		// click on Twitter-->get title and close
		twitterLink.click();
		handles = driver.getWindowHandles();
		it = handles.iterator();
		parentWindowID = it.next(); // will get parent window ID
		System.out.println("parent window id :" + parentWindowID + "and parent window title :" + driver.getTitle());

		childWindowID = it.next(); // will get child Window ID
		driver.switchTo().window(childWindowID);
		System.out.println("child window id :" + childWindowID + "and child window title :" + driver.getTitle());
		Thread.sleep(3000);
		driver.close();
		driver.switchTo().window(parentWindowID);
		
		// click on Youtube-->get title and close
		youtubeLink.click();
		handles = driver.getWindowHandles();
		it = handles.iterator();
		parentWindowID = it.next(); // will get parent window ID
		System.out.println("parent window id :" + parentWindowID + "and parent window title :" + driver.getTitle());

		childWindowID = it.next(); // will get child Window ID
		driver.switchTo().window(childWindowID);
		System.out.println("child window id :" + childWindowID + "and child window title :" + driver.getTitle());
		Thread.sleep(3000);
		driver.close();
		driver.switchTo().window(parentWindowID);
		driver.quit();
	}

}
