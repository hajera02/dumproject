package framework24_Actions;

import org.testng.Assert;

import framework24_Locators.framework24_HomePageLocators;
import framework24_Utility.framework24_Baseclass;

public class framework24_HomePageActions extends framework24_Baseclass {
	framework24_HomePageLocators fframework24_HomePageLocators =new framework24_HomePageLocators();
	
	public void ClickonLogin() {

		fframework24_HomePageLocators.Loginn.click();
		
}
	public void ClickContactLink() {
		fframework24_HomePageLocators.Contactlink.click();
	}	
	
	public void Clickonsignup()  {
	
		fframework24_HomePageLocators.Signup.click();
		
		
}
	public void Verifyusercansignupsuccessfully() throws Exception {
		Thread.sleep(3000);
	boolean Verifysignup =	fframework24_HomePageLocators.Signupvalidation.isDisplayed();	
	Assert.assertTrue(Verifysignup);
}	
}