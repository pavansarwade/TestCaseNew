package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ss_task 
{
	public static void main(String[] args) throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/?s_kwcid=AL!739!3!582822043580!b!!g!!flipkart&gclsrc=aw.ds&&semcmpid=sem_8024046704_brand_exe_buyers_goog&gad_source=1&gclid=EAIaIQobChMIpYPSwpjqiQMVR4VLBR2SswacEAAYASAAEgJVwfD_BwE");
	WebElement txt=driver.findElement(By.xpath("//input[@type='text']"));
	Thread.sleep(1000);
	txt.sendKeys("iphone11");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//button[@class='_2iLD__']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//div[@class='col col-7-12'])[1]")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("class=\"QqFHMw vslbG+ In9uk2\"")).click();
	
	
	
	
	
	}
}
