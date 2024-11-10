package framework24_Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import framework24_Utility.framework24_Baseclass;

public class framework24_HomePageLocators extends framework24_Baseclass {

	public framework24_HomePageLocators() {
	PageFactory.initElements(driver, this );
	
}
	
	@FindBy(id="login2")
public WebElement Loginn ;	
	@FindBy(xpath="//a[text()=\"Contact\"]")
	public WebElement Contactlink;	
	@FindBy(id="signin2")
	public WebElement Signup ;
	@FindBy(id="cat")
	public WebElement Signupvalidation ;
}