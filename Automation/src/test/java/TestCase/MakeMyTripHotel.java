package TestCase;
import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Element_Reusable.WebElement_Common_Usage;
import browser.Browser_Launch;

public class MakeMyTripHotel extends Browser_Launch{

	@BeforeSuite
	public void launchbrowser() throws IOException 
	{
		LaunchBrowser();
		
	}

	@BeforeMethod
	public void closepopups() {
		closepopup ();
		//closeads();
	}
	
	
	public void closepopup () {
		try {
		WebElement_Common_Usage.ExplicitWaitForClickable(browser,60,By.xpath("//*[@data-cy='closeModal']"));
		WebElement_Common_Usage.ClickOnClose(browser.findElement(By.xpath("//*[@data-cy='closeModal']")));
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
		
	//@BeforeMethod
	public void closeads() {
		try {
			WebElement_Common_Usage.ExplicitWaitForClickable(browser, 60, By.className("close"));
			WebElement_Common_Usage.ClickOnClose(browser.findElement(By.className("close")));
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
	@Test
	public void TestCase1() {
		System.out.println("TestCase1");
	}
	//@AfterSuite
	public void closebrowser() {
		closeBrowser();
	}
}
