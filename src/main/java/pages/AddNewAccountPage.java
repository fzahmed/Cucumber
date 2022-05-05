package pages;




import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AddNewAccountPage {

	WebDriver driver;

	public AddNewAccountPage(WebDriver driver) {
		
		this.driver = driver;
	}
	@FindBy(how=How.XPATH,using="//h5")WebElement ADD_NEW_ACCOUNT_HEADER_ELEMENT;
	@FindBy(how=How.XPATH,using="//input[@id='account']")WebElement ACCOUNT_TITLE_FIELD_ELEMENT;
	@FindBy(how=How.XPATH,using="//input[@id='description']")WebElement DESCRIPTION_FIELD_ELEMENT;
	@FindBy(how=How.XPATH,using="//input[@id='balance']")WebElement INITIAL_BALANCE_FIELD_ELEMENT;
	@FindBy(how=How.XPATH,using="//input[@id='account_number']")WebElement ACCOUNT_NUMBER_FIELD_ELEMENT;
	@FindBy(how=How.XPATH,using="//input[@id='contact_person']")WebElement CONTACT_PERSON_FIELD_ELEMENT;
	@FindBy(how=How.XPATH,using="//input[@id='contact_phone']")WebElement PHONE_FIELD_ELEMENT;
	@FindBy(how=How.XPATH,using="//input[@id='ib_url']")WebElement INTERNET_BANKING_URL_FIELD_ELEMENT;
	@FindBy(how=How.XPATH,using="//button[@class='btn btn-primary']")WebElement SUBMIT_BUTTON_ELEMENT;
	@FindBy(how=How.XPATH,using="//div[@class='alert alert-success fade in']")WebElement ACCOUNT_CREATED_ELEMENT;
	
	
	public void enterAcountTitle(String accountTitle) {
		ACCOUNT_TITLE_FIELD_ELEMENT.sendKeys(accountTitle);
	}
	
	public void enterDescription(String description) {
		DESCRIPTION_FIELD_ELEMENT.sendKeys(description);
	}
	
	public void enterInitialBalance(String balance) {
		INITIAL_BALANCE_FIELD_ELEMENT.sendKeys(balance);
	}
	
	public void enterAccountNumber(String accountNumber) {
		ACCOUNT_NUMBER_FIELD_ELEMENT.sendKeys(accountNumber);
	}
	
	public void enterContactPerson(String contactPerson) {
		CONTACT_PERSON_FIELD_ELEMENT.sendKeys(contactPerson);
	}
	public void enterPhone(String phone) {
		PHONE_FIELD_ELEMENT.sendKeys(phone);
	}
	public void enterInternetBankingUrl(String url) {
		INTERNET_BANKING_URL_FIELD_ELEMENT.sendKeys(url);
	}
	
	public void clickSubmit() {
		SUBMIT_BUTTON_ELEMENT.click();
		
	}
	
	public void verifyAccountCreated() {
		Assert.assertTrue(ACCOUNT_CREATED_ELEMENT.isDisplayed());
	}
	
	public void verifyAddNewAccountPage() {
		Assert.assertTrue(ADD_NEW_ACCOUNT_HEADER_ELEMENT.isDisplayed());
		
	}
}
