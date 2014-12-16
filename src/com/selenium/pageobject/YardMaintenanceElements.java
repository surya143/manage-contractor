package com.selenium.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class YardMaintenanceElements {
	 public static WebElement element=null;
		public static WebDriver driver; 
  
	 
	  public static WebElement  Date(WebDriver driver){
			element=driver.findElement(By.xpath("//table/tbody/tr/td[2]/div/div/img"));
			element.click();
			return element;
		}	
	  public static WebElement Maintenance_Dropdown  (WebDriver driver){
			element=driver.findElement(By.xpath("//table/tbody/tr/td[4]/div/div/img"));
			element.click();
			return element;
		}
	  public static WebElement txtRoadNumber  (WebDriver driver){
			element=driver.findElement(By.xpath("//input[@id='YardMaintenanceWindow_txtRoadNumber']"));
			return element;
		}
	  public static WebElement txtParticular  (WebDriver driver){
			element=driver.findElement(By.xpath("//input[@id='YardMaintenanceWindow_txtParticular']"));
			return element;
	  }
	  public static WebElement txtQuantity  (WebDriver driver){
			element=driver.findElement(By.xpath("//input[@id='YardMaintenanceWindow_txtQuantity']"));
			return element;
	  }
	  public static WebElement txtRate  (WebDriver driver){
			element=driver.findElement(By.xpath("//input[@id='YardMaintenanceWindow_txtRate']"));
			return element;
	  }
	  
	  public static WebElement button_Insert (WebDriver driver){
			element=driver.findElement(By.xpath("//tbody/tr/td[@class='x-btn-center']/em/button[text()='Insert']"));
			element.click();
			return element;
	  }
	  public static WebElement  ContractorFirmName_DropDown(WebDriver driver){
			element=driver.findElement(By.xpath("//table[3]/tbody/tr[1]/td[4]/div/div/img"));
			element.click();
			return element;
	  } 
	  public static WebElement txtOtherCharges (WebDriver driver){
			element=driver.findElement(By.xpath("//input[@id='YardMaintenanceWindow_txtOtherCharges']"));
			return element;

	  }
	 
  }

