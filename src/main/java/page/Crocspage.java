package page;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Crocspage {
	ChromeDriver driver;

	By men=By.xpath("//*[@id=\"root\"]/main/header/div[2]/nav/ul/li[2]");
	By selectitem=By.xpath("//*[@id=\"root\"]/main/div[2]/article/div[4]/div[2]/section/div/div/div[4]/div/a/div");
	By toggle=By.xpath("//*[@id=\"root\"]/main/div[2]/div[2]/div[2]/aside/form/section[3]/div/div[1]/h3/span[2]/div/div/label/span[2]");
	By size=By.xpath("//*[@id=\"root\"]/main/div[2]/div[2]/div[2]/aside/form/section[3]/div/div[2]/div/div[7]/button/span");
	By addcart=By.xpath("//*[@id=\"root\"]/main/div[2]/div[2]/div[2]/aside/form/div/section[2]/button/span");
	By basket=By.xpath("//*[@id=\"root\"]/main/header/div[2]/div[2]/div[2]/button/div");
	By checkout=By.xpath("//*[@id=\"miniCartTrigger\"]/div/div[3]/button[1]/span");
	By email=By.xpath("//*[@id=\"email\"]");
	By frstname=By.xpath("//*[@id=\"firstname\"]");
	By lastname=By.xpath("//*[@id=\"lastname\"]");
	By address=By.xpath("//*[@id=\"street0\"]");
	By city=By.xpath("//*[@id=\"city\"]");
	By dropbtn=By.xpath("//*[@id=\"region-root-1B2\"]");
	By postal=By.xpath("//*[@id=\"postcode-root-ttM\"]");
	By phone=By.xpath("//*[@id=\"telephone\"]");
	By continuebtn=By.xpath("//*[@id=\"root\"]/main/div[2]/div/div[1]/div[1]/div[3]/div[2]/div/form/div[11]/button/span");
	By fb=By.xpath("//*[@id=\"root\"]/main/div[3]/footer/div/div[1]/div[2]/ul/li[1]/a/svg");

	public Crocspage(ChromeDriver driver)
	{
		this.driver=driver;
	}
	public void menopt()
	{
		
		driver.findElement(men).click();
	}
	public void selectopt()
	{
		driver.findElement(selectitem).click();
	}
	public void itemdetails()
	{
		driver.findElement(toggle).click();
		driver.findElement(size).click();
	}
	public void cart()
	{
		driver.findElement(addcart).click();
		driver.findElement(basket).click();
		driver.findElement(basket).click();
	}
	public void chckout()
	{
		driver.findElement(checkout).click();
		driver.findElement(email).sendKeys("abc@gmail.com");
		driver.findElement(frstname).sendKeys("hgk");
		driver.findElement(lastname).sendKeys("llk");
		driver.findElement(address).sendKeys("hgr");
		driver.findElement(city).sendKeys("who");
		Select statedrop=new Select(driver.findElement(dropbtn));
		statedrop.selectByValue("550");
		driver.findElement(postal).sendKeys("689124");
		driver.findElement(phone).sendKeys("8878456325");
		driver.findElement(continuebtn).click();
		
	}
	public void window()
	{
		String parentwindow=driver.getWindowHandle();
		driver.findElement(fb).click();
		//String childwindow=driver.getWindowHandle();
		Set<String>allhandle=driver.getWindowHandles();
		for(String alllink:allhandle)
		{
			if(!alllink.equals(parentwindow))
			{
				driver.switchTo().window(parentwindow);
				
			}
			
		}
		
	}
	
	}

