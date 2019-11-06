package Day7;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class AmazonProject {

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
		
		driver.get("https://www.amazon.in");
		
		
		
	}
	public void searchProduct(String product, String category)
	{
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(product);
		WebElement dropdownCat = driver.findElement(By.id("searchDropdownBox"));
		
		Select selCategory = new Select (dropdownCat);
		selCategory.selectByVisibleText(category);
		
		driver.findElement(By.xpath("//input[@value='Go']")).click();
		
		System.out.println(driver.findElement(By.xpath("//span[contains(text( ),'results for')]")).getText());
		
}
	/*public String getNthProduct(int itemNumber)
	{
		String productIdLocator = String.format("result_%d",  (itemNumber - 1));
		return driver.findElement(By.id(productIdLocator)).getText();
	}*/
	
	public void printAllProducts()
	{
		//List<WebElement> allProducts = driver.findElements(By.xpath("//li[starts-with(@id,'result_')]"));
		List<WebElement> allProducts = driver.findElements(By.xpath("//span[@class = 'a-size-base-plus a-color-base']"));
		
		for(WebElement product: allProducts) {
		System.out.println(product.getText());
		
		System.out.println("-------------------------------------------------------------------------------");
		
	}
	}
		public void printAllProductsViaMouseScrollDown()
		{
			List<WebElement> allProducts = driver.findElements(By.xpath("//span[@class = 'a-size-base-plus a-color-base']"));
					//("//li[starts-with(@id,'result_')]"));
			Actions action = new Actions(driver);
			
			for(WebElement product: allProducts) {
				action.moveToElement(product).build().perform();
			System.out.println(product.getText());
			
			System.out.println("-------------------------------------------------------------------------------");
			}
		}
			public void printAllProductsViaJavaScript()
			{
				List<WebElement> allProducts = driver.findElements(By.xpath("//span[@class = 'a-size-base-plus a-color-base']"));
				
				
				int x, y;
				
				for(WebElement product: allProducts) {
					x=product.getLocation().x;
					y=product.getLocation().y;
					
				scrollDown(x,y);
				
				System.out.println(product.getText());
				
				System.out.println("-------------------------------------------------------------------------------");
				}	
			}
			private void scrollDown(int x, int y) 
			{

				String jsCommand = String.format("window.scrollBy(%d,%d)", x,y);
				driver.executeScript(jsCommand);
			
			}

	}