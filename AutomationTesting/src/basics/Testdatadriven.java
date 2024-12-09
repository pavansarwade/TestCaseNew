package basics;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testdatadriven {

	public static void main(String[] args) throws IOException
	{
		FileInputStream fis=new FileInputStream("./Testdata/Facebookcredentials.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		XSSFRow row=sheet.getRow(1);
		XSSFCell cel=row.getCell(0);
		 String val = cel.getStringCellValue();
		 System.out.println(val);
		 workbook.close();
		 fis.close();
		 System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com/login.php/");
			 WebElement un = driver.findElement(By.id("email"));
			 un.sendKeys(val);
			
			
			
			
			
			
			
			
			
			
			driver.quit();
			
	}

}
