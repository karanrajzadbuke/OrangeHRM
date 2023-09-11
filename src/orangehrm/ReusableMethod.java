package orangehrm;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

public class ReusableMethod 
{
	public static WebDriver driver;
	PageObject p = PageFactory.initElements(driver, PageObject.class);
	
	
//Launch App
	public void launchApp()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\Documents\\jars\\chromedriver.exe\"");
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();		
	}
	

//Login
	public void login(String username, String password)
	{
		p.username.sendKeys(username);
		p.password.sendKeys(password);
		p.login.click();
		Alert a =driver.switchTo().alert();
		a.dismiss();
	}

//Verify element is displayed
	public void checkDisplay(WebElement element)
	{
		boolean a = element.isDisplayed();				
		SoftAssert s = new SoftAssert();
		s.assertEquals(a, true);
		s.assertTrue(a, "Element is displayed");	
	}
	
//Verify the url
	public void urlContains(WebElement element,String letters)
	{
		element.click();
		boolean a = driver.getCurrentUrl().contains(letters);
		SoftAssert s = new SoftAssert();
		s.assertEquals(letters, true);
		s.assertTrue(a, "Element is displayed");
		
	}
		
//Close App
	public void close()
	{
		driver.quit();
	}

	



}
