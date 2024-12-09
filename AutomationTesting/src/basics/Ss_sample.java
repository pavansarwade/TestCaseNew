package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ss_sample 
{
public static void main(String[] args) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://busonlineticket.com/booking/bus-tickets.aspx");
	driver.findElement(By.id("txtOriginGeneral")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//div[@class='select2-result-label'])[3]")).click();
	Thread.sleep(1000);
	driver.findElement(By.id("txtDestinationGeneral")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//div[@class='select2-result-label'])[3]")).click();
	Thread.sleep(1000);
	driver.findElement(By.id("txtDepartDateBooking")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//a[.='30']")).click();
	Thread.sleep(1000);
	driver.findElement(By.id("txtReturnDateBooking")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//a[.='31']")).click();
	Thread.sleep(1000);
	driver.findElement(By.id("btnBusSearchNewGeneral")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("XB27303772")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//small[.='20'])[2]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//small[.='21'])[2]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//span[.='Proceed'])[2]")).click();
	Thread.sleep(1000);
	driver.findElement(By.id("btn-alert-okay")).click();
	Thread.sleep(1000);
	driver.findElement(By.id("XB28121682")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//small[.='A3'])[2]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//small[.='A4'])[2]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//small[.='A5'])[2]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//small[.='A6'])[2]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//small[.='A7'])[2]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//small[.='A8'])[2]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//span[.='Proceed'])[2]")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//input[@class='payment_textName form-controlpay-form-control']")).sendKeys("pavan");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@class='payment_textPhoneLogin form-controlpay-form-control']")).sendKeys("9035323025");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@class='payment_txtEmail form-controlpay-form-control']")).sendKeys("pavansarwade246@gmail.com");
	Thread.sleep(1000);
	driver.findElement(By.id("btnNext")).click();
	Thread.sleep(3000);
	driver.quit();







	
	
	
}
}
