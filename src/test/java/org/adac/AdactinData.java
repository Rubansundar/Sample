package org.adac;

import java.io.IOException;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AdactinData extends BaseClass{
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		launchBrowser();
		urlLaunch("http://adactinhotelapp.com/");
		maximizeBrowser();
		
		WebElement usrName = driver.findElement(By.id("username"));
		enterText(usrName, excelRead(1, 0));
		
		WebElement usrPw = driver.findElement(By.id("password"));
		enterText(usrPw, excelRead(1, 1));
		
		WebElement loginBtn = driver.findElement(By.id("login"));
		browseClk(loginBtn);
		
		WebElement drpDown1 = driver.findElement(By.id("location"));
		
		toPerformDrpDownSelectTxt(drpDown1, "Brisbane");
		
		WebElement drpDown2 = driver.findElement(By.id("hotels"));
		
		toPerformDrpDownSelectTxt(drpDown2, "Hotel Creek");
		
		WebElement drpDown3 = driver.findElement(By.id("room_type"));
		
		toPerformDrpDownSelectTxt(drpDown3, "Standard");
		
		WebElement drpDown4 = driver.findElement(By.id("room_nos"));
		
		toPerformDrpDownSelectTxt(drpDown4, "3 - Three");
				
		WebElement checkInDate = driver.findElement(By.id("datepick_in"));
		
		enterText(checkInDate, excelRead(1, 2));
		
		WebElement checkOutDate = driver.findElement(By.id("datepick_out"));
		
		enterText(checkOutDate, excelRead(1, 3));
			
		WebElement drpDown5 = driver.findElement(By.id("adult_room"));
		
		toPerformDrpDownSelectTxt(drpDown5, "3 - Three");
		
		WebElement drpDown6 = driver.findElement(By.id("child_room"));
		
		toPerformDrpDownSelectTxt(drpDown6, "0 - None");
		
		WebElement search = driver.findElement(By.id("Submit"));
		
		browseClk(search);
		
		WebElement radioBtn = driver.findElement(By.id("radiobutton_0"));
		
		browseClk(radioBtn);
		
		WebElement conti = driver.findElement(By.id("continue"));
	
		browseClk(conti);
		
		WebElement frstName = driver.findElement(By.id("first_name"));
		
		enterText(frstName, excelRead(1, 4));
		
		WebElement lstName = driver.findElement(By.id("last_name"));
		
		enterText(lstName, excelRead(1, 5));
		
		WebElement add = driver.findElement(By.id("address"));
		
		enterText(add, excelRead(1, 6));
		
		WebElement cc = driver.findElement(By.id("cc_num"));
		
		enterText(cc, excelRead(1, 7));
		
		WebElement cc_type = driver.findElement(By.id("cc_type"));
		
		toPerformDrpDownSelectTxt(cc_type, "American Express");
		
		WebElement cc_month = driver.findElement(By.id("cc_exp_month"));
		
		toPerformDrpDownSelectTxt(cc_month, "February");
		
		WebElement cc_year = driver.findElement(By.id("cc_exp_year"));
		
		toPerformDrpDownSelectTxt(cc_year, "2022");
		
		WebElement btn = driver.findElement(By.id("book_now"));
		
		browseClk(btn);
		
		WebElement cvv = driver.findElement(By.id("cc_cvv"));
		
		enterText(cvv, excelRead(1, 8));
			
		WebElement bookNowBtn = driver.findElement(By.id("book_now"));
		
		browseClk(bookNowBtn);
		
		Thread.sleep(10000);
		
		WebElement orderNo = driver.findElement(By.xpath("//input[@id='order_no']"));
		
		browserAtt(orderNo);
	
	}
	
}
