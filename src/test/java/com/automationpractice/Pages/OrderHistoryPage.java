package com.automationpractice.Pages;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderHistoryPage {
	
	private WebDriver driver;
	public OrderHistoryPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}

	@FindBy(xpath="//a[@title='View my customer account']")
	WebElement link_myAccount;
	@FindBy(xpath="//a[@href='http://automationpractice.com/index.php?controller=history' and @title='Orders']")
	WebElement btn_orderHistory;
	@FindBy(xpath="//div[@id='block-history']/table/tbody")
	WebElement btn_orderHistoryTable;
	
	public boolean VerifyAmountInOrderHistory()
	{
		link_myAccount.click();
		btn_orderHistory.click();
		List<WebElement> rows=btn_orderHistoryTable.findElements(By.tagName("tr"));
    	int rows_count = rows.size();
    	for (int row = 0; row < rows_count; row++) 
    	{
    	    List < WebElement > Columns_row = rows.get(row).findElements(By.tagName("td"));
    	    int columns_count = Columns_row.size();
    	    System.out.println("Number of cells In Row " + row + " are " + columns_count);
    	
    	for (int column = 0; column < columns_count; column++) 
    	{
	        // To retrieve text from that specific cell.
	        String celtext = Columns_row.get(column).getText();
	        System.out.println("Cell Value of row number " + row + " and column number " + column + " Is " + celtext);
    	}
		
    	}
    	return true;
	}
	
	
	/*
	 * String str="- Do not forget to insert your order reference XCWMOBQBT in the subject of your bank wire.";
	 * String str1=str.trim(); 
	 * System.out.println(str1); 
	 * String str2=str.substring(46, 56); 
	 * System.out.println(str2);
	 */

}
