package test;



import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.Sampletest;

public class Samplepagetest {

	ChromeDriver driver;
	@BeforeTest
	public void before()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void beforemthd()
	{
		driver.get("https://www.booking.com/");
	}
	@Test
	public void testbooking()
	{
		
		Sampletest s=new Sampletest(driver);
		
		s.location();
		
		s.travellers();
		s.search();
		s.selecthotel();
		s.reservation();
        	
	}
}
