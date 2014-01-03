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
	String footframe = "container";
	String footheader1 = "//div[@class='site-links']//div[1]";
	String footheader2 = "//div[@class='support-legal']//div[1]";
	String footheader3 = "//div[@class='community']//div[1]";
	String sitelinksL1 = "//div[@class='links']//ul/li[1]//a[@href='/']";
	String sitelinksL2 = "//div[@class='links']//ul/li[2]//a[@href='/products']";
	String supLegal1 = "//div[@class='links']//ul/li[1]//a[@href='/css']";
	
	
	
	
	By product = By.id(productid);
	By navigator = By.id(naviid);
	By customer = By.id(custid);
	By company = By.id(compid);
	By career = By.id(careid);
	By login = By.xpath(loginxpath);
	By ft = By.id(TRIAL);
	By contact = By.className(HEADER_CONTACT);
	By ph = By.xpath(phone);
	By footer = By.className(footframe);
	By foothd1 = By.xpath(footheader1);
	By foothd2 = By.xpath(footheader2);
	By foothd3 = By.xpath(footheader3);
	By SlinksL1 = By.xpath(sitelinksL1);
	By SlinksL2 = By.xpath(sitelinksL2);
	By Slegal1 = By.xpath(supLegal1);
}
