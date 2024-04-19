package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserUtil {
	WebDriver driver;
	
	
	public WebDriver launchBrowser(String browser) {
		//String browser="chrome";
		switch (browser.toLowerCase().trim()) {
		case "chrome":
			driver=new ChromeDriver();
			break;
			
		case "firefox":
			driver=new FirefoxDriver();
			break;

		case "edge":
			driver=new EdgeDriver();
			break;


		default:
			System.out.println("Please enter correct browser"+browser);
			throw new BrowserException("BROWSER NOT FOUND");
			
		}
		
		return driver;
	}
	
	public void launchUrl(String url) {
		
		if(url==null)
		{
		 throw new BrowserException("URL is Null");
		}
		if(url.indexOf("http")==0 || url.indexOf("https")==0) {
			driver.get(url);
		}
		else {
			throw new BrowserException("http/s IS MISSING");
		}
	}
	
	public String getPageTitle() {
		
		return driver.getTitle();
		
	}
	
	public String getCurrentUrl() {
		return driver.getCurrentUrl();
		
	}
	
	public void closeBrowser() {
		driver.close();
		
	}
	
	public void quitBrowser() {
		driver.quit();
		
	}
	
	
	

	

}
