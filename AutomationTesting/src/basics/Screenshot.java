package basics;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.netflix.com/");
		Date d=new Date();
		String d1 = d.toString().replace(":", "-");
		System.out.println(d1);
		TakesScreenshot ts=(TakesScreenshot) driver;
		File temp=ts.getScreenshotAs(OutputType.FILE);
		File perm=new File("./Screenshots/Defects1.png");
		org.openqa.selenium.io.FileHandler.copy(temp, perm);
		Thread.sleep(1000);
		driver.quit();
		
		
		
		
		
//		Date d=new Date();
//		d.toString()
//		System.out.println(d);
	driver.quit();
		
	}
}
