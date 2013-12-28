package forreusable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;



public class ClearSlideTestWithTestNG {
	ClearSlideSupport supp = new ClearSlideSupport();
	
	// Test case1 - checking for successful url login	
	@Test
	public void testcase1(){
		FirefoxDriver driver = new FirefoxDriver();
		driver.get(supp.baseurl);
		WebElement pro = driver.findElement(supp.product);
		Assert.assertNotNull(pro);		
	}
	
	// Test case2 - checking for nav frame and all nav title
	@Test
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
		Assert.assertNotNull(nav);
		Assert.assertNotNull(prod);
		Assert.assertNotNull(cust);
		Assert.assertNotNull(comp);
		Assert.assertNotNull(carr);
		Assert.assertNotNull(logi);
		Assert.assertNotNull(free);

	}
	// Test case3 - checking for need help and phone number
	@Test
	public void testcase3(){
		FirefoxDriver driver2 = new FirefoxDriver();
		driver2.get(supp.baseurl);
		WebElement help = driver2.findElement(supp.contact);
		WebElement phonenumele = help.findElement(supp.ph);
		Assert.assertNotNull(phonenumele);

	}
	
}