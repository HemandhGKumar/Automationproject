package test;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.Sgpage;

public class Sgtest {
ChromeDriver driver;
@BeforeTest
	public void before()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void beforesyska()
	{
		driver.get("https://shop.teamsg.in/");
	}
	@Test
	public void testsg()
	{
		Sgpage s=new Sgpage(driver);
		s.baticon();
		s.select();
		s.details();
		s.fb();
	}
}
