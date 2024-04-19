package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeConcept {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
//		String fn_type = driver.findElement(By.id("input-firstname")).getAttribute("type");
//		System.out.println(fn_type);
//		String fn_placeholder = driver.findElement(By.id("input-firstname")).getAttribute("value placeholder");
//		System.out.println(fn_placeholder);
		
		By firstName=By.id("input-firstname");
		
		String fn_type=doGetAttribute(firstName,"type");
		String fn_placeholder=doGetAttribute(firstName,"placeholder");
		String fn_class=doGetAttribute(firstName,"class");
		System.out.println(fn_type);
		System.out.println(fn_placeholder);
		System.out.println(fn_class);
	}

	public static String doGetAttribute(By locator, String attributeName) {
		return getElement(locator).getAttribute(attributeName);
	}

	public static WebElement getElement(By locator) {

		return driver.findElement(locator);
	}

}
