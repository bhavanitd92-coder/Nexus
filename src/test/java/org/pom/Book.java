package org.pom;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.stepdefinition.Stepdefinition;

import gherkin.ast.DataTable;

public class Book extends Baseclass {
	public Book() {
PageFactory.initElements(driver, this);
}

	@FindBy(id = "first_name")
	private WebElement Firstname;
	
	@FindBy(id = "last_name")
	private WebElement Lastname;
	@FindBy(id = "address")
	private WebElement Billaddress;
	@FindBy(id = "cc_num")
	private WebElement cardno;
	@FindBy(id = "cc_type")
	private WebElement cardtype;
	@FindBy(id = "cc_exp_month")
	private WebElement expmon;
	@FindBy(id = "cc_exp_year")
	private WebElement expyear;
	@FindBy(id = "cc_cvv")
	private WebElement cvvno;
	@FindBy(id = "book_now")
	private WebElement Booknow;
	@FindBy(id="order_no")
	private WebElement orderid;
	@FindBy(xpath="//a[text()='Booked Itinerary']")
	private WebElement orderhis;

	public WebElement getOrderhis() {
		return orderhis;
	}

	public WebElement getOrderid() {
		return orderid;
	}

	public WebElement getFirstname() {
		return Firstname;
	}

	public WebElement getLastname() {
		return Lastname;
	}

	public WebElement getBilladdress() {
		return Billaddress;
	}

	public WebElement getCardno() {
		return cardno;
	}

	public WebElement getCardtype() {
		return cardtype;
	}

	public WebElement getExpmon() {
		return expmon;
	}

	public WebElement getExpyear() {
		return expyear;
	}

	public WebElement getCvvno() {
		return cvvno;
	}

	public WebElement getBooknow() {
		return Booknow;
	}

	public void bookingdata(String firstname, String lastname, String address,io.cucumber.datatable.DataTable dataTable) {
		sendkeys(Firstname, firstname);
		sendkeys(Lastname, lastname);
		sendkeys(Billaddress, address);
		
		List<Map<String, String>> asMaps = dataTable.asMaps();
		Map<String, String> map = asMaps.get(1);
		sendkeys(getCardno(), map.get("creditCard"));
		sendkeys(getCardtype(), map.get("ccType"));
		sendkeys(getExpmon(), map.get("expiryMonth"));
		sendkeys(getExpyear(), map.get("expiryYear"));
		sendkeys(getCvvno(), map.get("ccv"));
		click(getBooknow());
		implicitywait();
		String getattribute = getattribute(getOrderid());
		
		click(getOrderhis());
		Cancelid c = new Cancelid();
		sendkeys(c.getSearchbox(), getattribute);
	}

}
