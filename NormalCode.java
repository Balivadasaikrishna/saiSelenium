package mavendemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class NormalCode {

	
	@Parameters({"username", "password"})
	
	@Test
	
	
	
	
	public void run (String pass , String user) {
		
		
		WebDriver driver;
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\baliv\\Desktop\\chromedriver.exe");
		 driver = new ChromeDriver();
		 
		 driver.get("https://www.facebook.com/login/");
		 
		 driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys(pass);
		 driver.findElement(By.xpath("//input[@id=\"pass\"]")).sendKeys(user);
              int a;
		 
		 
		
		
		

	}
	
	

}
