package com.obsqura.AutomationCourse;

public class NavigationCommands extends Base{
	public void navigate() {
		  driver.navigate().to("https://selenium.obsqurazone.com/simple-form-demo.php");
		  driver.navigate().back();
		  driver.navigate().forward();
		  driver.navigate().refresh();
		 }

	public static void main(String[] args) {
		
		 NavigationCommands navigationCommands=new NavigationCommands();
		  navigationCommands.initializeBrowser();
		  navigationCommands.navigate();
		  navigationCommands.driverQuit();
	}

}
