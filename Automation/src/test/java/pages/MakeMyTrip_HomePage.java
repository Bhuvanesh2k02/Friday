package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ElementUtils.webElementCommons;
import Element_Reusable.WebElement_Common_Usage;

public class MakeMyTrip_HomePage extends WebElement_Common_Usage{

	@FindBy (xpath ="//*[@for='fromCity']")
	WebElement fromCity;
	WebDriver browser;
	public MakeMyTrip_HomePage(WebDriver browser)
	{
		
		this.browser=browser;
		PageFactory.initElements(browser, this);
		
	}
	public static void closeads(WebDriver browser) throws InterruptedException {
		try {
			Thread.sleep(3000);
			//WebElement_Common_Usage.ExplicitWaitForClickable(browser, 60, By.className("close"));
			List<WebElement> closebutton =browser.findElements(By.tagName("iframe"));
			for(int i=0;i<closebutton.size();i++) {
				browser.switchTo().frame(i);
				List<WebElement> close = browser.findElements(By.className("close"));
				if(close.size()>0) {
					browser.findElement(By.className("close")).click();
					break;
				}
				browser.switchTo().defaultContent();
			}
			browser.switchTo().defaultContent();
		}
		catch(Exception e){
		}
	}

	public static void closepopup (WebDriver browser) {
		try {
			WebElement_Common_Usage.ExplicitWaitForClickable(browser,60,By.xpath("//*[@data-cy='closeModal']"));
			ClickOnButton(browser.findElement(By.xpath("//*[@data-cy='closeModal']")));
		}
		catch(Exception e) {
		}
	}
	
	public static void SelectCategory(WebDriver browser,String ExpectedOption) {
	  
		List<WebElement> select = browser.findElements(By.xpath("//div[contains(@class,'chHeaderContainer')]//ul[1]//li"));
		for(int i=1;i<select.size();i++) {
			WebElement searchOption=browser.findElement(By.xpath("//div[contains(@class,'chHeaderContainer')]//ul[1]//li["+i+"]//*[contains(@class,'headerIconTextAlignment')]"));
			String selectOption=searchOption.getText();
			if(selectOption.equalsIgnoreCase(ExpectedOption)) {
				WebElement_Common_Usage.ClickOnButton(searchOption);
				//searchOption.click();
				break;
			}	
		}
	}
	
	public String ClickOnRoundTrip()
	{
		ClickOnRadioButton(browser.findElement(By.xpath("//*[@data-cy='roundTrip']//span")));
		return GetAtrributes(browser.findElement(By.xpath("//*[@data-cy='roundTrip']//span")),"class");
	}
	public String ClickOnOneWay()
	{
		ClickOnRadioButton(browser.findElement(By.xpath("//*[@data-cy='oneWayTrip']//span")));
		return GetAtrributes(browser.findElement(By.xpath("//*[@data-cy='oneWayTrip']//span")),"class");
	}
	public String ClickOnMultiCity()
	{
		ClickOnRadioButton(browser.findElement(By.xpath("//*[@data-cy='mulitiCityTrip']//span")));
		return GetAtrributes(browser.findElement(By.xpath("//*[@data-cy='mulitiCityTrip']//span")),"class");
	}
	
	public static void clickonfromcity(WebDriver browser,String SelectCountry) {
		List<WebElement> allcity = browser.findElements(By.xpath("//ul[@role='listbox']//li"));
		for(int i=1;i<allcity.size();i++) {
			WebElement eachcity = browser.findElement(By.xpath("//ul[@role='listbox']//li["+i+"]//ul[@role='listbox']//li//*[contains(@class,'font14')]"));
			String GetCountryName=eachcity.getText();
			if(GetCountryName.equalsIgnoreCase(SelectCountry)) {
				ClickOnButton(eachcity);
				break;
			}
		}
	}
	
	public void ClickFromLocation()
	{
		WebElement_Common_Usage.ExplicitWaitForClickable(browser, 60, By.xpath("//*[@for='fromCity']"));
		//ClickOnButton(browser.findElement(By.xpath("//*[@for='fromCity']")));	
		ClickOnButton(fromCity);	
	}
	
	public void selectcountry() {
		ClickFromLocation();
		
	}
}






