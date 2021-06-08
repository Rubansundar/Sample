package org.pomframe;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PojoClassPage4 extends BaseClass{
	
	public PojoClassPage4() {

		PageFactory.initElements(driver, this);
	}
	
	@CacheLookup
	@FindAll({
		
		@FindBy(xpath="//input[@id='first_name']"),
		@FindBy(xpath="//input[@type='text']")

})
private WebElement frstName;
	
	@CacheLookup
	@FindAll({
		
		@FindBy(xpath="//input[@id='last_name']"),
		@FindBy(xpath="//input[@type='radio']")

})
private WebElement lastName;
	
	
	@CacheLookup
	@FindAll({
		
		@FindBy(xpath="//textarea[@id='address']"),
		@FindBy(xpath="//input[@type='radio']")

})
private WebElement addressPrnt;
	
	@CacheLookup
	@FindAll({
		
		@FindBy(xpath="//input[@id='cc_num']"),
		@FindBy(xpath="//input[@type='radio']")

})
private WebElement creditNo;
	
	@CacheLookup
	@FindAll({
		
		@FindBy(xpath="//select[@id='cc_type']"),
		@FindBy(xpath="//select[@name='cc_type']")

})
private WebElement creditType;
	
	@CacheLookup
	@FindAll({
		
		@FindBy(xpath="//select[@id='cc_exp_month']"),
		@FindBy(xpath="//select[@name='cc_exp_month']")

})
private WebElement expMonth;
	
	@CacheLookup
	@FindAll({
		
		@FindBy(xpath="//select[@id='cc_exp_year']"),
		@FindBy(xpath="//select[@name='cc_exp_year']")

})
private WebElement expYear;
	
	@CacheLookup
	@FindAll({
		
		@FindBy(xpath="//input[@id='cc_cvv']"),
		@FindBy(xpath="//input[@name='cc_cvv']")

})
private WebElement cvvNo;
	
	@CacheLookup
	@FindAll({
		
		@FindBy(xpath="//input[@id='book_now']"),
		@FindBy(xpath="//input[@type='radio']")

})
private WebElement bookClk;

	public WebElement getFrstName() {
		return frstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getAddressPrnt() {
		return addressPrnt;
	}

	public WebElement getCreditNo() {
		return creditNo;
	}

	public WebElement getCreditType() {
		return creditType;
	}

	public WebElement getExpMonth() {
		return expMonth;
	}

	public WebElement getExpYear() {
		return expYear;
	}

	public WebElement getCvvNo() {
		return cvvNo;
	}

	public WebElement getBookClk() {
		return bookClk;
	}

}
