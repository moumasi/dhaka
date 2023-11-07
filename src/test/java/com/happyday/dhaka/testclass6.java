package com.happyday.dhaka;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.Test;

public class testclass6 {
	
	@Test
	public void ruun() {
		System.setProperty("WebDriver.firefox.driver", "C:\\firefoxdriver\\geckodriver-v0.33.0-win64");
		FirefoxOptions h= new FirefoxOptions();
		h.addArguments("--remote-allow-origins=*");
		
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.amazon.com/");
		
	}

}
