package practice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Job_6getstarted {

	public static void main(String[] args) {
		
		By userID = By.id("Email");
		
		WebDriver sel = new FirefoxDriver();
		sel.get("http://www.gmail.com");
		WebElement username = sel.findElement(userID);
		username.clear();
		username.sendKeys("what a wonder");
		WebElement password = sel.findElement(By.id("Passwd"));
		password.clear();
		password.sendKeys("hiworld");
		
	}

}
