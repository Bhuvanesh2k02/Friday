package browser;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Browser_Launch {

	public static WebDriver browser;
	public static ExtentHtmlReporter htmlReporter;
	public static ExtentReports extent;
	    //helps to generate the logs in test report.
	public static ExtentTest test;
	
	String ReportPath = System.getProperty("user.dir")+ "\\Report\\TestCase.html";
	public void LaunchBrowser() throws IOException {
		//String browserName = propertyFile.ReadDataFromProperty().getProperty("browser");
		browser = new ChromeDriver();
		browser.get("https://www.makemytrip.com/");
		browser.manage().window().maximize();
		LauchReports();
	}
	
	public void LauchReports() {
		htmlReporter = new ExtentHtmlReporter(ReportPath);
		extent=new ExtentReports();
		extent.attachReporter(htmlReporter);
		
		htmlReporter.config().setChartVisibilityOnOpen(true);
		htmlReporter.config().setDocumentTitle("Automation");
		htmlReporter.config().setReportName("MakeMyTrip");
		htmlReporter.config().setTestViewChartLocation(ChartLocation.TOP);
		htmlReporter.config().setTheme(Theme.DARK);
		htmlReporter.config().setTimeStampFormat("EEEE, mmmm dd, yyyy, hh:mm:ss a '('zzz')'");
	}
	
	public void CloseReport() {
		extent.flush();
	}
	
	public void closeBrowser() {
		browser.close();
	}
}
