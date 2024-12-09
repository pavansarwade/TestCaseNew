package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo89 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Victus/OneDrive/Desktop/selenium/Frames/mainpage.html");
		WebElement usn = driver.findElement(By.xpath("//input[@type='text']"));
		Thread.sleep(1000);
		usn.sendKeys("admin");
		driver.switchTo().frame(0);
		WebElement psw=driver.findElement(By.xpath("//input[@type='text']"));
		Thread.sleep(1000);
		psw.sendKeys("admin2244");
		driver.switchTo().frame(0);
		WebElement mob=driver.findElement(By.xpath("//input[@type='text']"));
		Thread.sleep(1000);
		mob.sendKeys("123456789");
		driver.switchTo().frame(0);
		WebElement email=driver.findElement(By.xpath("//input[@type='text']"));
		Thread.sleep(1000);
		email.sendKeys("admin@2244");
		Thread.sleep(1000);
		driver.switchTo().parentFrame();
		mob.clear();
		Thread.sleep(1000);
		driver.switchTo().defaultContent();
		usn.clear();
		Thread.sleep(1000);
		driver.quit();
	}

}
