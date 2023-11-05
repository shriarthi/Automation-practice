package testcases;

import org.testng.annotations.Test;

import basemethod.ProjectSpectificationMethod;
import pages.LoginPage;

public class Tc_001_login extends ProjectSpectificationMethod {
	  
	@Test
	public void logindata() {
		LoginPage lp=new LoginPage();
		lp.enterUserName()
		.enterUserPassword()
		.clickSubmit()
		.clickcrmsfa()
		.clickCreatelead();
	
	}
	
}