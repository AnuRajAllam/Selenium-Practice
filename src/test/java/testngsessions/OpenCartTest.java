package testngsessions;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OpenCartTest {
	
	//before annotations
	@BeforeSuite
	public void dbConnection(){
		System.out.println("BS----DB Connection");
	}
	
	@BeforeTest
	public void createUser() {
		System.out.println("BT-----DB Connection");
	}
	
	@BeforeClass
	public void launchBrowser() {
		System.out.println("BC-----DB Connection");
	}
	
	@BeforeMethod
	public void Login() {
		System.out.println("BM------Login");
	}
	
	@Test
	public void titleTest() {
		System.out.println("Test-----titleTest");
	}
	@Test
	public void headeTest() {
		System.out.println("Test----Header Test");
	}
	@Test
	public void urlTest() {
		System.out.println("Test----After Test");
	}
	
	//After annotations
	@AfterMethod
	public void logout() {
		System.out.println("After Method -----------Logout");
	}

}
