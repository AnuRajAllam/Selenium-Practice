package testngsessions;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleTest extends BaseTest {
	
	
	
	@Test
	public void titleTest() {
	//	driver.get("https://www.google.com/");
		String title=driver.getTitle();
		Assert.assertEquals(title, "Google","not matched");
	}
	@Test
	public void imgTest() {
		boolean flag=driver.findElement(By.xpath("//img[@alt='Google']")).isDisplayed();
		Assert.assertTrue(flag);
	}
	@Test
	public void urlTest() {
		String url=driver.getCurrentUrl();
		System.out.println(url);
		Assert.assertTrue(url.contains("https://www.google.com/"));
		
	}
	
	

}
