package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.FindElement;

public class Demoframe {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Victus/OneDrive/Desktop/selenium/mainpage.html");
		WebElement usn = driver.findElement(By.xpath("//input[@type='text']"));
		Thread.sleep(1000);
		usn.sendKeys("admin");
		driver.switchTo().frame(0);
		WebElement psw=driver.findElement(By.xpath("//input[@type='text']"));
		Thread.sleep(1000);
		psw.sendKeys("admin2244");
		
		
		
		
		
		
		
		
		
		
		Thread.sleep(1000);
		driver.quit();
	}

}
