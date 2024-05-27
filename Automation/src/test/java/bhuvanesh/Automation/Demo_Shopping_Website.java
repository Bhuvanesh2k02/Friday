package bhuvanesh.Automation;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Demo_Shopping_Website {
	WebDriver driver;
	//@Test
	public void demoShop() throws InterruptedException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
//		boolean ourBiggest=driver.findElement(By.xpath("//span[text()='OUR BIGGEST']")).isEnabled();
//		System.out.println(ourBiggest);
		driver.findElement(By.cssSelector("[data-testid='open-registration-form-button']")).click();
		//Implicit
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.findElement(By.xpath("//*[@placeholder='First name']")).sendKeys("bhuvanesh");
		//Thread.sleep(1000);
		driver.findElement(By.name("lastname")).sendKeys("C");
		driver.findElement(By.name("reg_email__")).sendKeys("8754313835");
		//Explicit
		driver.findElement(By.id("password_step_input")).sendKeys("bhuvanesh2k02");
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(60));
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.name("websubmit"))));
		driver.findElement(By.name("websubmit")).click();
	}
	//@Test
	public void dropdown() {
		
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		System.out.println("TestCase1 pass");
		//driver.findElement(By.cssSelector("#j_idt87:lang_label")).click();
		//implicit
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		//explicit
		/*WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(60));
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector("#j_idt87:lang_0"))));
		
		//either we can go for list collection or set collection
		//List<WebElement> Countries= driver.findElements(By.tagName("//div[@id='example-11']//button[@role='option'][parent::div[@class='fs-scrollbar-content']]"));
		List<WebElement> Countries= driver.findElements(By.cssSelector("#j_idt87:lang_0"));

		//System.out.println("Total no. of. countries : "+Countries.size());
	    for(WebElement selectCountry : Countries) {
	    	String getCountry = selectCountry.getText();
	    	if(getCountry.equalsIgnoreCase("English")) {
	    		selectCountry.click();
	    		break;
	    	}
	    }*/
	}
	
}






