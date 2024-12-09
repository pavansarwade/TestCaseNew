package basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sstask 
{
	public static void main(String[] args) throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.saucedemo.com/v1/");
	Thread.sleep(2000);
	WebElement usn = driver.findElement(By.xpath("//input[@id='user-name']"));
	Thread.sleep(1000);
	usn.sendKeys("standard_user");
	Thread.sleep(1000);
	WebElement pwd = driver.findElement(By.xpath("//input[@id='password']"));
	Thread.sleep(1000);
	pwd.sendKeys("secret_sauce");
	WebElement login = driver.findElement(By.xpath("//input[@id='login-button']"));
	login.click();
	List<WebElement> title = driver.findElements(By.xpath("//div[@class='inventory_item_name']"));
	int count = title.size();
	{
		for (int i = 0; i < count; i++)
		{
			WebElement title1 = title.get(i);
			String all = title1.getText();
			System.out.println(all);
		}
	}
	WebElement first = driver.findElement(By.xpath("//a[@id='item_4_title_link']"));
	Thread.sleep(1000);
	first.click();
	WebElement aa = driver.findElement(By.xpath("//div[@class='inventory_details_name']"));
	String bb = aa.getText();
	WebElement cc = driver.findElement(By.xpath("//div[@class='inventory_details_price']"));
	String dd = cc.getText();
	WebElement cart = driver.findElement(By.xpath("//button[@class='btn_primary btn_inventory']"));
	Thread.sleep(1000);
	cart.click();
	WebElement cartoption = driver.findElement(By.xpath("(//a)[5]"));
	Thread.sleep(1000);
	cartoption.click();
	Thread.sleep(1000);
	WebElement c1 = driver.findElement(By.xpath("//div[@class='inventory_item_name']"));
	Thread.sleep(1000);
	String l1 = c1.getText();
	WebElement c2 = driver.findElement(By.xpath("//div[@class='inventory_item_price']"));
	Thread.sleep(1000);
	String l2 = c2.getText();
	Thread.sleep(1000);

	WebElement ham = driver.findElement(By.xpath("//div[@class='bm-burger-button']"));
	Thread.sleep(1000);

	ham.click();
	WebElement logout = driver.findElement(By.xpath("//a[@id='logout_sidebar_link']"));
	logout.click();
	
	
	
	Thread.sleep(8000);
	driver.quit();
	}
}
