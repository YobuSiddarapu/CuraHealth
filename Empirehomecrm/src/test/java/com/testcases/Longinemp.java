package com.testcases;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.Basetest;
public class Longinemp extends Basetest {
	


	@FindBy (xpath="//input[@placeholder='example@gmail.com']")
	
	WebElement userid; 
	
	@FindBy (id="pword")
	WebElement pass;
	
	@FindBy (xpath="//button[@Class='btn green_btn']")
	WebElement loginbutton;


	
	public void Verifytologin(String USERNAME,String PASS) {
		userid.sendKeys(USERNAME);
		pass.sendKeys(PASS);
		loginbutton.click();
	}
		

	
	

	
		
	
	

}
