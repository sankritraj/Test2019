package com.company.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.company.base.Page;

public class LoginPage extends Page {
	
	
	
	public ZohoAppPage doLogin(String username, String password)
	{
		driver.switchTo().frame("zohoiam");
		driver.findElement(By.className("lid")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password);
		driver.findElement(By.id("signin_submit")).click();
		
		return new ZohoAppPage();
		
	}

}
