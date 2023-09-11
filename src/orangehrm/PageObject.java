package orangehrm;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageObject 
{
	//@FindBy(xpath = "//input[@name="username"]") WebElement username;
	
	@FindBy(xpath = "//input[@name='username']") WebElement username;
	@FindBy(xpath = "//input[@name='password']") WebElement password;
	@FindBy(xpath = "//button[@type='submit']") WebElement login;

	@FindBy(xpath = "//a[@href=\"/web/index.php/pim/viewPimModule\"]") WebElement PIM;
	@FindBy(xpath = "//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']") WebElement PIMnamedisplay;
	@FindBy() WebElement EmployeeList;
	//@FindBy() WebElement EmpName; (//*[@class='oxd-autocomplete-wrapper'])[1]
	@FindBy() WebElement EmpID;
	@FindBy() WebElement SupervisorName;
	@FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary']") WebElement AddButton;
	@FindBy(xpath = "//button[@type='reset']") WebElement ResetButton;
	@FindBy(xpath = "//button[@type='submit']") WebElement SearchButton;	
	@FindBy(xpath = "//button[@title='Help']") WebElement HelpButton;
}
	