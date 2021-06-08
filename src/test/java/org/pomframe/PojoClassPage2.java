package org.pomframe;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PojoClassPage2 extends BaseClass{
	
	public PojoClassPage2() {
		
		PageFactory.initElements(driver, this);
	}
	
	@CacheLookup
	@FindAll({
		
		@FindBy(xpath="//select[@id='location']"),
		@FindBy(xpath="//select[@name='location']")

})
	private WebElement roomLocation;
	
	@CacheLookup
	@FindAll({
		
		@FindBy(xpath="//select[@id='hotels']"),
		@FindBy(xpath="//select[@name='hotels']")

})
	private WebElement hotelName;
	
	@CacheLookup
	@FindAll({
		
		@FindBy(xpath="//select[@name='room_type']"),
		@FindBy(xpath="//select[@name='hotels']")

})
	private WebElement roomType;
	
	@CacheLookup
	@FindAll({
		
		@FindBy(xpath="//select[@id='room_nos']"),
		@FindBy(xpath="//select[@name='room_nos']"),

	})
	private WebElement roomNo;
	
	@CacheLookup
	@FindAll({
		
		@FindBy(xpath="//input[@id='datepick_in']"),
		@FindBy(xpath="//input[@name='datepick_in']"),

	})
	private WebElement checkIn;
	
	@CacheLookup
	@FindAll({
		
		@FindBy(xpath="//input[@id='datepick_out']"),
		@FindBy(xpath="//input[@name='datepick_out']"),

	})
	private WebElement checkOut;
	
	@CacheLookup
	@FindAll({
		
		@FindBy(xpath="//select[@id='adult_room']"),
		@FindBy(xpath="//select[@class='search_combobox']"),

	})
	private WebElement adultRoom;
	
	@CacheLookup
	@FindAll({
		
		@FindBy(xpath="//select[@id='child_room']"),
		@FindBy(xpath="//select[@name='child_room']"),

	})
	private WebElement childRoom;
	
	@CacheLookup
	@FindAll({
		
		@FindBy(xpath="//input[@id='Submit']"),
		@FindBy(xpath="//input[@name='Submet']"),

	})
	private WebElement searchBtn;

	public WebElement getRoomLocation() {
		return roomLocation;
	}

	public WebElement getHotelName() {
		return hotelName;
	}

	public WebElement getRoomType() {
		return roomType;
	}

	public WebElement getRoomNo() {
		return roomNo;
	}

	public WebElement getCheckIn() {
		return checkIn;
	}

	public WebElement getCheckOut() {
		return checkOut;
	}

	public WebElement getAdultRoom() {
		return adultRoom;
	}

	public WebElement getChildRoom() {
		return childRoom;
	}

	public WebElement getSearchBtn() {
		return searchBtn;
	}
	
}