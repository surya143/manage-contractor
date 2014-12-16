package com.selenium.common;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FromDatepickerinGrid {
	public static WebElement element=null;
	public static List Webelement1 = null; 
	public static WebDriver driver;
	 //FRom Date in Grid
    public static WebElement date_icon(WebDriver driver){
		element=driver.findElement(By.xpath("//table/tbody/tr/td[3]/div/img"));
		element.click();
		return element; 
    }
    public static WebElement monthyear_selection(WebDriver driver){
 		element=driver.findElement(By.xpath("//td[@class='x-btn-center']/em[@unselectable='on']/button[contains(text(),'November 2014')]"));
 		element.click();
 		return element; 
     }
    public static WebElement month_selection(WebDriver driver){
 		element=driver.findElement(By.xpath("//td[@class='x-date-mp-month']/a[contains(text(),'Apr')]"));
 		element.click();
 		return element; 
     } 
    public static WebElement  year_selection(WebDriver driver){
  		element=driver.findElement(By.xpath("//td[@class='x-date-mp-year x-date-mp-sel']/a[contains(text(),'2014')]"));
  		element.click();
  		return element; 
      } 
    public static WebElement   ok_button(WebDriver driver){
   		element=driver.findElement(By.xpath("//button[@class='x-date-mp-ok']"));
   		element.click();
   		return element; 
       } 
   public static void date_selection(WebDriver driver){
	   
	   WebElement dateWidget =driver.findElement(By.xpath("//table[@class='x-date-inner']/tbody"));
  	  String T= dateWidget.getText();
  	  List<WebElement> rows=dateWidget.findElements(By.tagName("tr")); 
      int R=rows.size();
  	  List<WebElement> columns=dateWidget.findElements(By.tagName("td")); 
  	 int C=columns.size();
 	 // System.out.println(C);
 	  
 	 for (WebElement cell: columns){  
 		   //Select 13th Date   
 		   if (cell.getText().equals("1")){  
 		   cell.findElement(By.linkText("1")).click();  
 		   break;  
 		   }  
 		  }   
 		 
   return;
  }


	
}
