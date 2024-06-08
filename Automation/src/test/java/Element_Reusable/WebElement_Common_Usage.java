package Element_Reusable;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebElement_Common_Usage {

	public static void ExplicitWaitForClickable (WebDriver browser,int seconds,By Element) {

		WebDriverWait wait = new WebDriverWait(browser,Duration.ofSeconds(seconds));
		wait.until(ExpectedConditions.elementToBeClickable(Element));
	}

	public static void ClickOnButton (WebElement button) {
		if(button.isDisplayed()) {
			button.click();
		}
	}

	public static void ExplictWaitForVisible(WebDriver driver,int timeOut,By element){
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(timeOut));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(element));
	}
	public void ClickOnRadioButton(WebElement radio)
	{
		radio.click();
	}
	public static String GetAtrributes(WebElement textbox,String attributeName)
	{
		if(textbox.isDisplayed())
		{
			return textbox.getAttribute(attributeName);
		}
		return null;
	}

}
