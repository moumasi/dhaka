package com.happyday.dhaka;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.testng.annotations.Test;

public class myfirsttest {
	
	@Test
	public void black() throws Exception {
		
		System.setProperty("webdriver.edge.driver", "C:\\chormeDriver\\chrome-win64\\chrome.exe");
		//chormeOption is a class for Chrome Browser
		//ieOption is a class for edge Browser
		ChromeOptions chromee= new ChromeOptions();
		chromee.addArguments("--remote-allow-origins=*");
		
		WebDriver driver= new ChromeDriver();
		//get()method is responsible to lounching our browser
		driver.get("https://www.amazon.com/");
		//for maximize the window use maximize()method
		driver.manage().window().maximize();
		WebElement t= driver.findElement(By.id("twotabsearchtextbox"));
		
		
		t.sendKeys("Toys");
		//2 methods for closing window
		//close();is going to close current window/facing window
		//Quit();is going to close multiple window
		//for order to wait 10 second and then close ,we have to use manual wait method
		Thread.sleep(10000);
		driver.close();
		
		
		
	}

}
