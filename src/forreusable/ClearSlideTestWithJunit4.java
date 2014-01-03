package forreusable;
import static org.junit.Assert.*;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;



public class ClearSlideTestWithJunit4  {
	ClearSlideSupport supp = new ClearSlideSupport();
	FirefoxDriver driver = new FirefoxDriver();
	
	@Before
	public void set(){
	driver.get(supp.baseurl);
	driver.manage().window().maximize();
	}
	
	@After
	public void tear(){
		driver.quit();
	}
	
	// Test case1 - checking for successful url login
	@Test
	public void testcase1() throws IOException{
		WebElement pro = driver.findElement(supp.product);
		assertNotNull("Verify that pro is present", pro);
		File opFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File destiFile = new File("/Users/manushaonly/Documents/opFile.jpg");
		FileUtils.copyFile(opFile, destiFile);
	}
	
	// Test case2 - checking for nav frame and all nav title
	@Test
	public void testcase2(){
		WebElement nav = driver.findElement(supp.navigator);
		WebElement prod = nav.findElement(supp.product);
		WebElement cust = nav.findElement(supp.customer);
		WebElement comp = nav.findElement(supp.company);
		WebElement carr = nav.findElement(supp.career);
		WebElement logi = nav.findElement(supp.login);
		WebElement free = nav.findElement(supp.ft);
		assertNotNull("Verify that nav is present", nav);
		assertNotNull("Verify that prod is present", prod);
		assertNotNull("Verify that cust is present", cust);
		assertNotNull("Verify that comp is present", comp);
		assertNotNull("Verify that carr is present", carr);
		assertNotNull("Verify that logi is present", logi);
		assertNotNull("Verify that free is present", free);

	}
	
	// Test case3 - checking for need help and phone number
	@Test
	public void testcase3(){
		WebElement help = driver.findElement(supp.contact);
		WebElement phonenumele = help.findElement(supp.ph);
		assertNotNull("Verify phone is present", phonenumele);
	}
	
	// Test case4 - 	Verify Footer Frame is present	
	@Test
	public void testcase4(){
		WebElement foot = driver.findElement(supp.footer);	
		assertNotNull("verify footer frame is present", foot);
		}
	// Test case5 - Verify all elements in footer frame is present and takes to appropriate page
	@Test
	public void testcase5() throws IOException{
		WebElement FH1 = driver.findElement(supp.foothd1);
		WebElement SLL1 = driver.findElement(supp.SlinksL1);
		SLL1.click();
		assertNotNull("verify footer Header1 is present",FH1);
		assertNotNull("verify SLL1 is present",SLL1);
		WebElement SLL2 = driver.findElement(supp.SlinksL2);
		SLL2.click();
		File opsuplegalFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File dst = new File("/Users/manushaonly/Documents/opsuplegalFile.jpg");
		FileUtils.copyFile(opsuplegalFile, dst);
		assertNotNull("verify SLL2 is present",SLL2);
		
		WebElement FH2 = driver.findElement(supp.foothd2);
		WebElement SL = driver.findElement(supp.Slegal1);
		driver.findElement(supp.Slegal1).click();
		assertNotNull("verify footer Header2 is present",FH2);
		
		WebElement FH3 = driver.findElement(supp.foothd3);
		
		assertNotNull("verify footer Header3 is present",FH3);
	}
}
