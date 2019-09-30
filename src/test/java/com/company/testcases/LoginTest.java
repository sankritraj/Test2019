package com.company.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import com.company.pages.HomePage;
import com.company.pages.LoginPage;
import com.company.pages.ZohoAppPage;

import testcases.BaseTest;

public class LoginTest extends BaseTest {
	
	@Test
	public static void Login()
	{

		
		HomePage home= new HomePage();
		LoginPage lp= home.goToLogin();
		lp.doLogin("test", "test");
		
		
		
		
	}
		
	

}
