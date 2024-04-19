package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDownConcept {
	public static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stubb
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/30-day-free-trial/");
//		WebElement country=driver.findElement(By.id("Form_getForm_Country"));
//		Select select=new Select(country);
//		select.selectByIndex(5);
//		select.selectByVisibleText("India");
//		select.selectByValue("Australia");
//		//https://www.orangehrm.com/30-day-free-trial/

		By country = By.id("Form_getForm_Country");

	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static void doSelectByIndex(By locator, int num) {
		Select select = new Select(getElement(locator));
		select.selectByIndex(num);

	}

	public static void doSelectByValue(By locator, String value) {
		if (value == null || value.length() == 0) {
			throw new MyElementException("Value should not be empty or null");

		}
		Select select = new Select(getElement(locator));
		select.selectByValue(value);

	}

	public static void doSelectByVisibleText(By locator, String text) {
		if (text == null || text.length() == 0) {
			throw new MyElementException("Value should not be empty or null");

		}

		Select select = new Select(getElement(locator));
		select.selectByVisibleText(text);

	}

}
