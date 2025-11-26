package org.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotel extends Baseclass {

	public SearchHotel() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "location")
	private WebElement Location;
	@FindBy(id = "hotels")
	private WebElement Hotels;
	@FindBy(id = "room_type")
	private WebElement Roomtype;
	@FindBy(id = "room_nos")
	private WebElement noofrooms;
	@FindBy(id = "datepick_in")
	private WebElement checkindate;
	@FindBy(id = "datepick_out")
	private WebElement checkoutdate;
	@FindBy(id = "adult_room")
	private WebElement adultperroom;
	@FindBy(id = "Submit")
	private WebElement submit;

	public WebElement getLocation() {
		return Location;
	}

	public WebElement getSubmit() {
		return submit;
	}

	public WebElement getHotels() {
		return Hotels;
	}

	public WebElement getRoomtype() {
		return Roomtype;
	}

	public WebElement getNoofrooms() {
		return noofrooms;
	}

	public WebElement getCheckindate() {
		return checkindate;
	}

	public WebElement getCheckoutdate() {
		return checkoutdate;
	}

	public WebElement getAdultperroom() {
		return adultperroom;
	}

	public void searchhotels(String location, String hotels, String room) {
		selectbyindex(Location, location);
		selectbyindex(Hotels, hotels);
		sendkeys(Roomtype, room);
	}

	public void searchhotels2(String norooms, String datein, String dateout, String adultRoom) {

		sendkeys(noofrooms, norooms);
		sendkeys(checkindate, datein);
		sendkeys(checkoutdate, dateout);
		sendkeys(adultperroom, adultRoom);
		click(submit);
	}

}
