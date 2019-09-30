package com.company.rough;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import com.company.pages.HomePage;
import com.company.pages.LoginPage;
import com.company.pages.ZohoAppPage;

public class LoginTest {
	
	@Test
	public  void login()
	{
	
	
		HomePage home= new HomePage();
		LoginPage lp= home.goToLogin();
		
		
		
		
	}
		
	

}
