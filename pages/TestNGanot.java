package com.pages;

import java.io.IOException;

import org.sample.BaseClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNGanot extends BaseClass {

	
	@BeforeClass
	public static void beforeclass() throws InterruptedException {

		getDriver();
		loadUrl("https://adactinhotelapp.com/");
		waitUrl();
	}
	
	@Test
	public void bookin() throws IOException {

		LoginPage loginpage = new LoginPage();
		loginpage.loadlogin(getData("Data", 1, 0), getData("Data", 1, 1));
	
		HotelSearch hotelsearch = new HotelSearch();
		hotelsearch.searchhotels(getData("Data", 1, 2), getData("Data", 1, 3), getData("Data", 1, 4), getData("Data", 1, 5), getData("Data", 1, 6), getData("Data", 1, 7));
		
		SelectHotel selecthotel = new SelectHotel();
		selecthotel.selecthotels();
		
		BookAHotel bookhotel = new BookAHotel();
		bookhotel.bookhotel(getData("Data", 1, 8), getData("Data", 1, 9), getData("Data", 1, 10), getData("Data", 1, 11), getData("Data", 1, 12), getData("Data", 1, 13), getData("Data", 1, 14), getData("Data", 1, 15));
		
		BookingCancel bookcancel = new BookingCancel();
		bookcancel.bookcancel();
		
	}
	
	@AfterClass
	
		public static void Afterclass() {
			
			driver.close();
		}
	
	
}
