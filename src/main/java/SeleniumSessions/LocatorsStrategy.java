package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsStrategy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		//1.id
		//driver.findElement(By.id("input-firstname")).sendKeys("anusha");
		//driver.findElement(By.id("input-lastname")).sendKeys("automation");
		
		//2.name

//		driver.findElement(By.name("firstname")).sendKeys("anusha");
//		driver.findElement(By.name("lastname")).sendKeys("automation");
		
//		By fn=By.name("firstname") ;
//		By ln=By.name("lastname");
//		
//		ElementUtil eu=new ElementUtil(driver);
//		eu.sendKeys(fn, "anusha");
//		eu.sendKeys(ln, "automation");
//		--------------------------------------------------------
//		String fn="firstname";
//		String ln="lastname";
//		ElementUtil eu=new ElementUtil(driver);
//		eu.sendKeys("name", fn, "anusha");
//		eu.sendKeys("name", ln, "automation");
//		
		
		
		//3.className
		//driver.findElement(By.className("form-control")).sendKeys("testing");
		
		//4.xpath
//		driver.findElement(By.xpath("//*[@id=\"input-firstname\"]")).sendKeys("anusha");
//		driver.findElement(By.xpath("//*[@id=\"input-lastname\"]")).sendKeys("automation");
		
//		By fn=By.xpath("//*[@id=\"input-firstname\"]") ;
//		By ln=By.xpath("//*[@id=\"input-lastname\"]");
//		
//		ElementUtil eu=new ElementUtil(driver);
//		eu.sendKeys(fn, "anusha");
//		eu.sendKeys(ln, "automation");
		
		//5.csscollector
		driver.findElement(By.cssSelector("#input-firstname")).sendKeys("anusha");
		driver.findElement(By.cssSelector("#input-lastname")).sendKeys("automation");
		
		//6.linktext
		//driver.findElement(By.linkText("Login")).click();
		
//		By lgn=By.linkText("Login");
//		ElementUtil eu=new ElementUtil(driver);
//		eu.doClick(lgn);
		
		//7.partialLinkText
		//driver.findElement(By.partialLinkText("Forgotten")).click();
		
		//8.tagname
		
		//System.out.println(driver.findElement(By.tagName("h1")).getText());
		By header=By.tagName("h1");
		ElementUtil eu=new ElementUtil(driver);
		String headerText =eu.doGetText(header);
		System.out.println(headerText);
		
		
		
		
		
		
		
	}

}
