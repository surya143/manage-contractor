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
import com.selenium.pageobject.ManageContractorElements;

public class ManageContractorupdation {
	public static WebElement element=null;
	public static WebDriver driver;
	String Contractorname="khankumar";
	String Area="Ameerpet";
	String LicenseNumber="8877";
	String ContractorFirmName ="khankumar Contractor Firmname";
	private Object system;
  @BeforeTest
  public void a() {
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
  	  Dev_module.Manage_contractor(driver);
  	driver.switchTo().frame("4010_IFrame");
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
  			String T = Grid.getText();
  			// System.out.println(T);

  			if (T.contains(Contractorname)){
  				//System.out.println(Grid);
  				Grid.click();
  				System.out.println("ContractorName   found in Manage Contractor Screen Grid" + i + " Page");
  			    
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
  		System.out.println("ContractorName Not  found in Manage Contractor Screen Grid ");
  	}
  }
 @Test(priority=2)
  public void ManageContractorEdit() throws InterruptedException {
	  driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	  driver.switchTo().defaultContent();
	  driver.switchTo().frame("4010_IFrame");
	  Thread.sleep(1000);
	  Buttons.btn_EditRecord(driver);
	  ManageContractorElements.Txt_Area(driver).clear();
      ManageContractorElements.Txt_Area(driver).sendKeys(Area);
      ManageContractorElements.Txt_LicenseNumber(driver).clear();
      ManageContractorElements.Txt_LicenseNumber(driver).sendKeys(LicenseNumber);
      ManageContractorElements.SaveButton(driver);
      ConformationBox.Popup(driver);
     
  	 }
 @Test(priority=3)
 public void ManageContractorModify() throws InterruptedException {
driver.switchTo().defaultContent();
driver.navigate().refresh();
  Dev_module.Development_module(driver);
  Dev_module.Manage_contractor(driver);
 Thread.sleep(1000);
 driver.switchTo().frame("4010_IFrame");
 driver.findElement(By.xpath("//button[text()='Show Details']")).click();
 Thread.sleep(1000);
	  String PageCount = driver.findElement(By.xpath("//table/tbody/tr/td[6]/span")).getText();
 //System.out.println(PageCount);
 PageCount = PageCount.replace("of ", "");
 Integer PageCount_int = Integer.parseInt(PageCount);
	 for(int  i=0; i<=PageCount_int;i++){
	boolean flag = false;
	for (int j=1; j<=20;j++){
		//WebElement Grid = driver.findElement(By.xpath("//div[@class='x-grid3-body']/div[" + j + "]"));
		String L_num = driver.findElement(By.xpath("//div[@class='x-grid3-body']/div[" + j + "]/table/tbody/tr/td[3]/div")).getText();
		String A_Place = driver.findElement(By.xpath("//div[@class='x-grid3-body']/div[" + j + "]/table/tbody/tr/td[5]/div")).getText();
		//System.out.println(L_num+A_Place);

		//String T = Grid.getText();
		 //System.out.println(T);

		if (A_Place.contains(Area)&&(L_num.contains(LicenseNumber))){
			//System.out.println(Grid);
			//Grid.click();
			driver.findElement(By.xpath("//div[@class='x-grid3-body']/div[" + j + "]/table/tbody/tr/td[3]/div")).click();
			System.out.println("Modified Details has saved Successfully");
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
  		System.out.println("Modified Details Not saved Successfully ");
	}
 }
 }
 @Test(priority=4)
// Reflections 
  public void UpdationGodownDetails()throws Exception
  {
	  driver.switchTo().defaultContent();
	  String Godown ="";
		boolean flag = false;
	  Assetmanagment_Module.Asset_Mod(driver);
		Assetmanagment_Module.GodownDetails(driver);
		driver.switchTo().frame("4019_IFrame");
		Buttons.btn_NewRecord(driver);
	    driver.findElement(By.xpath("//table[1]/tbody/tr[6]/td[4]/div/div/img")).click();
	    Thread.sleep(1000);
	    List<WebElement> ContractorFirmnameCountofcombo =driver.findElements(By.xpath("//div[@class='x-combo-list-inner']/div"));
		   int Count =ContractorFirmnameCountofcombo.size();
		   //System.out.println(Count);
			for(int i=1;i<=Count;i++){
				Godown = driver.findElement(By.xpath("//div[@class='x-combo-list-inner']/div["+i+"]")).getText();
	          if(Godown.equals(ContractorFirmName)){
	             
	              driver.findElement(By.xpath("//div[@class='x-combo-list-inner']/div["+i+"]")).click();
	              System.out.println("ContractorFirmName  found in Updation GodownDetails");   
	              flag=true;
	              break;
	          }       
	    }
		    if(flag){
		    	//System.out.println(" Found");
		    	
		    } else {
		    	System.out.println("ContractorFirmName  found in Updation GodownDetails");
		    }
		    
		
	 WebElement objcontractor_LicenseNo=driver.findElement(By.id("GodownCreationUserWindow_txtContractorLicenseNumber"));
     ((JavascriptExecutor) driver).executeScript("document.getElementsByName('GodownCreationUserWindow_txtContractorLicenseNumber')[0].removeAttribute('disabled');");
     Thread.sleep(2000);
     String str=objcontractor_LicenseNo.getAttribute("value");
     //System.out.println("text is : "+str);
      
      Thread.sleep(2000);
	  WebElement objcontractor_Area=driver.findElement(By.id("GodownCreationUserWindow_txtContractorArea"));
      ((JavascriptExecutor) driver).executeScript("document.getElementsByName('GodownCreationUserWindow_txtContractorArea')[0].removeAttribute('disabled');");
      Thread.sleep(2000);
      String strArea=objcontractor_Area.getAttribute("value");
      //System.out.println("text is : "+strArea);
	   
     if(str.equals(LicenseNumber)&&(strArea.equals(Area))){
    	  System.out.println("Both records found---------------"+str+strArea);
      }
   else{
 	  System.out.println("Both records not found");

   }
  
  
  } 
  
  }

  

