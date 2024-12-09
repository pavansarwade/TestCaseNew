package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demodrag {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		org.openqa.selenium.Point d=new org.openqa.selenium.Point(300,900);
		Thread.sleep(2000);
		driver.manage().window().setPosition(d);
		
	}

}
