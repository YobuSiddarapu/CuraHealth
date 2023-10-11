package com.testcases;

import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.Basetest;
import com.pageobjects.Loginfunctionality;


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
	AssertJUnit.assertEquals(urltest, "http://empirehome.myprojectsonline.co.in/EmpireHome/Dashboard");
	
	
	
}

	

	@AfterMethod
	public void teardown() {
	//	  extentreports.flush();
		//driver.close();

	}
}
