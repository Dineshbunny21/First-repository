package com.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.sample.BaseClass;

public class BookingIdPage extends BaseClass {
	
	public BookingIdPage() {

		PageFactory.initElements(driver, this);
	}

	
	@FindBy(id="order_no")
	
	private WebElement getorderid;
	
	@FindBy(id="my_itinerary")

	private WebElement btnitinery;

	public WebElement getTxtorderid() {
		return getorderid;
	}

	public WebElement getBtnitinery() {
		return btnitinery;
	}
	
	public BookingIdPage(String path, String sheetname,int rowno,int cellno,WebElement element) throws IOException {

		String oderid = getAttributeValue(getorderid);
		
		outData("D:\\Pradeep\\ECLIPS\\eclipse\\MavenFirstProject\\ExcellSam\\Adactinhotel.xlsx", "Data", 1, 16, oderid);
		click(btnitinery);
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
