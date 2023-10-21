package week1.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class WindowHandle {

	public static void main(String[] args) throws InterruptedException {
        EdgeDriver driver= new EdgeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.leafground.com/window.xhtml");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='ui-button-text ui-c']")).click();
	    String windowHandle = driver.getWindowHandle();
	    System.out.println(windowHandle +" "+driver.getTitle());
	    
	    Set<String> windowHandles = driver.getWindowHandles();
        System.out.println(windowHandles +" "+ driver.getTitle());
        
        List<String>windows =new ArrayList<String>(windowHandles);
        driver.switchTo().window(windows.get(1));
        System.out.println(driver.getTitle());
        
        driver.findElement(By.id("email")).sendKeys("arthi@gmail.com");
        driver.close();
        
        driver.switchTo().window(windows.get(0));
        driver.findElement(By.xpath("//span[text()='Open Multiple']")).click();
        System.out.println(driver.getTitle());
        
        
	}

}
