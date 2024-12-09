package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo91 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.amazon.in/");
		WebElement usn = driver.findElement(By.xpath("//a"));
		int h = usn.getSize().getHeight();
		int g = usn.getSize().getWidth();
		System.out.println(h+" "+g);
		Thread.sleep(1000);
		driver.quit();
	}

}
