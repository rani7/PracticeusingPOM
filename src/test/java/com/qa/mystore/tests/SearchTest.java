package com.qa.mystore.tests;

import org.testng.annotations.BeforeMethod;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.qa.mystore.base.TestBase;
import com.qa.mystore.pages.ResultPage;
import com.qa.mystore.pages.SearchPage;

public class SearchTest extends TestBase{
	SearchPage searchPage;
	ResultPage resultPage;
	
	public SearchTest(){
		super();
	}
	
	@BeforeMethod
	public void setUp() throws IOException{
		initialization();
		searchPage=new SearchPage();	
	}
	
	@Test(priority=1)
	public void verifyPageTitle(){
    String title=searchPage.readPageTitle();
    System.out.println(title);
    Assert.assertEquals(title,"My Store");
	}
	
	@Test(priority=2)
	public void searchTest(){
		resultPage=searchPage.search();	
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}

}
