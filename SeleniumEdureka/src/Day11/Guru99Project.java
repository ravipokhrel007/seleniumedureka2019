package Day11;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class Guru99Project {
	
	WebDriver driver;
	
@Parameters("browserType")
	@BeforeClass(alwaysRun=true)
	
	public void invokeBrowser(String browserType)
	{
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
		
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS); //implicit waits
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS); //page-load timeout
		
		driver.get("http://demo.guru99.com/v4/");
		}
	}
	
	@AfterClass(alwaysRun=true)
	public void closeBrowser()
	{
		driver.quit();
	}
	
@Test(priority=0)
	public void	verifyTitleOfThePage()
	{
		String expectedTitle = "Guru99 Bank Home Page";
		String actualTitle = driver.getTitle();
		
		Assert.assertEquals(actualTitle, expectedTitle);
	}


@Parameters({"userId", "userpassword"})
@Test(priority = 1000, groups = {"Sanity"})
	public void login(String userId, String password)
{
		driver.findElement(By.name("uid")).sendKeys(userId);
		WebElement pwd = driver.findElement(By.name("password"));
		pwd.sendKeys(password);
	
		driver.findElement(By.name("btnLogin")).click();
	//"mngr231023", "Eparedu"
}



}
