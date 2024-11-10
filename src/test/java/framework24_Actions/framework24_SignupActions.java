package framework24_Actions;



import framework24_Locators.framework24_SignupLocators;
import framework24_Utility.framework24_Baseclass;

public class framework24_SignupActions extends framework24_Baseclass{
	framework24_SignupLocators fframework24_SignupLocators=new framework24_SignupLocators();
	public void usercardentials(String U,String P) throws Exception {
		Thread.sleep(3000);
		fframework24_SignupLocators.username1.sendKeys(U);
		Thread.sleep(3000);
		fframework24_SignupLocators.password1.sendKeys(P);
		Thread.sleep(3000);
		fframework24_SignupLocators.Signupbutton.click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		
		
}
	
		

	
	
}