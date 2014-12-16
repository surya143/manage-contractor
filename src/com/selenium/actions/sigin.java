package com.selenium.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.selenium.pageobject.Loginpage;


public class sigin {
	public static WebElement element=null;
	public static WebDriver driver;
	public static WebElement signin (WebDriver driver,String Username,String password){
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys(Username);
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys(password);
	    driver.findElement(By.xpath("//button [@id='ext-gen16']")).click();
		return element;
		
	}
}