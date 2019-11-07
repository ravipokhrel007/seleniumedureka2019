package Day10;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImageUpload {

	ChromeDriver driver;
	
	public void invokeBrowser()
	{
		
		System.setProperty("webdriver.chrome.driver", "/Users/p2707746/Desktop/SeleniumTraning/DriverExecutables/chromedriver");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS); 
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS); 
		
		driver.get("https://images.google.com/?gws_rd=ssl");
		
	}
	//AutoIT does NOT work on max so use Sikul
	public void uploadImage() {
	
	driver.findElement(By.xpath("//span[@class='S3Wjs']")).click();
	driver.findElement(By.xpath("//a[text()='Upload an image']")).click();
	driver.findElement(By.id("qbfile")).click();
	}
}
	

