package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ss_amazon
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_5szpgfto9i_e&adgrpid=155259813593&hvpone=&hvptwo=&hvadid=674893540034&hvpos=&hvnetw=g&hvrand=1410393840485136565&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9198441&hvtargid=kwd-64107830&hydadcr=14452_2316413&gad_source=1");
	Thread.sleep(1000);
	WebElement search = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	Thread.sleep(1000);
	search.sendKeys("wrist watches");
	Thread.sleep(1000);
	WebElement pwd = driver.findElement(By.xpath("//input[@value='Go']"));
	Thread.sleep(1000);
	pwd.click();
	Thread.sleep(1000);
	WebElement dd = driver.findElement(By.xpath("(//span[.='Fastrack'])[4]"));
	Thread.sleep(1000);
	dd.click();
	Thread.sleep(1000);
	WebElement cc = driver.findElement(By.xpath("//span[.='Leather']"));
	cc.click();
	Thread.sleep(1000);
	driver.quit();
}
}
