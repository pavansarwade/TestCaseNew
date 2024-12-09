package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Script_03 
{
	@Test
	public void Testcase()
	{
		Reporter.log("Hello",true);
		
	}
		@Test
		public void Testcase1()
		{
			Reporter.log("goodmorning",true);
			
		}
		@Test
		public void Testcase2()
		{
			Reporter.log("goodevening",true);
			
		}
}
