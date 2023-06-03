package com.obsqura.AutomationCourse;

import org.openqa.selenium.By;

public class Locators2 extends Base{
	public void locateByCssSelector()
	{
		//tag#id
		driver.findElement(By.cssSelector("input#twotabsearchtextbox"));
		driver.navigate().to("https://www.meesho.com/");
		driver.findElement(By.cssSelector("style#__jsx-2825112192"));
		driver.findElement(By.cssSelector("style#_goober"));
		driver.navigate().to("https://www.browserstack.com/");
		driver.findElement(By.cssSelector("input#doc-search-box-input"));
		driver.findElement(By.cssSelector("style#bstack-fcp-header-inline-css"));
		driver.navigate().back();
		driver.navigate().refresh();
		driver.navigate().back();
		driver.navigate().refresh();
		//tag.classname
		driver.findElement(By.cssSelector("span.hm-icon-label"));
		driver.navigate().to("https://www.meesho.com/");
		driver.findElement(By.cssSelector("div.header-logo-container"));
		driver.navigate().to("https://selenium.obsqurazone.com/simple-form-demo.php");
		driver.findElement(By.cssSelector("a.navbar-brand"));
		driver.navigate().to("https://www.browserstack.com/");
		driver.findElement(By.cssSelector("input.ais-SearchBox-input"));
		driver.findElement(By.cssSelector("div.ds__overlay"));
		driver.navigate().back();
		driver.navigate().refresh();
		driver.navigate().back();
		driver.navigate().refresh();
		driver.navigate().back();
		driver.navigate().refresh();
		//tag[id=value]
		driver.findElement(By.cssSelector("input[id=twotabsearchtextbox]"));
		driver.navigate().to("https://www.meesho.com/");
		driver.findElement(By.cssSelector("style[id=__jsx-2825112192]"));
		driver.findElement(By.cssSelector("style[id=_goober]"));
		driver.navigate().to("https://www.browserstack.com/");
		driver.findElement(By.cssSelector("input[id=doc-search-box-input]"));
		driver.findElement(By.cssSelector("style[id=bstack-fcp-header-inline-css]"));
		driver.navigate().back();
		driver.navigate().refresh();
		driver.navigate().back();
		driver.navigate().refresh();
		//tag#id[attribute=value]
		driver.findElement(By.cssSelector("a#nav-hamburger-menu[data-csa-c-slot-id=HamburgerMenuDesktop]"));
		driver.navigate().to("https://selenium.obsqurazone.com/simple-form-demo.php");
		driver.findElement(By.cssSelector("a#progress-bars[class=nav-link]"));
		driver.findElement(By.cssSelector("a#alert-modal[class=nav-link]"));
		driver.navigate().to("https://www.browserstack.com/");
		driver.findElement(By.cssSelector("input#doc-search-box-input[name=query]"));
		driver.findElement(By.cssSelector("link#googleidentityservice[media=all]"));
		driver.navigate().back();
		driver.navigate().refresh();
		driver.navigate().back();
		driver.navigate().refresh();
	}
	public void locateByLinkText()
	{
		driver.findElement(By.linkText("Sell on Amazon"));
		driver.navigate().to("https://selenium.obsqurazone.com/simple-form-demo.php");
		driver.findElement(By.linkText("Simple Form Demo"));
		driver.findElement(By.linkText("Radio Buttons Demo"));
		driver.findElement(By.linkText("Ajax Form Submit"));
		driver.findElement(By.linkText("Jquery Select2"));
		driver.navigate().back();
		driver.navigate().refresh();
		
	}
	public void partialLinkText()
	{
		driver.findElement(By.partialLinkText("Today's"));
		driver.navigate().to("https://selenium.obsqurazone.com/simple-form-demo.php");
		driver.findElement(By.partialLinkText("PICKERS"));
		driver.findElement(By.partialLinkText("MODALS"));
		driver.findElement(By.partialLinkText("ALERTS"));
		driver.findElement(By.partialLinkText("Checkbox"));
		driver.navigate().back();
		driver.navigate().refresh();
		
	}

	public static void main(String[] args) {
		Locators2 locators2 = new Locators2();
		locators2.initializeBrowser();
		locators2.locateByCssSelector();
		locators2.locateByLinkText();
		locators2.partialLinkText();
		locators2.driverQuit();

	}

}
