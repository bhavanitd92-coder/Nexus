package org.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Selecthotel extends Baseclass{

	public Selecthotel() {
PageFactory.initElements(driver, this);	
}
	@FindBy(id="radiobutton_0")
	private WebElement rdobutton;
	@FindBy(id= "continue")
	private WebElement conti;
	public WebElement getRdobutton() {
		return rdobutton;
	}
	public WebElement getConti() {
		return conti;
	}
	public void selectradiobutton() {
click(rdobutton);
click(conti);
	}
	
}
