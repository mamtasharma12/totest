package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_Demo {
	private static WebDriver driver=null;
	@BeforeTest
	public void setUpTest()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mamta.sharma\\MavenJAVA\\EXE\\chromedriver.exe");
		driver=new ChromeDriver();		
	}
	@Test
	public static void googlesearch()
	{
			driver.get("https://www.google.com/");
			driver.findElement(By.name("q")).sendKeys("Automation step By step");
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			//click on the search button
			//driver.findElement(By.name("btnK")).click();
			driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);	
	}
		
		@AfterTest
	public void tearDownTest()
	{
		driver.close();
		driver.quit();
		System.out.println("Test completed successfully");
		
	}
}
