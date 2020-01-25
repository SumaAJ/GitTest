package tests;

import java.io.IOException;
import java.text.ParseException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;



public class Test1   {

	WebDriver driver;
	@Test
	public void loginExe() throws InterruptedException, IOException, ParseException   
	{
		TestBase tb=new TestBase();
		driver = tb.launch("chrome");
		driver.manage().window().maximize();
	}	
}
