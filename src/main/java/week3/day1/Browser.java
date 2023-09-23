package week3.day1;

public class Browser extends Chrome {
	
	String browserName="chrome";
	int browserVersion=18;
	
	public void browserName()
	{
		System.out.println("browserName=chrome");
	}
	public void browserVersion()
	{
		System.out.println("int browserVersion=18;");
	}
	 public void openURL()
	 {
		 System.out.println("openURL-superBrowser");
	 }
	 
	 public void closeBrowser()
	 {
		 System.out.println("closeBrowser-superBrowser");
	 }
	 public void navigateBack()
	 {
		 System.out.println("navigateBack-superBrowser");
	 }
	

	public static void main(String[] args) {
		Browser objec=new Browser();
		objec.browserName();
		objec.browserVersion();
		objec.openIncognito();
		objec.clearCache();
		objec.openIncognito();
		objec.closeBrowser();
		objec.navigateBack();
		

	}

}
