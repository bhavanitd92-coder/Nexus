package org.pom;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	protected static WebDriver driver;

	public void launchbrowser() {
	
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	public void launchurl(String url) {
		driver.get(url);
	}
	public  WebElement findelement(String a, String b) {
		if (a.equals("id")) {
			WebElement findElement = driver.findElement(By.id(b));
			return findElement;
		} else if (a.equals("name")) {
			WebElement findElement = driver.findElement(By.name(b));
			return findElement;
		} else {
			WebElement findElement = driver.findElement(By.xpath(b));
			return findElement;
		}

	}
	public void sendkeys(WebElement element ,String data) {
element.sendKeys(data);
	}
	public void click(WebElement element) {
element.click();
	}
	public void selectbyindex(WebElement element ,String data) {
Select s = new Select(element);
s.selectByIndex(Integer.parseInt(data));
	}
	public String getattribute(WebElement element) {
String attribute = element.getAttribute("value");
return attribute;
	}
	
	public void implicitywait() {
driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
	}
	public void handlealert() {
Alert a = driver.switchTo().alert();
a.accept();
	}
	public String gettext(WebElement element) {
String text = element.getText();
return text;
	}
	public String getcellvalue( int c, int d) throws IOException {
		File f = new File("C:\\Users\\1611r\\Desktop\\adactin.xlsx");
		FileInputStream f1 = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(f1); 
		Sheet sheet = w.getSheet("Sheet1");
		Row row = sheet.getRow(c);
		Cell cell = row.getCell(d);
		int cellType = cell.getCellType();
		if (cellType == 1) {
			String stringCellValue = cell.getStringCellValue();
			return stringCellValue;
		} else if (DateUtil.isCellDateFormatted(cell)) {
			Date dateCellValue = cell.getDateCellValue();
			SimpleDateFormat s = new SimpleDateFormat("dd/MM/yyyy");
			String format = s.format(dateCellValue);
			return format;

		} else {
			double numericCellValue = cell.getNumericCellValue();
			long l = (long) numericCellValue;
			String valueOf = String.valueOf(l);
			return valueOf;
		}
	}

	private void sysout() {
		// TODO Auto-generated method stub
		
System.out.println("Hello git");
	}
	
	
	
}
