package framework24_Utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class framework24_Utility extends framework24_Baseclass {

	
	public static void takescreenshot(WebDriver driver, String screenshot) {

		File srcfile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		String correntdir = System.getProperty("user.dir");

		try {
			FileUtils.copyFile(srcfile, new File(correntdir + "/framework24_Screenshots/" + screenshot + ".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	
	
}
