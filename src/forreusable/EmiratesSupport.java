package forreusable;

import org.openqa.selenium.By;


public class EmiratesSupport {
	String baseurl = "http://www.emirates.com";
	String loginbuttonxpath = "//td[@id='skywardsAccount']/a";
	String joinnowxpath = "//a[@class='bodyLink']";
	String joinlabelxpath = "//div[@class='brownBar']/label";
	String membershipid ="MainContent_skywardsJoinNowEntry1_rbSkywardsNo";
	
	
	
	By login = By.xpath(loginbuttonxpath);
	By join = By.xpath(joinnowxpath);
	By membership = By.id(membershipid);
	
	
	

	
	

}
