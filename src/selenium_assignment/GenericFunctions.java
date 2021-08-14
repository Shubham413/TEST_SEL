package selenium_assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GenericFunctions {

	public static void main(String[] args) {
		
		
		 System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");  
         
         // Instantiate a ChromeDriver class.     
      WebDriver driver=new ChromeDriver();  
        
         // Launch testandquiz website
      driver.navigate().to("https://www.naukri.com/mnjuser/homepage");  
     
        //Maximize the browser  
      driver.manage().window().maximize();  
       ValidateTextBox(driver.findElement(By.xpath("//input[@id ='usernameField']")),"pal.shubham413@gmail.com");
       ValidateTextBox(driver.findElement(By.xpath("//input[@id ='passwordField']")),"nameoffame");
       ValidateButton(driver.findElement(By.xpath("//button[@type='submit']")));  
	}
	
	public static void ValidateTextBox(WebElement textbox, String Value){
  	  
  	  if(textbox.isDisplayed()) 
  	  {
  		  System.out.println("TextBox Displayed : " + textbox);
  		  if(textbox.isEnabled())
  		  {
  			System.out.println("TextBox Enabled : " + textbox);
  			  textbox.sendKeys(Value);
  		  }
  		  else
  		  {
  			  System.out.println("Element not enabled");
  		  }
  	  }
  	  else 
  	  {
  		 System.out.println("Element not Displayed");
  	  }
    }
    
	
	public static void ValidateButton(WebElement Button){
	  	  
	  	  if(Button.isDisplayed()) 
	  	  {
	  		System.out.println("Button Displayed : " + Button);
	  		  if(Button.isEnabled())
	  		  {
	  			System.out.println("TextBox Enabled : " + Button);
	  			Button.click();
	  		  }
	  		  else
	  		  {
	  			  System.out.println("Element not enabled");
	  		  }
	  	  }
	  	  else 
	  	  {
	  		 System.out.println("Element not Displayed");
	  	  }
	    }
}
