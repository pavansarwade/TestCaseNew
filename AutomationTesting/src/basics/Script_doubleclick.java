package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Script_doubleclick {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	WebElement ele = driver.findElement(By.xpath("//button[@ondblclick='myFunction()']"));
	Actions act=new Actions(driver);
	Thread.sleep(2000);
	act.doubleClick(ele).perform();
	Thread.sleep(2000);
	driver.quit();
}
}
