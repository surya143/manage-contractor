package com.selenium.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AdminModule {
	public static WebElement element=null;
	public static WebDriver driver;
	public static  WebElement Admin(WebDriver driver){
		        element= driver.findElement(By.xpath("//span[contains(text(),'Administration ')]"));
		        element.click();
		element.click();
		return element;
		
	}
	public static WebElement  ListofMarketFunctionaries (WebDriver driver){
		element =driver.findElement(By.xpath("//a[@class='x-tree-node-anchor']/span[contains(text(),'List of Market Functionaries')]"));
		element.click();
		return element;

	}
    public static WebElement Adminprofile (WebDriver driver){
    	element = (WebElement) driver.findElement(By.xpath("//a[@class='x-tree-node-anchor']/span[text()='Admin Profile']"));
    	element.click();
    	return element;
    }
    public static WebElement DetailsOfCommittee (WebDriver driver){
    	element=(WebElement) driver.findElement(By.xpath("//a[@class='x-tree-node-anchor']/span[text()='Details Of Committee']"));
    	element.click(); 
    	return element ;
    }
    public static WebElement Budget(WebDriver driver){
    	element=(WebElement) driver.findElement(By.xpath("//a[@class='x-tree-node-anchor']/span[text()='Budget']"));
    	element.click();
    	return element;
    }
    public static WebElement AnnualTarget(WebDriver driver){
    	element=(WebElement)driver.findElement(By.xpath("//a[@class='x-tree-node-anchor']/span[text()='Annual Target and Achievement']"));
    	element.click();
    	return element;
    }
    public static WebElement ActionPlan (WebDriver driver){
    	element=(WebElement)driver.findElement(By.xpath("//a[@class='x-tree-node-anchor']/span[text()='Action Plan']"));
    	element.click();
    	return element;
    }
    public static WebElement  CourtCases (WebDriver driver){
    	element=(WebElement)driver.findElement(By.xpath("//a[@class='x-tree-node-anchor']/span[text()='Court Cases']"));
    	element.click();
    	return element;
    }
    public static WebElement Enotice (WebDriver driver){
    	element=(WebElement)driver.findElement(By.xpath("//a[@class='x-tree-node-anchor']/span[text()='E-Notice']"));
    	element.click();
    	return element;
    }
    public static WebElement RetailLicenseHolder (WebDriver driver){
    	element=(WebElement) driver.findElement(By.xpath("//a[@class='x-tree-node-anchor']/span[text()='Retail License Holder']"));
    	element.click();
    	return element;
    }
    public static WebElement CourtCasesStatus (WebDriver driver){
    	element= (WebElement)driver.findElement(By.xpath("//a[@class='x-tree-node-anchor']/span[text()='Court Cases Status']"));
    	element.click();
    		return element;
    	
    }
}
