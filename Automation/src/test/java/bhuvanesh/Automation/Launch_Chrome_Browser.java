package bhuvanesh.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class Launch_Chrome_Browser {

	//@Test
	public void webdriver() throws InterruptedException{
		WebDriver driver = new ChromeDriver();//if import is not shown on auto suggestion just use it "control+shift+o"
		driver.manage().window().maximize();//why we are use this maximize window - because the code can't visible properly so sometime will get the runtime error
		driver.get("https://www.facebook.com/");
		WebElement enteremail=driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/div/form/div/div/input"));//Absolute xpath
		enteremail.sendKeys("bhuvanesh2k02@gmail.com");
		//Thread.sleep(1000);
		enteremail.clear();
		WebElement enterph_num=driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/div/form/div/div/input"));//Absolute xpath
		enterph_num.sendKeys("8754313835");
		//Thread.sleep(1000);
		enterph_num.clear();
		enterph_num.sendKeys("8754313835999");
		//Thread.sleep(1000);
		WebElement enterpass=driver.findElement(By.xpath("//input[@name='pass']"));//Relative xpath->basic xpath
		enterpass.sendKeys("Bhuvanesh@2k02");
		Thread.sleep(500);
		enterpass.clear();
		enterph_num.clear();
		driver.findElement(By.xpath("//*[@id='email'][@placeholder='Email address or phone number'][@name='email']")).sendKeys("bhuvanesh8754316458");
		
		Thread.sleep(3000);
		driver.close();
		System.out.println("TestCase2 pass");
	}
	//@Test
	public void forgetAccount() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement forpassword = driver.findElement(By.linkText("Forgotten password?"));
		forpassword.click();
		Thread.sleep(1000);
		WebElement enteremail4=driver.findElement(By.xpath("//input[@type='text']"));//Relative xpath->basic xpath
		enteremail4.sendKeys("Bhuvanesh2k02@gmail.com");
		//Thread.sleep(1000);
		WebElement enteremail5=driver.findElement(By.xpath("//*[@type='email']"));//Relative xpath->basic xpath
		enteremail5.sendKeys("Bhuvanesh2k02@gmail.com");
		//Thread.sleep(1000);
		WebElement enteremail6=driver.findElement(By.xpath("//input[@type='password']"));//Relative xpath->basic xpath
		enteremail6.sendKeys("Bhuvanesh@2k02");
		//Thread.sleep(1000);
		enteremail4.clear();
		enteremail5.clear();
		enteremail6.clear();
		//Thread.sleep(2000);
		driver.close();
		


	}
	//@Test
	public void forgotPassword() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		//Thread.sleep(1000);
		WebElement forpassword = driver.findElement(By.linkText("Forgotten password?"));
		forpassword.click();
		Thread.sleep(1000);
		WebElement enterEamil = driver.findElement(By.xpath("//input[@id='identify_email']"));//Relative xpath->basic xpath
		enterEamil.sendKeys("bhuvanesh2k02@gmail.com");
		//Thread.sleep(1000);
		enterEamil.clear();
		WebElement entereamil =driver.findElement(By.cssSelector("input#identify_email"));//css Selector-#id"value"
		entereamil.sendKeys("cssSelector");
		Thread.sleep(1000);
		enterEamil.clear();
		WebElement Entereamil =driver.findElement(By.cssSelector("#identify_email"));//css Selector-#id"value"
		Entereamil.sendKeys("cssSelector1112");
		Thread.sleep(1000);
		WebElement enteremail2=driver.findElement(By.xpath("//input[@dir='ltr']"));//Relative xpath->basic xpath
		enteremail2.sendKeys("bhuvanesh2k02@gmail.com");
		//Thread.sleep(1000);
		WebElement enteremail3=driver.findElement(By.xpath("//input[@name='pass']"));//Relative xpath->basic xpath
		enteremail3.sendKeys("Bhuvanesh@2k02");
		//Thread.sleep(1000);
		enterEamil.clear();
		enteremail2.clear();
		enteremail3.clear();
		//Thread.sleep(2000);
		driver.close();
	}
	//@Test
	public void Meesho() throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		WebElement search = driver.findElement(By.xpath("//input[contains(@title,'Search')]"));
		search.sendKeys("Hire Oil");
		
		
		Thread.sleep(1000);
//		WebElement search1 = driver.findElement(By.xpath("//input[contains(@title,'Products')]"));
//		search1.clear();
//		search.clear();
//		search1.clear();
//		Thread.sleep(1000);
		WebElement search2 = driver.findElement(By.xpath("//input[starts-with(@title,'Sear')]"));
		
		search.clear();
		//search2.sendKeys("moblie");
		
//		search2.clear();
		//Thread.sleep(1000);
		//driver.close();
	}
}


