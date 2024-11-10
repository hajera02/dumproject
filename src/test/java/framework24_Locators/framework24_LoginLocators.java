package framework24_Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import framework24_Utility.framework24_Baseclass;

public class framework24_LoginLocators extends framework24_Baseclass {
	public framework24_LoginLocators () {
		PageFactory.initElements(driver, this );
		
	}
		
		@FindBy(id="loginusername")
	public WebElement username;
		@FindBy(id="loginpassword")
		public WebElement password ;	
		@FindBy(xpath="//button[text()='Log in']")
		public WebElement Loginbutton ;		
		
		
}

