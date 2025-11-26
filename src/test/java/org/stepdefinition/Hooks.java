package org.stepdefinition;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.pom.Baseclass;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends Baseclass {
	
	@Before
public void before() {
launchbrowser();
launchurl("https://adactinhotelapp.com/");
}
	
	@After
	public  void after(Scenario s) {
		
    if (s.isFailed()) {
	
	TakesScreenshot ts = (TakesScreenshot)driver;
	byte[] screenshotAs = ts.getScreenshotAs(OutputType.BYTES);
	s.embed(screenshotAs, s.getName()+".png");
	driver.close();
	
}

	}
}
