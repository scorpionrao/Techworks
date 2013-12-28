package forreusable;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HTMLControlsSupport {
	// OBJECT REPOSITORIES, ELEMENT REPOSITORIES, RESOURCES
	String firstNameTextBoxXpath = "//input[@data-hint='Enter your First Name Here']";
	String middleNameTextBoxXpath = "//input[@name = 'middleName']";
	String lastNameTextBoxXpath = "//input[@name = 'lastName']";
	String emailXpath = "//input[@placeholder='you@domain.com']";
	String agexpath = "//div[@class = 'fb-input-number']/input";
	
	// TEST DATA
	String url = "file:///Users/manushaonly/Documents/Selenium/HTMLControls/preview.html";
	String fn = "Anusha";
	String mn = "us";
	String ln = "sha";
	String email = "123@gmail.com";
	String age = "20";
	
	// BY REPOSITORIES
	By FN1 = By.xpath(firstNameTextBoxXpath);
	By FN2 = By.xpath(middleNameTextBoxXpath);
	By FN3 = By.xpath(lastNameTextBoxXpath);
	By FN4 = By.xpath(emailXpath);
	By FN5 = By.xpath(agexpath);
	
	
	
	// RE-USABLE METHODS
	public void commonsteps() {
		FirefoxDriver driver = new FirefoxDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.findElement(FN1).sendKeys(fn);
		driver.findElement(FN2).sendKeys(mn);
		driver.findElement(FN3).sendKeys(ln);
		driver.findElement(FN4).sendKeys(email);
		driver.findElement(FN5).sendKeys(age);
		driver.quit();
	}
	
}
