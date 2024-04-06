package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageObject {

	public WebDriver driver; // WebDriver is declared globally and it is declared as null

	private By myAccount = By.xpath("//i[@class='fa fa-user']");

	private By register = By.xpath("//a[contains(text(),'Register')]");

	private By Login = By.xpath("//a[contains(text(),'Login')]");

	// driver 2 took the scope of driver from register test cases class

	public HomePageObject(WebDriver driver2) {

		// TODO Auto-generated constructor stub

		this.driver = driver2;
	}

	public WebElement clickonMyAccount() {

		return driver.findElement(myAccount);
	}

	public WebElement clickonregister() {

		return driver.findElement(register);
	}

	public WebElement clickonLogin() {

		return driver.findElement(Login);
	}

}
