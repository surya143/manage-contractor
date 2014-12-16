package testcases;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.xerces.impl.dv.xs.DayDV;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.seleniumhq.jetty7.server.Authentication.Deferred;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.selenium.actions.sigin;
import com.selenium.common.Buttons;
import com.selenium.pageobject.Dev_module;
import com.selenium.pageobject.Loginpage;
public class Pratice {
	
	public static WebElement element=null;
	public static WebDriver driver;
	 static String Workname="aaaa";
	@BeforeTest
	public  void main() throws InterruptedException{
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	  Loginpage.LoadPage(driver);
	  sigin.signin(driver, "bidarapmc", "vsspl");
	  //driver.manage().window().maximize();    
	  /*Thread.sleep(1000);
	  driver.findElement(By.xpath("//div[@id='contractorCreationuserWindow_pnlContractorDetails_Body']")).click();
	  driver.findElement(By.xpath("//input[@id='contractorCreationuserWindow_txtContractorName']")).sendKeys("rajesh");
	  driver.findElement(By.xpath("//input[@id='contractorCreationuserWindow_txtArea']")).sendKeys("Hyd");
	  driver.findElement(By.xpath("//input[@id='contractorCreationuserWindow_txtContactNumber']")).sendKeys("6655889944");
	  driver.findElement(By.xpath("//input[@id='contractorCreationuserWindow_txtLicenseNumber']")).sendKeys("44555666");
	  driver.findElement(By.xpath("//input[@id='contractorCreationuserWindow_txtFirmName']")).sendKeys("Ragesh Contractor firmname");
	  
	  driver.findElement(By.xpath("//img[@id='ext-gen252']")).click();
	  driver.findElement(By.xpath("//div[@class='x-combo-list-inner']/div[text()='A']")).click();

	  driver.findElement(By.xpath("//input[@id='contractorCreationuserWindow_txtNote']")).sendKeys("Ragesh Contractor");
	  driver.findElement(By.xpath("//div/textarea[@id='contractorCreationuserWindow_txtWorklist']")).sendKeys("in Progress");
	  driver.findElement(By.xpath("//div/textarea[@id='contractorCreationuserWindow_txtHistory']")).sendKeys("Good");

	    //OtherTab
	  driver.findElement(By.xpath("//li/a/em/span[@class='x-tab-strip-inner']/span[text()='Other Details']")).click();
	 // driver.findElement(By.xpath("//div[id='contractorCreationuserWindow_pnlOtherDetails_Container']")).click();
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//div[@Class='x-panel-ml']")).click();
	  driver.findElement(By.xpath("//div[@Class='x-panel-mr']")).click();
	  driver.findElement(By.xpath("//div[@Class='x-panel-mc']")).click();
	 
	 // driver.findElement(By.xpath("//div[id='contractorCreationuserWindow_pnlOtherDetails_Body']")).click();
	 // driver.findElement(By.xpath("//div[id='contractorCreationuserWindow_txtSolvency_Container']")).click();

	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//tr/td/div/input[@name='contractorCreationuserWindow_txtSolvency']")).sendKeys("financial obligations");
	  ///Firm Type Dropdown
	  driver.findElement(By.xpath("//img[@id='ext-gen307']")).click();
	  driver.findElement(By.xpath("//div[@class='x-combo-list-inner']/div[text()='proprietor']")).click();
	  //
	  driver.findElement(By.xpath("//input[@id='contractorCreationuserWindow_txtTechQualification']")).sendKeys("Civil certified");
	  //Block List
	  driver.findElement(By.xpath("//img[@id='ext-gen339']")).click();
	  driver.findElement(By.xpath("//div[@class='x-combo-list-inner']/div[text()='No']")).click();
	  
	  
	  driver.findElement(By.xpath("//div/textarea[@id='contractorCreationuserWindow_txtContractorAddress']")).sendKeys("Sec");
	  driver.findElement(By.xpath("//div[@id='contractorCreationuserWindow_txtQualification_Container']/input[@name='contractorCreationuserWindow_txtQualification']")).sendKeys("Civil");
	  driver.findElement(By.xpath("//input[@id='contractorCreationuserWindow_txtTechPersonname']")).sendKeys("samprasad");
	  
	  //  Penalities
	 driver.findElement(By.xpath("//table/tbody/tr[3]/td[4]/div[@id='contractorCreationuserWindow_cmbPenalities_Container']/div/img")).click();
	//driver.findElement(By.xpath("//div[@class='']div[@class='x-combo-list-inner']/div[contains(text(),'No')]")).click();
	// driver.findElement(By.xpath("//html/body/div[6]/div/div[2]")).click();
     driver.findElement(By.xpath("//div/div[@class='x-combo-list-inner']/div[@class='x-combo-list-item x-combo-selected']")).click();
	  System.out.println("going in");

	 // driver.findElement(By.xpath("//*[@id='ext-gen454']/div[2]")).click();

	  
	 driver.findElement(By.xpath("//div/textarea[@id='contractorCreationuserWindow_txtPenaltyDetails']")).sendKeys("Northing");
	 // Save 
	 // driver.findElement(By.xpath("//table[@id='UserRegisterWindow_btnTraderDetSave']")).click();
	  
	  

	  driver.findElement(By.xpath("//button[text()='Save']")).click();
	  System.out.println("PPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPP@@@@@@@@@@LLLLLLL");
	  ConformationBox.Popup(driver);
	  driver.findElement(By.xpath("//button[text()='Close']")).click();
	   	driver.findElement(By.xpath("//table/tbody/tr/td[3]/div/img")).click();
	  	Thread.sleep(1000);
	  	driver.findElement(By.xpath("//td[@class='x-btn-center']/em[@unselectable='on']/button[contains(text(),'November 2014')]")).click();
	  	driver.findElement(By.xpath("//td[@class='x-date-mp-month']/a[contains(text(),'Apr')]")).click();
	  	driver.findElement(By.xpath("//td[@class='x-date-mp-year x-date-mp-sel']/a[contains(text(),'2014')]")).click();
	  	driver.findElement(By.xpath("//button[@class='x-date-mp-ok']")).click();
	    driver.findElement(By.xpath("//table/tbody/tr[1]/td[3]/a/em/span[contains(text(),'1')]")).click();
	    
	   WebElement dateWidget =driver.findElement(By.xpath("//table[@class='x-date-inner']/tbody"));
  	  dateWidget.getText();
  	  List<WebElement> rows=dateWidget.findElements(By.tagName("tr")); 
      int R=rows.size();
  	  List<WebElement> columns=dateWidget.findElements(By.tagName("td")); 
  	 int C=columns.size();
 	 // System.out.println(C); 	  
 	 for (WebElement cell: columns){  
 		   //Select 13th Date   
 		   if (cell.getText().equals("20")){  
 		   cell.findElement(By.linkText("20")).click();  
 		   break;  
 		   }  
 		  }    

	    */
}
//@Test(priority=1)
public void Creation() throws InterruptedException{

	  Thread.sleep(1000);
	  Dev_module.Development_module(driver);
	  Dev_module.Work_allocation(driver);
	  driver.manage().window().maximize();
	  Thread.sleep(1000);
	  driver.switchTo().frame("4008_IFrame");
	  Thread.sleep(1000);
      boolean flag=false;
	     
	     
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
	             if (T.equals(Workname)){
	                  //System.out.println(Grid);
	                  Grid.click();
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
	      //System.out.println(flag);

	      if(!flag) {
	          System.out.println("Record not Found ");
	      }
	   /*   Thread.sleep(1000);
	      Buttons.btn_EditRecord(driver);
	      Thread.sleep(2000);
	      
	      
	      String start_date = driver.findElement(By.xpath("//table/tbody/tr[5]/td[2]/div[@id='workAllotmentuserWindow_dtWorkStartedDate_Container']/div/input")).getAttribute("value");
	      Thread.sleep(2000);
	      
	      System.out.println("Start date = " +start_date);
	      String end_date = driver.findElement(By.xpath("//table/tbody/tr[5]/td[2]/div/div/input[@id='workAllotmentuserWindow_dtWorkCompletionDate']")).getAttribute("value");
	      System.out.println("End Date = " +end_date);
	    	  */
	      
	  }
//@Test(priority=2)
public void date() throws InterruptedException{
	
	
	 Thread.sleep(1000);
     Buttons.btn_EditRecord(driver);
     Thread.sleep(2000);
     
     
     String start_date = driver.findElement(By.xpath("//table/tbody/tr[5]/td[2]/div[@id='workAllotmentuserWindow_dtWorkStartedDate_Container']/div/input")).getAttribute("value");
     Thread.sleep(2000);
     
     System.out.println("Start date = " +start_date);
     String end_date = driver.findElement(By.xpath("//table/tbody/tr[5]/td[2]/div/div/input[@id='workAllotmentuserWindow_dtWorkCompletionDate']")).getAttribute("value");
     System.out.println("End Date = " +end_date);
   	  
}


}
