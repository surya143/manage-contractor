package com.selenium.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ManageContractorElements {
	public static WebElement element=null;
	public static WebDriver driver;
	
	
	// Contractor Details 
	public static WebElement CreationWindow(WebDriver driver){
		  driver.findElement(By.xpath("//div[@id='contractorCreationuserWindow_pnlContractorDetails_Body']")).click();
		
		return element;
		
	}
	public static WebElement Txt_ContactName(WebDriver driver){
		element=driver.findElement(By.xpath("//input[@name='contractorCreationuserWindow_txtContractorName']"));
		return element;
	}	
	
	public static WebElement Txt_Area (WebDriver driver){
		element=driver.findElement(By.xpath("//input[@id='contractorCreationuserWindow_txtArea']"));
		return element;
	}	
	public static WebElement Txt_ContactNumber(WebDriver driver){
		element=driver.findElement(By.xpath("//input[@id='contractorCreationuserWindow_txtContactNumber']"));
		return element;
	}	
	public static WebElement Txt_LicenseNumber(WebDriver driver){
		element=driver.findElement(By.xpath("//input[@id='contractorCreationuserWindow_txtLicenseNumber']"));
		return element;
	}	
	public static WebElement Txt_FirmName(WebDriver driver){
		element=driver.findElement(By.xpath("//input[@id='contractorCreationuserWindow_txtFirmName']"));
		return element;
	}
	// ClassDropdown
	public static WebElement ClassDropdown(WebDriver driver){
		//element=driver.findElement(By.xpath("//img[@id='ext-gen252']"));
		element=driver.findElement(By.xpath("//table/tbody/tr[2]/td[4]/div/div/img"));
		element.click();
//		element= driver.findElement(By.xpath("//div[@class='x-combo-list-inner']/div[text()='A']"));
//		element.click();

		return element;
	}	
	public static WebElement Txt_Note(WebDriver driver){
		element=driver.findElement(By.xpath("//input[@id='contractorCreationuserWindow_txtNote']"));
		return element;
	}	
	public static WebElement Txt_WorksList(WebDriver driver){
		element=driver.findElement(By.xpath("//div/textarea[@id='contractorCreationuserWindow_txtWorklist']"));
		return element;
	}	
	public static WebElement Txt_History(WebDriver driver){
		element=driver.findElement(By.xpath("//div/textarea[@name='contractorCreationuserWindow_txtHistory']"));
		return element;
	}	
	
	// OtherDetails Tab 
	public static WebElement OtherDetailsTab (WebDriver driver){
		element=driver.findElement(By.xpath("//li/a/em/span[@class='x-tab-strip-inner']/span[text()='Other Details']"));
		element.click();
		return element;
	}	
	public static WebElement txtSolvency(WebDriver driver){
		element=driver.findElement(By.xpath("//div[@Class='x-panel-ml']"));
		 element.click();
		 element= driver.findElement(By.xpath("//div[@Class='x-panel-mr']"));
		  element.click();
		  element=driver.findElement(By.xpath("//div[@Class='x-panel-mc']"));
		  element.click();
		element= driver.findElement(By.xpath("//tr/td/div/input[@name='contractorCreationuserWindow_txtSolvency']"));
		return element;
	}	
	public static WebElement FirmTypeDropDown(WebDriver driver){
		//element=driver.findElement(By.xpath("//img[@id='ext-gen307']"));
		element=driver.findElement(By.xpath("//table/tbody/tr[2]/td[2]/div/div/img"));
		element.click();
//		element=  driver.findElement(By.xpath("//div[@class='x-combo-list-inner']/div[text()='proprietor']"));
//		element.click();

		return element;
	}	public static WebElement txtTechQualification(WebDriver driver){
		element=driver.findElement(By.xpath("//input[@id='contractorCreationuserWindow_txtTechQualification']"));
		return element;
	}	public static WebElement BlockListDropdown(WebDriver driver){
		//element=driver.findElement(By.xpath("//img[@id='ext-gen339']"));
		element=driver.findElement(By.xpath("//table/tbody/tr[4]/td[2]/div/div/img"));
		element.click();
		//element=driver.findElement(By.xpath("//div[@class='x-combo-list-inner']/div[text()='No']"));
        //element.click();
		return element;
	}	
	public static WebElement Txt_Address(WebDriver driver){
		element=driver.findElement(By.xpath("//div/textarea[@id='contractorCreationuserWindow_txtContractorAddress']"));
		return element;
	}	
	public static WebElement Qualification(WebDriver driver){
		element=driver.findElement(By.xpath("//div[@id='contractorCreationuserWindow_txtQualification_Container']/input[@name='contractorCreationuserWindow_txtQualification']")); 
		return element;
	}	
	
	public static WebElement Txt_TechPersonName(WebDriver driver){
		
		element=driver.findElement(By.xpath("//input[@id='contractorCreationuserWindow_txtTechPersonname']"));
		return element;
	}	
	public static WebElement  PenalitiesDropdown(WebDriver driver){
		element=driver.findElement(By.xpath("//table/tbody/tr[3]/td[4]/div/div/img"));

		//element=driver.findElement(By.xpath("//img[@id='ext-gen327']"));
		element.click();
		//element=driver.findElement(By.xpath("//*[@id='ext-gen454']/div[2]"));

		return element;
	}
	public static WebElement Txt_PenaltyDetails(WebDriver driver){
		element=driver.findElement(By.xpath("//div/textarea[@name='contractorCreationuserWindow_txtPenaltyDetails']"));
		return element;
	}
     public static WebElement SaveButton(WebDriver driver){
		element=driver.findElement(By.xpath("//button[text()='Save']"));
		element.click();
		return element;
	}
     public static WebElement CloseButton(WebDriver driver){
		element=driver.findElement(By.xpath("//button[text()='Close']"));
		element.click();
		return element;
	}

    
}
