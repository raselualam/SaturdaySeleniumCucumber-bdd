package com.talentech.steps;

import com.talentech.baseclass.BaseClass;
import com.talentech.pom.NewtoursHomePage;
import com.talentech.pom.NewtoursRegisterPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class NewtoursRegisterSteps {
	
	NewtoursHomePage newtoursHomePage = new NewtoursHomePage(BaseClass.driver);
	NewtoursRegisterPage newtoursRegisterPage = new NewtoursRegisterPage(BaseClass.driver);
	
	@Given("^Browse to Newtours homepage$")
	public void browse_to_Newtours_homepage() throws Throwable {
		newtoursHomePage.loadNewtours();
	}

	@When("^Navigate to Register page$")
	public void navigate_to_Register_page() throws Throwable {
		newtoursHomePage.navigateRegister();
	}

	@When("^Fill form with some basic information$")
	public void fill_form_with_some_basic_information() throws Throwable {
		newtoursRegisterPage.fillContactInformation();
		newtoursRegisterPage.fillMailingInformation();
	}

	@When("^Complete creating account with \"([^\"]*)\"$")
	public void complete_creating_account_with(String arg1) throws Throwable {
	    // to do
	}

	@Then("^Verify account created successfully$")
	public void verify_account_created_successfully() throws Throwable {
		// to do
	}	
}
