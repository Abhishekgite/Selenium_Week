package com.Resources;

import java.time.Duration;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

public class commonMethods {

	public static void handleAssertions(String actualResult, String expectedResult) {

		SoftAssert sa = new SoftAssert();

		sa.assertEquals(actualResult, expectedResult);

		sa.assertAll();

	}

	public static void putExplicitWait(WebDriver driver, int sec, WebElement element) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(sec));

		wait.until(ExpectedConditions.elementToBeClickable(element));

	}

}
