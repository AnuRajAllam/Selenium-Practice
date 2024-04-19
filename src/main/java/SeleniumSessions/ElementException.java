package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementException {
	static WebDriver driver;
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
				
	}
	
	public static void isElementExist(By locator) {
		//getElement(locator)
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 driver=new ChromeDriver();
		driver.get("https://classic.freecrm.com/register/");
		
		//boolean flag=driver.findElement(By.id("first_namesas")).isDisplayed();
		//System.out.println(flag);
		//throws no such element exception
		
		List<WebElement>fn=driver.findElements(By.id("first_namesas"));
		System.out.println(fn.size());
		
		
		
	}

}
