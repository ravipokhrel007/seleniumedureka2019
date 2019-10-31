package Day4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GURU99Project 
{
	
	ChromeDriver driver;

	public void invokeBrowser()
	{
		
		System.setProperty("webdriver.chrome.driver", "/Users/p2707746/Desktop/SeleniumTraning/DriverExecutables/chromedriver");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://demo.guru99.com/v4/");
	}
	public void closeBrowser()
	{
		driver.quit();
	}
	
	public void login(String userId, String password)
	{
		driver.findElement(By.name("uid")).sendKeys(userId);
		//Above Way 1
		//Below Way 2
		WebElement pwd = driver.findElement(By.name("password"));
		pwd.sendKeys(password);
		
		driver.findElement(By.name("btnLogin")).click();
		
	}
	
	public void addCustomer()
	{
		driver.findElement(By.linkText("New Customer")).click();
	}
}
