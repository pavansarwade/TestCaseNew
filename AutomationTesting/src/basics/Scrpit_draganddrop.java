package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scrpit_draganddrop {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		WebElement src = driver.findElement(By.id("box2"));
		WebElement dst = driver.findElement(By.id("box102"));
		WebElement src1 = driver.findElement(By.id("box3"));
		WebElement dst1= driver.findElement(By.id("box103"));
		Actions act=new Actions(driver);
		Thread.sleep(2000);
		act.dragAndDrop(src, dst).perform();
		Thread.sleep(2000);
		act.dragAndDrop(src1, dst1).perform();
		Thread.sleep(2000);
		driver.quit();
	}
}
