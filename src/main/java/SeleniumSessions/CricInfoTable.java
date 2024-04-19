package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CricInfoTable {

	static WebDriver driver;
	//private static List<WebElement> elements;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver=new ChromeDriver();
		driver.get("https://www.espncricinfo.com/series/women-s-premier-league-2023-24-1411373/delhi-capitals-women-vs-up-warriorz-women-4th-match-1417719/full-scorecard");

		System.out.println(getWicketTakerName("Dinesh Vrinda"));
		System.out.println(getWicketTakerName("Grace Harris"));
		
		System.out.println(getScoreCard("Dinesh Vrinda"));
		System.out.println(getScoreCard("Grace Harris"));
		
	}

	public static String getWicketTakerName(String name) {
		
		return driver.findElement(By.xpath("//a[@title='"+name+"']/ancestor::td/following-sibling::td//span//span")).getText();
	}
	
	public static List<String> getScoreCard(String name) {
		List<WebElement> totalScores = driver.findElements(By.xpath("//a[@title='"+name+"']/ancestor::td/following-sibling::td[contains(@class,'ds-text-right')]"));
		
		List<String> scoreList=new ArrayList<String>();
		
		for(WebElement e: totalScores) {
			String txt=e.getText();
			scoreList.add(txt);
		}
		return scoreList;
		
	}
}
