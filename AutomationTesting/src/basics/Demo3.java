package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https:/www.youtube.com");
		WebElement el=driver.findElement(By.cssSelector("input[aria-label='Search']"));
		el.sendKeys("kannada songs");
		WebElement jsp=driver.findElement(By.id("search-icon-legacy"));
		jsp.click();
		
	//	WebElement jsp=driver.findElement()
		
		
			
	}

}
