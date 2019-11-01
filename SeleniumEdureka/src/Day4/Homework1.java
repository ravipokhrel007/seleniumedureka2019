package Day4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class Homework1 

	{
		ChromeDriver driver;

		public void  invokeBrowser()
		{
			
			System.setProperty("webdriver.chrome.driver", "/Users/p2707746/Desktop/SeleniumTraning/DriverExecutables/chromedriver");
			
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			driver.get("https://www.edureka.co");
		}
	
}
