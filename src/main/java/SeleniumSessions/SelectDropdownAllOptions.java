package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdownAllOptions {

	public static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stubb
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/30-day-free-trial/");
//		WebElement country=driver.findElement(By.id("Form_getForm_Country"));
//	    Select select=new Select(country);
//		List<WebElement> countryList=select.getOptions();
//		System.out.println(countryList.size());
//		
//		for(WebElement e: countryList) {
//			//System.out.println(e.getText());
//			String txt=e.getText();
//			if(txt.equals("India")) {
//				e.click();
//			}
//		}

		By country = By.id("Form_getForm_Country");

	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static List<WebElement> getDropDownOptionsList(By locator) {
		Select select = new Select(getElement(locator));
		return select.getOptions();

	}

	public static void printSelectDropDownValue(By locator) {
		List<WebElement> optionsList = getDropDownOptionsList(locator);
		for (WebElement e : optionsList) {

			String txt = e.getText();
			System.out.println(txt);
		}
	}

	public static void getDropdownvaluesCount(By locator) {

		List<WebElement> optionsList = getDropDownOptionsList(locator);
		optionsList.size();
	}

	public static void doSelectDrpdownValue(By locator, String value) {
		List<WebElement> optionsList=getDropDownOptionsList(locator);
		for (WebElement e : optionsList) {

			String txt = e.getText();
			if(txt.equals(value)) {
				e.click();
				break;
			}
		}
	}

	public static List<String> getDropdownValuesTextLit(By locator, String value) {
		List<WebElement> optionsList = getDropDownOptionsList(locator);
		List<String> optionsTextList = new ArrayList<String>();

		for (WebElement e : optionsList) {

			String txt = e.getText();
			optionsTextList.add(txt);
		}
		return optionsTextList;
	}

}
