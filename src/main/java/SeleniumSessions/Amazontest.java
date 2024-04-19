package SeleniumSessions;

public class Amazontest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String browserName = "chrome";
		BrowserUtil bu = new BrowserUtil();
		bu.launchBrowser(browserName);
		bu.launchUrl("https://www.amazon.com");
		String title = bu.getPageTitle();

		if (title.contains("Amazon")) {
			System.out.println("title----passed");
		} else {
			System.out.println("title---failed");
		}
		String url = bu.getCurrentUrl();
		if (url.contains("amazon.com")) {
			System.out.println("url----passed");
		} else {
			System.out.println("url---failed");

		}

	}

}
