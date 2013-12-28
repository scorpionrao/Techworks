package forreusable;
import junit.framework.Assert;
import junit.framework.TestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;



public class ClearSlideTestWithJunit extends TestCase {
	ClearSlideSupport supp = new ClearSlideSupport();
	
	// Test case1 - checking for successful url login	
	public void testcase1(){
		FirefoxDriver driver = new FirefoxDriver();
		driver.get(supp.baseurl);
		WebElement pro = driver.findElement(supp.product);
		Assert.assertNotNull("Verify that pro is present", pro);		
	}
	
	// Test case2 - checking for nav frame and all nav title
	public void testcase2(){
		FirefoxDriver driver1 = new FirefoxDriver();
		driver1.get(supp.baseurl);
		WebElement nav = driver1.findElement(supp.navigator);
		WebElement prod = nav.findElement(supp.product);
		WebElement cust = nav.findElement(supp.customer);
		WebElement comp = nav.findElement(supp.company);
		WebElement carr = nav.findElement(supp.career);
		WebElement logi = nav.findElement(supp.login);
		WebElement free = nav.findElement(supp.ft);
		Assert.assertNotNull("Verify that nav is present", nav);
		Assert.assertNotNull("Verify that prod is present", prod);
		Assert.assertNotNull("Verify that cust is present", cust);
		Assert.assertNotNull("Verify that comp is present", comp);
		Assert.assertNotNull("Verify that carr is present", carr);
		Assert.assertNotNull("Verify that logi is present", logi);
		Assert.assertNotNull("Verify that free is present", free);

	}
	// Test case3 - checking for need help and phone number
	public void testcase3(){
		FirefoxDriver driver2 = new FirefoxDriver();
		driver2.get(supp.baseurl);
		WebElement help = driver2.findElement(supp.contact);
		WebElement phonenumele = help.findElement(supp.ph);
		Assert.assertNotNull("Verify phone is present", phonenumele);

	}
	
}