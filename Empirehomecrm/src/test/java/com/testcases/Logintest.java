package com.testcases;

import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.Basetest;
import com.pageobjects.Loginfunctionality;
import com.utils.Utils;


public class Logintest extends Basetest {

	Loginfunctionality Login;

	public Logintest() {
		super();   //invokes the parent class constructor
	}

	@BeforeMethod
	public void setup() {

		initialization();

		Login =new Loginfunctionality();
		

	}
@Test
public void Loginvarification() {
	Login.verifylogin();
	String urltest = driver.getCurrentUrl();
	Assert.assertEquals(urltest, "https://katalon-demo-cura.herokuapp.com/#appointment");
	
	
	
}
@Test
public void invalidloginvarification() {
	Login.verifyinvalidlogin();
	String url=driver.getCurrentUrl();
	Assert.assertEquals(url,"https://katalon-demo-cura.herokuapp.com/#appointment");
}

	

	@AfterMethod
	public void teardown(ITestResult Result) {
		//  extentreports.flush();
		  if (Result.getStatus()==ITestResult.FAILURE) {
			String Filename=Result.getMethod().getMethodName()+"-"+".png";
			Utils.takescreenshot(Filename, driver);
		}
//		driver.close();
		

	}
}
