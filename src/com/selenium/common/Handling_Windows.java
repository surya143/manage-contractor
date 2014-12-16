package com.selenium.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Handling_Windows {
	public static WebElement element=null;
	public static WebDriver driver;
	
	public static void Switch_to_Window(WebDriver driver) throws InterruptedException{
		 driver.getWindowHandle();
		    Thread.sleep(1000);
		    String main = driver.getWindowHandle();
		    for (String DevelopmentDetailsreport_Window : driver.getWindowHandles())
		    {
		    driver.switchTo().window(DevelopmentDetailsreport_Window);
		    Thread.sleep(1000);
		    }
		  	 
	   return;
	  }
}
