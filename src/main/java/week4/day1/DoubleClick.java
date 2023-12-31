package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) {
        EdgeDriver driver= new EdgeDriver();
		
        driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_ondblclick");
		
		driver.switchTo().frame("iframeResult");
		
		Actions obj=new Actions(driver);
		obj.doubleClick(driver.findElement(By.xpath("//p[contains(text(),'Double')]"))).perform();
		

	}

}
