package Day7;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		ChromeDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "/Users/p2707746/Desktop/SeleniumTraning/DriverExecutables/chromedriver");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS); //implicit waits
		
		driver.get("https://jqueryui.com/droppable/");
		
		WebElement frameElement = driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(frameElement);
		
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target =  driver.findElement(By.id("droppable"));
		//To get the css color
		String colorOfTaregetBeforeDragNDrop = target.getCssValue("color");
		
		//To perform Mouse Operation we need 'action' class
		Actions action = new Actions(driver);
		//action.dragAndDrop(source, target).build().perform();
		//Other way for drag and drop
		action.moveToElement(source).clickAndHold().moveToElement(target).release().build().perform();
		//To get the css color
		String colorOfTaregetAfterDragNDrop = target.getCssValue("color");
		
		System.out.println("Before Drag n Drop : " +colorOfTaregetBeforeDragNDrop );
		System.out.println("After Drag n Drop : " +colorOfTaregetAfterDragNDrop );
		
		
	}

}
