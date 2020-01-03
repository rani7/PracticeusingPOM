package com.qa.mystore.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.qa.mystore.base.TestBase;

public class SearchPage extends TestBase{
	
	@FindBy(xpath="//input[@name='search_query']")
	WebElement searchBox;
	
	@FindBy(xpath="//button[@name='submit_search']")
	WebElement searchBtn;

	
	public SearchPage(){
		PageFactory.initElements(driver,this);
	}
	
	public String readPageTitle(){
		return driver.getTitle();
	}

	public ResultPage search(){
		searchBox.sendKeys(prop.getProperty("search_criteria"));
		searchBtn.click();
		return new ResultPage();
	}
}
