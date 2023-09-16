package week1.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		
		//ChromeDriver driver =new ChromeDriver();
		EdgeDriver driver =new EdgeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("6380208845");
		driver.findElement(By.id("pass")).sendKeys("narayana");
		driver.findElement(By.name("login")).click();
		driver.findElement(By.linkText(null))
		
	
	}
}
//driver.get("http://leaftaps.com/opentaps/control/main");