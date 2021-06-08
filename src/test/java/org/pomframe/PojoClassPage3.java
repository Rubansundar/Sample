package org.pomframe;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PojoClassPage3 extends BaseClass{
	
	public PojoClassPage3() {

		PageFactory.initElements(driver, this);
	}
	
	@CacheLookup
	@FindAll({
		
		@FindBy(xpath="//input[@id='radiobutton_0']"),
		@FindBy(xpath="//input[@type='radio']")

})
private WebElement btnClick;
	
	@CacheLookup
	@FindAll({
		
		@FindBy(xpath="//input[@type='submit']"),
		@FindBy(xpath="//input[@type='submet']")

})
private WebElement submitClk;

	public WebElement getBtnClick() {
		return btnClick;
	}

	public WebElement getSubmitClk() {
		return submitClk;
	}
	
}
