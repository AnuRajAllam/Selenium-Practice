package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectionDrpdownWithSlectClass {
	
	public static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stubb
		driver = new ChromeDriver();
		driver.get("https://html.com/attributes/select-multiple/");

		WebElement multiDrpdown=driver.findElement(By.xpath("//select[@multiple]"));
		
		Select select=new Select(multiDrpdown);
		boolean flag=select.isMultiple();
		System.out.println(flag);
		
		if(select.isMultiple()) {
			select.selectByVisibleText("American flamingo");
			select.selectByVisibleText("Chilean flamingo");
			select.selectByVisibleText("Lesser flamingo");
			select.selectByVisibleText("James's flamingo");
		
			}
		
		select.deselectByVisibleText("Lesser flamingo");
		select.deselectAll();
		
	}


}
