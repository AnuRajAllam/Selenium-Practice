package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OpenCartRegisterPage {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BrowserUtil bu=new BrowserUtil();
		WebDriver driver=bu.launchBrowser("chrome");
		bu.launchUrl("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		System.out.println(bu.getPageTitle());
		System.out.println(bu.getCurrentUrl());
		
		By firstName=By.id("input-firstname");
		By lastName=By.id("input-lastname");
		By email=By.id("input-email");
		By telephone=By.id("input-telephone");
		By password=By.id("input-password");
		By confirmPassword=By.id("input-confirm");
		
		
		ElementUtil eu=new ElementUtil(driver);
		eu.sendKeys(firstName, "Anusha");
		eu.sendKeys(lastName, "Yeruva");
		eu.sendKeys(email, "yeruvaanusha@gmail.com");
		eu.sendKeys(telephone, "9876543210");
		eu.sendKeys(password, "Test@123");
		eu.sendKeys(confirmPassword, "Anusha");

	}

}
