package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Ss_notificationpopup
{
public static void main(String[] args) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	ChromeOptions opts=new ChromeOptions();
	opts.addArguments("--disable-notification");
	WebDriver driver=new ChromeDriver(opts);
	driver.manage().window().maximize();
	driver.get("https://demoapps.qspiders.com/ui/browserNot?sublist=0");
	Thread.sleep(2000);
	WebElement ele = driver.findElement(By.id("browNotButton"));
	Thread.sleep(2000);
	ele.click();
	//driver.quit();
}
}
