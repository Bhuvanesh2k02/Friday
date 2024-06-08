package formulas;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import ElementUtils.webElementCommons;

public class ListToBe_Click {

	public static void SelectValueFromList(WebDriver browser, String expectedText)
	{
		List<WebElement> AllList = browser.findElements(By.xpath("(//ul[@role='listbox'])[last()]//li"));
		for(int i=1;i<AllList.size();i++)
		{
			WebElement eachCountry =browser.findElement(By.xpath("((//ul[@role='listbox'])[last()]//li["+i+"]//div[contains(@class,'spaceBetween')]//div)[last()]"));
			//String actualCountrycode = webElementCommons.GetText(eachCountry);
			String selectcountry = eachCountry.getText();
			if(selectcountry.equalsIgnoreCase(expectedText))
			{
				eachCountry.click();
				break;
			}
		}
	}
}
