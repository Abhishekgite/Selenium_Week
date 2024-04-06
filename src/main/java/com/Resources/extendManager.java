		package com.Resources;
		
		import com.aventstack.extentreports.ExtentReports;
		import com.aventstack.extentreports.ExtentTest;
		import com.aventstack.extentreports.reporter.ExtentSparkReporter;
		import com.aventstack.extentreports.reporter.configuration.Theme;
		
		public class extendManager {
			
			public static ExtentSparkReporter htmlReporter;  //responsible to look 
			public static ExtentReports extent;  // Respossible for entries
			public static ExtentTest test;   // Respossible for test status pass/fail 
			
			public static void setup() {
			
				// Path of the extend report project
				
			 htmlReporter= new ExtentSparkReporter(System.getProperty("user.dir")+	"/test-output/myReport.html");  
						
			htmlReporter.config().setDocumentTitle("Automation Report"); // Title of the Report 
			htmlReporter.config().setReportName("Functional Report");  // Name of the Title Bar 
			htmlReporter.config().setTheme(Theme.STANDARD);  // Color of the Webpage 
					
			extent = new ExtentReports();   // Responsible for entering the details in the report 
			extent.attachReporter(htmlReporter); 
			extent.setSystemInfo("hostname", "LocalHost");
			extent.setSystemInfo("os", "window8.1");
			extent.setSystemInfo("browserName", "Chrome");
			extent.setSystemInfo("testname", "Selenium-Extend-Report");
					
			}
			
			public static void endReport() {
				extent.flush();
			}
		
		}
