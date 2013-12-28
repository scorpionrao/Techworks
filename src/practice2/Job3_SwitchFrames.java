package practice2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Job3_SwitchFrames {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://selenium.googlecode.com/svn/trunk/docs/api/java/index.html");
//		driver.findElement(By.name("Deprecated")).click();
		driver.switchTo().frame("classFrame");
		driver.findElement(By.linkText("Deprecated")).click();

	}

}
