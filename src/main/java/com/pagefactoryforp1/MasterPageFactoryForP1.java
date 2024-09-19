package com.pagefactoryforp1;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MasterPageFactoryForP1 {
	
	public MasterPageFactoryForP1(WebDriver diver) {
	PageFactory.initElements(diver, this);
	}
	
	
	@FindBy(xpath="//*[@class='fa fa-lock']")
	private WebElement signinbtn_homepage;
	
	@FindBy(xpath="(//input[@name='email'])[1]")
	private WebElement email;
	
	@FindBy(xpath="//*[@name='password']")
	private WebElement password;
	
	@FindBy(xpath="(//*[contains(text(),'Login')])[4]")
	private WebElement login;
	
	
	@FindBy(xpath="//*[text()=' Logout']")
	private WebElement logout;
	


	public WebElement getLogout() {
		return logout;
	}

	public WebElement getSigninbtn_homepage() {
		return signinbtn_homepage;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}


}
