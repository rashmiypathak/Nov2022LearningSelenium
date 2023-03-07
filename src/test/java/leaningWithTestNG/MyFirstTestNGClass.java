package leaningWithTestNG;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MyFirstTestNGClass {
	@BeforeTest
	public void MyBeforeTest() {
		System.out.println("This is my before test");
	}

	@Test
	public void FirstClass() {
		System.out.println("This is my first class with Test NG");
	}
	
	@AfterTest
	public void MyAfterTest() {
		System.out.println("This is my after test");
	}
	
	
	
}
