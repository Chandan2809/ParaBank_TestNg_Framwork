package base;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import java.io.ByteArrayInputStream;

import io.qameta.allure.Allure;

public class BaseTest {
	
	public WebDriver driver;
	
	@BeforeMethod
	@Parameters({"browser","URL"})
	public void setUp(String browser, String URL) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(URL);
	}
	
	@AfterMethod
	
	/*
	 * public void TearDown(Scenario scenario) { if(scenario.isFailed()) { byte[]
	 * Screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
	 * Allure.addAttachment("Failed Screenshot", new
	 * ByteArrayInputStream(Screenshot));
	 */
	
	
	
	public void tearDown(ITestResult result)
	{
	    if(result.getStatus()==ITestResult.FAILURE)
	    {
	        byte[] screenshot=((TakesScreenshot)driver)
	                .getScreenshotAs(OutputType.BYTES);

	        Allure.addAttachment(
	                "Failed Test Screenshot",
	                new ByteArrayInputStream(screenshot));
	    }
	    
	    if (driver != null) {

	    //driver.quit();
	}
	
	    
	
	
	
	/*
	 * public void tearDown(){ 
	 * if (driver != null) {
	 *  //driver.quit(); }
	 * 
	 * }
	 */

	}
}
