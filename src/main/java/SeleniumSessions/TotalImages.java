package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalImages {
	
	static WebDriver driver;
	public static ArrayList<String> getElementsAttribute(By locator, String eleAttribute) {
		List<WebElement> imagesList=getElements(locator);
		ArrayList<String> attr=new ArrayList<String>(); 
		for(WebElement e:imagesList) {
			String attrValue=e.getAttribute(eleAttribute);
			if(attrValue.length()!=0) {
				attr.add(e.getAttribute(eleAttribute));
			}
			
		}
		return attr;
	}
	
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/");//https://www.amazon.com/
		Thread.sleep(5000);
		//List<WebElement> imgsList=driver.findElements(By.tagName("img"));
		
//		for(int i=0;i<imgsList.size();i++) {
//			System.out.println( imgsList.get(i).getAttribute("alt"));
//		}
		
//		for(WebElement e:imgsList) {
//			System.out.println(e.getAttribute("alt"));
//		}
		
		By images=By.tagName("img");
		ArrayList<String> altAttribuesList=getElementsAttribute(images, "alt");
		System.out.println(altAttribuesList);
		
		

	}

}
