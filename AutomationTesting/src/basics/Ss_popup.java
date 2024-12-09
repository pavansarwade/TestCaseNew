package basics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ss_popup 
{
public static void main(String[] args) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoapps.qspiders.com/ui/alert?sublist=0");
	Thread.sleep(4000);
	WebElement ele = driver.findElement(By.xpath("//button[@id='buttonAlert1']"));
	Thread.sleep(4000);
	ele.click();
	Thread.sleep(2000);
	Alert popup = driver.switchTo().alert();
	popup.sendKeys("yes");
	popup.accept();
//	popup.dismiss();
	String msg = popup.getText();
	System.out.println(msg);
	driver.quit();
	
}
}
