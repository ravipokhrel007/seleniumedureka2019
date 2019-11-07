package Day10;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleBrowserTesting 
{
	WebDriver driver;
	
	public void invokeBrowser(String browserType)
	{
		if(browserType.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "/Users/p2707746/Desktop/SeleniumTraning/DriverExecutables/chromedriver");
			driver = new ChromeDriver();
		} else if(browserType.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "/Users/p2707746/Desktop/SeleniumTraning/DriverExecutables/geckodriver");
			driver = new FirefoxDriver();
		}else
		{
			System.out.println("Invalid Browser type ; " + browserType);
		}
		
	}
}
