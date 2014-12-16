package com.selenium.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class REPORTS {
	public static WebElement element=null;
	public static WebDriver driver;
  @Test
  public static WebElement ReportsModule(WebDriver driver){
      element= driver.findElement(By.xpath("//div/div/div/span[contains(text(),'Reports')]"));
      element.click();
      return element;
  }
  public static WebElement Markting(WebDriver driver){
      element= driver.findElement(By.xpath("//a/span[contains(text(),'Marketing')]"));
      element.click();
      return element;
  }
  public static WebElement Financial(WebDriver driver){
      element= driver.findElement(By.xpath("//a/span[contains(text(),'Financial')]"));
      element.click();
      return element;
  }
  public static WebElement MarketingIntelligence(WebDriver driver){
      element= driver.findElement(By.xpath("//a/span[contains(text(),'Marketing Intelligence')]"));
      element.click();
      return element;
  }
  public static WebElement Development(WebDriver driver){
      element= driver.findElement(By.xpath("//a/span[contains(text(),'Development')]"));
      element.click();
      return element;
  }
  public static WebElement AssetManagement(WebDriver driver){
      element= driver.findElement(By.xpath("//a/span[contains(text(),'Asset Management')]"));
      element.click();
      return element;
  }
}
