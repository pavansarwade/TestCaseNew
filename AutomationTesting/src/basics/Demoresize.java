package basics;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoresize {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		org.openqa.selenium.Dimension d=new org.openqa.selenium.Dimension(300,900);
		driver.manage().window().setSize(d);
	}

}
