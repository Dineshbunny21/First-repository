package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.sample.BaseClass;

public class BookingCancel extends BaseClass {
	
	public BookingCancel() {

		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[text()='Booked Itinerary']")
		
	private WebElement itenarybtn;
	
	@FindBy(xpath="//input[contains(@id,'btn_id_')]")
	
	private WebElement btncancelclick;
	
	@FindBy(id="search_result_error")
	
	private WebElement txterror;

	public WebElement getItenarybtn() {
		return itenarybtn;
	}

	public WebElement getBtncancelclick() {
		return btncancelclick;
	}

	public WebElement getTxterror() {
		return txterror;
	}
	
	public void bookcancel() {
		
		click(itenarybtn);
		click(btncancelclick);
		alertAccept();
		getText(getTxterror());
		System.out.println(getText(getTxterror()));

	}
	
	
		
	}

	
	
	
	
