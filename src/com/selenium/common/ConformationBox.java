package com.selenium.common;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;

	public class ConformationBox {
		
		public static WebElement element=null;
		public static WebDriver driver;
	    	public static  WebElement Popup (WebDriver driver) throws InterruptedException{

		  WebDriverWait wait=new WebDriverWait(driver, 40);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div/span[@class='ext-mb-text']")));
		
		  WebElement r = driver.findElement(By.xpath("//div/span[@class='ext-mb-text']"));
		   String str= r.getText().trim();
		/*   if(str.equalsIgnoreCase("Your record has been saved successfully,Please Re-login to application")) {
			   System.out.println("record is saving successfully");
		   }else if(str.equalsIgnoreCase("Failed to save User :Login Name already exists")){
			   System.out.println("unsuccessfull");
		   } else {
			   System.out.println("ERROR " + str);
		   } */
		  System.out.println("Alert :-" +str);
		  // Thread.sleep(5000);
		   Thread.sleep(5000);

	       driver.findElement(By.xpath("//td[@class='x-btn-center']/em[@unselectable='on']/button[text()='OK']")).click();
	       return element;
	}
	}

