package framework24_Actions;


import org.testng.Assert;

import framework24_Locators.framework24_ProfilePageLocators;
import framework24_Utility.framework24_Baseclass;

public class framework24_ProfilePageActions extends framework24_Baseclass {
	framework24_ProfilePageLocators fframework24_ProfilePageLocators=new framework24_ProfilePageLocators();
public void verifyusercanloginsuccessfully() throws InterruptedException {
	
		Thread.sleep(3000);
	
	
	boolean VerifyLogin= fframework24_ProfilePageLocators.ProfileValidation.isDisplayed();
	Assert.assertTrue(VerifyLogin);
}
}