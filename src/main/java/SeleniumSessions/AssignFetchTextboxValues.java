package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignFetchTextboxValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		BrowserUtil bu=new BrowserUtil();
		WebDriver driver=bu.launchBrowser("chrome");
		bu.launchUrl("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		System.out.println(bu.getPageTitle());
		
		ElementUtil eu=new ElementUtil(driver);
		
		//By Locators
		By firstName=By.id("input-firstname");
		By lastName=By.id("input-lastname");
		
		By email=By.name("email");
		By mobileNum=By.name("telephone");
		
		By pwd=By.xpath("//*[@id=\"input-password\"]");
		By confirmPwd=By.xpath("//*[@id=\"input-confirm\"]");
		
		By isSubscribeYes=By.xpath("//*[@id=\"content\"]/form/fieldset[3]/div/div/label[1]/input");
		By isSubscribeNo=By.xpath("//*[@id=\"content\"]/form/fieldset[3]/div/div/label[2]/input");
		
		By policyCheck=By.name("agree");
		By btnContinue=By.cssSelector("#content > form > div > div > input.btn.btn-primary");
		
		eu.sendKeys(firstName, "anusha");
		eu.sendKeys(lastName, "raj");
		eu.sendKeys(email, StringUtil.getRandomEmail());
		eu.sendKeys(mobileNum, "9989786756");
		eu.sendKeys(pwd, "test@123");
		eu.sendKeys(confirmPwd, "test@123");
		
		//Fetch the entered values from the textbox
		
		String fn_value=eu.doGetAttribute(firstName, "value");
		System.out.println(fn_value);
		
		String ln_value=eu.doGetAttribute(lastName, "value");
		System.out.println(ln_value);

		String email_value=eu.doGetAttribute(email, "value");
		System.out.println(email_value);

		String mobileNum_value=eu.doGetAttribute(mobileNum, "value");
		System.out.println(mobileNum_value);
		
		String pwd_value=eu.doGetAttribute(pwd, "value");
		System.out.println(pwd_value);

		String confirmPwd_value=eu.doGetAttribute(confirmPwd, "value");
		System.out.println(confirmPwd_value);


	}

}
