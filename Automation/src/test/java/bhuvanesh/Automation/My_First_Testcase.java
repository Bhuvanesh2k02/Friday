package bhuvanesh.Automation;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

public class My_First_Testcase extends Writing_Reports{

	@BeforeSuite
	public void BeforeSuite() {
		CreationOf_ExtentReport_FrameWork();
		System.out.println("BeforeSuite");
	}
	
	@Test(priority=2,enabled=true)
	public void TestCase2() {
		test=report.createTest("TestCase2", "TestCase2 has failed");
		Assert.assertTrue(true, "Please correct your TestCase");
		test.log(Status.PASS, "TC 2 has fail");
		System.out.println("--TestCase2--");
		
	}
	
	@BeforeMethod
	public void TestCase1() {
		
		System.out.println("BeforeMethod1");
	}
	
	@Test(priority=1)
	public void TestCase3() {
		
		test = report.createTest("TestCase1", "TestCase1 has passed");
		test.log(Status.INFO, "1st TC");
		test.log(Status.PASS, "2st TC");
		test.log(Status.PASS, "3st TC");
		test.log(Status.PASS, "4st TC");
		Assert.assertTrue(true);
		//System.out.println("--TestCase2--");
		
	}
	@AfterMethod
	public void TestCase4() {
		
		System.out.println("AfterMethod2");
		System.out.println("");
	}
	
	@Test(priority=3)
	public void TestCase5() {
		test = report.createTest("TestCase5", "TestCase5 has passed");
		test.log(Status.INFO, "1st TC");
		test.log(Status.PASS, "2st TC");
		test.log(Status.PASS, "3st TC");
		test.log(Status.SKIP, "4st TC");
		Assert.assertTrue(true);
		System.out.println("--TestCase5--");
		
	}
	
	@BeforeClass
	public void TestCase_1() {
	
		System.out.println("BeforeClass1");
	}
	
	@AfterTest
	public void TestCase_2() {
	
		System.out.println("AeforeTest");
	}
	
	@AfterSuite
	public void TestCase_3() {
		report.flush();
		System.out.println("AeforeSuite");
	}
	
}
