package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterationPageObject {

	public WebDriver driver; // WebDriver is declared globally and it is declared as null

	private By firstname = By.xpath("//input[@name='firstname']");

	private By lastname = By.xpath("//input[@name='lastname']");

	private By email = By.xpath("//input[@name='email']");

	private By telephone = By.xpath("//input[@name='telephone']");

	private By password = By.xpath("//input[@name='password']");

	private By passwordconfirm = By.xpath("//input[@name='confirm']");

	private By subscribe = By.xpath("(//input[@name='newsletter'])[2]");

	private By privacyPolicy = By.xpath("//input[@name='agree']");

	private By continueButton = By.xpath("//input[@value='Continue']");

	private By firstNameErrorMsg = By.xpath("(//div[@class='text-danger'])[1]");

	private By lastNameErrorMsg = By.xpath("(//div[@class='text-danger'])[2]");

	// driver 2 took the scope of driver from register test cases class

	public RegisterationPageObject(WebDriver driver2) {

		this.driver = driver2;
	}

	public WebElement EnterFirstname() {

		return driver.findElement(firstname);
	}

	public WebElement EnterLastname() {

		return driver.findElement(lastname);
	}

	public WebElement EnterEmail() {

		return driver.findElement(email);
	}

	public WebElement EnterTelephone() {

		return driver.findElement(telephone);
	}

	public WebElement EnterPassword() {

		return driver.findElement(password);
	}

	public WebElement EnterPasswordConfirm() {

		return driver.findElement(passwordconfirm);
	}

	public WebElement ClickOnSubscribe() {

		return driver.findElement(subscribe);
	}

	public WebElement AcceptPrivacyPolicy() {

		return driver.findElement(privacyPolicy);
	}

	public WebElement ClickOnContinueButton() {

		return driver.findElement(continueButton);
	}

	public WebElement CaptureFirstNameErrorMsg() {

		return driver.findElement(firstNameErrorMsg);
	}

	public WebElement CaptureLastNameErrorMsg() {

		return driver.findElement(lastNameErrorMsg);
	}
}
