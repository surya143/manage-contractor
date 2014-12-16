package com.selenium.common;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;

		public class Buttons {
			private static WebElement element=null;

			public static WebElement btn_NewRecord(WebDriver driver){
			element = driver.findElement(By.xpath("//button[contains(text(),'New Record')]"));
			element.click();
			return element;
			}

			public static WebElement btn_EditRecord(WebDriver driver){
			    element = driver.findElement(By.xpath("//button[contains(text(),'Edit Record')]"));
			    element.click();
			    return element;
			}

			public static WebElement btn_DeleteRecord(WebDriver driver){
			    element = driver.findElement(By.xpath("//button[contains(text(),'Delete Record')]"));
			    element.click();
			    return element;
			}
			public static WebElement btn_Print(WebDriver driver){
			    element = driver.findElement(By.xpath("//button[contains(text(),'Print')]"));
			    element.click();
			    return element;
			}
			public static WebElement btn_ShowDetails(WebDriver driver){
			    element = driver.findElement(By.xpath("//button[contains(text(),'Show Details')]"));
			    element.click();
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

