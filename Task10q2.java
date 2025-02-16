package taskguvi10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task10q2 {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://jqueryui.com/droppable/");
	    
        driver.manage().window().maximize();
        
        WebElement iframe=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
        driver.switchTo().frame(iframe);
        
        WebElement source=driver.findElement(By.tagName("div"));
        
        WebElement target=driver.findElement(By.id("droppable"));
        
        Actions action=new Actions(driver);
        action.dragAndDrop(source, target).perform();
        
        String backgroundColor = target.getCssValue("background-color");
        System.out.println("Target Element Background Color After Drop: " + backgroundColor);

        // Verify the text of the target element
        String targetText = target.getText();
        if (targetText.equals("Dropped!")) {
            System.out.println("Drag and Drop Operation Successful!");
        } else {
            System.out.println("Drag and Drop Operation Failed.");
        }

   
        // Close the browser
        driver.quit();   
    }
        

	}
//Output 
Target Element Background Color After Drop: rgba(255, 250, 144, 1)
Drag and Drop Operation Successful!



