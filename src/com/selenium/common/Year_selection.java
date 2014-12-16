package com.selenium.common;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Year_selection {
	public static WebElement element=null;
	public static List Webelement1 = null; 
	public static WebDriver driver;
	
	 public static WebElement Year_2011(WebDriver driver){
	 		element=driver.findElement(By.xpath("//td[@class='x-date-mp-year']/a[contains(text(),'2011')]"));
	 		element.click();
	 		return element; 
	     } 
	 public static WebElement Year_2012(WebDriver driver){
	 		element=driver.findElement(By.xpath("//td[@class='x-date-mp-year']/a[contains(text(),'2012')]"));
	 		element.click();
	 		return element; 
	     } 
	 public static WebElement Year_2013(WebDriver driver){
	 		element=driver.findElement(By.xpath("//td[@class='x-date-mp-year']/a[contains(text(),'2013')]"));
	 		element.click();
	 		return element; 
	     } 
	 public static WebElement Year_2014(WebDriver driver){
		    element=driver.findElement(By.xpath("//td[@class='x-date-mp-year x-date-mp-sel']/a[contains(text(),'2014')]"));
		    element.click();
	 		return element; 
	     } 
	 public static WebElement Year_2015(WebDriver driver){
	 		element=driver.findElement(By.xpath("//td[@class='x-date-mp-year']/a[contains(text(),'2015')]"));
	 		element.click();
	 		return element; 
	     } 
	 public static WebElement Year_2016(WebDriver driver){
	 		element=driver.findElement(By.xpath("//td[@class='x-date-mp-year']/a[contains(text(),'2016')]"));
	 		element.click();
	 		return element; 
	     } 
	 public static WebElement Year_2017(WebDriver driver){
	 		element=driver.findElement(By.xpath("//td[@class='x-date-mp-year']/a[contains(text(),'2017')]"));
	 		element.click();
	 		return element; 
	     } 
	 public static WebElement Year_2018(WebDriver driver){
	 		element=driver.findElement(By.xpath("//td[@class='x-date-mp-year']/a[contains(text(),'2018')]"));
	 		element.click();
	 		return element; 
	     } 
	 public static WebElement Year_2019(WebDriver driver){
	 		element=driver.findElement(By.xpath("//td[@class='x-date-mp-year']/a[contains(text(),'2019')]"));
	 		element.click();
	 		return element; 
	     } 
	
}
