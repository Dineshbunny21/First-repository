package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.sample.BaseClass;

public class BookAHotel extends BaseClass {
	
	public BookAHotel() {

		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="first_name")

	private WebElement txtfirstname;
	
	@FindBy(id="last_name")
	
	private WebElement txtlastname;
	
	@FindBy(id="address")
	
	private WebElement txtaddress;
	
	@FindBy(id="cc_num")
	
	private WebElement txtcreditno;
	
    @FindBy(id="cc_type")
	
	private WebElement ddncreditcard;
	
@FindBy(id="cc_exp_month")
	
	private WebElement ddnmonth;
	
	@FindBy(id="cc_exp_year")
	
	private WebElement ddnyear;
	
	@FindBy(id="cc_cvv")

	private WebElement txtcvv;
	
	@FindBy(id="book_now")
	
	private WebElement btnbook;

	public WebElement getTxtfirstname() {
		return txtfirstname;
	}

	public WebElement getTxtlastname() {
		return txtlastname;
	}

	public WebElement getTxtaddress() {
		return txtaddress;
	}

	public WebElement getTxtcreditno() {
		return txtcreditno;
	}

	public WebElement getDdncreditcard() {
		return ddncreditcard;
	}

	public WebElement getDdnmonth() {
		return ddnmonth;
	}

	public WebElement getDdnyear() {
		return ddnyear;
	}

	public WebElement getTxtcvv() {
		return txtcvv;
	}

	public WebElement getBtnbook() {
		return btnbook;
	}
	
	public void bookhotel(String firstname,String lastname,String address,String cardno,String cardtype,String month,String year,String cvv) {
		
		type(txtfirstname, firstname);
		type(txtlastname, lastname);
		type(txtaddress, address);
		type(txtcreditno, cardno);
		selectOptionsByText(ddncreditcard, cardtype);
		selectOptionsByText(ddnmonth, month);
		selectOptionsByText(ddnyear, year);
		type(txtcvv, cvv);
		click(getBtnbook());
		
		
		
	}

	}
	
	
	
	
	
	
	
	
	
	
	

