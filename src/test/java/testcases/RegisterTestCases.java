package testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.Resources.baseClass2;
import com.Resources.commonMethods;
import com.Resources.constants;

import PageObjectModel.HomePageObject;
import PageObjectModel.RegisterationPageObject;

public class RegisterTestCases extends baseClass2 {

	public static String randomEmail = "";

	@Test
	public void verifyRegisterationWithBlankData() throws IOException, InterruptedException {

		HomePageObject hpo = new HomePageObject(driver);

		commonMethods.putExplicitWait(driver, 10, hpo.clickonMyAccount());

		hpo.clickonMyAccount().click();
		hpo.clickonregister().click();

		RegisterationPageObject rop = new RegisterationPageObject(driver);

		rop.EnterFirstname().clear();
		rop.EnterFirstname().sendKeys("");
		rop.EnterLastname().clear();
		rop.EnterLastname().sendKeys("");

		rop.EnterEmail().clear();
		rop.EnterEmail().sendKeys("");

		rop.EnterTelephone().sendKeys("");
		rop.EnterPassword().sendKeys("");
		rop.EnterPasswordConfirm().sendKeys("");
		rop.ClickOnSubscribe().click();
		rop.AcceptPrivacyPolicy().click();
		rop.ClickOnContinueButton().click();

		commonMethods.handleAssertions(rop.CaptureFirstNameErrorMsg().getText(), constants.firstNameErrorMsg);

		commonMethods.handleAssertions(rop.CaptureLastNameErrorMsg().getText(), constants.lastNameErrorMsg);
	}

	@Test(dependsOnMethods = "verifyRegisterationWithBlankData")
	public void verifyRegisterationWithInValidData() throws IOException, InterruptedException {

		randomEmail = generateRandomEmail();
		RegisterationPageObject rop = new RegisterationPageObject(driver);

		commonMethods.putExplicitWait(driver, 10, rop.EnterFirstname());

		rop.EnterFirstname().clear();
		rop.EnterFirstname().sendKeys(constants.firstname);
		rop.EnterLastname().sendKeys(constants.lastname);

		rop.EnterEmail().sendKeys(randomEmail);

		rop.EnterTelephone().sendKeys(constants.telephone);
		rop.EnterPassword().sendKeys(constants.password);
		rop.EnterPasswordConfirm().sendKeys(constants.confirmpassword);
		rop.ClickOnSubscribe().click();
		rop.ClickOnContinueButton().click();

		commonMethods.handleAssertions(driver.getCurrentUrl(), constants.successURL);

	}

}
