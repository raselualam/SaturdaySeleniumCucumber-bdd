package com.talentech.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.talentech.baseclass.BaseClass;

public class NewtoursRegisterPage extends BaseClass{
	
	public NewtoursRegisterPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath="//input[@name='firstName']")
    public WebElement txtfirstName;

    @FindBy(xpath="//input[@name='address1']")
    public WebElement txtaddress1;
	
	public void fillContactInformation(){
		txtfirstName.sendKeys("Rasel");
	}
	
	public void fillMailingInformation(){
		txtaddress1.sendKeys("123 Main st");;
	}
}
