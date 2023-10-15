package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;

public class MoveToElements {

	public static void main(String[] args) {
		EdgeOptions option=new EdgeOptions();
		option.addArguments("--disable-notifications");
        EdgeDriver driver= new EdgeDriver(option);
		
        driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.ajio.com/");
		
		WebElement  MouseOver = driver.findElement(By.linkText("WOMEN"));
		
		Actions obj=new Actions(driver);
		obj.moveToElement(MouseOver).perform();

	}

}
