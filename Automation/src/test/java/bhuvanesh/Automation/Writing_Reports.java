package bhuvanesh.Automation;

import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;
/*
 * @BeforeSuite --It will run before all the test
 * @BeforeTest --It will run before all the class
 * @BeforeClass - it will run before all the TestCase in that class
 * @BeforeMethod --It will run before each TestCase
 * @Test--> TestCase
 * @AfterMethod --It will run after each TestCase
 * @AfterClass - it will run after all the TestCase in that class
 * @AfterTest --It will run after all the class
 * @AfterSuite --It will run after all the test  
 * 
 * Extent AventReport Classes:
 * ExtentHtmlReporter --> report location
 * ExtentReports --> it use to create a Test in each & every Method
 * ExtentTest -- write in that report
 */

public class Writing_Reports {

	public static ExtentHtmlReporter reporter;
	public static ExtentReports report;
	public static ExtentTest test;
	
	String ReportFile =System.getProperty("user.dir")+"\\Report\\TestCase.html"; 
	
	public void CreationOf_ExtentReport_FrameWork() {
		
		reporter = new ExtentHtmlReporter(ReportFile);
		report=new ExtentReports();
		report.attachReporter(reporter);
		
		reporter.config().setChartVisibilityOnOpen(true);
		reporter.config().setDocumentTitle("My Frist Report");
		reporter.config().setReportName("Fita Project");
		reporter.config().setTheme(Theme.DARK);
		reporter.config().setTestViewChartLocation(ChartLocation.TOP);
		reporter.config().setTimeStampFormat("EEEE, MMMM dd, yyyy, hh:mm:ss a '('zzz')'");
		
	}

}
	

