package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ss_hiddendivisionpopup {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.redbus.in/?gad_source=1&gclid=EAIaIQobChMI6tigvPTniQMVi6RmAh3IaAC4EAAYASAAEgL0x_D_BwE");
	driver.findElement(By.xpath("//div[@id='onwardCal']"));
	//driver.findElement(By.xpath(""));

}
}
