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
     driver.navigate().to("https://www.facebook.com/");  
    
       //Maximize the browser  
     driver.manage().window().maximize();      
     Thread.sleep(2000);
     //WebElement a = driver.findElement(By.xpath("//img[@class= '_396cs4 _3exPp9'][@alt = \"Grocery\"]"));
     driver.findElement(By.xpath("//a[@title='English (UK)']")).click();
     Thread.sleep(2000);
      WebElement a = driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
     a.click();
     
    // Actions actions = new Actions(driver);
    // WebElement elementLocator = driver.findElement(By.xpath("//button[@id='dblClkBtn']"));
    // actions.doubleClick(elementLocator).perform();
     Thread.sleep(3000);
     driver.findElement(By.xpath("//input[@name='sex'][@value=1]")).click();
     //driver.close();
    
    

 }  
	
}
