package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElemntIsEnble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://classic.freecrm.com/register/");
		
		boolean flag1=driver.findElement(By.id("submitButton")).isDisplayed();
		System.out.println(flag1);
		
		boolean isbtnSubmit_enable=driver.findElement(By.id("submitButton")).isEnabled();
		System.out.println(isbtnSubmit_enable);
		
		boolean flag_chck=driver.findElement(By.name("agreeTerms")).isSelected();
		System.out.println(flag_chck);
		
		driver.findElement(By.name("agreeTerms")).click();
		
		flag_chck=driver.findElement(By.name("agreeTerms")).isSelected();
		System.out.println(flag_chck);
		
		isbtnSubmit_enable=driver.findElement(By.id("submitButton")).isEnabled();
		System.out.println(isbtnSubmit_enable);
		
	}

}
