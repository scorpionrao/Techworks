package practice2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Job1_close {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		//WebElement element = driver.findElement(null);
		
		driver.get("http://www.popuptest.com/popuptest2.html");
		System.out.println("Page Source = " + driver.getPageSource());
		String title = driver.getTitle();
		System.out.println("Title = " + title);
		driver.close(); // using close only parent browser window will close all other pop window will remain open.
	}
	
}
