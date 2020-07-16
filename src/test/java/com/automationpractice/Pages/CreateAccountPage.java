package com.automationpractice.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountPage {
	private WebDriver driver;
	public CreateAccountPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="uniform-id_gender2")
	WebElement rdbtn_title;
	@FindBy(id="customer_firstname")
	WebElement txt_CustfirstName;
	@FindBy(id="customer_lastname")
	WebElement txt_CustlastName;
	@FindBy(id="passwd")
	WebElement txt_password;
	@FindBy(id="uniform-days")
	WebElement dropdwn_days;
	@FindBy(id="uniform-months")
	WebElement dropdwn_months;
	@FindBy(id="uniform-years")
	WebElement dropdwn_years;
	@FindBy(id="optin")
	WebElement chkbox_option;
	@FindBy(id="firstname")
	WebElement txt_firstName;
	@FindBy(id="lastname")
	WebElement txt_lastName;
	@FindBy(id="company")
	WebElement txt_company;
	@FindBy(id="address1")
	WebElement txt_address1;
	@FindBy(id="address2")
	WebElement txt_address2;
	@FindBy(id="city")
	WebElement txt_city;
	@FindBy(id="id_state")
	WebElement drpdown_state;
	@FindBy(id="postcode")
	WebElement txt_postCode;
	@FindBy(id="other")
	WebElement txt_other;
	@FindBy(id="phone")
	WebElement txt_phone;
	@FindBy(id="phone_mobile")
	WebElement txt_PhMobile;
	@FindBy(id="alias")
	WebElement txt_alias;
	@FindBy(xpath="//button[@id='submitAccount']")
	WebElement btn_submit;
	
	
	public void CreateNewUser()
	{
		rdbtn_title.clear();
		rdbtn_title.click();
		txt_CustfirstName.clear();
		txt_CustfirstName.sendKeys("Test");
		txt_CustlastName.clear();
		txt_CustlastName.sendKeys("Test1");
		txt_password.clear();
		txt_password.sendKeys("Password123");
		dropdwn_days.clear();
		Select dropdown = new Select(dropdwn_days);  
		dropdown.selectByVisibleText("29");
		dropdwn_months.clear();
		Select dropdown1 = new Select(dropdwn_months);  
		dropdown.selectByVisibleText("January");
		dropdwn_years.clear();
		Select dropdown2 = new Select(dropdwn_years);  
		dropdown.selectByVisibleText("1995");
		chkbox_option.click();
		txt_firstName.clear();
		txt_firstName.sendKeys("Seeta");
		txt_lastName.clear();
		txt_lastName.sendKeys("seth");
		txt_company.clear();
		txt_company.sendKeys("Explore LTD");
		txt_address1.clear();
		txt_address1.sendKeys("M.G.Road");
		txt_address2.clear();
		txt_address2.sendKeys("Karve Nagar");
		txt_city.clear();
		txt_city.sendKeys("Pune");
		drpdown_state.clear();
		Select dropdown3 = new Select(drpdown_state);  
		dropdown.selectByIndex(1);
		txt_postCode.clear();
		txt_postCode.sendKeys("400709");
		txt_other.clear();
		txt_other.sendKeys("NA");
		txt_phone.clear();
		txt_phone.sendKeys("02227667897");
		txt_PhMobile.clear();
		txt_PhMobile.sendKeys("8686868686");
		txt_alias.clear();
		txt_alias.sendKeys("test@gmail.com");
		btn_submit.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
