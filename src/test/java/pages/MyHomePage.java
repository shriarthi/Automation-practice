package pages;

import org.openqa.selenium.By;

import basemethod.ProjectSpectificationMethod;

public class MyHomePage extends ProjectSpectificationMethod {

	public MyLeadPage clickcrmsfa(){
		
			driver.findElement(By.linkText("CRM/SFA")).click();
			return new MyLeadPage();
		}
		
	public MyHomePage logout()
	{
		driver.findElement(By.className("decorativeSubmit")).click();
		return this;
	}
	}

