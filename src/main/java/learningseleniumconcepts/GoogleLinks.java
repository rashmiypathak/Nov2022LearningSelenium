package learningseleniumconcepts;

import java.util.ArrayList;
import java.util.List;

import org.checkerframework.checker.units.qual.s;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleLinks {

	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();

		if (driver.getTitle().equals("Google")) {
			System.out.println("Correct page launched");
		}

//			List<WebElement> googleLangLink = driver.findElements(By.xpath("//div[@id='SIvCob']/a"));
//			List<WebElement> googleFooterLink = driver.findElements(By.className("pHiOh"));
		By googleLangLink = By.xpath("//div[@id='SIvCob']/a");
		By googleFooterLink = By.className("pHiOh");

		List<String> returnedLinkText = new ArrayList<String>();

		// get size for google footer links and then get text for these links
		getSize(googleFooterLink);
		returnedLinkText = getElementsList(googleFooterLink);
		System.out.println(returnedLinkText);

		// get size for google language links and then get text for these links
		getSize(googleLangLink);
		returnedLinkText = getElementsList(googleLangLink);
		System.out.println(returnedLinkText);
		doElementClick(googleLangLink, "ગુજરાતી");

		// get size for google footer links and then get text for these links
		getSize(googleFooterLink);
		returnedLinkText = getElementsList(googleFooterLink);
		System.out.println(returnedLinkText);

//			System.out.println("Footer Links count -->" + googleFooterLink.size());
//			for(WebElement e: googleFooterLink) {
//				String footerLinkText = e.getText();
//				String footerLinkURL = e.getAttribute("href");
//				System.out.println("URL for footer link "+footerLinkText+ " is "+footerLinkURL);
//				
//			}
//			
//			
//			System.out.println("Total language links on google -->" +googleLangLink.size());
//			for(WebElement e : googleLangLink) {
//				String linkText = e.getText();
//				System.out.println(linkText);
//				
//				if(linkText.equals("മലയാളം")) {
//					e.click();
//					break;
//				}
//			}

	}

	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}

	public static void getSize(By locator) {
		System.out.println("Total size in list --> " + getElements(locator).size());
	}

	public static void doElementClick(By locator, String value) {
		List<WebElement> linkList = getElements(locator);
		for (WebElement e : linkList) {
			if (e.getText().equals(value)) {
				e.click();
				break;
			}
		}

	}

	public static List<String> getElementsList(By locator) {
		List<WebElement> linkList = getElements(locator);
		List<String> linkArrayText = new ArrayList<String>();

		for (WebElement e : linkList) {
			String linkText = e.getText();
			linkArrayText.add(linkText);
		}
		return linkArrayText;
	}

}
