package com.talentech.pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.talentech.baseclass.BaseClass;
import com.talentech.hooks.ReadExcelSheetData;

public class NewtoursHomePage extends BaseClass{
	
	public NewtoursHomePage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath="//a[contains(text(),'REGISTER')]")
    public WebElement linkRegister;

    @FindBy(xpath="//input[@name='userName']")
    public WebElement txtUserName;

	public void loadNewtours(){
    	driver.get("http://newtours.demoaut.com/");
		driver.manage().timeouts().implicitlyWait(20,  TimeUnit.SECONDS);
	}
	
	public void navigateRegister(){
		linkRegister.click();
	}
	
	public void excelReader() throws Exception{
		System.out.println(">>>>>>>>>>>>" + ReadExcelSheetData.getMapData("FirstName"));
	}
}
