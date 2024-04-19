package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementDisplayed {
public static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		//boolean flag=driver.findElement(By.className("img-responsive11")).isDisplayed();//NSE
		
		List<WebElement> imgsList=driver.findElements(By.className("img-responsive"));
		System.out.println(imgsList.size());
		if(imgsList.size()==1) {
			System.out.println("Pass");
		}
		else {
			System.out.println("fail");
		}
		

	}
	
	//create util for element exist instead of display()
	
	public static void isElementExist(By locator) {
		List<WebElement> webEleList=getElements(locator);
		if(webEleList.size()==1) {
			System.out.println("Pass");
		}
		else {
			System.out.println("fail");
		}
		
	}
	
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
	
	

}
