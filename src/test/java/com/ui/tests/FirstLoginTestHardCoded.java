package com.ui.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.utility.BrowserUtility;

public class FirstLoginTestHardCoded {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		WebDriver wd = new ChromeDriver();//Launch a Browser Window!! Browser Session is Created!!
		
		BrowserUtility browserUtility = new BrowserUtility(wd);
		browserUtility.goToWebsite("http://www.automationpractice.pl");
		browserUtility.maximizeWindow();
		
		
		
		
		
		By signInLinkLocator = By.xpath("//a[contains(text(),\"Sign\")]");
		WebElement signInLinkWebElement = wd.findElement(signInLinkLocator);
		signInLinkWebElement.click();
		
		By emailTextBoxLocator = By.id("email");
		WebElement emailTextBoxWebElement = wd.findElement(emailTextBoxLocator);
		emailTextBoxWebElement.sendKeys("fdyhugi153@uxmil.com");
		
		By passwordTextBoxLocator = By.id("passwd");
		WebElement passwordTextBoxWebElement = wd.findElement(passwordTextBoxLocator);
		passwordTextBoxWebElement.sendKeys("password");
		
		By submitLoginButtonLocator = By.id("SubmitLogin");
		WebElement submitLoginButtonWebElement = wd.findElement(submitLoginButtonLocator);
		submitLoginButtonWebElement.click();
		
		
		

	}

}
