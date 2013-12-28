package practice2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class HTMLDateControls {

	public static void main(String[] args) {
		// Test case 1 - Verify that user is able to successfully register
//		FirefoxDriver driver = new FirefoxDriver();
//		driver.get("file:///Users/manushaonly/Documents/Selenium/HTMLControls/preview.html");
//		driver.manage().window().maximize();
//		// enter name, ....
//		driver.findElement(By.id("item35_date_1")).sendKeys("04-12-2010");
//		driver.close();
//		
		// Test case 2 - Verify that clicking on calendar opens the current month
		FirefoxDriver driver2 = new FirefoxDriver();
		driver2.get("file:///Users/manushaonly/Documents/Selenium/HTMLControls/preview.html");
		driver2.manage().window().maximize();
		driver2.findElement(By.id("item35_date_1")).click();
//		WebElement calendarTitle = driver2.findElement(by);
		// Test case 3 - Verify calendar previous and next functionality
		
		// Test case 4 - Verify the calendar selection populates the Date of Birth text box correctly
		FirefoxDriver driver1 = new FirefoxDriver();
		driver1.get("file:///Users/manushaonly/Documents/Selenium/HTMLControls/preview.html");
		driver1.manage().window().maximize();
		driver1.findElement(By.id("item35_date_1")).click();
		for(int i=0;i<287;i++) {
			driver1.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']" +
				"[contains(text(),'Prev')]")).click();
		}
		driver1.findElement(By.xpath("//a[@class='ui-state-default'][contains(text(),'1')]")).click();
		String populatedText = driver1.findElement(By.id("item35_date_1")).getText();
		if(populatedText.equals("01-01-1990")) {
			System.out.println("Calendar selection populated the text box correctly");
			System.out.println("Test case passed");
		} else {
			System.out.println("Calendar selection does not match: 01-01-1990");
			System.out.println("Test case failed");
		}
//		driver1.close();
		
		
		
	}

}
