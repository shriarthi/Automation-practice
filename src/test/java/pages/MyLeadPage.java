package pages;

import org.openqa.selenium.By;

import basemethod.ProjectSpectificationMethod;

public class MyLeadPage extends ProjectSpectificationMethod{
	
	public CreateLeadPage clickCreatelead()
	{
		driver.findElement(By.linkText("Create Lead")).click();
		return new CreateLeadPage();
	}

}
