package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//input[@id='username']")
	WebElement USERNAME_FIELD_ELEMENT;

	@FindBy(how = How.XPATH, using = "//input[@id='password']")
	WebElement PASSWARD_FIELD_ELEMENT;
	@FindBy(how = How.XPATH, using = "//button[@name='login']")
	WebElement SignInButton;

	// Methods to interact with the elements
	public void enterUserName(String userName) {
		USERNAME_FIELD_ELEMENT.sendKeys(userName);
	}

	public void enterPassword(String password) {
		PASSWARD_FIELD_ELEMENT.sendKeys(password);
	}

	public void clickSignInButton() {
		SignInButton.click();
	}

	public String getPageTitle() {
		return driver.getTitle();
	}
}
