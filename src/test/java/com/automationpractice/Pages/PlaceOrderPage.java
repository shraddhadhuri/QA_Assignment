package com.automationpractice.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PlaceOrderPage {
	private WebDriver driver;
	public PlaceOrderPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[@id='total_price']")
	WebElement txt_expTotalPrice;
	@FindBy(xpath="//a[@href='http://automationpractice.com/index.php?controller=order' and @title='Proceed to checkout']")
	WebElement btn_checkout;
	@FindBy(name="processAddress")
	WebElement btn_addCheckout;
	@FindBy(id="cgv")
	WebElement chkbox_termsOfServices;
	@FindBy(name="processCarrier")
	WebElement btn_shippingCheckout;
	@FindBy(id="total_price")
	WebElement txt_actTotalPrice;
	@FindBy(xpath="//a[contains(text(),'Pay by bank')]")
	WebElement btn_paymentOption;
	@FindBy(id="amount")
	WebElement txt_amount;
	@FindBy(xpath="//*[text()='I confirm my order']")
	WebElement btn_confirmOrder;
	@FindBy(xpath="//span[@class='price']")
	WebElement txt_finalPrice;
	@FindBy(xpath="//*[@id=\"center_column\"]/div/text()[6]")
	WebElement txt_orderRef;
	
	
	public void placeOrder()
	{
		btn_checkout.click();
		btn_checkout.click();
		btn_addCheckout.click();
		chkbox_termsOfServices.click();
		btn_shippingCheckout.click();
		btn_paymentOption.click();
		btn_confirmOrder.click();
		
	}
	
	public boolean VerifyPaymentPageAmount()
	{
		if(txt_expTotalPrice.getText().equals(txt_actTotalPrice.getText()))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public boolean VerifyConfirmationPageAmount()
	{
		if(txt_expTotalPrice.getText().equals(txt_amount.getText()))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public boolean VerifyOrderConfirmationPageAmount()
	{
		if(txt_expTotalPrice.getText().equals(txt_finalPrice.getText()))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	
	
	
	
	
	
	

}
