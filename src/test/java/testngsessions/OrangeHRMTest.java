package testngsessions;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OrangeHRMTest extends BaseTest{
	
	
	
	@Test
	public void titleTest() {
		//driver.get("https://www.orangehrm.com/en/30-day-free-trial");
		String title=driver.getTitle();
		Assert.assertEquals(title, "30-Day Advanced Free Trial | OrangeHRM","not matched");
	}
	
	@Test
	public void urlTest() {
		String url=driver.getCurrentUrl();
		System.out.println(url);
		Assert.assertTrue(url.contains("30-day-free-trial"));
		
	}	

}
