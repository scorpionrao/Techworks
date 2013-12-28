package practice1;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;

	public class TestCase {
		
			// using static in Selenium
		
			// define driver as static
			static WebDriver staticdriver = new FirefoxDriver();
			// define driver as non-static
			WebDriver nonstaticdriver = new FirefoxDriver();
			
		public static void main(String[] args) {
			
			// I don't care, still how is it used in Selenium
			
			// Test Case 1 - calling in a static way
			TestCase.staticdriver.get("http://www.clearslide.com");
			TestCase.staticdriver.findElement(By.id("Email"));
			TestCase.staticdriver.findElement(By.id("Passwd"));
			TestCase.staticdriver.close();
			
			// Test Case 2 - calling in non-static way
			TestCase tc2 = new TestCase();
			tc2.nonstaticdriver.get("http://www.clearslide.com");
			tc2.nonstaticdriver.findElement(By.id("Email"));
			tc2.nonstaticdriver.findElement(By.id("Passwd"));
			tc2.nonstaticdriver.close();
			
			// Test Case 3 - calling in non-static way... again !
			TestCase tc3 = new TestCase();
			tc3.nonstaticdriver.get("http://www.clearslide.com");
			tc3.nonstaticdriver.findElement(By.id("Email"));
			tc3.nonstaticdriver.findElement(By.id("Passwd"));
			tc3.nonstaticdriver.close();
			
			/**
			 * So, when to use static and non-static ?
			 * 
			 * In static, there is ONE variable per class (Class = TestCase).
			 * 
			 * In non-static, there is ONE variable per object (Object = tc2, tc3).
			 * 
			 */
			
}
	}
