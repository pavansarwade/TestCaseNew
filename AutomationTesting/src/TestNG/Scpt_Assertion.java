package TestNG;

import org.apache.logging.log4j.core.util.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Scpt_Assertion
{
	@Test
	public void signup()
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		String ExpectedTitle="Facebook - log in or sign up";
		String ActualTitle=driver.getTitle();
		org.testng.Assert.assertEquals("ExpectedTitle","ActualTitle");
		System.out.println(ActualTitle);
		driver.quit();
	}
}
