package com.selenium.pageobject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Sec_Dev_DevelopmentDetails {
	public static WebElement element=null;
	public static WebDriver driver;
	
	
	public static WebElement MoreButton(WebDriver driver){
		element=driver.findElement(By.xpath("//button[text()='More']"));
		element.click();
		
		return element;
		
	}
	//View Report Button
	 public static WebElement View_ReportButton (WebDriver driver){
	 		element=driver.findElement(By.xpath("//button[contains(text(),'View Report')]"));
	 	   	element.click();
	 		return element; 
	     } 
	// Radio Buttons
	 public static WebElement RadioButton_WorkStatusReport(WebDriver driver){
	 		element=driver.findElement(By.xpath("//div[1]/div[1]/div/div/img"));
	 		element.click();
	 		return element; 
	     }
	 public static WebElement RadioButton_WorkPaymentReport(WebDriver driver){
	 		element=driver.findElement(By.xpath("//div[2]/div[1]/div/div/img"));
	 		element.click();
	 		return element; 
	     }
	 public static WebElement RadioButton_WorkStatusConsolidated(WebDriver driver){
	 		element=driver.findElement(By.xpath("//div[3]/div[1]/div/div/img"));
	 		element.click();
	 		return element; 
	     }
	 public static WebElement RadioButton_WorkPaymentConsolidated(WebDriver driver){
	 		element=driver.findElement(By.xpath("//div[4]/div[1]/div/div/img"));
	 		element.click();
	 		return element; 
	     }
	 public static WebElement RadioButton_WorkTypeWiseDevelopment(WebDriver driver){
	 		element=driver.findElement(By.xpath("//div[5]/div[1]/div/div/img"));
	 		element.click();
	 		return element; 
	     }
	 public static WebElement RadioButton_SchemeWiseDevelopment(WebDriver driver){
	 		element=driver.findElement(By.xpath("//div[6]/div[1]/div/div/img"));
	 		element.click();
	 		return element; 
	     }
	 public static WebElement RadioButton_ContractorWiseDevelopment(WebDriver driver){
	 		element=driver.findElement(By.xpath("//div[7]/div[1]/div/div/img"));
	 		element.click();
	 		return element; 
	     }
	 public static WebElement RadioButton_Weekly(WebDriver driver){
	 		element=driver.findElement(By.xpath("//div[@id='x-form-el-rbWeeckly']/div/div/img"));
	 		element.click();
	 		return element; 
	     }
	 public static WebElement RadioButton_Last15Days(WebDriver driver){
	 		element=driver.findElement(By.xpath("//div[@id='x-form-el-rbfifteenDays']/div/div/img"));
	 		element.click();
	 		return element; 
	     }
	 public static WebElement RadioButton_LastMonth(WebDriver driver){
	 		element=driver.findElement(By.xpath("//div[@id='x-form-el-rbLastMonth']/div/div/img"));
	 		element.click();
	 		return element; 
	     }
	 public static WebElement RadioButton_Custom(WebDriver driver){
	 		element= driver.findElement(By.xpath("//div[@id='x-form-el-rbCustom']/div/div/img"));
	 		element.click();
	 		return element; 
	     }
	 
	 //Combos selection
	 public static WebElement Combo_WorkName(WebDriver driver){
	 		element=driver.findElement(By.xpath("//table/tbody/tr[1]/td[2]/div/div/img"));
	 		element.click();
	 		return element; 
	     }
	 public static WebElement Combo_WorkType(WebDriver driver){
	 		element=driver.findElement(By.xpath("//table/tbody/tr[2]/td[2]/div/div/img"));
	 		element.click();
	 		return element; 
	     }
	 public static WebElement Combo_SchemeUnder(WebDriver driver){
	 		element=driver.findElement(By.xpath("//table/tbody/tr[3]/td[2]/div/div/img"));
	 		element.click();
	 		return element; 
	     }
	 public static WebElement Combo_ContractorName(WebDriver driver){
	 		element=driver.findElement(By.xpath("//table/tbody/tr[4]/td[2]/div/div/img"));
	 		element.click();
	 		return element; 
	     } 
	 public static WebElement Combo_YardName(WebDriver driver){
	 		element=driver.findElement(By.xpath("//table/tbody/tr[5]/td[2]/div/div/img"));
	 		element.click();
	 		return element; 
	     } 
	//From  Dates
	 public static WebElement From_Date(WebDriver driver){
	 		element=driver.findElement(By.xpath("//input[@id='dtFrom']"));
	 		return element; 
	     } 
	 public static WebElement To_Date(WebDriver driver){
	 		element=driver.findElement(By.xpath("//input[@id='dtTo']"));
	 		return element; 
	     } 
	 
	 
}
