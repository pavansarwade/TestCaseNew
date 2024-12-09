package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;

public class Demo55 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://106.51.87.42:9007/");
		Thread.sleep(1000);
		driver.findElement(By.id("email")).sendKeys("Fresher@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.id("password")).sendKeys("Fresher@2024");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[@href='http://106.51.87.42:9007/index.php?doctor/patient']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[@class='btn btn-primary pull-right']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("pavan");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("pavan@123");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(4000);
		driver.quit();
	}

}
