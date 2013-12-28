package forreusable;

import org.openqa.selenium.By;

public class LoginPageSupport {
	String url = "http://www.facebook.com";
	String expectedPageTitle = "Welcome to Facebook - Log In, Sign Up or Learn More";
	String u1 = "manushaonly@yahoo.com";
	String p1 = "Badri0735";
	String usernameid = "email";
	String passwordid = "pass";
	String homepagexpath = "//div[@id='pagelet_welcome_box']/div/div/div/div[2]/a[1]";
	
	By use1 = By.id(usernameid);
	By pas1 = By.id(passwordid);
}
