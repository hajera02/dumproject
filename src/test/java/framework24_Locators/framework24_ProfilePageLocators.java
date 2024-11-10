package framework24_Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import framework24_Utility.framework24_Baseclass;

public class framework24_ProfilePageLocators  extends framework24_Baseclass{
	public framework24_ProfilePageLocators() {
		PageFactory.initElements(driver, this );
		
	}
		
		@FindBy(id="nameofuser")
	public WebElement ProfileValidation ;	
		
	}
	
	
