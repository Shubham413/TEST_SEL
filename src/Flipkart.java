import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Flipkart {

	public static void main(String[] args) throws InterruptedException {  
	      
        // System Property for Chrome Driver   
     System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");  
       
        // Instantiate a ChromeDriver class.     
     WebDriver driver=new ChromeDriver();  
       
        // Launch LinkedIN Website  
     driver.navigate().to("https://www.flipkart.com/");  
    
       //Maximize the browser  
     driver.manage().window().maximize();      
     Thread.sleep(10000);
     //WebElement a = driver.findElement(By.xpath("//img[@class= '_396cs4 _3exPp9'][@alt = \"Grocery\"]"));
      WebElement a = driver.findElement(By.xpath("//img[@alt = 'Grocery']"));
     a.click();
     
    // Actions actions = new Actions(driver);
    // WebElement elementLocator = driver.findElement(By.xpath("//button[@id='dblClkBtn']"));
    // actions.doubleClick(elementLocator).perform();
     
     Thread.sleep(5000);
     driver.close();
    
    

 }  
	
}
