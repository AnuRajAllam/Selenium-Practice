package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OpenCartLoginTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BrowserUtil bu=new BrowserUtil();
		WebDriver driver=bu.launchBrowser("chrome");
		bu.launchUrl("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		String title=bu.getPageTitle();
		System.out.println(title);
		String url=bu.getCurrentUrl();
		System.out.println(url);
		
		By userName=By.id("input-email");
		By pwd=By.id("input-password");
		
		ElementUtil eu=new ElementUtil(driver);
		eu.sendKeys(userName, "test@gmail.com");
		eu.sendKeys(pwd, "test@123");

	}

}
