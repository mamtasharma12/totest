package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.GoogleSearchPageObjects;

public class GoogleSearchPageTest {
	
	WebDriver driver=null;
	public static void main(String[]args)
	{
		GoogleSearchTest();
}
	public static void GoogleSearchTest() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mamta.sharma\\MavenJAVA\\EXE\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		GoogleSearchPageObjects searchpageobject=new GoogleSearchPageObjects(driver);
		driver.get("https://www.google.com/");
		searchpageobject.setTextInSearchBox("Interview Question of Selenium");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		searchpageobject.clickSearchButton();
		driver.close();
		
	}
	
}
