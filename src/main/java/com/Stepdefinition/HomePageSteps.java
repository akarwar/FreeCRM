package com.Stepdefinition;

import com.feecrm.utilities.BaseClass;
import com.freecrmpages.HomePage;
import com.freecrmpages.loginPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class HomePageSteps extends BaseClass {
	
	loginPage loginPageTest;
	HomePage homePage ;
	
@Given("^I open a browser$")
public void i_open_a_browser()  {
	BaseClass.initialize();
}

@When("^I go to free crm link$")
public void i_go_to_free_crm_link() {
	driver.get(prop.getProperty("url"));
}

@When("^I see crm logo$")
public void i_see_crm_logo()  {
	loginPageTest = new loginPage();
	loginPageTest.validateCRMLogo();
}

@When("^I see forgot password link$")
public void i_see_forgot_password_link()  {
	boolean fgtLink = loginPageTest.validateForgotPasswordLink();
    Assert.assertTrue(fgtLink);
}

@When("^I see features link$")
public void i_see_features_link()  {
   boolean featureLink = loginPageTest.validateFeaturesLink();
   Assert.assertTrue(featureLink);
}

@When("^I see Signup link$")
public void i_see_Signup_link()  {
    
}

@When("^I see Pricing link$")
public void i_see_Pricing_link() {
    
}

@When("^I see Customers link$")
public void i_see_Customers_link() {
    
}

@When("^I see Contact link$")
public void i_see_Contact_link()  {
    
}

@When("^I enter username and password$")
public void i_enter_username_and_password() throws InterruptedException {
	 
	loginPageTest.login(prop.getProperty("username"), prop.getProperty("password"));
	Thread.sleep(3000);
}

@When("^I click Login button$")
public void i_click_Login_button() {
	loginPageTest.clickLink();
    
}

@Then("^I should see logout link$")
public void i_should_see_logout_link()  {
    
}


@Then("^I click the contact in the menu$")
public void i_click_the_contact_in_the_menu() throws InterruptedException {
	homePage= new HomePage();
    homePage.clickOnNewContactLink();
}

@Then("^I enter first name$")
public void i_enter_first_name()  {
	
	homePage.firstName();
  
}

@Then("^I enter last name$")
public void i_enter_last_name()  {
    homePage.lastName();
}

@Then("^I click save button$")
public void i_click_save_button()  {
    homePage.clickSave();
}

@Then("^I wait three seconds$")
public void i_wait_three_seconds() throws InterruptedException  {
    Thread.sleep(3000);
}


}