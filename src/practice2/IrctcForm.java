package practice2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class IrctcForm {

	public static void main(String[] args) {
		FirefoxDriver drv = new FirefoxDriver();
		drv.manage().window().maximize();
		//drv.get("https://www.irctc.co.in/cgi-bin/bv60.dll/irctc/services/register.do?click=true");
		//drv.get("file:///Users/manushaonly/Desktop/_%20IRCTC%20_%20-%20Registration.html");
		drv.get("http://www.irctc.co.in");
		drv.findElement(By.id("tabslinksright")).click();
		drv.findElement(By.name("userName")).sendKeys("Kelly");
		WebElement sequ = drv.findElement(By.name("question"));
		Select s1 = new Select(sequ);
		s1.selectByValue("3");
		drv.findElement(By.name("answer")).sendKeys("Television");
		drv.findElement(By.name("firstName")).sendKeys("Kellymayor");
		drv.findElement(By.name("lastName")).sendKeys("Gerogia");
		WebElement gender = drv.findElement(By.name("gender"));
		Select s2 = new Select(gender);
		s2.selectByValue("1");
		WebElement status = drv.findElement(By.name("maritalStatus"));
		Select s3 = new Select(status);
		s3.selectByValue("0");
		WebElement day = drv.findElement(By.name("day"));
		Select s4 = new Select(day);
		s4.selectByValue("15");
		WebElement month = drv.findElement(By.name("month"));
		Select s5 = new Select(month);
		s5.selectByValue("6");
		WebElement year = drv.findElement(By.name("year"));
		Select s6 = new Select(year);
		s6.selectByValue("1990");
		WebElement work = drv.findElement(By.name("occupation"));
		Select s7 = new Select(work);
		s7.selectByValue("3");
		drv.findElement(By.name("email")).sendKeys("123@gmail.com");
		drv.findElement(By.name("mobile")).sendKeys("064 333 9898");
		WebElement type = drv.findElement(By.name("nationality"));
		Select s8 = new Select(type);
		s8.selectByValue("India");
		drv.findElement(By.name("resAddress1")).sendKeys("111 Bellomo blvd");
		drv.findElement(By.name("resAddress2")).sendKeys("Bldg 6, Apt#7");
		WebElement con = drv.findElement(By.name("resCountry"));
		Select s9 = new Select(con);
		s9.selectByValue("India");
		//drv.findElement(By.id("resPinCode")).sendKeys("600004");
		drv.findElement(By.id("resState")).sendKeys("Tamilnadu");
		//WebElement city = drv.findElement(By.id("resCity"));
		drv.findElement(By.name("resPhone")).sendKeys("9876543210");
		drv.findElement(By.id("rdresno")).click();
		boolean isSelectedRb1 = drv.findElement(By.id("rdresno")).isSelected();
		System.out.println(isSelectedRb1);

		// 99% you will use static xpaths.
		// example of pre-defined xpath
		By newsRadioYes = By.xpath("//*[@name='newsRadio'][@value='0']");
		By newsRadioNo = By.xpath("//*[@name='newsRadio'][@value='1']");
		// example of dynamic xpath
		for(int i=0;i<2;i++) {
			By radio = By.xpath("//*[@name='newsRadio'][@value='"+i+"']");
		}
				
		drv.findElement(newsRadioYes).click();
		boolean isSelectedRb2 = drv.findElement(newsRadioYes).isSelected();
		System.out.println(isSelectedRb2);
//		drv.findElement(By.id("speRadio")).click();
//		WebElement tel = drv.findElement(By.id("telRadio"));
//		Select s14 = new Select(tel);
//		s14.selectByValue("1");
		
		
		
	}

}
