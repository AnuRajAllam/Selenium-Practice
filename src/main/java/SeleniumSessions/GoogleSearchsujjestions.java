package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchsujjestions {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stubb
		driver = new ChromeDriver();
		driver.get("https://google.com");
		//driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("Naveen Automation Labs");
		
		By searchArea=By.name("q");
		By searchOptions=By.xpath("//ul[@class='G43f7e' and @role='listbox']//div[@class='wM6W7d']/span");
		//List<WebElement> googleSujjest_list=driver.findElements(By.xpath("//ul[@class='G43f7e']//div[@class='wM6W7d']/span"));
		Thread.sleep(3000);
//		for(WebElement e:googleSujjest_list) {
//			String txt=e.getText();
//			System.out.println(txt);
//			if(txt.contains("java")) {
//				e.click();
//				break;
		//	}
		//}
		
		doSearch(searchArea,searchOptions,"hdfc","netbanking");

	}
	
	public static void doSearch(By searchArea,By searchOptions, String searchkey,String value) throws InterruptedException {
		driver.findElement(searchArea).sendKeys(searchkey);
		Thread.sleep(3000);
		List<WebElement> sujjestionsLst=driver.findElements(searchOptions);
		System.out.println(sujjestionsLst.size());
		Thread.sleep(3000);
		for(WebElement e:sujjestionsLst) {
			System.out.println(e.getText());
			if(e.getText().contains(value)) {
				e.click();
				break;
			}
		}
	}

}
