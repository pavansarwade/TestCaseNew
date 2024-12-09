package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Script_Assisgnment {

	public static void main(String[] args) throws InterruptedException 
	{
		
        System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
        WebDriver driver  = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://fitpeo.com/");
        Thread.sleep(2000);
        
      //To Perform Slider We should Use Actions Class
        Actions act = new Actions(driver);
        
     // Address of RevenueCalculator
        WebElement RevenueCalculator = driver.findElement(By.xpath("(//div[.='Revenue Calculator'])[1]"));
        RevenueCalculator.click();
        Thread.sleep(2000);
        
      //Address of medicare Eligible patient
        WebElement medicareEligiblepatient = driver.findElement(By.xpath("//h4[.='Medicare Eligible Patients']"));  
        
     
      //To Perform Scrolldown or Enabled element or Pass data without using sendkeys or handle the scrollbar we will use javascriptExecutor  
       
        JavascriptExecutor java = (JavascriptExecutor)driver;
        java.executeScript("arguments[0].scrollIntoView(true)",medicareEligiblepatient); 
        Thread.sleep(2000);
        
     //Address of the slider Component 
      
        WebElement slider = driver.findElement(By.xpath("//span[@class='MuiSlider-track css-10opxo5']"));     
       System.out.println("default location of the min slider:"+slider.getLocation());//(698,670),(x,y)
       
     //Reference variable of Actions class to perform on slider component
       act.moveToElement(slider).clickAndHold().moveByOffset(108, 0).release().perform();         
       Thread.sleep(5000);
        
     //Address of the slider textfield to enter digit = 560
       WebElement valuefield = driver.findElement(By.xpath("//input[@type='number']")); 
     
     //Select all digit in slider textfield
       valuefield.sendKeys(Keys.CONTROL+"a");
       
     //Remove all from slider textfield
       valuefield.sendKeys(Keys.BACK_SPACE);
       
     //Enter the value into slider textfield
       valuefield.sendKeys("560");
       System.out.println("The slider's position is updated to reflect the value is = 560");
       Thread.sleep(3000);
       
     //Select all digit from slider textfield
       valuefield.sendKeys(Keys.CONTROL+"a");
       
     //Remove all digit from slider textfield 
       valuefield.sendKeys(Keys.BACK_SPACE);
       
     //Enter actual value into slider textfield
       valuefield.sendKeys("820");
       Thread.sleep(3000);
       
    //Address of CPT CODE 99091: AND clickBOX on check box1    
      WebElement checkbox1 = driver.findElement(By.xpath("//P[.='CPT-99091']"));  
      Thread.sleep(3000);          
      WebElement CPT99091 = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
      CPT99091.click();
      
    //Address of the CPT-99453 AND CHECKBOX click on check box2 
      WebElement checkbox2 = driver.findElement(By.xpath("//p[.='CPT-99453']"));       
      Thread.sleep(3000);
      WebElement CPT99453 = driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
      CPT99453.click();
      
    //Address of the CPT-99453 AND CHECKBOX click on check box3 
      WebElement checkbox3 = driver.findElement(By.xpath("//p[.='CPT-99454']"));
      Thread.sleep(3000);
      WebElement CPT99454 = driver.findElement(By.xpath("(//input[@type='checkbox'])[3]"));
      CPT99454.click();
      
    //Address of the CPT-99453 AND CHECKEBOX,  click on check box8 
      WebElement checkbox4 = driver.findElement(By.xpath("//p[.='CPT-99474']"));
      Thread.sleep(3000);
      WebElement CPT99474 = driver.findElement(By.xpath("(//input[@type='checkbox'])[8]"));
      CPT99474.click();
      Thread.sleep(2000);
      
    //Value of Total Gross Revenue Per Year 
      WebElement totalgrass = driver.findElement(By.xpath("(//p[@class='MuiTypography-root MuiTypography-body2 inter css-1xroguk'])[1]"));
      String txt1 = totalgrass.getText();
      System.out.println(txt1);
      
    //Value of One Time Reimbursement for all Patients Annually 
      WebElement PatientsAnnually = driver.findElement(By.xpath("(//p[@class='MuiTypography-root MuiTypography-body2 inter css-1xroguk'])[2]"));
      String txt2 = PatientsAnnually.getText();
      System.out.println(txt2);
      
    //Value of Total Individual Patient/Month 
      WebElement TotalIndividualPatient = driver.findElement(By.xpath("(//p[@class='MuiTypography-root MuiTypography-body2 inter css-1xroguk'])[3]"));
      String txt3 = TotalIndividualPatient.getText();
      System.out.println(txt3);
       
    //Value of Total Recurring Reimbursement for all Patients Per Month
      WebElement TotalRecurringReimbursement = driver.findElement(By.xpath("(//p[@class='MuiTypography-root MuiTypography-body2 inter css-1xroguk'])[4]"));
      String txt4 = TotalRecurringReimbursement.getText();
      System.out.println(txt4);
      Thread.sleep(3000);
      driver.quit();		
	}
}
