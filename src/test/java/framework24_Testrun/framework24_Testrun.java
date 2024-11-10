package framework24_Testrun;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import framework24_Utility.framework24_Baseclass;

@CucumberOptions(features = {"src/test/resourcesfr/FrameworkFeatures"},
plugin = {"json:target/cucumber.json"},
glue = "framework24_stepdefit",tags = {"@Framework"})
public class framework24_Testrun extends AbstractTestNGCucumberTests  {

@BeforeTest
public void SoftWareStartURL() {
	
	framework24_Baseclass Test=new framework24_Baseclass();
	Test.SoftWareTestBrowser();
}	
	@AfterTest
	public void SoftWareCloseURL() {
		framework24_Baseclass Test=new framework24_Baseclass();
	Test.driver.quit();
}
}