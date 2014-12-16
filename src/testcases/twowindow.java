package testcases;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
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

@Test
public class twowindow {
	public static WebElement element=null;
	public static WebDriver driver;

	String RoadNumber="sudharroad";
	String Particular="Cement_KCP";
	String Quantity="100";
	String Rate="300";
    String WorkName="aaaa";

	private boolean flag;
	private Object workname; 
	@BeforeTest
	public void a() throws InterruptedException {
		  driver = new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
			driver.manage().window().maximize();

		  Loginpage.LoadPage(driver);
	      sigin.signin(driver, "bidarapmc", "vsspl");
	  }
	
	@Test 
	public void b() throws InterruptedException{
     Thread.sleep(1000);	     
	      boolean flag=false;
	      driver.switchTo().defaultContent();
	      Dev_module.Development_module(driver);
	      Dev_module.Work_allocation(driver);
	      driver.switchTo().frame("4008_IFrame");
	      Thread.sleep(2000);
	     
	     
	     
	    //  System.out.println("Date Selected ");
	      // search button
	      driver.findElement(By.xpath("//button[text()='Show Details']")).click();
	     /// System.out.println("show button");

	      String PageCount = driver.findElement(By.xpath("//table/tbody/tr/td[6]/span")).getText();
	     // System.out.println(PageCount);
	      PageCount = PageCount.replace("of ", "");
	      Integer PageCount_int = Integer.parseInt(PageCount);
	     // System.out.println("wwwwwwwwwwwwwwwww"+PageCount);
	      Thread.sleep(1000);
	      WebElement Web=driver.findElement(By.xpath("//div[@class='x-grid3-body']/div"));
	      String W=Web.getText();
	      //System.out.println(W);
	     
	      for(int  i=0; i<=PageCount_int;i++){
	    	  System.out.println(PageCount_int);
	          List<WebElement> Count=driver.findElements(By.xpath("//div[@class='x-grid3-body']/div"));
	          int D=Count.size();
	         //System.out.println(D);
	          for (int j=1; j<=D;j++){
	              WebElement Grid = driver.findElement(By.xpath("//div[@class='x-grid3-body']/div[" + j + "]/table/tbody/tr/td[3]/div"));
	              String T = Grid.getText();
	               System.out.println(T);
	             if (T.equals(WorkName)){
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
	 
	
	      Thread.sleep(2000);
   
	 Buttons.btn_EditRecord(driver);    
     Thread.sleep(2000);
	      
	      
    String start_date = driver.findElement(By.xpath("//table/tbody/tr[5]/td[2]/div[@id='workAllotmentuserWindow_dtWorkStartedDate_Container']/div/input")).getAttribute("value");
    Thread.sleep(2000);
    
    System.out.println("Start date = " +start_date);
    String end_date = driver.findElement(By.xpath("//table/tbody/tr[5]/td[2]/div/div/input[@id='workAllotmentuserWindow_dtWorkCompletionDate']")).getAttribute("value");
    System.out.println("End Date = " +end_date);
    
    
   /* Buttons.btn_NewRecord(driver);
    YardMaintenance.Date(driver);
    //FromDatepickerinGrid.monthyear_selection(driver);
	driver.findElement(By.xpath("//td[@class='x-btn-center']/em[@unselectable='on']/button[text()='December 2014']")).click();

    Month_Selection.month_Augest(driver);
	Year_selection.Year_2014(driver);
    Thread.sleep(1000);
    FromDatepickerinGrid.ok_button(driver);
    Dates_Selection.date_10(driver);
	Thread.sleep(1000);
	YardMaintenance.Maintenance_Dropdown(driver);
	Thread.sleep(1000);
	driver.findElement(By.xpath("//div[@class='x-combo-list-inner']/div[text()='StreetLights']")).click();
	Thread.sleep(1000);
	YardMaintenance.txtRoadNumber(driver).sendKeys(RoadNumber);
	YardMaintenance.txtParticular(driver).sendKeys(Particular);	
	YardMaintenance.txtQuantity(driver).sendKeys(Quantity);
	YardMaintenance.txtRate(driver).sendKeys(Rate);
	YardMaintenance.button_Insert(driver);
	YardMaintenance.ContractorFirmName_DropDown(driver);
	Thread.sleep(1000);	
	driver.findElement(By.xpath("//div[@class='x-combo-list-inner']/div[text()='rambabu']")).click();
	Thread.sleep(1000);	
	Buttons.SaveButton(driver);
	ConformationBox.Popup(driver);
	Buttons.CloseButton(driver);*/
	//Thread.sleep(2000);
	//driver.findElement(By.xpath("//table[@class='x-btn-wrap x-btn ']/tbody/tr/td[@class='x-btn-center']/em/button[@class='x-btn-text']")).click();
	//Thread.sleep(1000);
	//Month_Selection.month_October(driver);
	//driver.findElement(By.xpath("//td[@class='x-date-mp-month x-date-mp-sep']/a[contains(text(),'Dec')]")).click();
	//Thread.sleep(1000);
  	//driver.findElement(By.xpath("//td[@class='x-date-mp-year']/a[contains(text(),'2012')]")).click();

	/*driver.findElement(By.xpath("//td[@class='x-btn-center']/em[@unselectable='on']/button[contains(text(),'November 2014')]")).click();
  	driver.findElement(By.xpath("//td[@class='x-date-mp-month']/a[contains(text(),'Apr')]")).click();
  	driver.findElement(By.xpath("//td[@class='x-date-mp-year x-date-mp-sel']/a[contains(text(),'2014')]")).click();
  	driver.findElement(By.xpath("//button[@class='x-date-mp-ok']")).click();*/
	
	/*String handle=driver.getWindowHandle();
	Set<String> handles = driver.getWindowHandles();
	 String Parent_Window = driver.getWindowHandle();
	 for(String hnd:handles){

		 if(!hnd.equals(handle)){
			// System.out.println(handle);

			 driver.switchTo().window(hnd);
			 driver.manage().window().maximize();
		 }
	 }
	 String H=driver.findElement(By.xpath("//tr/td[2]/div[text()='Main Report']")).getText();
	 System.out.println(H);
		// driver.findElement(By.xpath("//[@id='Box1']"));
		 Thread.sleep(1000);
			//System.out.println(driver.getTitle());
			driver.switchTo().defaultContent();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//div[@name='developmentReportsViewer$ctl01']"));
		 System.out.println("hhhh");*/
// driver.close();
 /*driver.switchTo().window(handle);
 System.out.println(driver.getTitle());*/
	}
	 //@Test(priority=2)
	  public void GridVerification()throws InterruptedException { 
	     
	      driver.switchTo().defaultContent();
	      boolean flag=false;
	      Thread.sleep(1000);
	      //Dev_module.Development_module(driver);
	        Dev_module.Yard_maintenance(driver);
	      driver.switchTo().frame("4046_IFrame");
	      Thread.sleep(1000);
	      FromDatepickerinGrid.date_icon(driver);
	     // FromDatepickerinGrid.monthyear_selection(driver);
	  	driver.findElement(By.xpath("//td[@class='x-btn-center']/em[@unselectable='on']/button[text()='December 2014']")).click();
	      Month_Selection.month_Augest(driver);
	      Thread.sleep(1000);
	      FromDatepickerinGrid.ok_button(driver);
	      Thread.sleep(1000);
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
	     
	      for(int  i=0; i<PageCount_int;i++){
	          List<WebElement> Count=driver.findElements(By.xpath("//div[@class='x-grid3-body']/div"));
	          int D=Count.size();
	        //  System.out.println(D);
	          for (int j=1; j<D;j++){
	              WebElement Grid = driver.findElement(By.xpath("//div[@class='x-grid3-body']/div[" + j + "]/table/tbody/tr/td[4]/div"));
	              String T = Grid.getText();
	               System.out.println(T);
	              if (T.equals(RoadNumber)){
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
	      System.out.println(flag);

	      if(!flag) {
	          System.out.println("Record not Found ");
	      }
	  }
	 
	 
	 
	 //@Test(priority=2)
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
	     
	      for(int  i=0; i<PageCount_int;i++){
	          List<WebElement> Count=driver.findElements(By.xpath("//div[@class='x-grid3-body']/div"));
	          int D=Count.size();
	        //  System.out.println(D);
	          for (int r=1; r<D;r++){
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
