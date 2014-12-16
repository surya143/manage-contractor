package testcases;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

import com.selenium.actions.sigin;
import com.selenium.common.Buttons;
import com.selenium.common.ConformationBox;
import com.selenium.common.Dates_Selection;
import com.selenium.common.FromDatepickerinGrid;
import com.selenium.common.Handling_Windows;
import com.selenium.common.Month_Selection;
import com.selenium.common.Month_Year_selection;
import com.selenium.common.REPORTS;
import com.selenium.common.Year_selection;
import com.selenium.pageobject.Assetmanagment_Module;
import com.selenium.pageobject.Dev_module;
import com.selenium.pageobject.Loginpage;
import com.selenium.pageobject.ManageContractorElements;
import com.selenium.pageobject.Sec_Dev_DevelopmentDetails;

public class ManageContractorCreation {
	
	public static WebElement element=null;
	public static WebDriver driver;
String ContractorName = "khankumar";
String ContractorFirmName ="khankumar Contractor Firmname";
String ContractorAdderss="Hyd";
String LicenseNumber="554466";
String ContractorArea="sec";
String ContactNumber="44778899";
@BeforeTest
public void a() {
	driver = new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	driver.manage().window().maximize();

  Loginpage.LoadPage(driver);
  sigin.signin(driver, "bidarapmc", "vsspl");

}
@Test
public void ContractorCreation() throws InterruptedException {

  //driver.manage().window().maximize();
  Thread.sleep(1000);
  Dev_module.Development_module(driver);
  Dev_module.Manage_contractor(driver);
  Thread.sleep(1000);
  driver.switchTo().frame("4010_IFrame");
  Thread.sleep(1000);
  Buttons.btn_NewRecord(driver);
  Thread.sleep(1000);
  ManageContractorElements.CreationWindow(driver);
  Thread.sleep(1000);
  ManageContractorElements.Txt_ContactName(driver).sendKeys(ContractorName);
  ManageContractorElements.Txt_Area(driver).sendKeys(ContractorArea);
  ManageContractorElements.Txt_ContactNumber(driver).sendKeys(ContactNumber);
  ManageContractorElements.Txt_LicenseNumber(driver).sendKeys(LicenseNumber);
  ManageContractorElements.Txt_FirmName(driver).sendKeys(ContractorFirmName);
  ManageContractorElements.ClassDropdown(driver);
  driver.findElement(By.xpath("//div[@class='x-combo-list-inner']/div[text()='A']")).click();
  ManageContractorElements.Txt_Note(driver).sendKeys(" Contractor");
  ManageContractorElements.Txt_WorksList(driver).sendKeys("inprogress");
  Thread.sleep(500);
  ManageContractorElements.Txt_History(driver).sendKeys("good Content");
  Thread.sleep(1000);
  ManageContractorElements.OtherDetailsTab(driver);
  ManageContractorElements.txtSolvency(driver).sendKeys("finance");
  ManageContractorElements.FirmTypeDropDown(driver);
  driver.findElement(By.xpath("//div[@class='x-combo-list-inner']/div[text()='proprietor']")).click();
  Thread.sleep(500);
  ManageContractorElements.txtTechQualification(driver).sendKeys("Civil Certified");
  Thread.sleep(500);
  ManageContractorElements.BlockListDropdown(driver);
  driver.findElement(By.xpath("//div[@class='x-combo-list-inner']/div[text()='No']")).click();
  ManageContractorElements.Txt_Address(driver).sendKeys(ContractorAdderss);
  Thread.sleep(1000);
  ManageContractorElements.Qualification(driver).sendKeys("BE");
  ManageContractorElements.Txt_TechPersonName(driver).sendKeys("jani");
  ManageContractorElements.PenalitiesDropdown(driver);
  driver.findElement(By.xpath("//div/div[@class='x-combo-list-inner']/div[@class='x-combo-list-item x-combo-selected']")).click();
  ManageContractorElements.Txt_PenaltyDetails(driver).sendKeys("Penality should pay Rs=1000");
  ManageContractorElements.SaveButton(driver);
  ConformationBox.Popup(driver);
  ManageContractorElements.CloseButton(driver);
  
  Thread.sleep(1000);
}

// Manage Contractor  Grid Verification 
@Test(priority=1)
public void GridVerification()throws InterruptedException {  
	
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
	
  //  System.out.println("Date Selected ");
    // search button 
    driver.findElement(By.xpath("//button[text()='Show Details']")).click();
   /// System.out.println("show button");

	String PageCount = driver.findElement(By.xpath("//table/tbody/tr/td[6]/span")).getText();
	//System.out.println(PageCount);
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
			
			WebElement Grid = driver.findElement(By.xpath("//div[@class='x-grid3-body']/div[" + j + "]/table/tbody/tr/td[2]/div"));
			String T=Grid.getText();
			System.out.println(T);

			if (T.contains(ContractorName)){
				//System.out.println(Grid);
				driver.findElement(By.xpath("//div[@class='x-grid3-body']/div[" + j + "]/table/tbody/tr/td[2]/div")).click();
				System.out.println("ContractorName  found in Manage Contractor Screen Grid");
			    
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
   // System.out.println(flag);

	if(!flag) {
		System.out.println("ContractorName Not  found in Manage Contractor Screen Grid");
	}
}


// Reflection From Manage ContractorScreen  
// Alloction Screen Check Wheather ContractorName  Drop Down Contains Created Field 
@Test(priority=2)
public void Work_allocation() throws InterruptedException {
	driver.switchTo().defaultContent();
	Thread.sleep(1000);
	boolean flag=false;
	String drop="";
	//System.out.println("Comming to D");
	//Dev_module.Development_module(driver);
	   Dev_module.Work_allocation(driver);
	driver.switchTo().frame("4008_IFrame");
	Buttons.btn_NewRecord(driver);
	
   driver.findElement(By.xpath("//table/tbody/tr[2]/td[2]/div/div/img")).click();
	Thread.sleep(1000);
	 List<WebElement> Countofcombo =driver.findElements(By.xpath("//div[@class='x-combo-list-inner']/div"));
	   int Count =Countofcombo.size();
	   //System.out.println(Count);
	    for(int i=1;i<=Count;i++){
             drop = driver.findElement(By.xpath("//div[@class='x-combo-list-inner']/div["+i+"]")).getText();
             if(drop.equals(ContractorName)){
                
                 driver.findElement(By.xpath("//div[@class='x-combo-list-inner']/div["+i+"]")).click();
                 System.out.println(" In Work_allocation screen ContractorNamedropdown  matches with Created ManageContractor "+drop);   
                 flag=true;
                 break;
             }       
       }
	    if(flag){
	    	//System.out.println(" Found");
	    	
	    } else {
	    	System.out.println("In Work_allocation screen ContractorNamedropdown dose not  matches with Created ManageContractor");
	    }
        
	}
//QuatersDetails
@Test(priority=3)
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
	   //System.out.println(Count);
		for(int i=1;i<=Count;i++){
	    	Combo = driver.findElement(By.xpath("//div[@class='x-combo-list-inner']/div["+i+"]")).getText();
          if(Combo.equals(ContractorFirmName)){
             
              driver.findElement(By.xpath("//div[@class='x-combo-list-inner']/div["+i+"]")).click();
              System.out.println("In QuartersDetails screen Contractor Firm Name dropdown  matches with Created ManageContractor Firm Name"+Combo);   
              flag=true;
              break;
          }       
    }
	    if(flag){
	    	//System.out.println(" Found");
	    	
	    } else {
	    	System.out.println("In QuartersDetails screen Contractor Firm Name dropdown dose not matches with Created ManageContractor Firm Name");
	    }
	    
	 WebElement objContractorAdderss=driver.findElement(By.name("QuarterCreationuserWindow_txtContractorAddress"));
	     ((JavascriptExecutor) driver).executeScript("document.getElementsByName('QuarterCreationuserWindow_txtContractorAddress')[0].removeAttribute('disabled');");
	     Thread.sleep(2000);
	     String str=objContractorAdderss.getAttribute("value");
	     //System.out.println("text is : "+str);
	     if(str.equalsIgnoreCase(ContractorAdderss)){
	    	 System.out.println("ContractorAdderss  Found in screen QuartersDetails");   	 
	     }
	     else{
	    	 System.out.println("ContractorAdderss not Found in screen QuartersDetails");   	 
	     }
	}



//GoDownsDetails

@Test(priority=4)
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
              System.out.println("In GoDownsDetails screen Contractor Firm Name dropdown  matches with Created ManageContractor Firm Name"+Godown);   
              flag=true;
              break;
          }       
    }
	    if(flag){
	    	//System.out.println(" Found");
	    	
	    } else {
	    	System.out.println("In GoDownsDetails screen Contractor Firm Name dropdown Dose Not matches with Created ManageContractor Firm Name");
	    }
	    
	    // ContractorLicense Field in Disable Mode 
	    WebElement  objContractorLicenseNumber=driver.findElement(By.id("GodownCreationUserWindow_txtContractorLicenseNumber"));
	     ((JavascriptExecutor) driver).executeScript("document.getElementsByName('GodownCreationUserWindow_txtContractorLicenseNumber')[0].removeAttribute('disabled');");
	     Thread.sleep(2000);
	     String LNumber=objContractorLicenseNumber.getAttribute("value");
	     //System.out.println("text is : "+LNumber);
	     if(LNumber.equals(LicenseNumber)){
	    	 System.out.println("ContractorLicense  Found in screen GodownDetails  ");
	     }
	     else{
	    	 System.out.println("ContractorLicense Not Found in screen GodownDetails ");

	     }
	
	     // ContractorArea Field in Disable Mode 
		    WebElement  objContractorArea=driver.findElement(By.id("GodownCreationUserWindow_txtContractorArea"));
		     ((JavascriptExecutor) driver).executeScript("document.getElementsByName('GodownCreationUserWindow_txtContractorArea')[0].removeAttribute('disabled');");
		     Thread.sleep(2000);
		     String CArea=objContractorArea.getAttribute("value");
		     //System.out.println("text is : "+CArea);
		     if(CArea.equals(ContractorArea)){
		    	 System.out.println("ContractorArea  Found in screen GodownDetails  ");
		     }
		     else{
		    	 System.out.println("ContractorArea Not Found in screen GodownDetails ");

		     }
		     
		  // ContactNumber Field in Disable Mode 
			      WebElement  objContactNumber=driver.findElement(By.id("GodownCreationUserWindow_txtContactNumber"));
			     ((JavascriptExecutor) driver).executeScript("document.getElementsByName('GodownCreationUserWindow_txtContactNumber')[0].removeAttribute('disabled');");
			     Thread.sleep(2000);
			     String CNumber=objContactNumber.getAttribute("value");
			     //System.out.println("text is : "+CArea);
			     if(CNumber.equals(ContactNumber)){
			    	 System.out.println("ContactNumber  Found in screen GodownDetails  ");
			     }
			     else{
			    	 System.out.println("ContactNumber Not Found in screen GodownDetails ");

			     }   
	     
	     
	}

