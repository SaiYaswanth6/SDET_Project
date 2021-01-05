package Utilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.After;
import cucumber.api.java.Before;
public class hooks {
	
    public static WebDriver driver; 
    
     @Before
        public void beforeScenario() throws InterruptedException{
    	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\MCSaiYaswanth\\Desktop\\SDET\\BDD\\chromedriver.exe");
 	   	driver = new ChromeDriver();
 	   	 driver.get("https://corporate.olacabs.com/#/contact");
 	   	 Thread.sleep(5000);
         System.out.println("URL is open");
              
        
         
        } 
     
     @After
        public static void afterScenario(){
    	 driver.quit();
            System.out.println("Browser Closed");
            
        }
     
}