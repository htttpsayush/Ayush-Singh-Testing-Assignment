package TakeScreenshot;


import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Takescgreenshot {
	
	
	@Test

	public void Browser() throws Exception{
		
		
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.easemytrip.com/");
		
		
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("./ScreenShotsTestNG/easymytrip.png"));
		driver.quit();
		
		
	}
	
	
}
