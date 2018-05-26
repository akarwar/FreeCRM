package com.freecrmpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.feecrm.utilities.BaseClass;

public class loginPage extends BaseClass {
	
		// define object
		@FindBy(xpath = "//img[contains(@class,'img-responsive')]") WebElement crmLogo;
		@FindBy(xpath = "//small[contains(.,'Forgot Password?')]") WebElement forgotPasswordLink;
		@FindBy(xpath = "//a[contains(.,'Features')]") WebElement featuresLink;
		@FindBy(xpath = "//a[contains(.,'Sign Up')]") WebElement signUpLink;
		@FindBy(xpath = "//a[contains(.,'Pricing')]") WebElement pricingLink;
		@FindBy(xpath = "//a[contains(.,'Customers')]") WebElement customerLink;
		@FindBy(xpath = "//a[contains(.,'Contact')]") WebElement contactLink;
		@FindBy(xpath = "//input[@name='username']") WebElement usernameField;
		@FindBy(xpath = "//input[@name='password']") WebElement passwordField;
		@FindBy(xpath = "//input[@value='Login']") WebElement loginLink;
		
		
		//initialize the Page Object
		public loginPage() {
			PageFactory.initElements(driver, this);
		}
		
		public String validateLoginTitle() {
			return driver.getTitle();
		}
		
		public boolean validateCRMLogo() {
			return crmLogo.isDisplayed();
		}
		
		public boolean validateForgotPasswordLink() {
			return forgotPasswordLink.isDisplayed();
		}
		
		public boolean validateFeaturesLink() {
			return featuresLink.isDisplayed();
		}
		
		public boolean validatesignUpLink() {
			return signUpLink.isDisplayed();
		}
		
		public boolean validatepricingLink() {
			return pricingLink.isDisplayed();
		}
		
		public boolean validatecustomerLink() {
			return customerLink.isDisplayed();
		}
		
		public boolean validatecontactLink() {
			return contactLink.isDisplayed();
		}
		
		public HomePage login(String username,String password) {
			usernameField.sendKeys(username);
			passwordField.sendKeys(password);
			return new HomePage();
		}
		
		public void clickLink() {
			driver.findElement(By.xpath("//input[@value='Login']")).click();
		}

	}

