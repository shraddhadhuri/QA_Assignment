package com.automationpractice.Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddProductsInCart {

	private WebDriver driver;
	public AddProductsInCart(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="fancybox-frame1594752411546")
	WebElement frm_id;
	@FindBy(xpath="//a[@href='http://automationpractice.com/index.php?id_category=3&controller=category' and @title='Women' ]")
	WebElement link_women;
	@FindBy(xpath="//a[@href='http://automationpractice.com/index.php?id_product=1&controller=product']")
	List<WebElement> link_quickView;//6
	@FindBy(xpath="//a[@class='btn btn-default button-plus product_quantity_up']")
	WebElement btn_plusIcon;
	@FindBy(xpath="//span[text()='Add to cart']")
	List<WebElement> btn_AddToCart;//7
	
	
	public void addProduct()
	{
		link_women.click();
		link_quickView.get(6).click();
		driver.switchTo().frame(frm_id);
		btn_plusIcon.click();
		btn_AddToCart.get(7).click();
	}
}
