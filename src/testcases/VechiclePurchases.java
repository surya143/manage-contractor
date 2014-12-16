package testcases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
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
import com.selenium.common.REPORTS;
import com.selenium.common.Year_selection;
import com.selenium.pageobject.Assetmanagment_Module;
import com.selenium.pageobject.Dev_module;
import com.selenium.pageobject.Loginpage;
import com.selenium.pageobject.Vechicle_Purchases_Elements;

public class VechiclePurchases {
	public static WebElement element=null;
	public static WebDriver driver;
	String Vehiclename = "lorry";
	String Reg_Number ="TS-0145";
  @BeforeTest
	public void login() throws InterruptedException {
		   driver = new FirefoxDriver();

			driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
			driver.manage().window().maximize();

		  Loginpage.LoadPage(driver);
	      sigin.signin(driver, "bidarapmc", "vsspl");
	     
	  }
  //@Test(priority=1)
	public void vechicle_Purchases() throws InterruptedException {
		driver.switchTo().defaultContent();
		 boolean flag=false;
		 
        Assetmanagment_Module.Asset_Mod(driver);
        Assetmanagment_Module.VechiclePurchases(driver);
	     driver.switchTo().frame("4000_IFrame");
	     Thread.sleep(1000);
	    Buttons.btn_NewRecord(driver);
	    Thread.sleep(1000);
	    Vechicle_Purchases_Elements.Transaction_Type(driver);
		Thread.sleep(1000);	
	    driver.findElement(By.xpath("//div[@class='x-combo-list-inner']/div[2]")).click();
		Thread.sleep(1000);	
	    Vechicle_Purchases_Elements.VehicleNo_textbox(driver).sendKeys(Reg_Number);
	    Vechicle_Purchases_Elements.EngineNo_textbox(driver).sendKeys("LAD-44227798");
	    Vechicle_Purchases_Elements.VehicleLifeYears_textbox(driver).sendKeys("10");
	    Vechicle_Purchases_Elements.Warranty_In_Kms_textbox(driver).sendKeys("10000");
	    Vechicle_Purchases_Elements.Vehiclename_textbox(driver).sendKeys(Vehiclename);
	    Vechicle_Purchases_Elements.Model_textbox(driver).sendKeys("2014");
	    Vechicle_Purchases_Elements.ChassisNO_textbox(driver).sendKeys("TD-1441");
	    Thread.sleep(1000);
	    Vechicle_Purchases_Elements.Warranty_Period_Date(driver);
	    //driver.findElement(By.xpath("//table/tbody/tr[5]/td[4]/div/div/img")).click();
	    Month_Year_selection.December(driver);
	    Month_Selection.month_April(driver);
	    Year_selection.Year_2015(driver);
	    FromDatepickerinGrid.ok_button(driver);
	    Dates_Selection.date_1(driver);
	    Thread.sleep(1000);
	    Vechicle_Purchases_Elements.Value_textbox(driver).sendKeys("100000");
	    Thread.sleep(1000);

	    Vechicle_Purchases_Elements.Area_textbox(driver).sendKeys("Ameerpet");
	    Vechicle_Purchases_Elements.Address_textbox(driver).sendKeys("Hyd");
		//driver.findElement(By.xpath("//textarea[@name='VehiclePurchaseuserWindow_txtAddress']")).sendKeys("hyd");

	    Vechicle_Purchases_Elements.DealerName_textbox(driver).sendKeys("kumar");
	    Vechicle_Purchases_Elements.PhoneNo_textbox(driver).sendKeys("2255668874");
	    Vechicle_Purchases_Elements.Note_textbox(driver).sendKeys("purchase new vechicle ");
	    Buttons.SaveButton(driver);
	    ConformationBox.Popup(driver);
	    Buttons.CloseButton(driver);	    
  }
   //@Test(priority=2)
  public void vechicle_PurchasesGridVerification()throws InterruptedException { 
	     
      driver.switchTo().defaultContent();
      boolean flag=false;
      Thread.sleep(1000);
      driver.navigate().refresh();
      Assetmanagment_Module.Asset_Mod(driver);
      Assetmanagment_Module.VechiclePurchases(driver);
      driver.switchTo().frame("4000_IFrame");
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
             if (T.equals(Vehiclename)){
                  //System.out.println(Grid);
                  Grid.click();
                  System.out.println("vechicle_Purchases Creation Record found at grid " + i + " Page");
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
          System.out.println("vechicle_Purchases Creation Record found at grid Record not Found ");
      }
  }
  //@Test(priority=3)
   public void vechicle_Allotment()throws InterruptedException { 
      driver.switchTo().defaultContent();
	  Assetmanagment_Module.VechicleAllotment(driver);
	  driver.switchTo().frame("4001_IFrame");
      Thread.sleep(2000);
	  Buttons.btn_NewRecord(driver);
	  driver.findElement(By.xpath("//table/tbody/tr[1]/td[4]/div/div/img")).click();
	  Thread.sleep(1000);
		 List<WebElement> Countofcombo =driver.findElements(By.xpath("//div[@class='x-combo-list-inner']/div"));
		   int Count =Countofcombo.size();
		 //  System.out.println(Count);
		    boolean flag = false;
			for(int i=1;i<=Count;i++){
	             WebElement Reg_N = driver.findElement(By.xpath("//div[@class='x-combo-list-inner']/div["+i+"]"));
	             String reg = Reg_N.getText();
	             //System.out.println(reg);
	             if(reg.equals(Reg_Number)){
	                
	                 driver.findElement(By.xpath("//div[@class='x-combo-list-inner']/div["+i+"]")).click();
	                 System.out.println("Reg_Number  found"+reg);   
	                 flag=true;
	                 break;
	             }       
	       }
		    if(flag){
		    	//System.out.println(" Found");
		    	
		    } else {
		    	System.out.println("Not found");
		    }
		    
		    WebElement objVehicleAllotmentuserWindow_txtVehicleName=driver.findElement(By.id("VehicleAllotmentuserWindow_txtVehicleName"));
		     ((JavascriptExecutor) driver).executeScript("document.getElementsByName('VehicleAllotmentuserWindow_txtVehicleName')[0].removeAttribute('disabled');");
		     Thread.sleep(2000);
		     String str=objVehicleAllotmentuserWindow_txtVehicleName.getAttribute("value");
		     System.out.println(str);
   }
  //@Test(priority=4)
  public void vechicle_Repairs()throws InterruptedException { 
      driver.switchTo().defaultContent();
      //Assetmanagment_Module.Asset_Mod(driver);
	  Assetmanagment_Module.VechicleRepairs(driver);
	  driver.switchTo().frame("4003_IFrame");
      Thread.sleep(2000);
	  Buttons.btn_NewRecord(driver);
	  driver.findElement(By.xpath("//table/tbody/tr[2]/td[2]/div/div/img")).click();
	  Thread.sleep(1000);
		 List<WebElement> Countofcombo =driver.findElements(By.xpath("//div[@class='x-combo-list-inner']/div"));
		   int Count =Countofcombo.size();
		   //System.out.println(Count);
		    boolean flag = false;
			for(int i=1;i<=Count;i++){
	             WebElement Vehicle_Number = driver.findElement(By.xpath("//div[@class='x-combo-list-inner']/div["+i+"]"));
	             String V_No = Vehicle_Number.getText();
	             //System.out.println(V_No);
	             if(V_No.equals(Reg_Number)){
	                
	                 driver.findElement(By.xpath("//div[@class='x-combo-list-inner']/div["+i+"]")).click();
	                 System.out.println("V_No  found"+V_No);   
	                 flag=true;
	                 break;
	             }       
	       }
		    if(flag){
		    	//System.out.println(" Found");
		    	
		    } else {
		    	System.out.println("Not found");
		    }
		    
		    WebElement objvechicle_Repairs=driver.findElement(By.id("VehicleRepairuserWindow_txtVehicleName"));
		     ((JavascriptExecutor) driver).executeScript("document.getElementsByName('VehicleRepairuserWindow_txtVehicleName')[0].removeAttribute('disabled');");
		     Thread.sleep(2000);
		     String str=objvechicle_Repairs.getAttribute("value");
		     System.out.println(str);
   }
  //@Test(priority=5)
  public void vechicle_Sales()throws InterruptedException { 
	  driver.switchTo().defaultContent();
	  Assetmanagment_Module.VechicleSales(driver);
	  driver.switchTo().frame("4004_IFrame");
      Thread.sleep(2000);
	  Buttons.btn_NewRecord(driver);
	  driver.findElement(By.xpath("//table/tbody/tr[1]/td[4]/div/div/img")).click();
	  Thread.sleep(1000);
		 List<WebElement> Countofcombo =driver.findElements(By.xpath("//div[@class='x-combo-list-inner']/div"));
		   int Count =Countofcombo.size();
		   //System.out.println(Count);
		    boolean flag = false;
			for(int i=1;i<=Count;i++){
	             WebElement Sales_Reg_Numbe = driver.findElement(By.xpath("//div[@class='x-combo-list-inner']/div["+i+"]"));
	             String S_Reg_No = Sales_Reg_Numbe.getText();
	             //System.out.println(V_No);
	             if(S_Reg_No.equals(Reg_Number)){
	                
	                 driver.findElement(By.xpath("//div[@class='x-combo-list-inner']/div["+i+"]")).click();
	                 System.out.println("Sales_Reg_Numbe  found"+S_Reg_No);   
	                 flag=true;
	                 break;
	             }       
	       }
		    if(flag){
		    	//System.out.println(" Found");
		    	
		    } else {
		    	System.out.println("Not found");
		    }
		    // Vehicle Name

		    WebElement objVehicleName=driver.findElement(By.id("VehicleSalesuserWindow_txtSalesVehicleName"));
		     ((JavascriptExecutor) driver).executeScript("document.getElementsByName('VehicleSalesuserWindow_txtSalesVehicleName')[0].removeAttribute('disabled');");
		     Thread.sleep(2000);
		     String str=objVehicleName.getAttribute("value");
		     System.out.println(str);
		     // Engine Number
		     WebElement objtxtEngineNumber=driver.findElement(By.id("VehicleSalesuserWindow_txtEngineNumber"));
		     ((JavascriptExecutor) driver).executeScript("document.getElementsByName('VehicleSalesuserWindow_txtEngineNumber')[0].removeAttribute('disabled');");
		     Thread.sleep(2000);
		     String txtEngineNumber=objtxtEngineNumber.getAttribute("value");
		     System.out.println(txtEngineNumber);
		     //Model
		     WebElement objModel=driver.findElement(By.id("VehicleSalesuserWindow_txtModel"));
		     ((JavascriptExecutor) driver).executeScript("document.getElementsByName('VehicleSalesuserWindow_txtModel')[0].removeAttribute('disabled');");
		     Thread.sleep(2000);
		     String Model=objModel.getAttribute("value");
		     System.out.println("Model :"+Model);
		     // ChassisNumber
		     WebElement objChassisNumber=driver.findElement(By.id("VehicleSalesuserWindow_txtChassisNumber"));
		     ((JavascriptExecutor) driver).executeScript("document.getElementsByName('VehicleSalesuserWindow_txtChassisNumber')[0].removeAttribute('disabled');");
		     Thread.sleep(2000);
		     String ChassisNumber=objChassisNumber.getAttribute("value");
		     System.out.println("ChassisNumber :"+ChassisNumber);
  }
 // @Test(priority=6)
  public void vechicle_purchase_print()throws InterruptedException { 
	  driver.switchTo().defaultContent();
	    Assetmanagment_Module.VechiclePurchases(driver);
		driver.switchTo().frame("4000_IFrame");
		Buttons.btn_Print(driver);
		  Thread.sleep(1000);
		  driver.getWindowHandle();
		    Thread.sleep(1000);
		    String main = driver.getWindowHandle();
		    for (String PrintReport_Window : driver.getWindowHandles())
		    {
		    driver.switchTo().window(PrintReport_Window);
		    Thread.sleep(1000);
		    }
		    driver.manage().window().maximize();
		     driver.findElement(By.xpath("//input[@id='AssetReportsViewer_toptoolbar_search_textField']")).sendKeys(Vehiclename);
		     driver.findElement(By.xpath("//img[@id='IconImg_AssetReportsViewer_toptoolbar_search_button']")).click();
		     Thread.sleep(3000);
		     driver.close();
		     driver.switchTo().window(main);
			 Thread.sleep(1000);
  }
  @Test(priority=1)
  public void Reports() throws InterruptedException {
  	driver.switchTo().defaultContent();
  	 Thread.sleep(1000);
  	REPORTS.ReportsModule(driver);
  	REPORTS.AssetManagement(driver);
	driver.switchTo().frame("4065_IFrame");
	driver.findElement(By.xpath("//div[@id='portalColumnAsset']")).click();
	/*driver.findElement(By.xpath("//div[@id='portletVehicle']")).click();
	driver.findElement(By.xpath("//button[text()='More']")).click();
	System.out.println("111111111111111");*/
	//portletQuarter
	/*driver.findElement(By.xpath("//div[@id='portletQuarter']")).click();
	driver.findElement(By.xpath("//table[@id='btnQuarterMore']")).click();
	System.out.println("222222222");*/
	//portalFurniture
	/*driver.findElement(By.xpath("//div[@id='portalFurniture']")).click();
	driver.findElement(By.xpath("//table[@id='btnFurniture']")).click();
	System.out.println("3333");*/
	driver.findElement(By.xpath("//div[@id='portalColumn2']")).click();

	/*//portletLandDetails
	driver.findElement(By.xpath("//div[@id='portalColumn2']")).click();
	driver.findElement(By.xpath("//div[@id='portletLandDetails']")).click();
	driver.findElement(By.xpath("//table[@id='btnConsolidatedMore']")).click();
	System.out.println("C2/444");*/
	//portletShops
	/*driver.findElement(By.xpath("//div[@id='portletShops']")).click();
	driver.findElement(By.xpath("//table[@id='btnPermitsMore']")).click();
	System.out.println("C2/555");*/
	//portletShops
	driver.findElement(By.xpath("//div[@id='portalSpecialDAMReports']")).click();
	driver.findElement(By.xpath("//table[@id='btnSpecialDAMReports']")).click();
	System.out.println("C2/666");

  }
}
