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
	
	public static void ClickOnClose (WebElement button) {
		if(button.isDisplayed()) {
			button.click();
		}
	}
}
