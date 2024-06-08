package pages;

import org.openqa.selenium.WebDriver;

public class Page1 extends MakeMyTrip_HomePage {
	
	public Page1(WebDriver browser) {
		super(browser);
		
	}
	WebDriver browser;
	public void SelectDataFromList(String expectedCountryCode)
	{
		clickonfromcity(browser,expectedCountryCode);
	}
}
