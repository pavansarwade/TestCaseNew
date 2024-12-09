package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo90 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.facebook.com/login/?next=https%3A%2F%2Fwww.facebook.com%2F");
		WebElement usn = driver.findElement(By.id("email"));
		Point loc = usn.getLocation();
		System.out.println(loc);
		int x = loc.getX();
		int y = loc.getY();
		Thread.sleep(1000);
		driver.quit();
	}

}
