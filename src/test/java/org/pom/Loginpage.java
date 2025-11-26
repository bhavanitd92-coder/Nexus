package org.pom;

import org.pom.Baseclass;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage extends Baseclass{
	
public Loginpage() {
	PageFactory.initElements(driver, this);
}
@FindBy(id= "username")
private WebElement username;
@FindBy(id= "password")
private WebElement password;
@FindBy(id= "login")
private WebElement login;
public WebElement getUsername() {
	return username;
}
public WebElement getPassword() {
	return password;
}
public WebElement getLogin() {
	return login;
}

public void login2 throws IOException {
sendkeys(username, getcellvalue(0, 0));
sendkeys(password, getcellvalue(1, 0));
click(login);
}





}
