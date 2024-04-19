package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalLinksConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		List<WebElement>allLinks=driver.findElements(By.tagName("a"));
		System.out.println("total links:"+allLinks.size());
		
		for(int i=0;i<allLinks.size();i++) {
			String text=allLinks.get(i).getText();
			if(text.length()!=0) {
				System.out.println(allLinks.get(i).getText());
			}
		}
		
		
		for(WebElement e : allLinks) {
			String text=e.getText();
			if(text.length()!=0) {
				System.out.println(e.getText());
			}
		}

	}

}
