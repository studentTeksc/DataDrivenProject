package com.testcase;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.base.BaseClass;

public class DataDrivenTest extends BaseClass{
	
	@Test(dataProvider = "credentials")
	public void logintest(String userName, String password) {
		driver.findElement(By.xpath("//input[@name ='username']")).sendKeys(userName);
	
		driver.findElement(By.xpath("//input[@type ='password']")).sendKeys(password);
		driver.findElement(By.xpath("//button[@type ='submit']")).click();
		String actualURL = driver.getCurrentUrl();
		String expectedURL = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
		Assert.assertEquals(actualURL, expectedURL);
		
		
	}

}
