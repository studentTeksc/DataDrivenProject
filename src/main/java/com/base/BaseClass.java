package com.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import io.github.bonigarcia.wdm.WebDriverManager;


public class BaseClass {
	 public WebDriver driver;
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mhassany\\Downloads\\chromedriver_win32 (2).zip\\chromedriver.exe");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/");
        
	}
	@AfterMethod
	public void tearDown() {
		driver.close();
	}
	@DataProvider(name = "credentials")
	public Object[][] getData() {
		Object[][] dataObjects = new Object[3][2];
		dataObjects[0][0] = "admin";
		dataObjects[0][1] = "admin123";
		
		dataObjects[1][0] = "admin1";
		dataObjects[1][1] = "admin111";
		
		dataObjects[2][0] = "admin2";
		dataObjects[2][1] = "admin222";
		return dataObjects; 
		
	}
	
	
}
