package test;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.Nikepage;

public class Niketest {
ChromeDriver driver;
@BeforeTest
public void before()
{
	driver=new ChromeDriver();
}
@BeforeMethod
public void beforemthd()
{
	driver.get("https://www.nike.com/in/");
}
@Test
public void testnike() throws InterruptedException
{
	Nikepage ni=new Nikepage(driver);
	
	Thread.sleep(3000);
	
	ni.gender();
	ni.shoesselect();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(300));
	ni.shoescroll();
	ni.sizeselect();
	ni.checkoutdetails();
	ni.fbredirect();
	ni.fb();
	ni.facebook();

}
}
