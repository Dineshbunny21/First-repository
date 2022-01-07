package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.sample.BaseClass;

public class SelectHotel extends BaseClass{
	
	public SelectHotel() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(id="radiobutton_0")
	
	private WebElement radiobtn;
	
	@FindBy(id="continue")
	
	private WebElement btncontinue;

	public WebElement getRadiobtn() {
		return radiobtn;
	}

	public WebElement getBtncontinue() {
		return btncontinue;
	}
	
	public void selecthotels() {
		
		click(radiobtn);
		click(btncontinue);
		
	}
	
	
	
}
