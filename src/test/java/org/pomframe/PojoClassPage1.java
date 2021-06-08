package org.pomframe;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PojoClassPage1 extends BaseClass{
	
	public PojoClassPage1() {

		PageFactory.initElements(driver, this);
	}
	
	@CacheLookup
	@FindAll({
		
		@FindBy(xpath="//input[@id='username']"),
		@FindBy(xpath="//input[@type='text']")
		
	})
	private WebElement txtUser;
	
	
	@CacheLookup
	@FindAll({
		
		@FindBy(xpath="//input[@id='password']"),
		@FindBy(xpath="//input[@type='password']")
		
	})
	private WebElement txtPass;


	@CacheLookup
	@FindAll({
		
		@FindBy(xpath="//input[@id='login']"),
		@FindBy(xpath="//input[@type='Submit']")
		
	})
	private WebElement loginBtn;


	public WebElement getTxtUser() {
		return txtUser;
	}


	public WebElement getTxtPass() {
		return txtPass;
	}


	public WebElement getLoginBtn() {
		return loginBtn;
	}
	
}
