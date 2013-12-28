package forreusable;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

import junit.framework.Assert;
import junit.framework.TestCase;

public class EmiratesTest{
	EmiratesSupport data = new EmiratesSupport();
	long timeout = 600;
	FirefoxDriver drv = new FirefoxDriver();
	@After
	public void testcasetear(){
	drv.quit();	
	}
//Login as a new member	- Testcase1 to get necessary url.
	@Before
	public void testcase() throws InterruptedException{
		drv.manage().window().maximize();
		drv.get(data.baseurl);
		Thread.sleep(timeout);
	}
// there is a way to handle through selenium
	@Test
	public void 	testcase1() throws InterruptedException{
		
		drv.get(data.baseurl);
		drv.findElement(data.login).click();
		Thread.sleep(timeout);
		drv.findElement(data.join).click();
		Thread.sleep(timeout);
		Assert.assertNotNull(drv.findElement(By.xpath(data.joinlabelxpath)));
		drv.findElement(data.membership).click();
	}
	//Login as a new member-Testcase2 to enter necessary customer details.		
	@Test
	public void testcase2() throws InterruptedException{
		
		
	}
	
//	public static void main(String[] args) throws InterruptedException{
//		new EmiratesTest().testcase();	
//	}	// to run in java application and debug easily

	
}
