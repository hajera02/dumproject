package framework24_Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import framework24_Utility.framework24_Baseclass;

public class framework24_ContactLocators extends framework24_Baseclass {
	public framework24_ContactLocators () {
		PageFactory.initElements(driver, this );
		
	}
		
		@FindBy(id="recipient-email")
	public WebElement Email ;	
		@FindBy(id="recipient-name")
		public WebElement Name;	
		@FindBy(id="message-text")
		public WebElement Messagetext;		

		@FindBy(xpath="//button[text()=\"Send message\"]")
		public WebElement Clickbutton;	

		@FindBy(xpath="//a[text()=\"Monitors\"]")
		public WebElement Verifysendmessage;	
}

