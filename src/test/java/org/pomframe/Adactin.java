package org.pomframe;

import java.io.IOException;

import org.base.BaseClass;

public class Adactin extends BaseClass{
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		launchBrowser();
		urlLaunch("http://adactinhotelapp.com/");
		maximizeBrowser();
		
		PojoClassPage1 p1 = new PojoClassPage1();
		
		enterText(p1.getTxtUser(), excelRead(1, 0));
		enterText(p1.getTxtPass(), excelRead(1, 1));
		browseClk(p1.getLoginBtn());
		
		PojoClassPage2 p2 = new PojoClassPage2();
		
		toPerformDrpDownSelectTxt(p2.getRoomLocation(), "Adelaide");
		toPerformDrpDownSelectTxt(p2.getHotelName(), "Hotel Sunshine");
		toPerformDrpDownSelectTxt(p2.getRoomType(), "Double");
		toPerformDrpDownSelectTxt(p2.getRoomNo(), "5 - Five");
		enterText(p2.getCheckIn(), excelRead(1, 2));
		enterText(p2.getCheckOut(),excelRead(1, 3));
		toPerformDrpDownSelectTxt(p2.getAdultRoom(), "4 - Four");
		toPerformDrpDownSelectTxt(p2.getChildRoom(), "1 - One");
		browseClk(p2.getSearchBtn());
		
		PojoClassPage3 p3 = new PojoClassPage3();
		
		browseClk(p3.getBtnClick());
		browseClk(p3.getSubmitClk());
		
		PojoClassPage4 p4 = new PojoClassPage4();
		
		enterText(p4.getFrstName(), excelRead(1, 4));
		enterText(p4.getLastName(), excelRead(1, 5));
		enterText(p4.getAddressPrnt(), excelRead(1, 6));
		enterText(p4.getCreditNo(), excelRead(1, 7));
		toPerformDrpDownSelectTxt(p4.getCreditType(), "Master Card");
		toPerformDrpDownSelectTxt(p4.getExpMonth(), "May");
		toPerformDrpDownSelectTxt(p4.getExpYear(), "2021");
		enterText(p4.getCvvNo(), excelRead(1, 8));
		browseClk(p4.getBookClk());

		Thread.sleep(7000);
		
		PojoClassPage5 p5 = new PojoClassPage5();
		
		browserAtt(p5.getOrderNoPrint());
		
	}

}
