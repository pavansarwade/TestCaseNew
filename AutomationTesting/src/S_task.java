import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class S_task 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//input[@id='email']"));
		Thread.sleep(2000);
		ele.sendKeys("pavan");
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		ele.sendKeys("pavan");
		driver.quit();
	}
}
