package page;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sgpage {
	ChromeDriver driver;
	By bats=By.xpath("//*[@id=\"menu-1-4df39e2\"]/li[1]");
	By selectbat=By.xpath("//*[@id=\"main\"]/ul/li[1]/div/div[2]/a");
	By cart=By.xpath("//*[@id=\"product-84978\"]/div[2]/form/div[2]/div[1]/div[3]/button[2]");
	By firstname=By.xpath("//*[@id=\"billing_first_name\"]");
	By lastname=By.xpath("//*[@id=\"billing_last_name\"]");
	By address=By.xpath("//*[@id=\"billing_address_1\"]");
	By drop=By.xpath("//*[@id=\"billing_state\"]");
	By dropdownvalue=By.xpath("//*[@id=\"billing_state\"]/option[14]");
	By mob=By.xpath("//*[@id=\"billing_phone\"]");
	By radio=By.xpath("//*[@id=\"payment\"]/ul/li[4]/label");
	By fblogo=By.xpath("//*[@id=\"page\"]/div[4]/div/section[3]/div/div/div[1]/div/div/div[4]/div/div/span[1]/a/i");
    By ball=By.xpath("//*[@id=\"sm-1687637096568591-3\"]");
    
	public Sgpage(ChromeDriver driver)
	{
		this.driver=driver;
	}
	public void baticon()
	{
		
		driver.findElement(bats).click();
	}
	public void select()
	{
		driver.findElement(selectbat).click();
		driver.findElement(cart).click();
	}
	public void details()
	{
		driver.findElement(firstname).sendKeys("abc");
		driver.findElement(lastname).sendKeys("def");
		driver.findElement(address).sendKeys("home");
		Select dropdown=new Select(driver.findElement(drop));
		dropdown.selectByValue("KL");
		driver.findElement(mob).sendKeys("8847523659");
		driver.getWindowHandle();
		driver.findElement(radio).click();
	}
	public void fb()
	{
		
		String parentwindow=driver.getWindowHandle();
		Set<String>allhandle=driver.getWindowHandles();
		for(String alllinks:allhandle)
		{
			if(!alllinks.equals(parentwindow))
			{
				driver.switchTo().window(parentwindow);
				driver.findElement(ball).click();
			}
		}
	}
	
}
