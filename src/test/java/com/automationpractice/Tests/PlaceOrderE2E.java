package com.automationpractice.Tests;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.automationpractice.Pages.AddProductsInCart;
import com.automationpractice.Pages.CreateAccountPage;
import com.automationpractice.Pages.OrderHistoryPage;
import com.automationpractice.Pages.PlaceOrderPage;
import com.automationpractice.Pages.SignInPage;
import com.automationpractice.Tests.*;


import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class PlaceOrderE2E extends BaseTest {

	@BeforeClass
	public void launchApp() throws IOException
	{
		if(driver==null)
		{
			openURL();
		}
	}
	
	@Test
	public void CreateLeadE2E()
	{
		logger=extent.startTest("Place order End to End flow");
		logger.log(LogStatus.PASS, "Navigated to Automation practice Home page");
		SignInPage sp=new SignInPage(driver);
		sp.login();
		logger.log(LogStatus.PASS, "Registration done Sucessfully");
		CreateAccountPage ca = new CreateAccountPage(driver);
		logger.log(LogStatus.PASS, "Navigated to Create Account page");
		ca.CreateNewUser();
		logger.log(LogStatus.PASS, "New user account has been created successfully");
		AddProductsInCart apc=new AddProductsInCart(driver);
		apc.addProduct();
		logger.log(LogStatus.PASS, "Product added successfully in Cart");
		PlaceOrderPage po=new PlaceOrderPage(driver);
		po.placeOrder();
		logger.log(LogStatus.PASS, "Order placed");
		po.VerifyConfirmationPageAmount();
		logger.log(LogStatus.PASS, "Confimation page amount matched");
		po.VerifyOrderConfirmationPageAmount();
		logger.log(LogStatus.PASS, "Order Confimation page amount matched");
		po.VerifyPaymentPageAmount();
		logger.log(LogStatus.PASS, "payment page amount matched");
		OrderHistoryPage oh=new OrderHistoryPage(driver);
		oh.VerifyAmountInOrderHistory();
		logger.log(LogStatus.PASS, "Amount matched in Order histoy page");
		
		
	}
	@AfterClass
	public void CloseApp()
	{
		
		
		driver.quit();
		
	
	}
}
