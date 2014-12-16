package testcases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

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
import com.selenium.pageobject.YardMaintenanceElements;

public class Yard_MaintenanceCreation {
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
	public void Creation() throws InterruptedException{
     Thread.sleep(1000);
    driver.switchTo().defaultContent();

	Dev_module.Development_module(driver);
	Dev_module.Yard_maintenance(driver);
	Thread.sleep(1000);
    driver.switchTo().frame("4046_IFrame");
    Buttons.btn_NewRecord(driver);
    YardMaintenanceElements.Date(driver);
    Month_Year_selection.December(driver);
    Month_Selection.month_Augest(driver);
	Year_selection.Year_2014(driver);
    Thread.sleep(1000);
    FromDatepickerinGrid.ok_button(driver);
    Dates_Selection.date_10(driver);
	Thread.sleep(1000);
	YardMaintenanceElements.Maintenance_Dropdown(driver);
	Thread.sleep(1000);
	driver.findElement(By.xpath("//div[@class='x-combo-list-inner']/div[text()='WaterTanks']")).click();
	Thread.sleep(1000);
	YardMaintenanceElements.txtRoadNumber(driver).sendKeys(RoadNumber);
	YardMaintenanceElements.txtParticular(driver).sendKeys(Particular);	
	YardMaintenanceElements.txtQuantity(driver).sendKeys(Quantity);
	YardMaintenanceElements.txtRate(driver).sendKeys(Rate);
	YardMaintenanceElements.button_Insert(driver);
	YardMaintenanceElements.ContractorFirmName_DropDown(driver);
	Thread.sleep(1000);	
	driver.findElement(By.xpath("//div[@class='x-combo-list-inner']/div[text()='rambabu']")).click();
	Thread.sleep(1000);	
	Buttons.SaveButton(driver);
	ConformationBox.Popup(driver);
	Buttons.CloseButton(driver);
	//driver.findElement(By.xpath("//table/tbody/tr/td[2]/em/button[@class='x-btn-text x-tbar-loading']")).click();
	driver.navigate().refresh();  
	 Thread.sleep(1000);
    driver.switchTo().defaultContent();

	}
	@Test(priority=2)
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
	               System.out.println(T);
	             if (T.equals(Maintenance_OF)){
	                  //System.out.println(Grid);
	                  Grid.click();
	                  System.out.println("Yard_MaintenanceCreation Record found at grid " + i + " Page");
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
	          System.out.println("Yard_MaintenanceCreation Record found at grid Record not Found ");
	      }
	  }
	
	
	
	@Test(priority=3)
	 public void GridVerification2()throws InterruptedException { 
	     
	      driver.switchTo().defaultContent();
	      boolean flag=false;
	      //System.out.println("Comming to C");
	      Thread.sleep(1000);
	       // Dev_module.Development_module(driver);
	        Dev_module.Yard_maintenance(driver);
	      driver.switchTo().frame("4046_IFrame");
	      Thread.sleep(1000);
	   

	      String PageCount = driver.findElement(By.xpath("//table/tbody/tr/td[6]/span")).getText();
	      //System.out.println(PageCount);
	      PageCount = PageCount.replace("of ", "");
	      Integer PageCount_int = Integer.parseInt(PageCount);
	      //System.out.println("wwwwwwwwwwwwwwwww"+PageCount_int);
	      Thread.sleep(1000);
	      WebElement Web=driver.findElement(By.xpath("//div[@class='x-grid3-body']/div"));
	      String W=Web.getText();
	     // System.out.println(W);
	     
	      for(int  i=0; i<=PageCount_int;i++){
	          List<WebElement> Count=driver.findElements(By.xpath("//div[@class='x-grid3-body']/div"));
	          int D=Count.size();
	        //  System.out.println(D);
	          for (int r=1; r<=D;r++){
	              WebElement Grid = driver.findElement(By.xpath("//div[@class='x-grid3-body']/div["+r+"]/table/tbody/tr/td[1]/div"));
	              String T = Grid.getText();
	               System.out.println(T);
	              if (T.contains(Particular)){
	                  //System.out.println(Grid);
	                  //Grid.click();
	            	  driver.findElement(By.xpath("//div[@class='x-grid3-body']/div["+r+"]/table/tbody/tr/td[1]/div")).click();
	                  System.out.println("Record found at " + i + " Page");
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
	      System.out.println(flag);

	      if(!flag) {
	          System.out.println("Record not Found ");
	      }
	  }	 
	
	 }

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

