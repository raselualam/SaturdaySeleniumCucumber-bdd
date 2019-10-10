package com.talentech.baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class BaseClass{
	
	public static WebDriver driver = getDriver();
	
	public BaseClass(WebDriver driver){
		BaseClass.driver=driver;
		PageFactory.initElements(driver, this); 
	}
	
	public static WebDriver getDriver(){
		System.setProperty("webdriver.chrome.driver", "C:/tda_cc_views/Softwares/chromedriver.exe");
		driver= new ChromeDriver();
		return driver;
	}
}
