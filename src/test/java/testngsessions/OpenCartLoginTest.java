package testngsessions;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OpenCartLoginTest extends BaseTest {

	@Test
	public void titleTest() {
		//driver.get("https://naveenautomationlabs.com/opencart/");
		String title=driver.getTitle();
		Assert.assertEquals(title, "Account Login","not matched");
	}
	@Test
	public void imgTest() {
		boolean flag=driver.findElement(By.xpath("//img[@alt='naveenopencart']")).isDisplayed();
		Assert.assertTrue(flag);
	}
	@Test
	public void urlTest() {
		String url=driver.getCurrentUrl();
		System.out.println(url);
		Assert.assertTrue(url.contains("account/login"));
		
	}	


}
