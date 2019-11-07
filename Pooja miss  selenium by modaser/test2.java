package selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class test2 {
	public static void main(String[] args)throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:/selenium/webdriver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		 driver.get("https://www.amazon.in/bb/registration/choice/work");
		 
		 driver.findElement(By.linkText("No")).click();
		 
		 driver.findElement(By.name("customerName")).sendKeys("dawood");
		
		 driver.findElement(By.name("email")).sendKeys("adgfg123@gmail.com");
		
		 driver.findElement(By.name("password")).sendKeys("67546543654");
		 driver.findElement(By.name("passwordCheck")).sendKeys("67546543654");
		
		 
		 
		 driver.findElement(By.linkText("Create your Amazon Business account")).click();
		 driver.wait(100);
		 driver.close();
		
	}

}