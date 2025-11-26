package org.stepdefinition;

import org.pom.Baseclass;
import org.pom.Book;
import org.pom.Cancelid;
import org.pom.Errormsgverify;
import org.pom.SearchHotel;
import org.pom.Selecthotel;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Stepdefinition extends Baseclass {

	@Given("User is in the adactin page")
	public void userIsInTheAdactinPage() {
		launchbrowser();
		launchurl("https://adactinhotelapp.com/");
	}

	@Then("enter datas {string} ,{string},{string}")
	public void enterDatas(String location, String hotels, String room) {
		SearchHotel s = new SearchHotel();
		s.searchhotels(location, hotels, room);
	}

	@Then("select datas {string},{string},{string},{string}")
	public void selectDatas(String norooms, String datein, String dateout, String adultRoom) {
		SearchHotel s = new SearchHotel();
		s.searchhotels2(norooms, datein, dateout, adultRoom);
	}

	@Then("select radiobutton")
	public void selectRadiobutton() {
		Selecthotel sh = new Selecthotel();
		sh.selectradiobutton();
	}

	@Then("enter datas {string},{string},{string}")
	public void enterDatas(String firstname, String lastname, String address,
			io.cucumber.datatable.DataTable dataTable) {
		Book b = new Book();
		b.bookingdata(firstname, lastname, address, dataTable);
	}

	@Then("User should select and cancel the order")
	public void userShouldSelectAndCancelTheOrder() {
		Cancelid c = new Cancelid();
		c.enterid();
	}

	@Then("User should verify {string} is displayed")
	public void userShouldVerifyIsDisplayed(String string) {
		Errormsgverify e = new Errormsgverify();
		e.verifyerrormsg();
	}

}
