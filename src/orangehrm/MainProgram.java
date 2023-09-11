package orangehrm;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class MainProgram 
{
	public WebDriver driver;	
	PageObject p = PageFactory.initElements(driver,PageObject.class);
	ReusableMethod rm = new ReusableMethod();
	
@BeforeClass	
//Step 1: Launch Orange HRM Web site
public void launchWebsite()
{
	rm.launchApp();
}

//Step 2: Login Orange HRM Web site and handle alert
public void login()
{
	rm.login("Admin", "admin123");
}

//Step 3: Verify PIM Module is displayed
	@Test(priority = 1)
	public void checkPIM()
	{
		//WebElement PIM = p.PIM;
		rm.checkDisplay(p.PIM);
	}
	
//Step 3.1 : Open PIM Module
	@Test(priority = 2)
   public void openPIM()
    {
	   p.PIM.click();
    }
	
//Step 4 : Check PIM name is displayed
	@Test(priority = 3)
	public void checkPIMName()
	{
		rm.checkDisplay(p.PIMnamedisplay);
	}
	
//Step 5 : Check Employee List is displayed
	@Test(priority = 4)
	public void checkEmpListDisplay()
	{
		rm.checkDisplay(p.EmployeeList);
	}
	
//Step 6 : Click on Employee List
	@Test(priority = 5)
	public void clickEmpList()
	{
		p.EmployeeList.click();
	}
	
	
//Step 7 : Check Reset button is displayed
	@Test(priority = 6)
	public void checkResetBtn()
	{
		rm.checkDisplay(p.ResetButton);
	}
	
		
//Step 8 : Check Search button is displayed
	@Test(priority = 7)
	public void checkSearchBtn()
	{
		rm.checkDisplay(p.SearchButton);
	}
	
//Step 9 : Check Add button is displayed
	@Test(priority = 8)
	public void checkAddBtn()
	{
		rm.checkDisplay(p.AddButton);
	}
	
//Step 9 : Check Help button is displayed
	@Test(priority = 9)
	public void checkHelpBtn()
	{
		rm.checkDisplay(p.HelpButton);
	}
	
//Step 10 : Check Help Button Functionality
	@Test(priority = 10)
	public void checkHelpFunct()
	{
		rm.urlContains(p.HelpButton, "How-to-Filter-the-Employee-List");
		driver.close();
	}

//Step 11 : Check Add Button Functionality
	@Test(priority = 11)
	public void checkAddBtnFunct()
	{
		rm.urlContains(p.AddButton, "addEmployee");	   	
		driver.navigate().back();
	}

//Close Orange HRM Web site
	@AfterClass
	public void closeapp()
	{
		driver.close();
	}
	
	
}
