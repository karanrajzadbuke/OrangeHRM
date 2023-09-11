package test;

import java.util.Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderr 
{
	WebDriver driver;
	@BeforeMethod
	public void launchApp() throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Documents\\jars\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");                                         //Hit the URL
		driver.manage().window().maximize();                                             // maximize the window  
		Thread.sleep(3000);
	}
	
	@AfterMethod
	public void closeApp()
	{
		driver.close();
	}
	
	@DataProvider(name="loginid")
	public Object[][] data() 
	{
		Object[][] obj = new Objects[3][2];
		obj[0][0]="Karan";
		obj[0][1]="User.123";
		obj[1][0]="Manas";
		obj[1][1]="User.123";
		obj[2][0]="Vardaan";
		obj[2][1]="User.123";
		obj[3][0]="Shounak";
		obj[3][1]="User.123";
		return obj;
	}

	@Test(dataProvider = "logindata")
	public void m1(String uid , String pswd) throws Exception
	{
		driver.findElement(((By.id("email")))).sendKeys(uid);
		Thread.sleep(1000);
		driver.findElement(((By.id("email")))).sendKeys(pswd);	
	}
	
	
}
