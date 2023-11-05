package week7day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitlyWait {

	public static void main(String[] args) {
EdgeDriver driver= new EdgeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.manage().window().maximize();
		
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles);
		List<String> window=new ArrayList<String>(windowHandles);
		
		driver.findElement(By.xpath(("//span[text()='Click'])[3]"))).click();
		
		WebDriverWait w=new WebDriverWait(driver,Duration.ofSeconds(10));
		
		w.until(Expected)
		
		

	}

}
