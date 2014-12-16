package com.selenium.common;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Month_Selection {
	private static WebElement element=null;
	private static List Webelement1 = null; 
	private static WebDriver driver;
	
	 public static WebElement month_April(WebDriver driver){
	 		element=driver.findElement(By.xpath("//td[@class='x-date-mp-month']/a[contains(text(),'Apr')]"));
	 		element.click();
	 		return element; 
	     } 
	 public static WebElement month_May(WebDriver driver){
		 element=driver.findElement(By.xpath("//td[@class='x-date-mp-month']/a[contains(text(),'May')]"));
	 	 element.click();

	 		return element; 
	     } 
	 public static WebElement month_June(WebDriver driver){
	 		element=driver.findElement(By.xpath("//td[@class='x-date-mp-month']/a[contains(text(),'Jun')]"));
	 		element.click();
	 		return element; 
	     } 
	 public static WebElement month_March(WebDriver driver){
	 		element=driver.findElement(By.xpath("//td[@class='x-date-mp-month']/a[contains(text(),'Mar')]"));
	 		element.click();
	 		return element; 
	     } 
	 public static WebElement month_Feb(WebDriver driver){
	 		element=driver.findElement(By.xpath("//td[@class='x-date-mp-month']/a[contains(text(),'Feb')]"));
	 		element.click();
	 		return element; 
	     } 
	
	 public static WebElement month_Jan(WebDriver driver){
	 		element=driver.findElement(By.xpath("//td[@class='x-date-mp-month']/a[contains(text(),'Jan')]"));
	 		element.click();
	 		return element; 
	     } 
	 public static WebElement month_july(WebDriver driver){
	 		element=driver.findElement(By.xpath("//td[@class='x-date-mp-month x-date-mp-sep']/a[contains(text(),'Jul')]"));
	 		element.click();
	 		return element; 
	     } 
	 public static WebElement month_Augest(WebDriver driver){
	 		element=driver.findElement(By.xpath("//td[@class='x-date-mp-month x-date-mp-sep']/a[contains(text(),'Aug')]"));
	 		element.click();
	 		return element; 
	     } 
	 public static WebElement month_September(WebDriver driver){
	 		element=driver.findElement(By.xpath("td[@class='x-date-mp-month x-date-mp-sep']/a[contains(text(),'Sep')]"));
	 		element.click();
	 		return element; 
	     } 
	 public static WebElement month_October(WebDriver driver){
	 		element=driver.findElement(By.xpath("td[@class='x-date-mp-month x-date-mp-sep']/a[contains(text(),'Oct')]"));
	 		element.click();
	 		return element; 
	     } 
	 public static WebElement month_November(WebDriver driver){
	 		element=driver.findElement(By.xpath("td[@class='x-date-mp-month x-date-mp-sep']/a[contains(text(),'Nov')]"));
	 		element.click();
	 		return element; 
	     } 
	 public static WebElement month_December(WebDriver driver){
	 		element=driver.findElement(By.xpath("td[@class='x-date-mp-month x-date-mp-sep']/a[contains(text(),'Dec')]"));
	 		element.click();
	 		return element; 
	     } 
}
