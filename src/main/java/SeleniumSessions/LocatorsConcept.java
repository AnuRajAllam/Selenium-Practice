package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsConcept {

	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		//1.
//		driver.findElement(By.id("input-email")).sendKeys("test@gmail.com");
//		driver.findElement(By.id("input-password")).sendKeys("test@123");
		
		//2 create webelement
//		WebElement username=driver.findElement(By.id("input-email"));
//		WebElement pwd=driver.findElement(By.id("input-password"));
//		
//		username.sendKeys("test@gmail.com");
//		pwd.sendKeys("test@123");
		
		//3. create byLocators
//		By userName=By.id("input-email");
//		By pwd=By.id("input-password");
//		
//		WebElement emaiId=driver.findElement(userName);
//     	WebElement password=driver.findElement(pwd);
//     	
//     	emaiId.sendKeys("test@gmail.com");
//     	password.sendKeys("test@123");
//     	
     	//4.create utility for webelement
		
	//	By userName=By.id("input-email");
	//	By pwd=By.id("input-password");
		
		
//		WebElement emaiId=getWebElement(userName);
//		WebElement password=getWebElement(pwd);
//     	emaiId.sendKeys("test@gmail.com");
//     	password.sendKeys("test@123");
//     	
     	//5. create utility for webelement and sendKeys
     	
	//	doSendKeys(userName, "test@gmail.com");
	//	doSendKeys(pwd,"test@123");
		
		//6. create seperate utility class for webelement and sendKeys
	//ElementUtil eu= new ElementUtil();
		
		//7.BrwUtil+eleUtil
		
		//8.By util+ String locators
		
		String un="input-email";
		String pwd="input-password";
		
		ElementUtil eu=new ElementUtil(driver);
		//eu.getBy("id", un);
		eu.sendKeys("id",un,"test@gmail.com");
		eu.sendKeys("id",pwd,"test@123");
	}
	
	public static WebElement getWebElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void doSendKeys(By locator, String Value) {
		getWebElement(locator).sendKeys(Value);
	}

}
