package Day7;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;


public class FlipkartProject 
{
	ChromeDriver driver;
	List<WebElement> allLinks;
	
	public void invokeBrowser()
	{
		
		System.setProperty("webdriver.chrome.driver", "/Users/p2707746/Desktop/SeleniumTraning/DriverExecutables/chromedriver");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS); //implicit waits
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS); //page-load timeout
		
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//div[@class = '_3Njdz7']/button")).click();
		
	}
	
	public void mouseHover()
	{
		
		
		WebElement elecLink = driver.findElement(By.xpath("//span[text()='Electronics']"));
		Actions action = new Actions(driver);
		action.moveToElement(elecLink).build().perform();
		
		WebElement samsungLink = driver.findElement(By.linkText("Samsung"));
		
		String urlOfSamsungLink = samsungLink.getAttribute("href");
		System.out.println("URL of Samsung Link is: " + urlOfSamsungLink);
		System.out.println(driver.getTitle());
		
	}
	
	public int getLinkCount()
	{
		 allLinks = driver.findElements(By.tagName("a"));
		//driver.findElements(By.xpath("a"));
		int count = allLinks.size();
		return count;

	}
	public void printAllLinks()
	{
		for (WebElement link : allLinks)
		{
			System.out.println(link.getText() + "and its url : " + link.getAttribute("href"));
		}
	}
	
}
