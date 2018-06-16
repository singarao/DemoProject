package com.facebook.login;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login {
	
	public static void main(String args[]) throws IOException
	{
		System.setProperty("webdriver.chrome.driver", "D://Capgemini//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		FileInputStream fs=new FileInputStream("D:/Capgemini/test1.xlsx");
		
		XSSFWorkbook workbook=new XSSFWorkbook(fs);
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		int rowcount=sheet.getLastRowNum(); /// Total no.of rows in sheet
		
		//-sheet.getFirstRowNum();
		System.out.println("The row count is"+rowcount);
		for(int i=1;i<=rowcount+1;i++)
		{
			XSSFRow row1=sheet.getRow(i);
			XSSFCell Username=row1.getCell(0);
			XSSFCell Password=row1.getCell(1);
			
			//CharSequence[] uname=Username.getStringCellValue();
			//String password=Password.getStringCellValue();
		
			/*driver.findElement(By.id("")).sendKeys(uname.toString());
			driver.findElement(By.id("")).sendKeys(password.toString());
			driver.findElement(By.id("")).click();*/
		}	
		
		driver.close();
	}

}
