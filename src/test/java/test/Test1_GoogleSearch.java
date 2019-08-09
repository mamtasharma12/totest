package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test1_GoogleSearch {
	
	public static void googlesearch()
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\mamta.sharma\\MavenJAVA\\EXE\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.findElement(By.name("q")).sendKeys("Automation step By step");
	//click on the search button
	//driver.findElement(By.name("btnK")).click();
	driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
	driver.close();
	System.out.println("Test completed successfully");
	
	}
}
