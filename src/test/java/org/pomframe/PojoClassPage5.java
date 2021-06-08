package org.pomframe;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PojoClassPage5 extends BaseClass{
	
	public PojoClassPage5() {

		PageFactory.initElements(driver, this);
	}
	
	@CacheLookup
	@FindAll({
		
		@FindBy(xpath="//input[@id='order_no']"),
		@FindBy(xpath="//input[@name='order_no']")

	})
	private WebElement orderNoPrint;

	public WebElement getOrderNoPrint() {
		return orderNoPrint;
	}

}
