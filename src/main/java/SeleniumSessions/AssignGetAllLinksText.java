package SeleniumSessions;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AssignGetAllLinksText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		BrowserUtil bu=new BrowserUtil();
		WebDriver driver=bu.launchBrowser("chrome");
		bu.launchUrl("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		System.out.println(bu.getPageTitle());
		
		By links=By.className("list-group-item");
		
		ElementUtil eu=new ElementUtil(driver);
		ArrayList<String> linksTextList=eu.getElementsText(links);
		System.out.println("Number of links is:"+ linksTextList.size());
		System.out.println(linksTextList);
	}

}
