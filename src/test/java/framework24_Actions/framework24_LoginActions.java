package framework24_Actions;




import framework24_Locators.framework24_LoginLocators;
import framework24_Utility.framework24_Baseclass;

public class framework24_LoginActions extends  framework24_Baseclass {
	framework24_LoginLocators fframework24_LoginLocators =new framework24_LoginLocators();
	public void usercardentials(String U,String P) throws InterruptedException {
		Thread.sleep(3000);
		fframework24_LoginLocators.username.sendKeys(U);
		Thread.sleep(3000);
		fframework24_LoginLocators.password.sendKeys(P);
		Thread.sleep(3000);
		fframework24_LoginLocators.Loginbutton.click();
		
		
}
}