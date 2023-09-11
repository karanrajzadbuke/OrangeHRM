
package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion 
{
	public WebDriver driver;
	
	@BeforeMethod
	public void launchApp() throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Documents\\jars\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");                                         //Hit the URL
		driver.manage().window().maximize();                                             // maximize the window  
		Thread.sleep(3000);
	}
	
	@Test
	public void f() throws Exception
	{
		
		boolean a = driver.findElement(By.id("pass")).isDisplayed();
		SoftAssert s = new SoftAssert();
		s.assertEquals(a, true);
		System.out.println(driver.getTitle());
		s.assertAll();
	}
	
	@AfterMethod
	public void closeApp()
	{
		driver.close();
	}

}
