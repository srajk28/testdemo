package page;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import utility.Browser;
import utility.ConfigProperties;

public class BasePageClass 
{
	public WebDriver driver;
	public ConfigProperties config;
	
	@BeforeClass
	public void set()
	{
		driver=Browser.startApplication(driver, config.getBrowser(), config.getURL());
	}
	@AfterClass
	public void teardown()
	{
		Browser.quitBrowser(driver);
	}
}