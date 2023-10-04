package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class LearnAlert {

	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver= new EdgeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
		Thread.sleep(2000);
		
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("Arthi");
		alert.accept();
	    String text = driver.findElement(By.xpath("//span[@id='confirm_result']")).getText();
		System.out.println(text);
	
		
		
		//driver.findElement(By.id("j_idt88:j_idt104"));
		
		
		
		
		
	}

}
