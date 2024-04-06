package com.Resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

public class baseClass2 {

	public static WebDriver driver;

	public Properties prop;

	public void intializeDriver() throws IOException, InterruptedException {

		// To read the data from properties file
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\main\\java\\com\\Resources\\data.properties");

		// To access the properties file
		prop = new Properties();
		prop.load(fis);

		String broswerName = prop.getProperty("broswer");

		if (broswerName.equalsIgnoreCase("chrome")) {

			driver = new ChromeDriver();
		}

		else if (broswerName.equalsIgnoreCase("firefox")) {

			driver = new FirefoxDriver();
		}

		else if (broswerName.equalsIgnoreCase("EdgeDriver")) {

			driver = new EdgeDriver();

		}
	}
		
		@BeforeSuite
		public void ExtentReport() {
			
			extendManager.setup();
		}
		
		@AfterSuite
		public void endReport() {
			
			extendManager.endReport();
		}
		
	

	@BeforeClass
	public void launchBroswer() throws IOException, InterruptedException {

		intializeDriver();

		driver.get(prop.getProperty("url"));

	}
	
	// To take the ScreenShot and store in one folder 
	
//	public static String screenshot(WebDriver driver , String filename) {
//		
//		String dateName= new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
//		TakesScreenshot takeScreenshot = (TakesScreenshot) driver;
//		File source = takeScreenshot.getScreenshotAs(OutputType.FILE);
//		String  destination = System.getProperty("user.dir")+"\\ScreenShot\\" +filename +" "+dateName +".png";
//		File finalDestination = new File(destination);
//		
//		try {
//			FileUtils.copyFile(source, finalDestination);
//			
//		} catch (Exception e) {
//			
//			e.getMessage();
//				
//		}
//		return destination;
//	}

	public String generateRandomEmail() {

		return System.currentTimeMillis() + "@gmail.com";
	}
}
