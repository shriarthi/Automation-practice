package week1.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class LaunchBrowser {

	public static void main(String[] args) {
		
		//ChromeDriver driver =new ChromeDriver();
		EdgeDriver driver =new EdgeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.findElement(By.name("USERNAME")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("center-content-column"));
		driver.findElement(By.className("allSubSectionBlocks"));
		WebElement element = driver.findElement(By.id("createLeadForm_dataSourceId"));
		
		Select object=new Select(element);
		//object.selectByValue("LEAD_EMPLOYEE");
		//object.selectByIndex(1);
		object.selectByVisibleText("Existing Customer");
		
	
	}
}
//driver.get("http://leaftaps.com/opentaps/control/main");