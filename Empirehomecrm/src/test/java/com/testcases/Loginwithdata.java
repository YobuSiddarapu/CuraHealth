package com.testcases;

import com.base.Basetest;
import com.utils.Utils;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Loginwithdata extends Basetest {
	Longinemp If;
	private final String sheetname="login";
	public Loginwithdata() {
		super();
		
	}
	@DataProvider
	public String[][] dataload()throws Throwable{
		return Utils.Customerdata(sheetname);
	
	}
	@BeforeMethod
	public void setup() {
		initialization();
		If=new Longinemp();
		
		
	}
	@Test(dataProvider="dataload",dataProviderClass=Loginwithdata.class)
	public void Login(String USERNAME,String PASS) {
		If.Verifytologin(USERNAME,PASS);
		String Url1=driver.getCurrentUrl();
		Assert.assertEquals(Url1,"http://empirehome.myprojectsonline.co.in/EmpireHome/Dashboard");
	
	}
	@AfterMethod
	public void teardown() {
		
	}
	

}
