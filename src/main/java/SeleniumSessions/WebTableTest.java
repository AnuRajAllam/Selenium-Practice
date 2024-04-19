package SeleniumSessions;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebTableTest {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		driver=new ChromeDriver();
		driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com/");

		driver.findElement(By.name("username")).sendKeys("apiautomation");
		driver.findElement(By.name("password")).sendKeys("Selenium@12345");
		driver.findElement(By.xpath("//input[@value='Login']")).click();

		Thread.sleep(4000);

		driver.switchTo().frame("mainpanel");
		Thread.sleep(4000);
		driver.findElement(By.linkText("CONTACTS")).click();
		Thread.sleep(4000);
		selectContact("Annu Priya");
		Thread.sleep(4000);
		String compName = getCompName("Annu Priya");
		Thread.sleep(4000);
		System.out.println(compName);
		System.out.println(getContactsInfoList("Annu Priya"));
	}

	public static void selectContact(String contactName) {
		String xpath = "//a[text()='"+contactName+"']/parent::td/preceding-sibling::td/child::input[@type='checkbox']";
		driver.findElement(By.xpath(xpath)).click();
	}

	public static String getCompName(String contactName) {
		String xpath = "//a[text()='"+contactName+"']/parent::td/following-sibling::td/child::a[@context='company']";
		return driver.findElement(By.xpath(xpath)).getText();
	}
	
	public static String getPhoneNumber(String contactName) {

		String xpath="(//a[text()='"+contactName+"']/parent::td/following-sibling::td/child::span[@context='phone'])[1]";
		return driver.findElement(By.xpath(xpath)).getText();
	}
	
	public static List<String> getContactsInfoList(String contactName) {
		String xpath="//a[text()='"+contactName+"']/parent::td/following-sibling::td";//a[text()='Annu Priya']/parent::td/following-sibling::td
		List<WebElement> infoList = driver.findElements(By.xpath(xpath));
		List<String> contInfoList=new ArrayList<String>();
		
		for(int i=1;i<infoList.size();i++) {
			contInfoList.add(infoList.get(i).getText());
			
		}
//		for(WebElement e:infoList) {
//			String tct=e.getText();
//			contInfoList.add(tct);
//		}

		return contInfoList;
	}
	}


