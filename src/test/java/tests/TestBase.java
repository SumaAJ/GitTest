package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;


public class TestBase{
	public WebDriver driver;

	@BeforeSuite
	public WebDriver launch(String browser )
	{
		if(browser.equals("chrome")) 
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\703219448\\Downloads\\chromedriver.exe");	
			driver=new ChromeDriver();

		}
		else if(browser.equals("firefox"))
		{	System.setProperty("webdriver.gecko.driver", "C:\\Users\\703219448\\Downloads\\geckodriver.exe");	
		driver=new FirefoxDriver();
		}
		else if(browser.equals("edge"))
		{	System.setProperty("webdriver.edge.driver", "C:\\Users\\703219448\\Downloads\\MicrosoftWebDriver.exe");
		driver=new EdgeDriver();
		}
		else
		{

			System.out.println("Can't find the browser drivers");
		}

		driver.get("https://www.flipkart.com/");


		return driver;
	}
	@AfterSuite
	public void tearDown()
	{
		driver.quit();;	
	}

	/*public void failedTestCase(String testMethodName) throws IOException
	{
		
		File srcfile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcfile, new File("D:\\Users\\703219448\\eclipse-workspace\\PageObject"
				+ "\\src\\ScreenShot"+testMethodName+"_"+".jpg"));
	}
	*/
	

}


