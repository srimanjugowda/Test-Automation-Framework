package com.ui.pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import com.constants.Browser;
import static com.constants.Env.*;
import com.utility.BrowserUtility;
import com.utility.JSONUtility;
import com.utility.LoggerUtility;

import static com.utility.PropertiesUtil.*;


//Page object Design Pattern

public final class HomePage extends BrowserUtility {
	
	Logger logger = LoggerUtility.getLogger(this.getClass());
	
	

	private static final By SIGN_IN_LINK_LOCATOR = By.xpath("//a[contains(text(),\"Sign\")]");
	
	

	public HomePage(Browser browserName, boolean isHeadless) {
		super(browserName,isHeadless);
		goToWebsite(JSONUtility.readJSON(QA).getUrl());
		
	}
	
	
   public HomePage(WebDriver driver) {
	   super(driver);
	   goToWebsite(JSONUtility.readJSON(QA).getUrl());
	   
   }


	//Here datatype of LoginPage is LoginPage only
	public LoginPage goToLoginPage() {  // Page Functions -----> In Page object design pattern we will not return void type
		  
		
	    logger.info("Trying to performing click to go to Sign in Page");	
		clickOn(SIGN_IN_LINK_LOCATOR);
		// it will get that session and give it to loginpage class like getting session from one page object performing require
		// operation and passing it to another page object to utilize it
		LoginPage loginpage = new LoginPage(getDriver());  
		return loginpage;                                 
	}


	public void quit() {
		// TODO Auto-generated method stub
		
	}


	

}
