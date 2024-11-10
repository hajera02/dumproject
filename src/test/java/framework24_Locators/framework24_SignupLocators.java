package framework24_Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import framework24_Utility.framework24_Baseclass;

public class framework24_SignupLocators extends framework24_Baseclass {
	public framework24_SignupLocators() {
		PageFactory.initElements(driver, this );
}
	
	@FindBy(id="sign-username")
	public WebElement username1;
		@FindBy(id="sign-password")
		public WebElement password1 ;	
		@FindBy(xpath="//button[text()='Sign up']")
		public WebElement Signupbutton ;		
	
	
}