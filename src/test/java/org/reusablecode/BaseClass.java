package org.reusablecode;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	public static WebDriver driver;
	static Select s;
	Actions a;

	public static void openBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Renuka\\eclipse-workspace\\Cucumber1\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();

	}

	public static void loadUrl(String url) {
		driver.get(url);
	}

	public static void pageUrl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
	}

	public static void pageTitle() {
		String title = driver.getTitle();
		System.out.println(title);
	}

	public static void chooseText(WebElement e1, int i) {
		s = new Select(e1);
		s.selectByIndex(i);

	}

	public static void closeBrowser() {
		driver.quit();

	}
}
