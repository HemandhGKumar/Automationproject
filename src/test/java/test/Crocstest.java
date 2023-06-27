package test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.Crocspage;

public class Crocstest {
ChromeDriver driver;
@BeforeTest
public void before()
{
	driver=new ChromeDriver();
	
}
@BeforeMethod
public void beforeCrocs()
{
	driver.get("https://www.crocs.in/");
	
	
}
@Test
public void testCrocs()
{
Crocspage cr=new Crocspage(driver);	
cr.menopt();
cr.selectopt();
cr.itemdetails();
cr.cart();
cr.chckout();
cr.window();
}
}