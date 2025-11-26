package org.pom;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.stepdefinition.Stepdefinition;


public class Cancelid extends Baseclass{
	public Cancelid() {
PageFactory.initElements(driver, this);	}
	@FindBy(id="order_id_text")
	private WebElement searchbox;
	@FindBy(id="check_all")
	private WebElement checkall;
	@FindBy (id="search_hotel_id")
	private WebElement go;
	@FindBy(xpath="//table[@cellpadding='5']//tbody//tr//input[@style='width:150px;']")
	private WebElement cancelall;
	public WebElement getSearchbox() {
		return searchbox;
	}
	public WebElement getCheckall() {
		return checkall;
	}
	public WebElement getGo() {
		return go;
	}
	public WebElement getCancelall() {
		return cancelall;
	}
	
	public void cancelid() {

	}
	
	public void enterid() {
		
		click(getGo());
		click(getCheckall());
		click(getCancelall());
		handlealert();
	}
	
	
	
}
