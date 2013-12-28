package forreusable;
import junit.framework.TestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginPageTests extends TestCase {
	LoginPageSupport supp = new LoginPageSupport();
	
	// Test Case 1 - Verify the Facebook login page title
	public void testcase1(){
		FirefoxDriver driver = new FirefoxDriver();
		driver.get(supp.url);	
		String actualPageTitle = driver.getTitle();
		boolean verify = actualPageTitle.equals(supp.expectedPageTitle);
	 	if (verify) {
	 		System.out.println("Test 1 Passed");
	 	} else {
	 		System.out.println("Test 1 Failed");
	 	}
	 	driver.quit();
	}
	
 // Test Case 2 - Verify that Facebook login page has username and password textboxes
 	public void testcase2(){
 		FirefoxDriver driver1 = new FirefoxDriver();
	 	driver1.get(supp.url);
	 	WebElement textbox = driver1.findElement(supp.use1);
	 	WebElement pwdbox = driver1.findElement(supp.pas1);
	 	if (textbox != null && !(pwdbox == null)) {
	 		System.out.println("Test 2 Passed");
	 	} else {
	 		System.out.println("Test 2 Failed");
	 	}
	 	driver1.quit();	
 	}
		 	
 // Test Case 3 - Verify successful login with valid user name and password. 
 	public void testcase3(){	
	 	FirefoxDriver driver2 = new FirefoxDriver();
	 	driver2.get(supp.url);
	 	WebElement usernamebox = driver2.findElement(supp.use1);
		usernamebox.sendKeys(supp.u1);
		driver2.findElement(supp.pas1).sendKeys(supp.p1);
		usernamebox.submit();
		WebElement homepageele = driver2.findElementByXPath(supp.homepagexpath);
		if (homepageele != null){
			System.out.println("sucessful login");
		} else {
			System.out.println("login failed");
		}
	 	driver2.quit(); 	

	 }

}


