package practice1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Job_5browsers {

	public static void main(String[] args) {
//		FirefoxDriver dr1 = new FirefoxDriver();
//		dr1.get("http://www.clearslide.com");
	
		//how to open chrome
		//short cut to import in eclipse is ctrl+shif+o
		
		String path = System.getProperty("user.dir"); //current path of the project
		System.out.println(path);
		System.setProperty("webdriver.chrome.driver","drivers//chromedriver");
		ChromeDriver cr1 = new ChromeDriver();
		cr1.get("http://www.apple.com");

		//how to open ie
		//turn off protected mode in ie 8 n ie9
		
//		System.setProperty("webdriver.ie.driver", "drivers//internetexplorer");
//		InternetExplorerDriver ied1 = new InternetExplorerDriver();
//		ied1.get("http://www.amazon.com");
		
	}

}
