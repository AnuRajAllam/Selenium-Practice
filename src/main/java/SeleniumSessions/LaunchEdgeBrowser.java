package SeleniumSessions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchEdgeBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new EdgeDriver();
		
driver.get("https://naveenautomationlabs.com/opencart/");
		
		String url=driver.getCurrentUrl();
		if(url.contains("https://naveenautomationlabs.com/opencart/")) {
			System.out.println("Correct url");
		}
		else {
			System.out.println("inCorrect url");
		}
		
		String title=driver.getTitle();
		System.out.println(title);
		
		if(title.equals("Your Store")) {
			System.out.println("Correct title");
		}
		else {
			System.out.println("incorrect title");
		}
//		driver.get("https://www.google.com");
//		
//		String url=driver.getCurrentUrl();
//		if(url.contains("www.google.com")) {
//			System.out.println("Correct url");
//		}
//		else {
//			System.out.println("inCorrect url");
//		}
//		
//		String title=driver.getTitle();
//		System.out.println(title);
//		
//		
//		driver.close();


	}

}
