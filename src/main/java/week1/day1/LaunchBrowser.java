package week1.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class LaunchBrowser {

	public static void main(String[] args) throws InterruptedException {
		
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
		object.selectByValue("LEAD_EMPLOYEE");
		object.selectByIndex(1);
		//object.selectByVisibleText("Existing Customer");
		WebElement findElement = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		
		Select obj=new Select(findElement);
		
		obj.selectByValue("CATRQ_AUTOMOBILE");
		
		WebElement findElement2 = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		 Select obje = new Select(findElement2);
		 obje.selectByValue("OWN_CCORP");
		 
		String title = driver.getTitle();  
		System.out.println(title);
		 
		 
		 //driver.findElement(By.id("sectionHeaderTitle_leads"));
		 Thread.sleep(20000);
		 
		driver.close();
		
		
	
	}
}
//driver.get("http://leaftaps.com/opentaps/control/main");