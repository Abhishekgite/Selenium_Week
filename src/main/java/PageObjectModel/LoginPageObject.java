package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObject {

	public WebDriver driver; // WebDriver is declared globally and it is declared as null

	private By email = By.xpath("//input[@name='email']");

	private By password = By.xpath("//input[@name='password']");

	private By Login = By.xpath("//input[@value='Login']");

	// driver 2 took the scope of driver from register test cases class

	public LoginPageObject(WebDriver driver2) {

		// TODO Auto-generated constructor stub

		this.driver = driver2;
	}

	public WebElement enteremail() {

		return driver.findElement(email);
	}

	public WebElement enterpassword() {

		return driver.findElement(password);
	}

	public WebElement clickonLogin() {

		return driver.findElement(Login);
	}

}
