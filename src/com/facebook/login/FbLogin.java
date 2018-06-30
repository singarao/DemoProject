package com.facebook.login;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class FbLogin {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//edit the code for testing
				DesiredCapabilities d = DesiredCapabilities.internetExplorer();
				d.setCapability("nativeEvents", false);
				d.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
				d.setCapability(InternetExplorerDriver.FORCE_CREATE_PROCESS, true);
				d.setCapability(InternetExplorerDriver.IE_ENSURE_CLEAN_SESSION, true);
				//Driver = new RemoteWebDriver(serviceIE.getUrl(),d);
				System.setProperty("webdriver.ie.driver", "D://Selenium//IEDriverServer.exe");
				
				WebDriver driver=new InternetExplorerDriver();
		
		driver.get("https://www.facebook.com");
		
	}

}
