package com.automationpractice.Tests;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;

import com.automationpratice.common.*;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
public class BaseTest {
	
	public static WebDriver driver;
	public static ExtentReports extent;
	public static ExtentTest logger;
	public static Properties prop;
	public static FileInputStream fis;
	
	public  void openURL()
	{
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/chromedriver_83.exe");
		driver=new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
	}
	
	@BeforeSuite
	public void reporting()
	{
		String file=GenericMethods.getFileName();
		extent=new ExtentReports(System.getProperty("user.dir")+"\\src\\test\\java\\com\\automationpractice\\Reports\\AutomationPractiveextent_"+file+".html");
		
	}
	
	@AfterTest
	public void flushReport()
	{
	
		extent.endTest(logger);
		extent.flush();
	}


}
