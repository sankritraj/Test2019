package com.company.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;

import com.company.base.Page;

public class HomePage extends Page {
	
	
	
	public void goToSignUp() {
		driver.findElement(By.className("zh-signup")).click();
		
	}
	
	public LoginPage goToLogin()
	{
		try {
		driver.findElement(By.className("zh-login1")).click();
		
		
		}
		catch(Exception e)
		{
		Reporter.log("Excpetion occured for Login");
		Assert.fail("Excpetion occured for Login");
		}
		return new LoginPage();
				
	}
	
	public SupportPage goToSupportPage()
	{
		try {
		driver.findElement(By.className("zh-support")).click();
		
		for(String winHandle : driver.getWindowHandles()){
		    driver.switchTo().window(winHandle);
		}
		
		
		}
		catch(Exception e)
		{
		Reporter.log("Excpetion occured for support");
		Assert.fail("Excpetion occured for support");
		}
		return new SupportPage();
				
	}
	
	public void validateFooter()
	{
		
	}

}
