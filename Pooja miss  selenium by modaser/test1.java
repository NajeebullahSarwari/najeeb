package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test1 {

    public static void main(String [] args) throws InterruptedException{
    	System.setProperty("webdriver.chrome.driver","C:/selenium/webdriver/chromedriver.exe");
    	WebDriver driver = new ChromeDriver();
    	
    	driver.get("https://www.google.com/");
    	driver.wait(100);
    	driver.close();
    	}
    
}