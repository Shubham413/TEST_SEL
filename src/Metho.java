import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;  
  
public class Metho {  
  
    public static void main(String[] args) throws InterruptedException {  
      
           // System Property for Chrome Driver   
        System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");  
          
           // Instantiate a ChromeDriver class.     
        WebDriver driver=new ChromeDriver();  
          
           // Launch testandquiz website
        driver.navigate().to("https://www.testandquiz.com/selenium/testing.html");  
       
          //Maximize the browser  
        driver.manage().window().maximize();      

        WebElement a = driver.findElement(By.xpath("//button[@id='idOfButton']"));
        a.click();
        
        Actions actions = new Actions(driver);
        WebElement elementLocator = driver.findElement(By.xpath("//button[@id='dblClkBtn']"));
        actions.doubleClick(elementLocator).perform();
        
        Thread.sleep(5000);
        driver.close();
       
       
  
    }  
  
}  

