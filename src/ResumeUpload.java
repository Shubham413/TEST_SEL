import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ResumeUpload {

	
	public static void main(String[] args) throws InterruptedException {  
	      
        // System Property for Chrome Driver   
     System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");  
       
        // Instantiate a ChromeDriver class.     
     WebDriver driver=new ChromeDriver();  
       
        // Launch testandquiz website
     driver.navigate().to("https://www.naukri.com/mnjuser/homepage");  
    
       //Maximize the browser  
     driver.manage().window().maximize();  
     
     driver.findElement(By.xpath("//input[@id ='usernameField']")).sendKeys("pal.shubham413@gmail.com");
     driver.findElement(By.xpath("//input[@id ='passwordField']")).sendKeys("nameoffame");
     WebElement Logbtn = driver.findElement(By.xpath("//button[@type='submit']"));
     Logbtn.click();

   
   
     
}
	
}
