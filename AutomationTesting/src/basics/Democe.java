package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Democe {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("file:///C:/Users/Victus/OneDrive/Desktop/selenium/webelement.html");
		WebElement cb=driver.findElement(By.xpath("//input[@type='checkbox']"));
		if (cb.isDisplayed())
		{
		if (cb.isEnabled())
		{
			if (cb.isSelected()) {
				cb.click();
			}
		else 
		{
			System.out.println("not selected");
		}
		}	
		else {
			System.out.println("is disabled");
		}
		}
		else {
			System.out.println("not displayed");
		}
	}}
