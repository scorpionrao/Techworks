import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginPageTests {

	public static void main(String[] args) {
		
			// Test Case 1 - Verify the Facebook login page title
			FirefoxDriver driver = new FirefoxDriver();
		 	driver.get("http://www.facebook.com");
		 	String actualPageTitle = driver.getTitle();
		 	String expectedPageTitle = "Welcome to Facebook - Log In, Sign Up or Learn More";
		 	boolean verify = actualPageTitle.equals(expectedPageTitle);
		 	if (verify) {
		 		System.out.println("Test 1 Passed");
		 	} else {
		 		System.out.println("Test 1 Failed");
		 	}
		 	driver.quit();
		 	
		 	// Test Case 2 - Verify that Facebook login page has username and password textboxes
		 	FirefoxDriver driver1 = new FirefoxDriver();
		 	driver1.get("http://www.facebook.com");
		 	WebElement textbox = driver1.findElement(By.id("email"));
		 	WebElement pwdbox = driver1.findElement(By.id("pass"));
		 	if (textbox != null && !(pwdbox == null)) {
		 		System.out.println("Test 2 Passed");
		 	} else {
		 		System.out.println("Test 2 Failed");
		 	}
		 	driver1.quit();
		 	
		 	// Test Case 3 - Verify successful login with valid user name and password. 
		 	FirefoxDriver driver2 = new FirefoxDriver();
		 	driver2.get("http://www.facebook.com");
			String u1 = "manushaonly@yahoo.com";
			String p1 = "Badri0735";
			WebElement usernamebox = driver2.findElement(By.name("email"));
			usernamebox.sendKeys(u1);
			driver2.findElement(By.name("pass")).sendKeys(p1);
			usernamebox.submit();
			WebElement homepageele = driver2.findElementByXPath("//div[@id='pagelet_welcome_box']/div/div/div/div[2]/a[1]");
			if (homepageele != null){
				System.out.println("sucessful login");
			} else {
				System.out.println("login failed");
			}
		 	driver2.quit();
		 	
		 	
		 	
		 
//		    driver.findElement(By.id("u_0_0")).clear();
//		    driver.findElement(By.id("u_0_0")).sendKeys("annn");
//		    driver.findElement(By.id("u_0_1")).clear();
//		    driver.findElement(By.id("u_0_1")).sendKeys("nuyy");
//		    driver.findElement(By.id("u_0_2")).clear();
//		    driver.findElement(By.id("u_0_2")).sendKeys("muyra@yahoo.com");
//		    driver.findElement(By.id("u_0_4")).clear();
//		    driver.findElement(By.id("u_0_4")).sendKeys("muyra@yahoo.com");
//		    driver.findElement(By.id("u_0_5")).clear();
//		    driver.findElement(By.id("u_0_5")).sendKeys("j123o");

	}

}
