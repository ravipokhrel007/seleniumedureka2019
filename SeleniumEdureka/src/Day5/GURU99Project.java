package Day5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

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
		
		//driver.findElement(By.)
		
	}
	
	public void addCustomer()
	{
		 
		
		 driver.findElement(By.linkText("New Customer")).click();
		driver.findElement(By.name("name")).sendKeys("Rocki Balboa");
		driver.findElement(By.xpath("//input[@value='f']")).click();
		driver.findElement(By.name("dob")).sendKeys("06/21/1989");
		driver.findElement(By.name("addr")).sendKeys("3470 Fantasy Place");
		driver.findElement(By.name("city")).sendKeys("Castle Rock");
		
		driver.findElement(By.name("state")).sendKeys("COLORADO");
		driver.findElement(By.name("pinno")).sendKeys("007007007");	
		driver.findElement(By.name("telephoneno")).sendKeys("3201234343");	
		//Code to get new email id each time we run the code
		String emailId = "aa" + System.currentTimeMillis() + "@gmail.com";
		System.out.println("Email Id : " + emailId);
		driver.findElement(By.name("emailid")).sendKeys(emailId);
		
		driver.findElement(By.name("password")).sendKeys("therock");	
		driver.findElement(By.name("sub")).click();
	}
	
	public String getCustomerId()
	{
		String customerId = driver.findElement(By.xpath("//table[@id='customer']/tbody/tr[4]/td[2]")).getText();
		return customerId;
	}
	public void addAccount(String customerId)
	{
		driver.findElement(By.linkText("New Account")).click();
		
		driver.findElement(By.name("cusid")).sendKeys(customerId)	;
		
		WebElement selectAccount = driver.findElement(By.name("selaccount"));
		Select accountDropdown = new Select(selectAccount);
		accountDropdown.selectByVisibleText("Current");
		
		System.out.println(accountDropdown.isMultiple());
		
		driver.findElement(By.name("inideposit")).sendKeys("50000");
		driver.findElement(By.name("button2")).click();
		
	}
	public String getaccountId(String addAccount) 
	{
		String accountId = driver.findElement(By.xpath("//table[@name ='account']/tbody/tr[4]/td[2]")).getText();
		return accountId;
		
	}
	
	public void editAccount(String addAccount)
	{
		driver.findElement(By.xpath("//a[text()='Edit Account']")).click();
		driver.findElement(By.name("accountno")).sendKeys(addAccount);
		driver.findElement(By.name("AccSubmit")).click();
		
		WebElement changeAccount = driver.findElement(By.name("a_type"));
		Select accountDropdown = new Select(changeAccount);
		accountDropdown.selectByVisibleText("Savings");
		
		driver.findElement(By.name("AccSubmit")).click();
		
	}
	
}
