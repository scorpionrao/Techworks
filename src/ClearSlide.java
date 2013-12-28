import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class ClearSlide {

	public static void main(String[] args) {
//		FirefoxDriver driver = new FirefoxDriver();
//		String baseurl = "http://www.clearslide.com";
//		driver.get(baseurl);
//		// Test case1 - checking for successful url login
//		WebElement product = driver.findElement(By.id("products-nav"));
//		if (product !=null){
//			System.out.println("welcome to clearslide");
//		}else 
//			System.out.println("Try again");
		
		// Test case2 - checking for nav frame and all nav title
//		FirefoxDriver driver1 = new FirefoxDriver();
//		driver1.get("http://www.clearslide.com");
//		WebElement nav = driver1.findElement(By.id("nav"));
//		WebElement prod = nav.findElement(By.id("products-nav"));
//		WebElement cust = nav.findElement(By.id("customers-nav"));
//		WebElement comp = nav.findElement(By.id("company-nav"));
//		WebElement carr = nav.findElement(By.id("careers-nav"));
//		WebElement logi = nav.findElement(By.xpath("//ul/li[5]/a"));
//		WebElement free = nav.findElement(By.id("nav-free-trial"));
//		if (nav != null && 
//			prod != null && 
//			cust != null && 
//			comp != null && 
//			carr != null && 
//			logi !=null && free != null){
//			System.out.println("nav frame and all nav title is present");
//			System.out.println("Test case2 passed successfully");
//		}else
//			System.out.println("Test case2 failed - sry");
//
		
		
		// Test case3 - checking for need help and phone number
		ChromeDriver driver2 = new ChromeDriver();
		driver2.get("http://www.clearslide.com");
		WebElement help = driver2.findElement(By.className("header-contact"));
		WebElement phonenumele = help.findElement(By.xpath("//a[@href='tel:+18773603366']"));
		if (phonenumele != null){
			System.out.println("phone number is present in header");
			System.out.println("Test case3 passed successfully");
		}else {
			System.out.println("phone number is not present in header");
			System.out.println("Test case3 failed - sry");
		}

}
}