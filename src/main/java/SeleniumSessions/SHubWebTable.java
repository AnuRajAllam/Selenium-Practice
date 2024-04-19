package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SHubWebTable {
	
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		driver=new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		
		selectUser("John.Smith");
		selectUser("Garry.White");
		
		System.out.println(getUserDetails("John.Smith"));
		System.out.println(getUserDetails("Garry.White"));

	}
	
	public static void selectUser(String userName) {
		String xpath="//a[text()='"+userName+"']/parent::td/preceding-sibling::td/input[@type='checkbox']";
		driver.findElement(By.xpath(xpath)).click();
	}
	
	public static List<String> getUserDetails(String userName) {
		String xpath="//a[text()='"+userName+"']/parent::td/following-sibling::td";
		List<WebElement> detailsList=driver.findElements(By.xpath(xpath));
		List<String> userDetailsList=new ArrayList<String>();
		
		for(WebElement e:detailsList) {
			String text=e.getText();
			userDetailsList.add(text);
		}
		return userDetailsList;
	}

}
