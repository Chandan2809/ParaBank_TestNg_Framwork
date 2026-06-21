package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

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
	public void tearDown(){
		if (driver != null) {
			//driver.quit();
		}
		
	}

}
