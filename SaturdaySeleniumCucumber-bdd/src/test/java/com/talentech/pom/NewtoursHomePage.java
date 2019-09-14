package com.talentech.pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.talentech.baseclass.BaseClass;
import com.talentech.hooks.ReadExcelSheetData;

public class NewtoursHomePage extends BaseClass{
	
	@FindBy(xpath="//a[contains(text(),'REGISTER')]")
    public WebElement linkRegister;

    @FindBy(xpath="//input[@name='userName']")
    public WebElement txtUserName;

	public void loadNewtours(){
		System.setProperty("webdriver.chrome.driver", "C:/TTSoftware/chromedriver.exe");
		driver= new ChromeDriver();
		PageFactory.initElements(driver, this);
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
