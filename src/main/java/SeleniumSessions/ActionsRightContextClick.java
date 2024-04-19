package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsRightContextClick {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		driver=new ChromeDriver();
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		Actions act=new Actions(driver);
		act.contextClick(driver.findElement(By.xpath("//span[text()='right click me']"))).perform();
		driver.findElement(By.xpath("//span[text()='Cut']")).click();
		
//		List<WebElement> lst=driver.findElements(By.cssSelector("ul.context-menu-list >li:not(.context-menu-separator)"));
//
//		for(WebElement e:lst) {
//			String txt=e.getText();
//			if(txt.equals("Cut")) {
//				e.click();
//				break;
//			}
//		}
	}

}
