package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pages.GoogleSearchPage;

public class GoogleSearchTest {
	static WebDriver driver=null;
	
	
	public void googlesearch()
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\mamta.sharma\\MavenJAVA\\EXE\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	//driver.findElement(By.name("q")).sendKeys("Automation step By step");
	GoogleSearchPage.textbox_search(driver).sendKeys("Automation step by step");
	//click on the search button
	//driver.findElement(By.name("btnK")).click();
	//driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
	GoogleSearchPage.button_search(driver).sendKeys(Keys.RETURN);
	driver.close();
	System.out.println("Test completed successfully");
	
	}
}
