
package framework24_stepdefit;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import framework24_Actions.framework24_ContactActions;
import framework24_Actions.framework24_HomePageActions;
import framework24_Actions.framework24_LoginActions;
import framework24_Actions.framework24_ProfilePageActions;
import framework24_Actions.framework24_SignupActions;
import framework24_Utility.framework24_Baseclass;

public class framework24_Stepdefit extends framework24_Baseclass {
	framework24_HomePageActions fframework24_HomePageActions=new framework24_HomePageActions();
	framework24_LoginActions fframework24_LoginActions=new framework24_LoginActions();
	framework24_ProfilePageActions fframework24_ProfilePageActions=new framework24_ProfilePageActions();
	framework24_SignupActions fframework24_SignupActions=new framework24_SignupActions();
	framework24_ContactActions fframework24_ContactActions=new framework24_ContactActions();
	
	@Given("^Launch \"([^\"]*)\" Applicationss$")
	public void launch_Applicationss(String URL) throws Throwable {
		SoftWareLaunchURL();
		framework24_Utility.framework24_Utility.takescreenshot(driver, "Home Page");
	}
	@Then("^Click on Login$")
	public void click_on_Login() throws Throwable {
		fframework24_HomePageActions.ClickonLogin();
	}

	@Then("^Enter UserName PassWord Click Login button$")
	public void enter_UserName_PassWord_Click_Login_button() throws Throwable {
		fframework24_LoginActions.usercardentials(prop.getProperty("SoftWareTestUserName"),prop.getProperty("SoftWareTestPassWord") ); 
	}

	@Then("^verify user can login successfully\\.$")
	public void verify_user_can_login_successfully() throws Throwable {
		fframework24_ProfilePageActions.verifyusercanloginsuccessfully();
		framework24_Utility.framework24_Utility.takescreenshot(driver, "LoginSucessfully");
	}
	@Then("^Click Contact Link$")
	public void click_Contact_Link() throws Throwable {
		fframework24_HomePageActions.ClickContactLink();
	}

	@Then("^Enter Contact email name message$")
	public void enter_Contact_email_name_message() throws Throwable {
		fframework24_ContactActions.EnterContactemailnamemessage();
	}

	@Then("^Click send message button$")
	public void click_send_message_button() throws Throwable {
		fframework24_ContactActions.Clicksendmessagebutton();
		
	}

	@Then("^verify contact message send successfully\\.$")
	public void verify_contact_message_send_successfully() throws Throwable {
		fframework24_ContactActions.verifycontactmessagesendsuccessfully();
		
	}
	@Then("^Click on Signup$")
	public void click_on_Signup() throws Throwable {
		fframework24_HomePageActions.Clickonsignup();
	}

	@Then("^Enter Username Password Click Signup button$")
	public void enter_Username_Password_Click_Signup_button() throws Throwable {
		fframework24_SignupActions.usercardentials(prop.getProperty("frameworkusername"),prop.getProperty("frameworkpassword"));
	}

	@Then("^Verify user can signup successfully$")
	public void verify_user_can_signup_successfully() throws Throwable {
		fframework24_HomePageActions.Verifyusercansignupsuccessfully();
	}




}