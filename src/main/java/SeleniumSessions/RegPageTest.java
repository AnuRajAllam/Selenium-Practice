package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegPageTest {

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
		eu.doClick(isSubscribeYes);
		eu.doClick(policyCheck);
		eu.doClick(btnContinue);
		
		String url=bu.getCurrentUrl();
		if(url.contains("success")) {
			System.out.println("test Passed");
		}
		else
		{
			System.out.println("test failed");
		}
		By header=By.tagName("h1");
		String successMsg=eu.doGetText(header);
		if(successMsg.equals("Your Account Has Been Created!")) {
			System.out.println("User Registeration-Passed");
			
		}
		else {
			System.out.println("User Registeration--failed");
		}
		
				
				
		
		

	}

}
