package pages;

import org.openqa.selenium.By;

import basemethod.ProjectSpectificationMethod;

public class LoginPage extends ProjectSpectificationMethod {
	
	public LoginPage enterUserName()
	{
		driver.findElement(By.name("USERNAME")).sendKeys("demosalesmanager");
		return this;
	}
	
	public LoginPage enterUserPassword()
	{
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		return this;
	}
	public MyHomePage clickSubmit()
	{
		driver.findElement(By.className("decorativeSubmit")).click();
		return new MyHomePage();
	}
}
