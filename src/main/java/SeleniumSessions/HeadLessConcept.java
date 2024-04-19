package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class HeadLessConcept {
	
	public static void main(String[] args) { 
		// TODO Auto-generated method stub
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--incognito");
//		co.addArguments("--headless");
		WebDriver driver=new ChromeDriver(co);
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		
		
//		FirefoxOptions fo =new FirefoxOptions();
//	//	fo.addArguments("--headless");
//		fo.addArguments("--incognito");
//		WebDriver driver1=new FirefoxDriver(fo);
//		driver1.get("https://www.google.com");
//		System.out.println(driver1.getTitle());
		
//		EdgeOptions eo =new EdgeOptions();
//		eo.addArguments("--headless");
//	//	eo.addArguments("--inprivate");
//		WebDriver driver1=new EdgeDriver(eo);
//		driver1.get("https://www.google.com");
//		System.out.println(driver1.getTitle());
//		
		

	}

}
