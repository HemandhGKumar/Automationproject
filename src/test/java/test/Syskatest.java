package test;



import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.Syskapage;

public class Syskatest {
ChromeDriver driver;
@BeforeTest
public void before()
{
	driver=new ChromeDriver();
}
@BeforeMethod
public void beforesyska()
{
	driver.get("https://syska.co.in/");
}
@Test
public void testsyska() 
{
	Syskapage sy=new Syskapage(driver);
	
	String Actual=driver.getTitle();
	String exp="Buy Syska Electronic & Lighting Product Online | Syska";
	Assert.assertEquals(Actual, exp);
	System.out.println("Actual title is "+Actual);
	
	
	
	sy.lighting();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	sy.pin();
	
	
	sy.fb();
	
	
	sy.search();
	sy.sprt();
    
}
}
