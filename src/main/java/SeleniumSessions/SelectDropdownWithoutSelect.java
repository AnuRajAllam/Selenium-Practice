package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectDropdownWithoutSelect {

	public static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stubb
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/30-day-free-trial/");

		List<WebElement> optionsList = driver.findElements(By.xpath("//select[@id='Form_getForm_Country']/option"));

		for (WebElement e : optionsList) {
			String txt = e.getText();
			if (txt.equals("India")) {
				e.click();
				break;
			}

		}
		
		
	}
	public static List<WebElement> getElments(By locator) {
		return driver.findElements(locator);
	}
	
	public static void DoSelectValueFromDropDown(By locator, String value) {
		List<WebElement> optionsList=getElments(locator);
		for (WebElement e : optionsList) {
			String txt = e.getText();
			if (txt.equals("India")) {
				e.click();
				break;
			}
	}
	
	}
}
