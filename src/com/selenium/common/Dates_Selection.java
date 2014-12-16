package com.selenium.common;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Dates_Selection {
	
public static void date_1(WebDriver driver){
		   
		   WebElement dateWidget =driver.findElement(By.xpath("//table[@class='x-date-inner']/tbody"));
	  	  String T= dateWidget.getText();
	  	  List<WebElement> rows=dateWidget.findElements(By.tagName("tr")); 
	      int R=rows.size();
	  	  List<WebElement> columns=dateWidget.findElements(By.tagName("td")); 
	  	 int C=columns.size();
	 	 // System.out.println(C);
	 	  
	 	 for (WebElement cell: columns){  
	 		   //Select 13th Date   
	 		   if (cell.getText().equals("1")){  
	 		   cell.findElement(By.linkText("1")).click();  
	 		   break;  
	 		   }  
	 		  }   	 		 
	   return;
	  }
public static void date_2(WebDriver driver){
	   
	   WebElement dateWidget =driver.findElement(By.xpath("//table[@class='x-date-inner']/tbody"));
	  String T= dateWidget.getText();
	  List<WebElement> rows=dateWidget.findElements(By.tagName("tr")); 
   int R=rows.size();
	  List<WebElement> columns=dateWidget.findElements(By.tagName("td")); 
	 int C=columns.size();
	 // System.out.println(C);
	  
	 for (WebElement cell: columns){  
		   //Select 13th Date   
		   if (cell.getText().equals("2")){  
		   cell.findElement(By.linkText("2")).click();  
		   break;  
		   }  
		  }   	 		 
return;
}
public static void date_3(WebDriver driver){
	   
	   WebElement dateWidget =driver.findElement(By.xpath("//table[@class='x-date-inner']/tbody"));
	  String T= dateWidget.getText();
	  List<WebElement> rows=dateWidget.findElements(By.tagName("tr")); 
int R=rows.size();
	  List<WebElement> columns=dateWidget.findElements(By.tagName("td")); 
	 int C=columns.size();
	 // System.out.println(C);
	  
	 for (WebElement cell: columns){  
		   //Select 13th Date   
		   if (cell.getText().equals("3")){  
		   cell.findElement(By.linkText("3")).click();  
		   break;  
		   }  
		  }   	 		 
return;
}
public static void date_4(WebDriver driver){
	   
	   WebElement dateWidget =driver.findElement(By.xpath("//table[@class='x-date-inner']/tbody"));
	  String T= dateWidget.getText();
	  List<WebElement> rows=dateWidget.findElements(By.tagName("tr")); 
int R=rows.size();
	  List<WebElement> columns=dateWidget.findElements(By.tagName("td")); 
	 int C=columns.size();
	 // System.out.println(C);
	  
	 for (WebElement cell: columns){  
		   //Select 13th Date   
		   if (cell.getText().equals("4")){  
		   cell.findElement(By.linkText("4")).click();  
		   break;  
		   }  
		  }   	 		 
return;
}
public static void date_5(WebDriver driver){
	   
	   WebElement dateWidget =driver.findElement(By.xpath("//table[@class='x-date-inner']/tbody"));
	  String T= dateWidget.getText();
	  List<WebElement> rows=dateWidget.findElements(By.tagName("tr")); 
int R=rows.size();
	  List<WebElement> columns=dateWidget.findElements(By.tagName("td")); 
	 int C=columns.size();
	 // System.out.println(C);
	  
	 for (WebElement cell: columns){  
		   //Select 13th Date   
		   if (cell.getText().equals("5")){  
		   cell.findElement(By.linkText("5")).click();  
		   break;  
		   }  
		  }   	 		 
return;
}
public static void date_6(WebDriver driver){
	   
	   WebElement dateWidget =driver.findElement(By.xpath("//table[@class='x-date-inner']/tbody"));
	  String T= dateWidget.getText();
	  List<WebElement> rows=dateWidget.findElements(By.tagName("tr")); 
int R=rows.size();
	  List<WebElement> columns=dateWidget.findElements(By.tagName("td")); 
	 int C=columns.size();
	 // System.out.println(C);
	  
	 for (WebElement cell: columns){  
		   //Select 13th Date   
		   if (cell.getText().equals("6")){  
		   cell.findElement(By.linkText("6")).click();  
		   break;  
		   }  
		  }   	 		 
return;
}
public static void date_7(WebDriver driver){
	   
	   WebElement dateWidget =driver.findElement(By.xpath("//table[@class='x-date-inner']/tbody"));
	  String T= dateWidget.getText();
	  List<WebElement> rows=dateWidget.findElements(By.tagName("tr")); 
int R=rows.size();
	  List<WebElement> columns=dateWidget.findElements(By.tagName("td")); 
	 int C=columns.size();
	 // System.out.println(C);
	  
	 for (WebElement cell: columns){  
		   //Select 13th Date   
		   if (cell.getText().equals("7")){  
		   cell.findElement(By.linkText("7")).click();  
		   break;  
		   }  
		  }   	 		 
return;
}
public static void date_8(WebDriver driver){
	   
	   WebElement dateWidget =driver.findElement(By.xpath("//table[@class='x-date-inner']/tbody"));
	  String T= dateWidget.getText();
	  List<WebElement> rows=dateWidget.findElements(By.tagName("tr")); 
int R=rows.size();
	  List<WebElement> columns=dateWidget.findElements(By.tagName("td")); 
	 int C=columns.size();
	 // System.out.println(C);
	  
	 for (WebElement cell: columns){  
		   //Select 13th Date   
		   if (cell.getText().equals("8")){  
		   cell.findElement(By.linkText("8")).click();  
		   break;  
		   }  
		  }   	 		 
return;
}
public static void date_9(WebDriver driver){
	   
	   WebElement dateWidget =driver.findElement(By.xpath("//table[@class='x-date-inner']/tbody"));
	  String T= dateWidget.getText();
	  List<WebElement> rows=dateWidget.findElements(By.tagName("tr")); 
int R=rows.size();
	  List<WebElement> columns=dateWidget.findElements(By.tagName("td")); 
	 int C=columns.size();
	 // System.out.println(C);
	  
	 for (WebElement cell: columns){  
		   //Select 13th Date   
		   if (cell.getText().equals("9")){  
		   cell.findElement(By.linkText("9")).click();  
		   break;  
		   }  
		  }   	 		 
return;
}
public static void date_10(WebDriver driver){
	   
	   WebElement dateWidget =driver.findElement(By.xpath("//table[@class='x-date-inner']/tbody"));
	  String T= dateWidget.getText();
	  List<WebElement> rows=dateWidget.findElements(By.tagName("tr")); 
int R=rows.size();
	  List<WebElement> columns=dateWidget.findElements(By.tagName("td")); 
	 int C=columns.size();
	 // System.out.println(C);
	  
	 for (WebElement cell: columns){  
		   //Select 13th Date   
		   if (cell.getText().equals("10")){  
		   cell.findElement(By.linkText("10")).click();  
		   break;  
		   }  
		  }   	 		 
return;
}
public static void date_11(WebDriver driver){
	   
	   WebElement dateWidget =driver.findElement(By.xpath("//table[@class='x-date-inner']/tbody"));
	  String T= dateWidget.getText();
	  List<WebElement> rows=dateWidget.findElements(By.tagName("tr")); 
int R=rows.size();
	  List<WebElement> columns=dateWidget.findElements(By.tagName("td")); 
	 int C=columns.size();
	 // System.out.println(C);
	  
	 for (WebElement cell: columns){  
		   //Select 13th Date   
		   if (cell.getText().equals("11")){  
		   cell.findElement(By.linkText("11")).click();  
		   break;  
		   }  
		  }   	 		 
return;
}
public static void date_12(WebDriver driver){
	   
	   WebElement dateWidget =driver.findElement(By.xpath("//table[@class='x-date-inner']/tbody"));
	  String T= dateWidget.getText();
	  List<WebElement> rows=dateWidget.findElements(By.tagName("tr")); 
int R=rows.size();
	  List<WebElement> columns=dateWidget.findElements(By.tagName("td")); 
	 int C=columns.size();
	 // System.out.println(C);
	  
	 for (WebElement cell: columns){  
		   //Select 13th Date   
		   if (cell.getText().equals("12")){  
		   cell.findElement(By.linkText("12")).click();  
		   break;  
		   }  
		  }   	 		 
return;
}
public static void date_13(WebDriver driver){
	   
	   WebElement dateWidget =driver.findElement(By.xpath("//table[@class='x-date-inner']/tbody"));
	  String T= dateWidget.getText();
	  List<WebElement> rows=dateWidget.findElements(By.tagName("tr")); 
int R=rows.size();
	  List<WebElement> columns=dateWidget.findElements(By.tagName("td")); 
	 int C=columns.size();
	 // System.out.println(C);
	  
	 for (WebElement cell: columns){  
		   //Select 13th Date   
		   if (cell.getText().equals("13")){  
		   cell.findElement(By.linkText("13")).click();  
		   break;  
		   }  
		  }   	 		 
return;
}
public static void date_14(WebDriver driver){
	   
	   WebElement dateWidget =driver.findElement(By.xpath("//table[@class='x-date-inner']/tbody"));
	  String T= dateWidget.getText();
	  List<WebElement> rows=dateWidget.findElements(By.tagName("tr")); 
int R=rows.size();
	  List<WebElement> columns=dateWidget.findElements(By.tagName("td")); 
	 int C=columns.size();
	 // System.out.println(C);
	  
	 for (WebElement cell: columns){  
		   //Select 13th Date   
		   if (cell.getText().equals("14")){  
		   cell.findElement(By.linkText("14")).click();  
		   break;  
		   }  
		  }   	 		 
return;
}
public static void date_15(WebDriver driver){
	   
	   WebElement dateWidget =driver.findElement(By.xpath("//table[@class='x-date-inner']/tbody"));
	  String T= dateWidget.getText();
	  List<WebElement> rows=dateWidget.findElements(By.tagName("tr")); 
int R=rows.size();
	  List<WebElement> columns=dateWidget.findElements(By.tagName("td")); 
	 int C=columns.size();
	 // System.out.println(C);
	  
	 for (WebElement cell: columns){  
		   //Select 13th Date   
		   if (cell.getText().equals("15")){  
		   cell.findElement(By.linkText("15")).click();  
		   break;  
		   }  
		  }   	 		 
return;
}
public static void date_16(WebDriver driver){
	   
	   WebElement dateWidget =driver.findElement(By.xpath("//table[@class='x-date-inner']/tbody"));
	  String T= dateWidget.getText();
	  List<WebElement> rows=dateWidget.findElements(By.tagName("tr")); 
int R=rows.size();
	  List<WebElement> columns=dateWidget.findElements(By.tagName("td")); 
	 int C=columns.size();
	 // System.out.println(C);
	  
	 for (WebElement cell: columns){  
		   //Select 13th Date   
		   if (cell.getText().equals("16")){  
		   cell.findElement(By.linkText("16")).click();  
		   break;  
		   }  
		  }   	 		 
return;
}
public static void date_17(WebDriver driver){
	   
	   WebElement dateWidget =driver.findElement(By.xpath("//table[@class='x-date-inner']/tbody"));
	  String T= dateWidget.getText();
	  List<WebElement> rows=dateWidget.findElements(By.tagName("tr")); 
int R=rows.size();
	  List<WebElement> columns=dateWidget.findElements(By.tagName("td")); 
	 int C=columns.size();
	 // System.out.println(C);
	  
	 for (WebElement cell: columns){  
		   //Select 13th Date   
		   if (cell.getText().equals("17")){  
		   cell.findElement(By.linkText("17")).click();  
		   break;  
		   }  
		  }   	 		 
return;
}
public static void date_18(WebDriver driver){
	   
	   WebElement dateWidget =driver.findElement(By.xpath("//table[@class='x-date-inner']/tbody"));
	  String T= dateWidget.getText();
	  List<WebElement> rows=dateWidget.findElements(By.tagName("tr")); 
int R=rows.size();
	  List<WebElement> columns=dateWidget.findElements(By.tagName("td")); 
	 int C=columns.size();
	 // System.out.println(C);
	  
	 for (WebElement cell: columns){  
		   //Select 13th Date   
		   if (cell.getText().equals("18")){  
		   cell.findElement(By.linkText("18")).click();  
		   break;  
		   }  
		  }   	 		 
return;
}
public static void date_19(WebDriver driver){
	   
	   WebElement dateWidget =driver.findElement(By.xpath("//table[@class='x-date-inner']/tbody"));
	  String T= dateWidget.getText();
	  List<WebElement> rows=dateWidget.findElements(By.tagName("tr")); 
int R=rows.size();
	  List<WebElement> columns=dateWidget.findElements(By.tagName("td")); 
	 int C=columns.size();
	 // System.out.println(C);
	  
	 for (WebElement cell: columns){  
		   //Select 13th Date   
		   if (cell.getText().equals("19")){  
		   cell.findElement(By.linkText("19")).click();  
		   break;  
		   }  
		  }   	 		 
return;
}
public static void date_20(WebDriver driver){
	   
	   WebElement dateWidget =driver.findElement(By.xpath("//table[@class='x-date-inner']/tbody"));
	  String T= dateWidget.getText();
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
return;
}
public static void date_21(WebDriver driver){
	   
	   WebElement dateWidget =driver.findElement(By.xpath("//table[@class='x-date-inner']/tbody"));
	  String T= dateWidget.getText();
	  List<WebElement> rows=dateWidget.findElements(By.tagName("tr")); 
int R=rows.size();
	  List<WebElement> columns=dateWidget.findElements(By.tagName("td")); 
	 int C=columns.size();
	 // System.out.println(C);
	  
	 for (WebElement cell: columns){  
		   //Select 13th Date   
		   if (cell.getText().equals("21")){  
		   cell.findElement(By.linkText("21")).click();  
		   break;  
		   }  
		  }   	 		 
return;
}
public static void date_22(WebDriver driver){
	   
	   WebElement dateWidget =driver.findElement(By.xpath("//table[@class='x-date-inner']/tbody"));
	  String T= dateWidget.getText();
	  List<WebElement> rows=dateWidget.findElements(By.tagName("tr")); 
int R=rows.size();
	  List<WebElement> columns=dateWidget.findElements(By.tagName("td")); 
	 int C=columns.size();
	 // System.out.println(C);
	  
	 for (WebElement cell: columns){  
		   //Select 13th Date   
		   if (cell.getText().equals("22")){  
		   cell.findElement(By.linkText("22")).click();  
		   break;  
		   }  
		  }   	 		 
return;
}
public static void date_23(WebDriver driver){
	   
	   WebElement dateWidget =driver.findElement(By.xpath("//table[@class='x-date-inner']/tbody"));
	  String T= dateWidget.getText();
	  List<WebElement> rows=dateWidget.findElements(By.tagName("tr")); 
int R=rows.size();
	  List<WebElement> columns=dateWidget.findElements(By.tagName("td")); 
	 int C=columns.size();
	 // System.out.println(C);
	  
	 for (WebElement cell: columns){  
		   //Select 13th Date   
		   if (cell.getText().equals("23")){  
		   cell.findElement(By.linkText("23")).click();  
		   break;  
		   }  
		  }   	 		 
return;
}
public static void date_24(WebDriver driver){
	   
	   WebElement dateWidget =driver.findElement(By.xpath("//table[@class='x-date-inner']/tbody"));
	  String T= dateWidget.getText();
	  List<WebElement> rows=dateWidget.findElements(By.tagName("tr")); 
int R=rows.size();
	  List<WebElement> columns=dateWidget.findElements(By.tagName("td")); 
	 int C=columns.size();
	 // System.out.println(C);
	  
	 for (WebElement cell: columns){  
		   //Select 13th Date   
		   if (cell.getText().equals("24")){  
		   cell.findElement(By.linkText("24")).click();  
		   break;  
		   }  
		  }   	 		 
return;
}
public static void date_25(WebDriver driver){
	   
	   WebElement dateWidget =driver.findElement(By.xpath("//table[@class='x-date-inner']/tbody"));
	  String T= dateWidget.getText();
	  List<WebElement> rows=dateWidget.findElements(By.tagName("tr")); 
int R=rows.size();
	  List<WebElement> columns=dateWidget.findElements(By.tagName("td")); 
	 int C=columns.size();
	 // System.out.println(C);
	  
	 for (WebElement cell: columns){  
		   //Select 13th Date   
		   if (cell.getText().equals("25")){  
		   cell.findElement(By.linkText("25")).click();  
		   break;  
		   }  
		  }   	 		 
return;
}
public static void date_26(WebDriver driver){
	   
	   WebElement dateWidget =driver.findElement(By.xpath("//table[@class='x-date-inner']/tbody"));
	  String T= dateWidget.getText();
	  List<WebElement> rows=dateWidget.findElements(By.tagName("tr")); 
int R=rows.size();
	  List<WebElement> columns=dateWidget.findElements(By.tagName("td")); 
	 int C=columns.size();
	 // System.out.println(C);
	  
	 for (WebElement cell: columns){  
		   //Select 13th Date   
		   if (cell.getText().equals("26")){  
		   cell.findElement(By.linkText("26")).click();  
		   break;  
		   }  
		  }   	 		 
return;
}
public static void date_27(WebDriver driver){
	   
	   WebElement dateWidget =driver.findElement(By.xpath("//table[@class='x-date-inner']/tbody"));
	  String T= dateWidget.getText();
	  List<WebElement> rows=dateWidget.findElements(By.tagName("tr")); 
int R=rows.size();
	  List<WebElement> columns=dateWidget.findElements(By.tagName("td")); 
	 int C=columns.size();
	 // System.out.println(C);
	  
	 for (WebElement cell: columns){  
		   //Select 13th Date   
		   if (cell.getText().equals("27")){  
		   cell.findElement(By.linkText("27")).click();  
		   break;  
		   }  
		  }   	 		 
return;
}
public static void date_28(WebDriver driver){
	   
	   WebElement dateWidget =driver.findElement(By.xpath("//table[@class='x-date-inner']/tbody"));
	  String T= dateWidget.getText();
	  List<WebElement> rows=dateWidget.findElements(By.tagName("tr")); 
int R=rows.size();
	  List<WebElement> columns=dateWidget.findElements(By.tagName("td")); 
	 int C=columns.size();
	 // System.out.println(C);
	  
	 for (WebElement cell: columns){  
		   //Select 13th Date   
		   if (cell.getText().equals("28")){  
		   cell.findElement(By.linkText("28")).click();  
		   break;  
		   }  
		  }   	 		 
return;
}
public static void date_29(WebDriver driver){
	   
	   WebElement dateWidget =driver.findElement(By.xpath("//table[@class='x-date-inner']/tbody"));
	  String T= dateWidget.getText();
	  List<WebElement> rows=dateWidget.findElements(By.tagName("tr")); 
int R=rows.size();
	  List<WebElement> columns=dateWidget.findElements(By.tagName("td")); 
	 int C=columns.size();
	 // System.out.println(C);
	  
	 for (WebElement cell: columns){  
		   //Select 13th Date   
		   if (cell.getText().equals("29")){  
		   cell.findElement(By.linkText("29")).click();  
		   break;  
		   }  
		  }   	 		 
return;
}
public static void date_30(WebDriver driver){
	   
	   WebElement dateWidget =driver.findElement(By.xpath("//table[@class='x-date-inner']/tbody"));
	  String T= dateWidget.getText();
	  List<WebElement> rows=dateWidget.findElements(By.tagName("tr")); 
int R=rows.size();
	  List<WebElement> columns=dateWidget.findElements(By.tagName("td")); 
	 int C=columns.size();
	 // System.out.println(C);
	  
	 for (WebElement cell: columns){  
		   //Select 13th Date   
		   if (cell.getText().equals("30")){  
		   cell.findElement(By.linkText("30")).click();  
		   break;  
		   }  
		  }   	 		 
return;
}
public static void date_31(WebDriver driver){
	   
	   WebElement dateWidget =driver.findElement(By.xpath("//table[@class='x-date-inner']/tbody"));
	  String T= dateWidget.getText();
	  List<WebElement> rows=dateWidget.findElements(By.tagName("tr")); 
int R=rows.size();
	  List<WebElement> columns=dateWidget.findElements(By.tagName("td")); 
	 int C=columns.size();
	 // System.out.println(C);
	  
	 for (WebElement cell: columns){  
		   //Select 13th Date   
		   if (cell.getText().equals("31")){  
		   cell.findElement(By.linkText("31")).click();  
		   break;  
		   }  
		  }   	 		 
return;
}
}
