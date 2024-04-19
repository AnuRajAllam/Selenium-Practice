package SeleniumSessions;

public class StringUtil {
	
	public static String getRandomEmail() {
		String email="automation"+System.currentTimeMillis()+"@opencart.com";
		return email;
	}

}
