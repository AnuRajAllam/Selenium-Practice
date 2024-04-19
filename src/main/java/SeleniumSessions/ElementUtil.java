package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ElementUtil {

	private WebDriver driver;

	public ElementUtil(WebDriver driver) {
		this.driver = driver;
	}
	
	public void nullCheck(String text) {
		if (text == null || text.length() == 0) {
			throw new MyElementException("Value should not be empty or null");

		}

	}

	public By getBy(String locatorType, String locatorValue) {

		By locator = null;

		switch (locatorType.toLowerCase().trim()) {
		case "id":
			locator = By.id(locatorValue);
			break;
		case "name":
			locator = By.name(locatorValue);
			break;
		case "classname":
			locator = By.className(locatorValue);
			break;
		case "xpath":
			locator = By.xpath(locatorValue);
			break;
		case "cssselector":
			locator = By.cssSelector(locatorValue);
			break;
		case "linktext":
			locator = By.linkText(locatorValue);
			break;
		case "partiallinktext":
			locator = By.partialLinkText(locatorValue);
			break;
		case "tagname":
			locator = By.tagName(locatorValue);
			break;

		default:
			throw new BrowserException("Please send correct locator");
		// break;
		}

		return locator;
	}

	/*
	 * Get the webElement using By
	 */
	public WebElement getElement(By locator) {
		WebElement element = null;

		try {
			element = driver.findElement(locator);
		} catch (NoSuchElementException e) {
			System.out.println("Element is not present on the page");
			e.printStackTrace();
		}

		return driver.findElement(locator);
	}
	/*
	 * Get the webElement using String
	 */

	public WebElement getElement(String locatorType, String locatorValue) {

		return driver.findElement(getBy(locatorType, locatorValue));
	}

	public boolean isElementDisplayed(By locator) {
		return getElement(locator).isDisplayed();
	}

	/*
	 * Sendkeys for the webelement using String
	 */
	public void sendKeys(String locatorType, String locatorValue, String value) {

		getElement(locatorType, locatorValue).sendKeys(value);

	}
	/*
	 * Sendkeys o webelement using By
	 */

	public void sendKeys(By locator, String value) {
		nullCheck(value);
		getElement(locator).sendKeys(value);

	}

	/*
	 * Click the webelement
	 */
	public void doClick(By locator) {
		getElement(locator).click();
	}
	/*
	 * Get the text from webelement
	 */

	public String doGetText(By locator) {
		return getElement(locator).getText();
	}
	/*
	 * Get the attribute value
	 */

	public String doGetAttribute(By locator, String attributeName) {
		return getElement(locator).getAttribute(attributeName);
	}

	/*
	 * Get the webelements
	 */
	public List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}

	/*
	 * icreate util for element exist instead of display()
	 */
	public void isElementExist(By locator) {
		List<WebElement> webEleList = getElements(locator);
		if (webEleList.size() == 1) {
			System.out.println("Pass");
		} else {
			System.out.println("fail");
		}

	}

	/*
	 * Multiple element exist ont he page
	 */
	public boolean multipleElementsExist(By locator) {
		if (getElements(locator).size() > 0) {
			return true;
		}
		return false;
	}

	/*
	 * check whether the correct no of elemnts are present or not
	 */
	public boolean multipleElementsExist(By locator, int elementCount) {
		if (getElements(locator).size() == elementCount) {
			return true;
		}
		return false;
	}

	/*
	 * get the values of elements attribute
	 */
	public ArrayList<String> getElementsAttribute(By locator, String eleAttribute) {
		List<WebElement> locatorList = getElements(locator);
		ArrayList<String> attrList = new ArrayList<String>();
		for (WebElement e : locatorList) {
			String attrValue = e.getAttribute(eleAttribute);
			if (attrValue.length() != 0) {
				attrList.add(attrValue);
			}

		}
		return attrList;
	}

	/*
	 * get the text for all the webelements
	 */
	public ArrayList<String> getElementsText(By locator) {
		List<WebElement> locatorList = getElements(locator);
		ArrayList<String> textList = new ArrayList<String>();
		for (WebElement e : locatorList) {
			String txtValue = e.getText();
			if (txtValue.length() != 0) {
				textList.add(txtValue);
			}

		}
		return textList;
	}

	///////////////// Drop down concept///////////////////////////

	public void doSelectByIndex(By locator, int num) {
		Select select = new Select(getElement(locator));
		select.selectByIndex(num);

	}

	public void doSelectByValue(By locator, String value) {
		nullCheck(value);
		Select select = new Select(getElement(locator));
		select.selectByValue(value);

	}

	public void doSelectByVisibleText(By locator, String text) {
		nullCheck(text);
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(text);
	}
	
	public List<WebElement> getDropDownOptionsList(By locator) {
		Select select = new Select(getElement(locator));
		return select.getOptions();

	}

	public void printSelectDropDownValue(By locator) {
		List<WebElement> optionsList = getDropDownOptionsList(locator);
		for (WebElement e : optionsList) {

			String txt = e.getText();
			System.out.println(txt);
		}
	}

	public void getDropdownvaluesCount(By locator) {

		List<WebElement> optionsList = getDropDownOptionsList(locator);
		optionsList.size();
	}

	public void doSelectDrpdownValue(By locator, String value) {
		List<WebElement> optionsList=getDropDownOptionsList(locator);
		for (WebElement e : optionsList) {

			String txt = e.getText();
			if(txt.equals(value)) {
				e.click();
				break;
			}
		}
	}
		
		public void DoSelectValueFromDropDown(By locator, String value) {
			List<WebElement> optionsList = driver.findElements(locator);

			System.out.println(optionsList.size());

			for (WebElement e : optionsList) {
				String text = e.getText();
				if (text.equals(value)) {
					e.click();
					break;
				}
			}
		

}
		
		public void doSearch(By searchArea,By searchOptions, String searchkey,String value) throws InterruptedException {
			getElement(searchArea).sendKeys(searchkey);
			Thread.sleep(3000);
			List<WebElement> sujjestionsLst=getElements(searchOptions);
			System.out.println(sujjestionsLst.size());
			Thread.sleep(3000);
			for(WebElement e:sujjestionsLst) {
				System.out.println(e.getText());
				if(e.getText().contains(value)) {
					e.click();
					break;
				}
			}
		}
		
		
	//	-------------------------- Actions Utils---------------------
		
		public void handleMenuSubMenuLevel2(By parentMenuLocator,By subMenuLocator) throws InterruptedException {
			Actions act=new Actions(driver);
			act.moveToElement(getElement(parentMenuLocator)).perform();
			Thread.sleep(1500);
			getElement(subMenuLocator).click();
		}
		
		public void handleMenuSubMenuLevel4(By level1Menu, By level2Menu,By level3Menu,By level4Menu) throws InterruptedException {
			Actions act=new Actions(driver);
			getElement(level1Menu).click();
			Thread.sleep(1500);
			act.moveToElement(getElement(level2Menu)).perform();
			Thread.sleep(1500);
			act.moveToElement(getElement(level3Menu)).perform();
			Thread.sleep(1500);
			getElement(level4Menu).click();
		}
}
