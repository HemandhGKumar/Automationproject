package page;


import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Nikepage {
ChromeDriver driver;
By signin=By.xpath("//*[@id=\"gen-nav-commerce-header-v2\"]/div[3]/div[1]/div/div/div[4]/div/button");
By email=By.xpath("//*[@id=\"18bb7e6f-b91c-4d73-8aa9-b8f188a12719\"]");
By pswrd=By.xpath("//*[@id=\"1316470d-cec3-4014-8d8f-d0f2d8cb2b81\"]");
By Signinsubmit=By.xpath("//*[@id=\"66a11dcc-de95-49f9-8705-12d387aa9b51\"]");
By menoption=By.xpath("//*[@id=\"gen-nav-commerce-header-v2\"]/div[3]/header/div/div[1]/div[2]/nav/div[2]/div/ul/li[2]/a");
By shoesbutton=By.xpath("//*[@id=\"30a77704-0e7e-4823-8f32-995ce53b5bd4\"]/div/div/nav/div[1]/ul/li[1]/a");
By shoeselect=By.xpath("//*[@id=\"skip-to-products\"]/div[2]/div/figure/div/div[1]/div[2]");
By closeoption=By.xpath("//*[@id=\"bluecoreActionScreen\"]/div[3]/button");

By selectmodel=By.xpath("//*[@id=\"skip-to-products\"]/div[1]/div/figure/a[2]/div/img");
By size=By.xpath("//*[@id=\"buyTools\"]/div[1]/fieldset/div/div[7]/label");
By addcart=By.xpath("//*[@id=\"floating-atc-wrapper\"]/div/button[1]");
By bag=By.xpath("//*[@id=\"PDP\"]/div[2]/div/div[5]/div/div/div/div/div/div/div/div/div/div[3]/div/button[1]");
By checkout=By.xpath("//*[@id=\"maincontent\"]/div[2]/div[1]/div[2]/aside/div[4]/button");
By firstname=By.xpath("//*[@id=\"firstName\"]");
By lastname=By.xpath("//*[@id=\"lastName\"]");
By address=By.xpath("//*[@id=\"addressLine1\"]");
By postal=By.xpath("//*[@id=\"postalCode\"]");
By state=By.xpath("//*[@id=\"region\"]");
By keralaselect=By.xpath("//*[@id=\"region\"]/option[19]");
By returnscart=By.xpath("/html/body/esw-root/esw-header/header/div/a[2]/img");
By leavecheckout=By.xpath("/html/body/ngb-modal-window/div/div/esw-modal-container/div/div[3]/button[1]");
By fbicon=By.xpath("//*[@id=\"gen-nav-footer\"]/div/footer/div/div[1]/div[2]/ul/li[2]/a");
By fbphoto=By.xpath("//*[@id=\"mount_0_0_Me\"]/div/div[1]/div/div[3]/div/div/div/div[1]/div[1]/div[3]/div/div/div/div[1]/div/div/div[1]/div/div/div/div/div/a[3]");


public Nikepage(ChromeDriver driver)
{
	this.driver=driver;
}
public void signIn()
{
	driver.findElement(signin).click();
}
public void signindetails()
{
	driver.findElement(email).sendKeys("hemandh3223@gmail.com");
	driver.findElement(pswrd).sendKeys("Tahmp@3223");
	driver.findElement(Signinsubmit).click();
}
public void gender()
{
	driver.findElement(menoption).click();
}
public void shoesselect()
{
	driver.findElement(shoesbutton).click();

	driver.findElement(shoeselect).click();
}
public void shoescroll()
{
	
	driver.findElement(selectmodel).click();
}
public void sizeselect()
{
	driver.findElement(size).click();
	driver.findElement(addcart).click();
	driver.findElement(bag).click();
	driver.findElement(checkout).click();
}
public void checkoutdetails()
{
	driver.findElement(firstname).sendKeys("Hemandh");
	driver.findElement(lastname).sendKeys("G Kumar");
	driver.findElement(address).sendKeys("abc");
	driver.findElement(postal).sendKeys("689122");
	Select statedropdown=new Select(driver.findElement(state));
	statedropdown.selectByValue("18");
	
}
public void fbredirect()
{
	driver.findElement(returnscart).click();
	driver.findElement(leavecheckout).click();
	
}
public void fb()
{

	driver.findElement(fbicon).click();
}
public void facebook()
{
    String childwindow=driver.getWindowHandle();
	Set<String>allhandles=driver.getWindowHandles();
	if(!allhandles.equals(childwindow))
	{
		
		driver.switchTo().window(childwindow);
		driver.findElement(fbphoto);
	}
	
	

}

}
