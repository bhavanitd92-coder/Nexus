package org.pom;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Errormsgverify extends Baseclass{
	public Errormsgverify() {
PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//table[@cellpadding='0']//tbody//tr//td//label[@id='search_result_error']")
	private WebElement errormsg;
	public WebElement getErrormsg() {
		return errormsg;
	}
	public void verifyerrormsg() {
		implicitywait();
		String gettext = gettext(getErrormsg());
		Assert.assertEquals("The booking has been cancelled.", gettext);
		System.out.println("The booking has been cancelled. msg displayed");
	
	}
}