//ShopsDetails
@Test(priority=5)
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
              System.out.println("In ShopDetails screen Contractor Firm Name dropdown  matches with Created ManageContractor Firm Name"+ShopDetails);   
              flag=true;
              break;
          }       
    }
	    if(flag){
	    	//System.out.println(" Found");
	    	
	    } else {
	    	System.out.println("In ShopDetails screen Contractor Firm Name dropdown Dose not  matches with Created ManageContractor Firm Name");
	    }
	    
	    // ContractorAdderss Field in Disable Mode 
	    WebElement  objContractorAdderss=driver.findElement(By.id("ShopBuildinguserCreationWindow_txtContractorAddress"));
	     ((JavascriptExecutor) driver).executeScript("document.getElementsByName('ShopBuildinguserCreationWindow_txtContractorAddress')[0].removeAttribute('disabled');");
	     Thread.sleep(2000);
	     String str=objContractorAdderss.getAttribute("value");
	     //System.out.println("text is : "+str);
	     if(str.equals(ContractorAdderss)){
	    	 System.out.println("ContractorAdderss  Found in screen shopsDetails  ");
	     }
	     else{
	    	 System.out.println("ContractorAdderss Not Found in screen shopsDetails ");

	     }
	}
//Print
@Test(priority=6)
public void Print() throws InterruptedException {
	driver.switchTo().defaultContent();
	Dev_module.Development_module(driver);
	Dev_module.Manage_contractor(driver);
	driver.switchTo().frame("4010_IFrame");
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
	     driver.findElement(By.xpath("//input[@id='developmentReportsViewer_toptoolbar_search_textField']")).sendKeys(ContractorName);
	     driver.findElement(By.xpath("//img[@id='IconImg_developmentReportsViewer_toptoolbar_search_button']")).click();
	     Thread.sleep(3000);
	     driver.close();
	     driver.switchTo().window(main);
		 Thread.sleep(1000);

}
//sec_Reports 
@Test(priority=7)
public void Reports() throws InterruptedException {
	driver.switchTo().defaultContent();
	 Thread.sleep(1000);
	REPORTS.ReportsModule(driver);
	REPORTS.Development(driver);
	driver.switchTo().frame("4064_IFrame");
	Sec_Dev_DevelopmentDetails.MoreButton(driver);
	Handling_Windows.Switch_to_Window(driver);
    driver.switchTo().frame("107_IFrame");
    Sec_Dev_DevelopmentDetails.RadioButton_ContractorWiseDevelopment(driver);
    Sec_Dev_DevelopmentDetails.Combo_ContractorName(driver);
    List<WebElement> ContractornameCountofcombo =driver.findElements(By.xpath("//div[@class='x-combo-list-inner']/div"));
	   int Count =ContractornameCountofcombo.size();
	  // System.out.println(Count);
		boolean flag = false;
		for(int i=1;i<=Count;i++){
		String	DevelopmentDetails = driver.findElement(By.xpath("//div[@class='x-combo-list-inner']/div["+i+"]")).getText();
    if(DevelopmentDetails.equals(ContractorName)){
       
        driver.findElement(By.xpath("//div[@class='x-combo-list-inner']/div["+i+"]")).click();
        flag=true;
        break;
    }       
}
	    if(flag){
	    	System.out.println("ContractorName Found in Reports DevelopmentDetails screen ");
	    	
	    } else {
	    	System.out.println("ContractorName not Found in Reports DevelopmentDetails screen ");
	    }
	Sec_Dev_DevelopmentDetails.Combo_YardName(driver);
	driver.findElement(By.xpath("//div[@class='x-combo-list-inner']/div[text()='Bidar']")).click();
	Sec_Dev_DevelopmentDetails.RadioButton_Custom(driver);
	Sec_Dev_DevelopmentDetails.From_Date(driver).clear();
	Sec_Dev_DevelopmentDetails.From_Date(driver).sendKeys("01-04-2014");
	Sec_Dev_DevelopmentDetails.To_Date(driver).clear();
	Sec_Dev_DevelopmentDetails.To_Date(driver).sendKeys("03-12-2014");
	Sec_Dev_DevelopmentDetails.View_ReportButton(driver);
	Handling_Windows.Switch_to_Window(driver);
	Thread.sleep(1000);
    driver.manage().window().maximize();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@class='textinputs']")).sendKeys(ContractorName);
	Thread.sleep(1000);
	driver.findElement(By.xpath("//img[@id='IconImg_SecceratryReportViewer_toptoolbar_search_button']")).click();
	
}


}






  

  

