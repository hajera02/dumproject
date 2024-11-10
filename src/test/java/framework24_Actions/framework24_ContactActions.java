package framework24_Actions;

import org.testng.Assert;

import framework24_Locators.framework24_ContactLocators;
import framework24_Utility.framework24_Baseclass;
import framework24_Utility.framework24_TestData;

public class framework24_ContactActions extends framework24_Baseclass{
	framework24_ContactLocators fframework24_ContactLocators=new framework24_ContactLocators();
	
	
public void	EnterContactemailnamemessage() {
	fframework24_ContactLocators.Email.sendKeys(framework24_TestData.email);
	fframework24_ContactLocators.Name.sendKeys(framework24_TestData.ContractName);
	fframework24_ContactLocators.Messagetext.sendKeys(framework24_TestData.message);
}	
	public void Clicksendmessagebutton() {
		
		fframework24_ContactLocators.Clickbutton.click();
	driver.switchTo().alert().accept();	
}
	
	public void verifycontactmessagesendsuccessfully() {
		
		
	boolean resultt=	fframework24_ContactLocators.Verifysendmessage.isDisplayed();
	Assert.assertTrue(resultt);
	}
	
}