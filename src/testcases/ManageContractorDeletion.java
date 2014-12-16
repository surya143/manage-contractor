package testcases;

import java.util.List;
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
import com.selenium.pageobject.Assetmanagment_Module;
import com.selenium.pageobject.Dev_module;
import com.selenium.pageobject.Loginpage;

public class ManageContractorDeletion {
	public static WebElement element=null;
	public static WebDriver driver;
	String ContractorName="Jaswanth";
	String Area="Ameerpet";
	String LicenseNumber="122223331";
	String ContractorFirmName ="Jaswanth Contractor Firmname";
	String ContractorAdderss="Hyd";
	private Object system;
  @BeforeTest
  public void a() {
	  driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	  Loginpage.LoadPage(driver);
	  sigin.signin(driver, "bidarapmc", "vsspl");
  }
  @Test
 public void b() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	    driver.switchTo().defaultContent();
		boolean flag=false;
		Thread.sleep(1000);
		Dev_module.Development_module(driver);
		Dev_module.Manage_contractor(driver);
		driver.switchTo().frame("4010_IFrame");
		Thread.sleep(1000);
		FromDatepickerinGrid.date_icon(driver);
		Thread.sleep(1000);
		Month_Year_selection.December(driver);
		Thread.sleep(1000);
		Month_Selection.month_April(driver);
		Thread.sleep(1000);
		Year_selection.Year_2014(driver);
		Thread.sleep(1000);
		FromDatepickerinGrid.ok_button(driver);
		Dates_Selection.date_1(driver);
		Thread.sleep(1000);

	    // search button 
	    driver.findElement(By.xpath("//button[text()='Show Details']")).click();
	 //   System.out.println("show button");

