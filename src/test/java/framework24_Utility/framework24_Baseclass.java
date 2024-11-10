package framework24_Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class framework24_Baseclass {

public static WebDriver driver;	
public static 	Properties prop;
public framework24_Baseclass() {
  
    try {
		FileInputStream fls =new FileInputStream(System.getProperty("user.dir")+ "\\src\\test\\java\\framework24_configure\\framework24_Config.Properties");
		
		 prop =new Properties();
				
			prop.load(fls);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}	
			
		}

public void SoftWareTestBrowser() {

String SoftWareB ="Chrome";
if(SoftWareB.equals("Chrome")) {
	
	System.setProperty("Webdriver.chrome.driver", (System.getProperty("user.dir")+"\\framework24_ChromeDriver\\chrome.exe"));
	ChromeOptions ops = new ChromeOptions();
	ops.addArguments("--remote-allow-origins=*");
	
driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(framework24_TestData.implicitlyWait));
driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(framework24_TestData.pageLoadTimeout));
driver.manage().deleteAllCookies();
	
	


}else if(SoftWareB.equals("IE")) {




}


} 

public  static void SoftWareLaunchURL() {

driver.get(prop.getProperty("SoftWareTestURL"));




}

}