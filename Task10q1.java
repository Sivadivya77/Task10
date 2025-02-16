package taskguvi10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task10q1 {

	public static void main(String[] args) {
		
WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://jqueryui.com/datepicker/");
	    
        driver.manage().window().maximize();
        
        WebElement iframe=driver.findElement(By.cssSelector(".demo-frame"));
        driver.switchTo().frame(iframe);
        driver.findElement(By.xpath("//input[@id='datepicker']")).click();
        
        
        driver.findElement(By.cssSelector("a[title='Next']")).click();
     // Click the datepicker input field to open the calendar
        WebElement dateInput = driver.findElement(By.id("datepicker"));
        dateInput.click();

        // Select the date "22" from the datepicker
        WebElement date22 = driver.findElement(By.xpath("//a[text()='22']"));
        date22.click();
       String select= date22.getText();
        System.out.println(select);
        
        
	}

}
