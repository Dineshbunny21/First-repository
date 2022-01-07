package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.sample.BaseClass;

public class HotelSearch extends BaseClass {
	
	public HotelSearch() {

		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="location")

	private WebElement ddnlocation;
	
	@FindBy(id="hotels")
	
	private WebElement ddnhotel;
	
	@FindBy(id="room_type")
	
	private WebElement ddnroomtype;
	
	@FindBy(id="room_nos")
	
	private WebElement ddnroomno;
	
	@FindBy(id="datepick_in")
	
	private WebElement txtdatein;
	
	@FindBy(id="datepick_out")
	
	private WebElement txtdateout;
	
	@FindBy(id="adult_room")
	
	private WebElement ddnadultroom;
	
	@FindBy(id="child_room")
	
	private WebElement ddnchildroom;
	
	@FindBy(id="Submit")
	
	private WebElement btnsearch;

	public WebElement getTxtlocation() {
		return ddnlocation;
	}

	public WebElement getTxthotel() {
		return ddnhotel;
	}

	public WebElement getTxtroomtype() {
		return ddnroomtype;
	}

	public WebElement getTxtroomno() {
		return ddnroomno;
	}

	public WebElement getTxtdatein() {
		return txtdatein;
	}

	public WebElement getTxtdateout() {
		return txtdateout;
	}

	public WebElement getTxtadultroom() {
		return ddnadultroom;
	}

	public WebElement getTxtchildroom() {
		return ddnchildroom;
	}

	public WebElement getBtnsearch() {
		return btnsearch;
	}
	
	public void searchhotels(String location,String hotel,String roomtype,String noofrooms,String adultroom,String childroom) {
		
		selectOptionsByText(ddnlocation, location);
		selectOptionsByText(ddnhotel, hotel);
		selectOptionsByText(ddnroomtype, roomtype);
		selectOptionsByText(ddnroomno, noofrooms);
		selectOptionsByText(ddnadultroom, adultroom);
		selectOptionsByText(ddnchildroom, childroom);
		click(getBtnsearch());
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}

