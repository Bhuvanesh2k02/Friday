package TestCase;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import browser.Browser_Launch;
import pages.MakeMyTrip_HomePage;


public class MakeMyTripHotel extends Browser_Launch
{
	
	
	@BeforeSuite
	public void launchbrowser() throws Exception{
		LaunchBrowser();
		//we need to click on iframe
		MakeMyTrip_HomePage.closeads(browser);
		MakeMyTrip_HomePage.closepopup(browser);
	}
	
	@BeforeMethod
	public static void SelectTrip() throws InterruptedException {
		
		
		MakeMyTrip_HomePage.selecttrip(browser,"Round Trip");
		Thread.sleep(500);
	}
//	public void selectcountry() throws InterruptedException {
//
//		MakeMyTrip_HomePage m=new MakeMyTrip_HomePage(browser);
//
//		Thread.sleep(500);
//		
//		m.ClickOnRoundTrip();
//		Thread.sleep(500);
//		
//		m.ClickOnMultiCity();
//		Thread.sleep(500);
//
//		m.ClickOnOneWay();
//		Thread.sleep(500);
//		
//		m.ClickOnRoundTrip();
//		Thread.sleep(500);
//		
//		m.ClickOnMultiCity();
//		Thread.sleep(500);
//
//		m.ClickOnOneWay();
//		Thread.sleep(500);
//		
//		m.ClickOnRoundTrip();
//		Thread.sleep(500);
//		
//		m.ClickOnMultiCity();
//		Thread.sleep(500);
//
//		m.ClickOnOneWay();
//		Thread.sleep(500);
//	}

	@Test
	public void SelectHotels1() throws InterruptedException{
		test=extent.createTest("TestCase1", "Passed TestCase");
		test.log(Status.INFO, "Launch Browser");

		Thread.sleep(500);
		MakeMyTrip_HomePage.SelectCategory(browser,"Hotels");
		test.log(Status.PASS, "Selected Hotels Option");

		Thread.sleep(500);
		MakeMyTrip_HomePage.SelectCategory(browser,"Homestays & Villas");
		test.log(Status.PASS, "Selected Homestays & Villas Option");

		Thread.sleep(500);
		MakeMyTrip_HomePage.SelectCategory(browser,"Holiday Packages");
		test.log(Status.PASS, "Selected Holiday Packages Option");

		Thread.sleep(500);
		MakeMyTrip_HomePage.SelectCategory(browser,"Trains");
		test.log(Status.PASS, "Selected Trains Option");

		Thread.sleep(500);
		MakeMyTrip_HomePage.SelectCategory(browser,"Buses");
		test.log(Status.PASS, "Selected Buses Option");

		Thread.sleep(500);
		MakeMyTrip_HomePage.SelectCategory(browser,"Cabs");
		test.log(Status.PASS, "Selected Cabs Option");

		Thread.sleep(500);
		MakeMyTrip_HomePage.SelectCategory(browser,"Forex Card & Currency");
		test.log(Status.PASS, "Selected Forex Card & Currency Option");

		Thread.sleep(500);
		MakeMyTrip_HomePage.SelectCategory(browser,"Flights");
		test.log(Status.PASS, "Selected Flights Option");

	}
//	@Test
//	public void selectfromcity() throws InterruptedException {
//		MakeMyTrip_HomePage m=new MakeMyTrip_HomePage(browser);
//		browser.navigate().back();
//
//		m.ClickFromLocation();
//		Page1.SelectDataFromList(browser,"HYD");
//		Thread.sleep(500);
//
//		m.ClickFromLocation();
//		Page1.SelectDataFromList(browser,"Chennai, India");
//		Thread.sleep(500);
//
//		m.ClickFromLocation();
//		Page1.SelectDataFromList(browser,"Mumbai, India");
//		Thread.sleep(500);
//
//		m.ClickFromLocation();
//		Page1.SelectDataFromList(browser,"DEL");
//		Thread.sleep(500);
//
//		m.ClickFromLocation();
//		Page1.SelectDataFromList(browser,"Bangkok, Thailand");
//		Thread.sleep(500);
//
//		m.ClickFromLocation();
//		Page1.SelectDataFromList(browser,"BKK");
//		Thread.sleep(500);
//
//		m.ClickFromLocation();
//		Page1.SelectDataFromList(browser,"BLR");
//		Thread.sleep(500);
//
//		m.ClickFromLocation();
//		Page1.SelectDataFromList(browser,"Kolkata, India");
//
//	}
	
	@AfterSuite
	public void closebrowser() throws InterruptedException {
		//CloseReport();
		Thread.sleep(1000);
		closeBrowser();
	}
}
