package com.company.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.Reporter;

import com.company.base.Page;

public class SupportPage  extends Page{
	
	public void SearchArticle(String text) {
		driver.findElement(By.id("searchContainer1")).sendKeys(text);
		
		driver.findElement(By.xpath("//*[@id='tsf']/div[2]/div/div[1]/div/div[1]/input")).sendKeys("Fresco Play");
		
		driver.findElement(By.name("btnK")).sendKeys(Keys.ENTER);
		
	}
	
	public void verifySupportElementisVisible() {
		
		if(verifyElementisVisible(By.id("searchContainer1")))
		{
			Reporter.log("tested");
		}
		else {
			Assert.fail();
		}
		
	}

	
	

}
