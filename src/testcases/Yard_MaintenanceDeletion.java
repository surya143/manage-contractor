package testcases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.javascript.configuration.JavaScriptConfiguration;
import com.selenium.actions.sigin;
import com.selenium.common.Buttons;
import com.selenium.common.ConformationBox;
import com.selenium.common.Dates_Selection;
import com.selenium.common.FromDatepickerinGrid;
import com.selenium.common.Month_Selection;
import com.selenium.common.Month_Year_selection;
import com.selenium.common.Year_selection;
import com.selenium.pageobject.Dev_module;
import com.selenium.pageobject.Loginpage;

public class Yard_MaintenanceDeletion {
	public static WebElement element=null;
	public static WebDriver driver;
	
	
	String Maintenance_OF="WaterTanks";
	String RoadNumber="MTS_Road";
	String Particular="Cement_KCP";
	String Quantity="200";
	String Rate="200";
	
	@BeforeTest
	public void login() throws InterruptedException {
		  driver = new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
			driver.manage().window().maximize();

		  Loginpage.LoadPage(driver);
	      sigin.signin(driver, "bidarapmc", "vsspl");
	  }	
	
	
	@Test(priority=1)
	 public void GridVerification()throws InterruptedException { 
	     
	      driver.switchTo().defaultContent();
	      boolean flag=false;
	      Thread.sleep(1000);
	      Dev_module.Development_module(driver);
	      Dev_module.Yard_maintenance(driver);
	      driver.switchTo().frame("4046_IFrame");
	      Thread.sleep(2000);
	      FromDatepickerinGrid.date_icon(driver);
	      Month_Year_selection.December(driver);
	      Month_Selection.month_April(driver);
	      Year_selection.Year_2014(driver);
	      FromDatepickerinGrid.ok_button(driver);
	      Dates_Selection.date_1(driver);
	     
	     
	    //  System.out.println("Date Selected ");
	      // search button
	      driver.findElement(By.xpath("//button[text()='Show Details']")).click();
	     /// System.out.println("show button");

	      String PageCount = driver.findElement(By.xpath("//table/tbody/tr/td[6]/span")).getText();
	     // System.out.println(PageCount);
	      PageCount = PageCount.replace("of ", "");
	      Integer PageCount_int = Integer.parseInt(PageCount);
	      //System.out.println("wwwwwwwwwwwwwwwww"+PageCount_int);
	      Thread.sleep(1000);
	      WebElement Web=driver.findElement(By.xpath("//div[@class='x-grid3-body']/div"));
	      String W=Web.getText();
	      //System.out.println(W);
	     
	      for(int  i=0; i<=PageCount_int;i++){
	          List<WebElement> Count=driver.findElements(By.xpath("//div[@class='x-grid3-body']/div"));
	          int D=Count.size();
	        //  System.out.println(D);
	          for (int j=1; j<=D;j++){
	              WebElement Grid = driver.findElement(By.xpath("//div[@class='x-grid3-body']/div[" + j + "]/table/tbody/tr/td[3]/div"));
	              String T = Grid.getText();
	              //System.out.println(T);
	             if (T.equals(Maintenance_OF)){
	                  //System.out.println(Grid);
	                  Grid.click();
	                  System.out.println("Yard_Maintenance Created  Record found at " + i + " Page");
	                  flag=true;
	                  break;
	          }      
	          }
	          if (flag) {

	              break;
	          }

	           else {
	                  driver.findElement(By.xpath("//tbody/tr/td[@class='x-btn-center']/em/button[@class='x-btn-text x-tbar-page-next']")).click();
	          }
	      }
	      //System.out.println(flag);

	      if(!flag) {
	          System.out.println("Yard_Maintenance Created Record not Found ");
	      }
	      Thread.sleep(1000);
	      Buttons.btn_DeleteRecord(driver);
	      Thread.sleep(1000);
	      Alert alert = driver.switchTo().alert();
          String AlertText = alert.getText();
          System.out.println(AlertText);
          alert.accept();	      
          Thread.sleep(1000);
	      ConformationBox.Popup(driver);

	  }
	
	
	@Test(priority=2)
	 public void DeleteGridVerification()throws InterruptedException { 
	      Thread.sleep(2000);
			driver.navigate().refresh();  
		 driver.switchTo().defaultContent();
	      boolean flag=false;
	      Thread.sleep(1000);
	      Dev_module.Development_module(driver);
	      Dev_module.Yard_maintenance(driver);
	      driver.switchTo().frame("4046_IFrame");
	      Thread.sleep(2000);
	      FromDatepickerinGrid.date_icon(driver);
	      Month_Year_selection.December(driver);
	      Month_Selection.month_April(driver);
	      Year_selection.Year_2014(driver);
	      FromDatepickerinGrid.ok_button(driver);
	      Dates_Selection.date_1(driver);
	     
	     
	    //  System.out.println("Date Selected ");
	      // search button
	      driver.findElement(By.xpath("//button[text()='Show Details']")).click();
	     /// System.out.println("show button");

	      String PageCount = driver.findElement(By.xpath("//table/tbody/tr/td[6]/span")).getText();
	     // System.out.println(PageCount);
	      PageCount = PageCount.replace("of ", "");
	      Integer PageCount_int = Integer.parseInt(PageCount);
	      //System.out.println("wwwwwwwwwwwwwwwww"+PageCount_int);
	      Thread.sleep(1000);
	      WebElement Web=driver.findElement(By.xpath("//div[@class='x-grid3-body']/div"));
	      String W=Web.getText();
	      //System.out.println(W);
	     
	      for(int  i=0; i<=PageCount_int;i++){
	          List<WebElement> Count=driver.findElements(By.xpath("//div[@class='x-grid3-body']/div"));
	          int D=Count.size();
	        //  System.out.println(D);
	          for (int j=1; j<=D;j++){
	              WebElement Grid = driver.findElement(By.xpath("//div[@class='x-grid3-body']/div[" + j + "]/table/tbody/tr/td[3]/div"));
	              String T = Grid.getText();
	               //System.out.println(T);
	             if (T.equals(Maintenance_OF)){
	                  //System.out.println(Grid);
	                  Grid.click();
	                  System.out.println("Deleted Yard_maintenance Record found at " + i + " Page");
	                  flag=true;
	                  break; 
	          }      
	          }
	          if (flag) {

	              break;
	          }

	           else {
	                  driver.findElement(By.xpath("//tbody/tr/td[@class='x-btn-center']/em/button[@class='x-btn-text x-tbar-page-next']")).click();
	          }
	      }
	      //System.out.println(flag);

	      if(!flag) {
	          System.out.println("Deleted Yard_maintenance not Found ");
	      }
	 }
	
	
}
