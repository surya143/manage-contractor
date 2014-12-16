package com.selenium.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Vechicle_Purchases_Elements {
	public static WebElement element=null;
	public static WebDriver driver;
	
	
	 public static WebElement Entry_Date(WebDriver driver){
			element=driver.findElement(By.xpath("//table/tbody/tr[1]/td[2]/div/div/img"));
			element.click();
			return element;
		}	
	 public static WebElement Transaction_Type(WebDriver driver){
			element=driver.findElement(By.xpath("//table/tbody/tr[2]/td[2]/div/div/img"));
			element.click();
			return element;
		}	
	 public static WebElement VehicleNo_textbox(WebDriver driver){
			element=driver.findElement(By.xpath("//input[@id='VehiclePurchaseuserWindow_txtRegistrationNumber']"));
			return element;
		}	
	 public static WebElement EngineNo_textbox(WebDriver driver){
			element=driver.findElement(By.xpath("//input[@id='VehiclePurchaseuserWindow_txtEngineNumber']"));
			return element;
		}	
	 public static WebElement VehicleLifeYears_textbox(WebDriver driver){
			element=driver.findElement(By.xpath("//input[@id='VehiclePurchaseuserWindow_txtVehiclelife']"));
			return element;
		}	
	 public static WebElement Warranty_In_Kms_textbox(WebDriver driver){
			element=driver.findElement(By.xpath("//input[@id='VehiclePurchaseuserWindow_txtWarrentyinKms']"));
			return element;
		}	
	 public static WebElement Vehiclename_textbox(WebDriver driver){
			element=driver.findElement(By.xpath("//input[@id='VehiclePurchaseuserWindow_txtVehiclename']"));
			return element;
		}	
	 public static WebElement Model_textbox(WebDriver driver){
			element=driver.findElement(By.xpath("//input[@id='VehiclePurchaseuserWindow_txtModel']"));
			return element;
		}	
	 public static WebElement ChassisNO_textbox(WebDriver driver){
			element=driver.findElement(By.xpath("//input[@id='VehiclePurchaseuserWindow_txtChaissNumber']"));
			return element;
		}	
	 public static WebElement Warranty_Period_Date(WebDriver driver){
			element=driver.findElement(By.xpath("//table/tbody/tr[5]/td[4]/div/div/img"));
			element.click();
			return element;
		}
	 public static WebElement Value_textbox(WebDriver driver){
			element=driver.findElement(By.xpath("//input[@id='VehiclePurchaseuserWindow_txtValue']"));
			return element;
		}	
	 public static WebElement Purchased_Date(WebDriver driver){
			element=driver.findElement(By.xpath("//table/tbody/tr[1]/td[2]/div/div/img']"));
			element.click();
			return element;
		} 
	 public static WebElement  Area_textbox(WebDriver driver){
			element=driver.findElement(By.xpath("//input[@id='VehiclePurchaseuserWindow_txtArea']"));
			return element;
		}	
	 public static WebElement  Address_textbox(WebDriver driver){
			element=driver.findElement(By.xpath("//textarea[@name='VehiclePurchaseuserWindow_txtAddress']"));
			return element;
		}	
	 public static WebElement DealerName_textbox(WebDriver driver){
			element=driver.findElement(By.xpath("//input[@id='VehiclePurchaseuserWindow_txtDealername']"));
			return element;
		}	
	 public static WebElement PhoneNo_textbox(WebDriver driver){
			element=driver.findElement(By.xpath("//input[@id='VehiclePurchaseuserWindow_txtPhoneNumber']"));
			return element;
		}
	 
	 public static WebElement Note_textbox(WebDriver driver){
			element=driver.findElement(By.xpath("//textarea[@id='VehiclePurchaseuserWindow_txtNote']"));
			return element;
		}
}
