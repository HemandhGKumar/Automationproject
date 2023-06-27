package page;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class Sampletest {
	ChromeDriver driver;

By Signin=By.xpath("//*[@id=\"b2indexPage\"]/div[2]/div/header/nav[1]/div[2]/div/a");
By email=By.xpath("//*[@id=\"username\"]");
By emailcontinue=By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/div[1]/div/div/div/div/div/div/form/div[3]/button");
By password=By.xpath("//*[@id='password']");
By passworsignin=By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/div[1]/div/div/div/div/div/div/form/div[2]/button");
By place=By.xpath("//*[@id=\":Ra9:\"]");
By random=By.xpath("//*[@id=\"indexsearch\"]/div[1]/div/div");
By calender=By.xpath("//*[@id=\"indexsearch\"]/div[2]/div/div/form/div[1]/div[2]/div/div/span[1]");
By dateselect=By.xpath("//*[@id=\"calendar-searchboxdatepicker\"]/div/div[1]/div/div[1]/table/tbody");
By monthname=By.xpath("//*[@id=\"calendar-searchboxdatepicker\"]/div/div[1]/div/div[1]/h3");
By nextbutton=By.xpath("//*[@id=\"calendar-searchboxdatepicker\"]/div/div[1]/button[2]");
By personpick=By.xpath("//*[@id=\"indexsearch\"]/div[2]/div/div/form/div[1]/div[3]/div/button");
By childagedrop=By.xpath("//*[@id=\"indexsearch\"]/div[2]/div/div/form/div[1]/div[3]/div/div/div/div/div[3]/div/div/span/span");
By childageselect=By.xpath("//*[@id=\":rp:\"]/option[14]");
By donebutton=By.xpath("//*[@id=\"indexsearch\"]/div[2]/div/div/form/div[1]/div[3]/div/div/div/button");
By searchbutton=By.xpath("//*[@id=\"indexsearch\"]/div[2]/div/div/form/div[1]/div[4]/button");
By availability=By.xpath("//*[@id=\"search_results_table\"]/div[2]/div/div/div[3]/div[16]/div[1]/div[2]/div/div[2]/div[2]/div/div[2]/a");
By reserve=By.xpath("//*[@id=\"hp_book_now_button\"]");


public Sampletest(ChromeDriver driver)
{
this.driver=driver;
}
public void signIn()
{
	
	String parentwindow=driver.getWindowHandle();
	driver.findElement(Signin).click();
	driver.findElement(email).sendKeys("hemandh3223@gmail.com");
	driver.findElement(emailcontinue).click();
}
public void pswrd()
{
	driver.findElement(password).sendKeys("Tahmp@3223");
	driver.findElement(passworsignin);
}
public void location()
{
	driver.findElement(place).sendKeys("Trivandrum");
	driver.findElement(random).click();
	driver.findElement(calender).click();
	while(true)
	{
		WebElement julymonthbtn=driver.findElement(monthname);
		String monthtext=julymonthbtn.getText();
		if(monthtext.equals("july"))
		{
			System.out.println("JULY");
			break;
		}
		else
		{
			driver.findElement(nextbutton).click();
		}
		List<WebElement>allmonth=driver.findElements(dateselect);
		for(WebElement alldates:allmonth)
		{
			String reqrddate=alldates.getAttribute("aria-label");
			if(reqrddate.equals("9 August 2023"))
			{
				alldates.click();
			}
			
		}
	}
	
}

public void travellers()
{
	driver.findElement(personpick).click();
	Select agechild=new Select(driver.findElement(childagedrop));
	agechild.selectByValue("11");
	driver.findElement(donebutton).click();
}
public void search()
{
	driver.findElement(searchbutton).click();
}
public void selecthotel()
{
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoView;",availability );
	driver.findElement(availability).click();
}
public void reservation()
{
	
	String childwindow=driver.getWindowHandle();
	Set<String>allwindow=driver.getWindowHandles();
	for(String windowall:allwindow)
	{
		if(!windowall.equals(childwindow))
		{
			driver.switchTo().window(childwindow);
			driver.findElement(reserve).click();
		}
	}
	
}
}