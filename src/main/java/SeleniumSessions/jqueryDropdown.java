package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class jqueryDropdown {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/#google_vignette");
		//Tc-01: single selection
		
		By drpdown=By.id("justAnInputBox");
		By choices=By.xpath("//li[@class='ComboTreeItemChlid']");
		
		//selectjqueryDropdwn(drpdown,choices,"choice 2 1");
		
		//Tc-02: multi selection
		
		//selectjqueryDropdwn(drpdown,choices,"choice 2 1","choice 1","choice 3");
		//Tc-03: select all
		selectjqueryDropdwn(drpdown,choices,"all");
	}
	
	public static void selectjqueryDropdwn(By drpdownLocator, By choicesLocator, String... value) throws InterruptedException {
		
		driver.findElement(drpdownLocator).click();
		Thread.sleep(3000);
		
		List<WebElement> choicesList=driver.findElements(choicesLocator);
		System.out.println(choicesList.size());
		if(!value[0].equals("all")) {
		for(WebElement e:choicesList) {
			String txt=e.getText();
			for(String val:value) {
			if(txt.equals(val)) {
				e.click();
			}
			}
			}
			
		}
		
		else {
			for(WebElement e:choicesList) {
				try {
					Thread.sleep(500);
				e.click();
				}
				catch(ElementNotInteractableException ex) {
					break;
				}
			}
		}
		
	}

}
