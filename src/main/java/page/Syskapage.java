package page;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Syskapage {
ChromeDriver driver;
By loginicon=By.xpath("/html/body/div[4]/header/div[2]/div[1]/div/div[3]/div[1]/ul/li/a/i");
By email=By.xpath("//input[@id=\"social_login_email\"]");
By pswrd=By.xpath("//*[@id=\"social_login_pass\"]");
By loginbutton=By.xpath("//*[@id=\"bnt-social-login-authentication\"]");
By selection=By.xpath("/html/body/div[4]/div[1]/div/nav/div/ul/li[1]/a");
By ceilingled=By.xpath("//*[@id=\"maincontent\"]/div[4]/div[1]/div[5]/div/div/ol/li[2]/div/strong");
By selectceiling=By.xpath("//*[@id=\"maincontent\"]/div[4]/div[1]/div[3]/div/div/ol/li[2]/div/strong/a");
By pincode=By.xpath("//*[@id=\"pincode\"]");
By pincheck=By.xpath("//*[@id=\"maincontent\"]/div[2]/div/div[1]/div[6]/div[1]/div/button");
By addcart=By.xpath("//*[@id=\"product-addtocart-button\"]/span");
By basket=By.xpath("/html/body/div[4]/header/div[2]/div[3]");
By viewandedit=By.xpath("/html/body/div[4]/header/div[2]/div[3]/div/div/div/div[2]/div[5]/div/a/span");
By prcdcheckout=By.xpath("//*[@id=\"maincontent\"]/div[2]/div/div[5]/div/div[1]/ul/li/button");
By buynow=By.xpath("//*[@id=\"buy-now\"]");
By postalcode=By.xpath("//*[@id=\"shipping-new-address-form\"]/div[8]");
By fblogo=By.xpath("/html/body/div[4]/div[3]/div[2]/div[2]/div[1]/div/ul/li[1]/a");
By search=By.xpath("/html/body/div[4]/header/div[2]/div[2]/div/div/div[2]/form/div[1]/label");
By searchinput=By.xpath("//*[@id=\"search\"]");
By support=By.xpath("/html/body/div[4]/div[1]/div/nav/div/ul/li[8]/a");
By sprtpin=By.xpath("//*[@id=\"maincontent\"]/div[3]/div/div[4]/form/input");
By service=By.xpath("//*[@id=\"tab-label-service-center-tab-title\"]");


public Syskapage(ChromeDriver driver)
{
	this.driver=driver;
}
public void signin()
{
	driver.findElement(loginicon).click();



	driver.findElement(email).sendKeys("hemandh3223@gmail.com");
	driver.findElement(pswrd).sendKeys("Tahmp@3223");
	driver.findElement(loginbutton).click();
}

public void lighting()
{
	driver.findElement(selection).click();;
	driver.findElement(ceilingled).click();
}
public void pin()
{
	driver.findElement(pincode).sendKeys("689126");
	driver.findElement(pincheck).click();
	driver.findElement(buynow);
    
	
	
}

public void fb()
{
	
	String parentwindow=driver.getWindowHandle();
	driver.findElement(fblogo).click();
	Set<String>allhandle=driver.getWindowHandles();
	
	for(String alllinks:allhandle)
	{
	if(!alllinks.equalsIgnoreCase(parentwindow))
	{
		driver.switchTo().window(parentwindow);
		
		
		
	}
}}
public void search()
{
	driver.findElement(search).click();
	driver.findElement(searchinput).sendKeys("led");
}
public void sprt()
{
	driver.navigate().to("https://syska.co.in/");
	driver.findElement(support).click();
	driver.findElement(sprtpin).sendKeys("BANGALORE",Keys.ENTER);
	driver.findElement(service).click();
}
}
