package pages;

import org.openqa.selenium.WebDriver;

public class Page1 extends MakeMyTrip_HomePage {
	
	public Page1(WebDriver browser) {
		super(browser);
		
	}
	static WebDriver browser;
	
	public static void SelectDataFromList(WebDriver browser,String expectedCountryCode)
	{
		clickonfromcity(browser,expectedCountryCode);
	}
}
