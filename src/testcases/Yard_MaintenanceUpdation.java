package testcases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
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

public class Yard_MaintenanceUpdation {
	public static WebElement element=null;
	public static WebDriver driver;
	String Maintenance_OF="WaterTanks";
	String RoadNumber="MTS_Road";
	String Particular="Cement_Priya";
	String Quantity="150";
	String Rate="150";
	
	@BeforeTest
	public void login() throws InterruptedException {
		  driver = new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
			driver.manage().window().maximize();

		  Loginpage.LoadPage(driver);
	      sigin.signin(driver, "bidarapmc", "vsspl");
	  }
	@Test(priority=1)
	  public void UpdateGridVerification()throws InterruptedException {  
	  	
	  	driver.switchTo().defaultContent();
	  	boolean flag=false;
	  	//System.out.println("Comming to C");
	  	Thread.sleep(1000);
	  	  Dev_module.Development_module(driver);
	  	  Dev_module.Yard_maintenance(driver);
	  	driver.switchTo().frame("4046_IFrame");
	  	Thread.sleep(1000);
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
	  	System.out.println(PageCount);
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
	  		//System.out.println(D);
	  		for (int j=1; j<=D;j++){
	  			WebElement Grid = driver.findElement(By.xpath("//div[@class='x-grid3-body']/div[" + j + "]/table/tbody/tr/td[3]/div"));
	  			String T = Grid.getText();
	  			// System.out.println(T);

	  			if (T.equals(Maintenance_OF)){
	  				//System.out.println(Grid);
	  				Grid.click();
	  				System.out.println("Yard_MaintenanceCreation Record found at gridRecord found at " + i + " Page");
	  			    
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
	  	Thread.sleep(1000);
	  }
	
	@Test(priority=2)
	  public void ManageContractorEdit() throws InterruptedException {
		  driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		  driver.switchTo().defaultContent();
		  driver.switchTo().frame("4046_IFrame");
		  Thread.sleep(1000);
		  Buttons.btn_EditRecord(driver);
		  // Yard Maintenance
		 WebElement childwindow= driver.findElement(By.xpath("//tr/td/div/div/div/div/div/div[1]/div[2]/div/div"));
		  String Get=childwindow.getText();
		  //System.out.println(Get);
		  childwindow.click();
		  Thread.sleep(1000);
     	  YardMaintenanceElements.txtParticular(driver).clear();
		  YardMaintenanceElements.txtParticular(driver).sendKeys(Particular);
		  Thread.sleep(1000);
		  YardMaintenanceElements.txtQuantity(driver).clear();
		  YardMaintenanceElements.txtQuantity(driver).sendKeys(Quantity);
		  Thread.sleep(1000);
		  YardMaintenanceElements.txtRate(driver).clear();
		  YardMaintenanceElements.txtRate(driver).sendKeys(Rate);
		  Thread.sleep(1000);
		  YardMaintenanceElements.button_Insert(driver);
		  Thread.sleep(1000);
	      Buttons.SaveButton(driver);
		  Thread.sleep(1000);
	      ConformationBox.Popup(driver);
		  Thread.sleep(1000);
	      Buttons.CloseButton(driver);
	      Thread.sleep(1000);
	      
	      
	}
	@Test(priority=3)
	  public void ManageContractorGrid() throws InterruptedException {
		Thread.sleep(1000);
		  driver.switchTo().defaultContent();
		  driver.switchTo().frame("4046_IFrame");
		Thread.sleep(1000);
	        FromDatepickerinGrid.date_icon(driver);
		    Dates_Selection.date_2(driver);
			Thread.sleep(1000);
		  driver.findElement(By.xpath("//button[text()='Show Details']")).click();
			Thread.sleep(1000);
	      driver.findElement(By.xpath("//table/tbody/tr/td[2]/em/button[@class='x-btn-text x-tbar-loading']")).click();
	      Thread.sleep(1000);
	  	  String PageCount = driver.findElement(By.xpath("//table/tbody/tr/td[6]/span")).getText();
		  //System.out.println(PageCount);
		  PageCount = PageCount.replace("of ", "");
		  Integer PageCount_int = Integer.parseInt(PageCount);
	  	 for(int  i=0; i<PageCount_int;i++){
	 	 	boolean flag = false;
			for (int r=1; r<20;r++){
				String P = driver.findElement(By.xpath("//div[@class='x-grid3-body']/div[" + r + "]/table/tbody/tr/td[1]/div")).getText();
				String R = driver.findElement(By.xpath("//div[@class='x-grid3-body']/div[" + r + "]/table/tbody/tr/td[2]/div")).getText();
				String Q = driver.findElement(By.xpath("//div[@class='x-grid3-body']/div[" + r + "]/table/tbody/tr/td[3]/div")).getText();

				System.out.println(P+R+Q);

				if (P.equals(Particular)&&(Q.equals(Quantity)&&(R.equals(Rate)))){
					//System.out.println(Grid);
					driver.findElement(By.xpath("//div[@class='x-grid3-body']/div[" + r + "]/table/tbody/tr/td[1]/div")).click();
					System.out.println("Yard_Maintenance Edit Details has saved Successfully");
					flag=true;
					break;
			}		
			
			if (flag) {
				break;
			}

			 else {
					driver.findElement(By.xpath("//tbody/tr/td[@class='x-btn-center']/em/button[@class='x-btn-text x-tbar-page-next']")).click();

			}
		} 
			if(!flag) {
		  		System.out.println("Yard_Maintenance Edit Record not Found ");
		  	}
			}
		
	  	 }
}