		String PageCount = driver.findElement(By.xpath("//table/tbody/tr/td[6]/span")).getText();
		System.out.println(PageCount);
		PageCount = PageCount.replace("of ", "");
		Integer PageCount_int = Integer.parseInt(PageCount);
		//System.out.println("wwwwwwwwwwwwwwwww"+PageCount_int);
		Thread.sleep(1000);
		for(int  i=0; i<PageCount_int;i++){
			for (int j=1; j<20;j++){
				WebElement Grid = driver.findElement(By.xpath("//div[@class='x-grid3-body']/div[" + j + "]/table/tbody/tr/td[2]/div"));
				String T = Grid.getText();
				// System.out.println(T);

				if (T.contains(ContractorName)){
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
		if (!flag) {

			 System.out.println("record not found");
		}
		  Thread.sleep(1000);
		  Buttons.btn_DeleteRecord(driver);
		  driver.switchTo().alert().accept();
	      ConformationBox.Popup(driver);
	      driver.findElement(By.xpath("//button[text()='Show Details']")).click();
  }
  
  //Reflection Screens 
  //WorkAllocation in DevModule
  // 
  @Test(priority=1)
 public void Work_allocation() throws InterruptedException {
	driver.switchTo().defaultContent();
	Thread.sleep(1000);
	boolean flag=false;
	String drop="";
	System.out.println("Comming to D");
	//Dev_module.Development_module(driver);
	   Dev_module.Work_allocation(driver);
	driver.switchTo().frame("4008_IFrame");
	Buttons.btn_NewRecord(driver);
	
   driver.findElement(By.xpath("//table/tbody/tr[2]/td[2]/div/div/img")).click();
	Thread.sleep(1000);
	 List<WebElement> Countofcombo =driver.findElements(By.xpath("//div[@class='x-combo-list-inner']/div"));
	   int Count =Countofcombo.size();
	   System.out.println(Count);
	    for(int i=1;i<=Count;i++){
             drop = driver.findElement(By.xpath("//div[@class='x-combo-list-inner']/div["+i+"]")).getText();
             if(drop.equals(ContractorName)){
                
                 driver.findElement(By.xpath("//div[@class='x-combo-list-inner']/div["+i+"]")).click();
                 System.out.println("ContractorName  found"+drop);   
                 flag=true;
                 break;
             }       
       }
	    if(flag){
	    	System.out.println(" Found");
	    	
	    } else {
	    	System.out.println("Not found");
	    }
      
	  	driver.switchTo().defaultContent();

    
	}
  @Test(priority=2)
  public void QuartersDetails() throws InterruptedException {
  	driver.switchTo().defaultContent();
      boolean flag = false;

  	String Combo="";
  	Thread.sleep(1000);
  	Assetmanagment_Module.Asset_Mod(driver);
  	Assetmanagment_Module.QuartersDetails(driver);
  	driver.switchTo().frame("4005_IFrame");
  	Buttons.btn_NewRecord(driver);
      driver.findElement(By.xpath("//table[1]/tbody/tr[7]/td[2]/div/div/img")).click();
  	Thread.sleep(1000);
      List<WebElement> QuaterFirmnameCountofcombo =driver.findElements(By.xpath("//div[@class='x-combo-list-inner']/div"));
  	   int Count =QuaterFirmnameCountofcombo.size();
  	   System.out.println(Count);
  		for(int i=1;i<=Count;i++){
  	    	Combo = driver.findElement(By.xpath("//div[@class='x-combo-list-inner']/div["+i+"]")).getText();
            if(Combo.equals(ContractorFirmName)){
               
                driver.findElement(By.xpath("//div[@class='x-combo-list-inner']/div["+i+"]")).click();
                System.out.println("ContractorFirmName  found"+Combo);   
                flag=true;
                break;
            }       
      }
  	    if(flag){
  	    	System.out.println(" Found");
  	    	
  	    } else {
  	    	System.out.println("Not found");
  	    }
  	    WebElement objContractorAdderss=driver.findElement(By.id("QuarterCreationuserWindow_txtContractorAddress"));
  	     ((JavascriptExecutor) driver).executeScript("document.getElementsByName('QuarterCreationuserWindow_txtContractorAddress')[0].removeAttribute('disabled');");
  	     Thread.sleep(2000);
  	     String str=objContractorAdderss.getAttribute("value");
  	     System.out.println("text is : "+str);
  	     if(str.equals(ContractorAdderss)){
  	    	 System.out.println("ContractorAdderss  Found in screen GodownDetails  ");
  	     }
  	     else{
  	    	 System.out.println("ContractorAdderss Not Found in screen GodownDetails ");

  	     }
  	}
  
  @Test(priority=3)

  public void GoDownsDetails() throws InterruptedException {
  	driver.switchTo().defaultContent();
      boolean flag = false;

  	String Godown="";
  	Thread.sleep(1000);
  	Assetmanagment_Module.GodownDetails(driver);
  	driver.switchTo().frame("4019_IFrame");
  	Buttons.btn_NewRecord(driver);
      driver.findElement(By.xpath("//table[1]/tbody/tr[6]/td[4]/div/div/img")).click();
  	Thread.sleep(1000);
      List<WebElement> ContractorFirmnameCountofcombo =driver.findElements(By.xpath("//div[@class='x-combo-list-inner']/div"));
  	   int Count =ContractorFirmnameCountofcombo.size();
  	   System.out.println(Count);
  		for(int i=1;i<=Count;i++){
  			Godown = driver.findElement(By.xpath("//div[@class='x-combo-list-inner']/div["+i+"]")).getText();
            if(Godown.equals(ContractorFirmName)){
               
                driver.findElement(By.xpath("//div[@class='x-combo-list-inner']/div["+i+"]")).click();
                System.out.println("ContractorFirmName  found"+Godown);   
                flag=true;
                break;
            }       
      }
  	    if(flag){
  	    	System.out.println(" Found");
  	    	
  	    } else {
  	    	System.out.println("Not found");
  	    }
  	    
  	
  	}
  
  
  @Test(priority=4)

  public void ShopsDetails() throws InterruptedException {
		driver.switchTo().defaultContent();
	    boolean flag = false;
		String ShopDetails="";
		Thread.sleep(1000);
		Assetmanagment_Module.ShopsDetails(driver);
		driver.switchTo().frame("4025_IFrame");
		Buttons.btn_NewRecord(driver);
	    driver.findElement(By.xpath("//table[1]/tbody/tr[10]/td[4]/div/div/img")).click();
		Thread.sleep(1000);
	    List<WebElement> FirmnameCountofcombo =driver.findElements(By.xpath("//div[@class='x-combo-list-inner']/div"));
		   int Count =FirmnameCountofcombo.size();
		   System.out.println(Count);
			for(int i=1;i<=Count;i++){
				ShopDetails = driver.findElement(By.xpath("//div[@class='x-combo-list-inner']/div["+i+"]")).getText();
	          if(ShopDetails.equals(ContractorFirmName)){
	             
	              driver.findElement(By.xpath("//div[@class='x-combo-list-inner']/div["+i+"]")).click();
	              System.out.println("ContractorFirmName  found"+ShopDetails);   
	              flag=true;
	              break;
	          }       
	    }
		    if(flag){
		    	System.out.println(" Found");
		    	
		    } else {
		    	System.out.println("Not found");
		    }
		    
		    // ContractorAdderss Field in Disable Mode 
		    WebElement objContractorAdderss=driver.findElement(By.id("ShopBuildinguserCreationWindow_txtContractorAddress"));
		     ((JavascriptExecutor) driver).executeScript("document.getElementsByName('ShopBuildinguserCreationWindow_txtContractorAddress')[0].removeAttribute('disabled');");
		     Thread.sleep(2000);
		     String str=objContractorAdderss.getAttribute("value");
		     System.out.println("text is : "+str);
		     if(str.equals(ContractorAdderss)){
		    	 System.out.println("ContractorAdderss  Found in screen shopsDetails  ");
		     }
		     else{
		    	 System.out.println("ContractorAdderss Not Found in screen shopsDetails ");

		     }
		}
  @Test(priority=5)
  public void GridVerification()throws InterruptedException {  
  	
  	driver.switchTo().defaultContent();
  	boolean flag=false;
  	//System.out.println("Comming to C");
  	Thread.sleep(1000);
  	  Dev_module.Development_module(driver);
  	  Dev_module.Manage_contractor(driver);
  	driver.switchTo().frame("4010_IFrame");
  	Thread.sleep(1000);
  	/*FromDatepickerinGrid.date_icon(driver);
  	FromDatepickerinGrid.monthyear_selection(driver);
  	FromDatepickerinGrid.month_selection(driver);
  	FromDatepickerinGrid.year_selection(driver);
  	FromDatepickerinGrid.ok_button(driver);
  	FromDatepickerinGrid.date_selection(driver);*/
  	
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
  	
  	for(int  i=0; i<PageCount_int;i++){
  		List<WebElement> Count=driver.findElements(By.xpath("//div[@class='x-grid3-body']/div"));
  		int D=Count.size();
  		//System.out.println(D);
  		for (int j=1; j<D;j++){
  			WebElement Grid = driver.findElement(By.xpath("//div[@class='x-grid3-body']/div[" + j + "]/table/tbody/tr/td[2]/div"));
  			String T = Grid.getText();
  			// System.out.println(T);

  			if (T.contains(ContractorName)){
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
  }
  
}