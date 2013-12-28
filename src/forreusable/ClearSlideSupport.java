package forreusable;

import org.openqa.selenium.By;

public class ClearSlideSupport {
	
	String baseurl = "http://www.clearslide.com";
	String productid = "products-nav";
	String naviid = "nav";
	String custid = "customers-nav";
	String compid = "company-nav";
	String careid = "careers-nav";
	String loginxpath = "//ul/li[5]/a";
	String TRIAL = "nav-free-trial";
	String HEADER_CONTACT = "header-contact";
	String phone = "//a[@href='tel:+18773603366']";
	String wel = "welcome to clearslide";
	
	
	By product = By.id(productid);
	By navigator = By.id(naviid);
	By customer = By.id(custid);
	By company = By.id(compid);
	By career = By.id(careid);
	By login = By.xpath(loginxpath);
	By ft = By.id(TRIAL);
	By contact = By.className(HEADER_CONTACT);
	By ph = By.xpath(phone);
	
}
