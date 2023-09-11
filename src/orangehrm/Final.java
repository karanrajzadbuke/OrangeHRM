package orangehrm;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Final 
{
	ReusableMethod m = new ReusableMethod();
	
	@BeforeTest
	public void launchApp()
	{
		m.launchApp("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	@AfterTest
	public void close()
	{
		m.close();
	}
	
	@Test
	public void login()
	{
		m.login("Admin", "admin123");
	}

}
