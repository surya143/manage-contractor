package com.selenium.common;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Month_Year_selection {
	public static WebElement element=null;
	public static List Webelement1 = null; 
	public static WebDriver driver;
	
	
	  public static WebElement April(WebDriver driver){
	 		element=driver.findElement(By.xpath("//td[@class='x-btn-center']/em[@unselectable='on']/button[contains(text(),'April')]"));
	 		element.click();
	 		return element; 
	     }
	  public static WebElement May(WebDriver driver){
	 		element=driver.findElement(By.xpath("//td[@class='x-btn-center']/em[@unselectable='on']/button[contains(text(),'May')]"));
	 		element.click();
	 		return element; 
	     }
	  public static WebElement June(WebDriver driver){
	 		element=driver.findElement(By.xpath("//td[@class='x-btn-center']/em[@unselectable='on']/button[contains(text(),'June')]"));
	 		element.click();
	 		return element; 
	     }
	  public static WebElement July(WebDriver driver){
	 		element=driver.findElement(By.xpath("//td[@class='x-btn-center']/em[@unselectable='on']/button[contains(text(),'July')]"));
	 		element.click();
	 		return element; 
	     } 
	  public static WebElement August(WebDriver driver){
	 		element=driver.findElement(By.xpath("//td[@class='x-btn-center']/em[@unselectable='on']/button[contains(text(),'July')]"));
	 		element.click();
	 		return element; 
	     } 
	  public static WebElement September(WebDriver driver){
	 		element=driver.findElement(By.xpath("//td[@class='x-btn-center']/em[@unselectable='on']/button[contains(text(),'September')]"));
	 		element.click();
	 		return element; 
	     } 
	  public static WebElement October(WebDriver driver){
	 		element=driver.findElement(By.xpath("//td[@class='x-btn-center']/em[@unselectable='on']/button[contains(text(),'October')]"));
	 		element.click();
	 		return element; 
	     } 
	  public static WebElement November(WebDriver driver){
	 		element=driver.findElement(By.xpath("//td[@class='x-btn-center']/em[@unselectable='on']/button[contains(text(),'November')]"));
	 		element.click();
	 		return element; 
	     }   
	  public static WebElement December(WebDriver driver){
	 		element=driver.findElement(By.xpath("//td[@class='x-btn-center']/em[@unselectable='on']/button[contains(text(),'December')]"));
	 		element.click();
	 		return element; 
	     }   
	  public static WebElement January(WebDriver driver){
	 		element=driver.findElement(By.xpath("//td[@class='x-btn-center']/em[@unselectable='on']/button[contains(text(),'January')]"));
	 		element.click();
	 		return element; 
	     }   
	  public static WebElement February(WebDriver driver){
	 		element=driver.findElement(By.xpath("//td[@class='x-btn-center']/em[@unselectable='on']/button[contains(text(),'February')]"));
	 		element.click();
	 		return element; 
	     } 
	  public static WebElement March(WebDriver driver){
	 		element=driver.findElement(By.xpath("//td[@class='x-btn-center']/em[@unselectable='on']/button[contains(text(),'March')]"));
	 		element.click();
	 		return element; 
	     }  
}
