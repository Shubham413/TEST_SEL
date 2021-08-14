package selenium_assignment;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wbtable {

	  public static void main(String[] args) throws InterruptedException {  
	      
          // System Property for Chrome Driver   
       System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");  
         
          // Instantiate a ChromeDriver class.     
       WebDriver driver=new ChromeDriver();  
         
          // Launch testandquiz website
       driver.navigate().to("https://www.tutorialspoint.com/microsoft_azure/microsoft_azure_personalize_company_branding.htm");  
      
         //Maximize the browser  
       driver.manage().window().maximize();  
       
       List<WebElement> columnsNumber = driver.findElements(By.xpath("//table[@class=\"table table-bordered\"]/tbody/tr[1]/th"));
       int columnCount = columnsNumber.size();
       System.out.println("No of columns in this table : " + columnCount);
       
       //List col = driver.findElements(By.xpath("//table[@class='table table-bordered']/tbody/tr"));
       List<WebElement> rowsNumber = driver.findElements(By.xpath("//table[@class='table table-bordered']/tbody/tr"));
       int rowCount = rowsNumber.size();
       System.out.println("No of rows in this table : " + rowCount);
       
       for (int row = 1; row <= rowsNumber.size();row++) {
    	   
    	   for (int col = 1; col<= columnsNumber.size(); col++) {
    		   if(row ==1) {
    		   WebElement currentcol = driver.findElement(By.xpath("//table[@class='table table-bordered']/tbody/tr["+row+"]/th["+col+"]"));
    		   System.out.print(currentcol.getText() + "\t");
    		   }
    		   else if(row >1 && col==1){
    			   WebElement currentcol = driver.findElement(By.xpath("//table[@class='table table-bordered']/tbody/tr["+row+"]/th["+col+"]"));
        		   System.out.print(currentcol.getText() + "\t");  
    		   }
    		   else {
    			   WebElement currentcol = driver.findElement(By.xpath("//table[@class='table table-bordered']/tbody/tr["+row+"]/td["+(col-1)+"]"));
        		   System.out.print(currentcol.getText() + "\t");  
    		   }
    		 
    	   }
    	   System.out.println("\n");
       }
	  
	  
	  }
	
}
