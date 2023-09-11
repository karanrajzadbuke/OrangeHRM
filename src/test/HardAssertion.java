package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HardAssertion //It will not execute next line of code in test if the earlier condition fails
{
	WebDriver driver;
	@BeforeTest
	public void openApp() 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Documents\\jars\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");                                         //Hit the URL
		driver.manage().window().maximize();                                             // maximize the window  
	}
	
	@AfterTest
	public void closeApp()
	{
		driver.quit();
	}
	
	
	@Test
	public void verifyLogin()
	{
		driver.findElement(By.id("email")).sendKeys("Karan");
		boolean emailDisplay = driver.findElement(By.id("email")).isDisplayed();
		Assert.assertEquals(emailDisplay, false);;
		System.out.println(emailDisplay);
		
	}
	
	
	

}
