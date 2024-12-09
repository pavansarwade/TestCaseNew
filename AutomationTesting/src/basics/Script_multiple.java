package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Script_multiple
{
public static void main(String[] args) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/Victus/OneDrive/Desktop/selenium/dropdown.html");
	WebElement dd = driver.findElement(By.id("celebreties"));
	Select s=new Select(dd);
	if (s.isMultiple())
	{
	System.out.println("dropdown is multiple select");	
	}
	else
	{
		System.out.println("dropdown is single select");		
	}
	Thread.sleep(2000);
	driver.quit();
}
}
