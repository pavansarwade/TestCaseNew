package basics;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S_countbrowsers 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoapps.qspiders.com/ui/browser/multipleTabs?sublist=3");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//button[@id='browserButton2']")).click();
	Thread.sleep(1000);
	Set<String> win = driver.getWindowHandles();
	Thread.sleep(1000);
	int count = win.size();
	System.out.println(count);
	driver.quit();
}
}
