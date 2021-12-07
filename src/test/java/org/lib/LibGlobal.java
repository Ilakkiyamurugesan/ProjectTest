package org.lib;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LibGlobal {
	WebDriver driver;
	public void browserconfig() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
			}
	public void openurl(String url) {
		driver.get(url);

	}
	public WebElement locateById(String id) {
		WebElement findElement = driver.findElement(By.id(id));
		return findElement;
	}
	public WebElement locateByName(String name) {
		WebElement findElement = driver.findElement(By.name(name));
		return findElement;
		
		}
	public void type(WebElement element, String data)
	{
		element.sendKeys(data);
	}
	public void click(WebElement element)
	{
		element.click();
	}
	

	public String excelread(String path,String sheet, int row,int cell) throws IOException {
		File f=new File(path);
		FileInputStream fin=new FileInputStream(f);
		Workbook w=new XSSFWorkbook(fin);
		Sheet s1=w.getSheet(sheet);
		Row r1=s1.getRow(row);
		Cell c1 = r1.getCell(cell);
		c1.getStringCellValue();
		FileOutputStream fi=new FileOutputStream(f);
		w.write(fi);
		return path;

		
	}

	public WebElement locateByxpath(String xpathExpression) {
		WebElement findElement = driver.findElement(By.xpath(xpathExpression));
		return findElement;

	}

}
