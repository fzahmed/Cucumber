package pages;



import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;



public class DashboardPage {

	
	WebDriver driver;

	public DashboardPage(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(how=How.XPATH, using ="//h2[contains(text(),'Dashboard')]") WebElement
	DASHBOARD_HEADER_ELEMENT;
	@FindBy(how=How.XPATH, using ="//span[contains(text(),'Bank & Cash')]") WebElement
	BANK_AND_CASH_ELEMENT;
	@FindBy(how=How.XPATH, using ="//a[contains(text(),'New Account')]") WebElement
	NEW_ACCOUNT_ELEMENT;
	
	public void clickBankAndCASH(){
		BANK_AND_CASH_ELEMENT.click();
	}
	
	public void clickNewAccount() {
		NEW_ACCOUNT_ELEMENT.click();
	}
	
	
	public void verifyDashboardPage() {
		Assert.assertTrue(DASHBOARD_HEADER_ELEMENT.isDisplayed());
	}
}
