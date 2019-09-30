package com.company.testcases;

import org.testng.annotations.Test;

import com.company.pages.HomePage;
import com.company.pages.SupportPage;

import testcases.BaseTest;

public class SupportTest extends BaseTest {
	
	@Test
	public void verifySearchPanel()
	{
		HomePage home = new HomePage();
		home.goToSupportPage();
		SupportPage p= new SupportPage();
		//p.verifySupportElementisVisible();
		 p.SearchArticle("abc");
	}
	

}
