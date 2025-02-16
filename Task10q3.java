package taskguvi10;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Task10q3 {

	public static void main(String[] args) {
		
        WebDriver driver=new ChromeDriver();
				
		driver.get("https://www.guvi.in/");
	    
        driver.manage().window().maximize();
        
        driver.findElement(By.cssSelector("a[class='⭐️rawbli-0 bg-green-500 hover:bg-green-600 text-white font-normal py-2 px-4 rounded text-base min-h-8 h-8 align-middle mr-2']")).click();
        
        
        driver.findElement(By.id("name")).sendKeys("Sivachandranlatha");
        
        driver.findElement(By.id("email")).sendKeys("csiva80001@gamil.com");
        
        JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,2500)");
		
        
		 driver.findElement(By.xpath("(//input[@id='password'])[1]")).sendKeys("Sivalatha@77");
        
        driver.findElement(By.id("mobileNumber")).sendKeys("9876543210");
        
        driver.findElement(By.id("signup-btn")).click();
        
        
        
     driver.navigate().to("https://www.guvi.in/"); 
        
       
       driver.findElement(By.cssSelector("#login-btn")).click();
       
       driver.findElement(By.id("email")).sendKeys("csiva801@gamil.com");
       
       driver.findElement(By.id("password")).sendKeys("Divyasiva@77");
       
       driver.findElement(By.id("login-btn")).click();
       
       
       
     
	}

}
