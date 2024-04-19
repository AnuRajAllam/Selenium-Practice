package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsMoveToElement {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		driver=new ChromeDriver();
		//driver.get("https://www.spicejet.com/");//http://mrbool.com/search/?txtsearch=how-to-create-menu-with-submenu-using-css-html
		driver.get("http://mrbool.com/search/?txtsearch=how-to-create-menu-with-submenu-using-css-html");
		Thread.sleep(3000);
//		By menu=By.xpath("//div[text()='Add-ons']");
//		By submenu=By.xpath("//div[text()='Visa Services']");
		By menu=By.xpath("//a[contains(text(),'Content')]");
		By submenu=By.xpath("//ul[@class='submenu']//a[text()='Articles']");
		
		handleMenuSubMenuLevel2(menu,submenu);

	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void handleMenuSubMenuLevel2(By parentMenuLocator,By subMenuLocator) throws InterruptedException {
		Actions act=new Actions(driver);
		act.moveToElement(getElement(parentMenuLocator)).perform();
		Thread.sleep(1500);
		getElement(subMenuLocator).click();
	}

}
