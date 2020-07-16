package com.automationpractice.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {
	
	private WebDriver driver;
	public SignInPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="email_create")
   WebElement txt_EmailID;
   @FindBy(xpath="//button[@id='SubmitCreate']")
   WebElement btn_CreateAccount;
	
	
	public void login()
	{
		txt_EmailID.sendKeys("");
		btn_CreateAccount.click();
	}
	
	

}
