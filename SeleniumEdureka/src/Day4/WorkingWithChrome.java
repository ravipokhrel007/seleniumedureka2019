package Day4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithChrome 
{
	ChromeDriver driver;

	public void invokeBrowser()
	{
		
		System.setProperty("webdriver.chrome.driver", "/Users/p2707746/Desktop/SeleniumTraning/DriverExecutables/chromedriver");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://qatechhub.com");
		
	}
	public String getTitleOfThePage()
	{
	
		return driver.getTitle();
}
	
	
	//Different commands to Navigate
	
	public void navigateMethods()
	{
		driver.navigate().to("http://facebook.com");
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.navigate().refresh();
		
	}
		
	//Methods to Close the Browser
	
	public void closeBrowser()
	{
	driver.close();
}

	public void closeAllBrowser()
	{
	driver.quit();
	}
}