package steps;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AddNewAccountPage;
import pages.Base;
import pages.DashboardPage;
import pages.DataBasePage;
import pages.LoginPage;





public class StepDefination extends Base {

	LoginPage loginPage;
	DashboardPage dashboardPage;
	AddNewAccountPage addNewAccountPage;
	DataBasePage dataBasePage;
	@Before
	public void beforeRun() {
		init();
		loginPage = PageFactory.initElements(driver, LoginPage.class);
		dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
		addNewAccountPage = PageFactory.initElements(driver, AddNewAccountPage.class);
		dataBasePage = new DataBasePage();
	}

	@Given("^user is in techfios login page$")
	public void user_is_in_techfios_login_page() throws Throwable {
		getUrl();
	}

	@When("^user enters valid username as \"([^\"]*)\" and password as \"([^\"]*)\"$")
	public void user_enters_valid_and(String arg1, String arg2) throws Throwable {
		loginPage.enterUserName(arg1);
		loginPage.enterPassword(arg2);
	}

	@When("^user click on \"([^\"]*)\"$")
	public void user_click_on(String data) throws Throwable {

		switch (data) {

		case "Login":
			loginPage.clickSignInButton();
			break;
		case "Bank and Cash":
			dashboardPage.clickBankAndCASH();
			break;
		case "Add new Account":
			dashboardPage.clickNewAccount();
		case "Submit":
			addNewAccountPage.clickSubmit();
		}

	}

	@Then("^user lands on Dashbord page$")
	public void user_lands_on_Dashbord_page() throws Throwable {
		dashboardPage.verifyDashboardPage();
	}

	

	@Then("^user lands on Add new account page$")
	public void user_lands_on_Add_new_account_page() throws Throwable {
		addNewAccountPage.verifyAddNewAccountPage();
	}

	@Then("^user enters \"([^\"]*)\" as Acount Title in Add New Account page$")
	public void user_enters_as_Acount_Title_in_Add_New_Account_page(String title) throws Throwable {
		addNewAccountPage.enterAcountTitle(title+randomNumber(99));
	}

	@Then("^user enters \"([^\"]*)\" as Description in Add New Account page$")
	public void user_enters_as_Description_in_Add_New_Account_page(String description) throws Throwable {
		addNewAccountPage.enterDescription(description);
	}

	@Then("^user enters \"([^\"]*)\" as Initial Balance in Add New Account page$")
	public void user_enters_as_Initial_Balance_in_Add_New_Account_page(String balance) throws Throwable {
		addNewAccountPage.enterInitialBalance(balance);
	}

	@Then("^user enters \"([^\"]*)\" as Account Number in Add New Account page$")
	public void user_enters_as_Account_Number_in_Add_New_Account_page(String accNumber) throws Throwable {
		addNewAccountPage.enterAccountNumber(accNumber);
	}

	@Then("^user enters \"([^\"]*)\" as Contact Person in Add New Account page$")
	public void user_enters_as_Contact_Person_in_Add_New_Account_page(String person) throws Throwable {
		addNewAccountPage.enterContactPerson(person);
	}

	@Then("^user enters \"([^\"]*)\" as Phone in Add New Account page$")
	public void user_enters_as_Phone_in_Add_New_Account_page(String phone) throws Throwable {
		addNewAccountPage.enterPhone(phone);
	}

	@Then("^user enters \"([^\"]*)\" as Internet Banking URL in Add New Account page$")
	public void user_enters_as_Internet_Banking_URL_in_Add_New_Account_page(String url) throws Throwable {
		addNewAccountPage.enterInternetBankingUrl(url);
	}

	

	@Then("^user should be able to verify new account created sucessfully$")
	public void user_should_be_able_to_verify_new_account_created_sucessfully() throws Throwable {
		addNewAccountPage.verifyAccountCreated();
		Thread.sleep(2000);
		takeScreenShot();
		
	}

	@Given("user is on Techfios Database Page")
	public void user_is_on_Techfios_Database_Page() {
		getUrl();
	}

	@Given("user put {string} in username field")
	public void user_put_in_username_field(String string) {
	   loginPage.enterUserName(dataBasePage.getData("username"));
	}

	@Given("user put {string} in password field")
	public void user_put_in_password_field(String string) {
	   loginPage.enterPassword(dataBasePage.getData("password"));
	}

	@When("user click on login button")
	public void user_click_on_login_button() {
		loginPage.clickSignInButton();
	}

	@Then("user lands on Dashboard Page")
	public void user_lands_on_Dashboard_Page() throws InterruptedException, IOException {
		Thread.sleep(2000);
		dashboardPage.verifyDashboardPage();
		takeScreenShot();
	}

	@After
	public void afterRun() {
		tearDown();
		
	}
	
}
