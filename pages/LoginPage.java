package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.sample.BaseClass;

public class LoginPage extends BaseClass {

	public LoginPage() {

		PageFactory.initElements(driver, this);
	}
	
	@FindBy (id="username")
	
	private WebElement txtUserName;
	
	@FindBy (id="password")
	
	private WebElement txtPassword;
	
	@FindBy(id="login")
	
	private WebElement btnlogin;

	public WebElement getTxtUserName() {
		return txtUserName;
	}

	public WebElement getTxtPassword() {
		return txtPassword;
	}

	public WebElement getBtnlogin() {
		return btnlogin;
	}
	
	public void loadlogin(String username,String password) {

		type(txtUserName, username);
		type(txtPassword, password);
		click(btnlogin);
	}
	
}
