package practice2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Job2_quit {

	public static void main(String[] args) {
		WebDriver sel = new FirefoxDriver();
		sel.get("http://www.popuptest.com/popuptest2.html");
		sel.quit(); // using quit all windows will close

	}

}
