package org.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	
	public static WebDriver driver;
	
	public static Actions a;
	
	public static Alert al;
	
	public static JavascriptExecutor js;
	
	public static Select s;
	
	public static void launchBrowser() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sundruba\\eclipse-workspace\\SeleniumClass\\Drivers\\chromedriver.exe");
		
		driver = new ChromeDriver();
	}
	
	public static void urlLaunch(String url) {

		driver.get(url);
	}
	
	public static void maximizeBrowser() {

		driver.manage().window().maximize();
	}
	
	public static void enterText(WebElement element,String value) {

		element.sendKeys(value);
	}
	
	public static void browseClk(WebElement element) {

		element.click();
		
	}
	
	public static void browserTitle() {

		String title = driver.getTitle();
		System.out.println(title);
	}
	
	public static void browserCurrentUrl() {

		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
	}
	
	public static void browserPageClose() {

		driver.close();
	}
	
	public static void browserQt() {
		
		driver.quit();
	}
	
	public static void browserAtt(WebElement element) {
		
		String attribute = element.getAttribute("value");
		System.out.println(attribute);
	}
	
	public static void browserTextPrint(WebElement element) {

		String text = element.getText();
		System.out.println(text);
	}
	
	public static void toPerformMouseHover(WebElement element) {

		a = new Actions(driver);
		a.moveToElement(element).perform();
	}

	public static void toPerformDrgAndDrop(WebElement element,WebElement element1) {

		a.dragAndDrop(element, element1).perform();
	}
	
	public static void toPerformDoubleClk(WebElement dble) {

		a.doubleClick(dble).perform();
	}
	
	public static void toPerformContextClk(WebElement element) {

		a.contextClick(element).perform();
	}
	
	public static void alertAccpt() {
		al = driver.switchTo().alert();
		al.accept();
	}
	
	public static void alertDismiss() {

		al.dismiss();
	}
	
	public static void alertText(String value) {

		al.sendKeys(value);
	}
	
	public static void alertGetTxt() {

		String text = al.getText();
		System.out.println(text);
	}
	
	public static void javaScriptClk(WebElement element) {
		
		js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", element);

	}
	
	public static void javaScriptGetAttr(WebElement element) {

		Object script = js.executeScript("return arguments[0].getAttribute('value')", element);
		
		String text = (String)script;
		
		System.out.println(text);
	}
	
	public static void javaScriptScrollDown(WebElement element) {

		js.executeScript("arguments[0].scrollIntoView('true')", element);
	}
	
	public static void javaScriptScrollUp(WebElement element) {
		
		js.executeScript("arguments[0].scrollIntoView('false')", element);
	}
	
	public static void toPerformScreenshot(String name) throws IOException {

		TakesScreenshot ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		
		File Destination = new File("C:\\Users\\sundruba\\eclipse-workspace\\SeleniumClass\\Screenshot\\" + name + ".png");
		
		FileUtils.copyFile(source, Destination);
		
	}
	
	public static void toPerformWindowsHandling() {

		String parentId = driver.getWindowHandle();
	
		Set<String> allWindowId = driver.getWindowHandles();
		
		for (String windowId : allWindowId) {
			
			if (!(parentId.equals(windowId))) {
				
				driver.switchTo().window(windowId);
				
			}
			
		}
			
	}
	
	public static void toPerformDrpDownSelectTxt(WebElement element, String value) {
		
		s = new Select(element);
		
		s.selectByVisibleText(value);

	}

	public static void toPerformDrpDownSelectValue(WebElement element, String value) {
		
		s = new Select(element);

		s.selectByValue(value);

	}

	public static void toPerformDrpDownSelectIndex(WebElement element, int index) {
	
		s = new Select(element);

		s.selectByIndex(index);

	}
	
	public static void toPerformDrpDownGetOptns(WebElement element) {
		
		s = new Select(element);
		
		List<WebElement> options = s.getOptions();
		
		for (int i = 0; i < options.size(); i++) {
			
			WebElement webElement = options.get(i);
			String text = webElement.getText();
			System.out.println(text);
			
		}

	}
	
	public static void toPerformDrpDownGetAllSelectOptions(WebElement element) {
 
		s = new Select(element);

		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		
		for (int i = 0; i < allSelectedOptions.size(); i++) {
			
			WebElement webElement = allSelectedOptions.get(i);
			String text = webElement.getText();
			System.out.println(text);
			
		}
		
	}

	public static void toPerformDrpDownGetFirstSelectOption(WebElement element) {

		s = new Select(element);
		
		WebElement firstSelectedOption = s.getFirstSelectedOption();
		String text = firstSelectedOption.getText();
		System.out.println(text);
	}

	public static void toPerformDrpDownDeselectIndex(WebElement element, int index) {

		s = new Select(element);
		
		s.deselectByIndex(index);
	}

	public static void toPerformDrpDownDeselectValue(WebElement element, String value) {

		s = new Select(element);
		
		s.deselectByValue(value);
	}
	
	public static void toPerformDrpDownDeselectVisibleText(WebElement element, String text) {

		s = new Select(element);
		
		s.deselectByVisibleText(text);
	}

	public static void toPerformDrpDownDeselectAll(WebElement element) {

		s.deselectAll();
	}

	public static void toPerformSwitchToFrameById(String Id) {
		
		driver.switchTo().frame(Id);

	}

	public static void toPerformSwitchToFrameByName(String name) {
		
		driver.switchTo().frame(name);

	}

	public static void toPerformSwitchToFrameByIndex(int index) {
	
	driver.switchTo().frame(index);

}

	public static String excelRead(int rowNo, int cellNo) throws IOException {

		File file = new File("C:\\Users\\sundruba\\eclipse-workspace\\Sample\\ExcelData\\Data.xlsx");
		
		FileInputStream f = new FileInputStream(file);
		
		Workbook w = new XSSFWorkbook(f);
		
		Sheet s = w.getSheet("Sheet1");
		
		Row r = s.getRow(rowNo);
		
		Cell c = r.getCell(cellNo);
		
		int cellType = c.getCellType();
		
		String value = "";
		
		if (cellType == 1) {
			
			value = c.getStringCellValue();
			
		}
		
		else if (DateUtil.isCellDateFormatted(c)) {
			
			Date d = c.getDateCellValue();
			
			SimpleDateFormat sim = new SimpleDateFormat("dd-MM-yyyy");
			
			value = sim.format(d);
			
		}
		else {
			double dd = c.getNumericCellValue();
			
			long l = (long)dd;
			
			value = String.valueOf(l);
		}
		
		return value;
		}
	
	public static void excelNoofRowsAndCells() throws IOException {

		File file = new File("C:\\Users\\sundruba\\eclipse-workspace\\Sample\\ExcelData\\Data.xlsx");
		
		FileInputStream f = new FileInputStream(file);
		
		Workbook w = new XSSFWorkbook(f);
		
		Sheet s = w.getSheet("Sheet1");
		
		Row r = s.getRow(0);
		
		int physicalNumberOfRows = s.getPhysicalNumberOfRows();
		System.out.println(physicalNumberOfRows);
		
		int physicalNumberOfCells = r.getPhysicalNumberOfCells();
		System.out.println(physicalNumberOfCells);
		
		}
	
	public static void excelPrintAllData() throws IOException {
		
		File file = new File("C:\\Users\\sundruba\\eclipse-workspace\\Sample\\ExcelData\\Data.xlsx");
		
		FileInputStream f = new FileInputStream(file);
		
		Workbook w = new XSSFWorkbook(f);
		
		Sheet s = w.getSheet("Sheet1");
	
		for (int i = 0; i <s.getPhysicalNumberOfRows(); i++) {
			
			Row row = s.getRow(i);
			
			for (int j = 0; j <row.getPhysicalNumberOfCells(); j++) {
				
				Cell cell = row.getCell(j);
				System.out.println(cell);
				
			}
			
		}
		
	}
	
}
	
	
