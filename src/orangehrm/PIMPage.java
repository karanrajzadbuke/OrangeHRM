package orangehrm;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;

public class PIMPage {

	@FindBy(className = "oxd-input")
	public List<WebElement> txtEmployeeId;

	@FindBy(css = "[type=submit]")
	public WebElement Submit;
	@FindBy(tagName = "input")
	public List<WebElement> txtSearchEmpName;
	@FindBy(tagName = "button")
	public List<WebElement> btnUpdateEmployee;
	@FindBy(className = "oxd-input")
	public List<WebElement> txtUpdateEmployeeId;

	public PIMPage(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

	public void SearchEmployeeByInvalidName(String employeeName) throws InterruptedException {
		txtSearchEmpName.get(1).sendKeys(employeeName);
		Thread.sleep(1500);
		Submit.click();
	}

	public void SearchEmployeeByValidName(String employeeName) throws InterruptedException {
		txtSearchEmpName.get(1).sendKeys(employeeName);
		Thread.sleep(1500);
		Submit.click();
	}

	public void updateEmployeeById(String employeeId) throws InterruptedException {
		btnUpdateEmployee.get(6).click();
		txtUpdateEmployeeId.get(5).sendKeys(Keys.CONTROL + "a" + Keys.BACK_SPACE);
		Thread.sleep(1000);
		txtUpdateEmployeeId.get(5).sendKeys(employeeId);
		Thread.sleep(1500);
		btnUpdateEmployee.get(1).click();
	}

	public void SearchEmployeeByValidId(String randomEmployeeId) throws InterruptedException {
		txtEmployeeId.get(1).sendKeys(randomEmployeeId);
		Thread.sleep(1500);
		Submit.click();
	}
}


