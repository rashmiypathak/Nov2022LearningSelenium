package learningseleniumconcepts;

public class AmazonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String browser = "chrome";
		String URL = "https://www.amazon.com";
		
		WebBrowserUtil b = new WebBrowserUtil();
		b.launchBrowser(browser);
		b.openURL(URL);
		String actTitle = b.fetchCurrentTitle();
		
		if(actTitle.contains("Amazone")) {
			System.out.println("Test Passed");
		}
		else {
			System.out.println("Test Failed");
		}
		
		b.quitBrowser();
		
	}

}
