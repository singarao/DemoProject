package com.facebook.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class jenkinstest {

	/**
	 * @param args
	 */
/*	public static void main(String[] args) {*/
	@Test
	public void testjenkins()
	{
		System.setProperty("webdriver.chrome.driver", "D://Capgemini//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		String title=driver.getTitle();
		System.out.println("The title is"+title);
				
		System.out.println("FB page opened successfully");
		driver.close();
		
		

	}

}
