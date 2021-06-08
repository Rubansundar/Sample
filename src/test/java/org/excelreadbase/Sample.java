package org.excelreadbase;

import java.io.IOException;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Sample extends BaseClass{
	
	public static void main(String[] args) throws IOException {
		
		launchBrowser();
		urlLaunch("https://www.facebook.com/");
		maximizeBrowser();
		
		WebElement txtUsr = driver.findElement(By.id("email"));
		
		enterText(txtUsr, excelRead(1, 4));
		
		WebElement txtPass = driver.findElement(By.id("pass"));
		
		enterText(txtPass, excelRead(1, 2));
		
	}

}
