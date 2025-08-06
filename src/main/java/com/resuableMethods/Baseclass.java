package com.resuableMethods;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

// Reusable Methods
public abstract class Baseclass {

	public static WebDriver driver; // null

	public static File file;
	// browser launch

	protected static WebDriver launchBrowser(String browserName) { // browserName= "chrome"

		try {
			if (browserName.equalsIgnoreCase("chrome")) {
				ChromeOptions options = new ChromeOptions();
				options.addArguments("start-maximized");
				options.addArguments("incognito");
				options.addArguments("--ignore-certificate-errors");
				options.addArguments("chrome.switches", "--disable-extensions");
				options.addArguments("--disable-notifications");
				options.addArguments("enable-automation");

				driver = new ChromeDriver(options);
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

			} else if (browserName.equalsIgnoreCase("edge")) {
				driver = new EdgeDriver();
			} else if (browserName.equalsIgnoreCase("FireFox")) {
				driver = new FirefoxDriver();
			} else if (browserName.equalsIgnoreCase("IE")) {
				driver = new InternetExplorerDriver();
			}
		} catch (Exception e) {

			Assert.fail("ERROR: ");
		}

		return driver;
	}

	// get Url
	protected static void launchUrl(String url) {

		try {
			driver.get(url);
		} catch (Exception e) {

			Assert.fail("ERROR: OCCUR IN THE URL LAUNCHING ");

		}

	}

	protected static void inputValues(WebElement element, String value) { // element= loginEmail, string =" velan"

		try {
			element.sendKeys(value);
		} catch (Exception e) {

			Assert.fail("ERROR: OCCUR IN THE INPUTVALUES ");
		}

	}

	protected static void clickElement(WebElement element) {

		try {
			element.click();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	protected static void elementIsEnabled(WebElement element) {

		try {
			boolean enabled = element.isEnabled();

			System.out.println("The element isenabled :" + enabled);

		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	protected static void framesIndex(int index) {

		try {
			driver.switchTo().frame(index);
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	protected static void frameWebelement(WebElement element) {

		try {
			driver.switchTo().frame(element);
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	protected static void framesID(String IDorName) {

		// overload

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));

		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(0));

		try {
			driver.switchTo().frame(IDorName);
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	protected static void framesDefaultContent() {

		try {
			driver.switchTo().defaultContent();
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	protected static void terminateBrowser() {
		try {
			driver.quit();
		} catch (Exception e) {
			Assert.fail("ERROR: OCCUR IN THE TERMINATING THE BROWSER");
		}
	}

	protected static void assertText(WebElement element, String exceptedText) {

		try {
			String actualText = element.getText();

			Assert.assertEquals(actualText, exceptedText);
		} catch (Exception e) {

			Assert.fail("ERROR: OCCUR IN THE ASSERT TEXT ");

		}
	}

	protected static void actionsMoveToElement(WebElement element) {

		Actions s = new Actions(driver);

		try {
				s.moveToElement(element).build().perform();
			
		} catch (Exception e) {
			Assert.fail("ERROR: OCCUR IN THE MOUSE ACTION MOVETOELEMENT ");

		}
	}

	protected static void javaScriptClick(WebElement element) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", element);

	}

	protected static void clearInput(WebElement element) {

		try {
			element.clear();
		} catch (Exception e) {

		}
	}

	protected static void PrintingText(WebElement element) {

		String text = element.getText();
		System.out.println(text);

	}

	public static void selectDropDownOptionValue(WebElement element, String value) {

		Select s = new Select(element);

		s.selectByValue(value);

	}

	public String takeScreenshot() throws IOException {
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
		File scrfile = screenshot.getScreenshotAs(OutputType.FILE);
		File destfile = new File("Screenshot\\.png" + "_" + timeStamp + ".png");
		FileHandler.copy(scrfile, destfile);
		return destfile.getAbsolutePath();
	}

	public static void windowsHandling(String wId) {
		Set<String> AllId = driver.getWindowHandles();
		for (String id : AllId) {
			{
//				if (!(id == wId))
//					driver.switchTo().window(id); // Switch to the desired window first and then execute commands using

				System.out.println(driver.switchTo().window(id).getTitle());

			}
		}
	}

	public static void selectDropDownOption(WebElement element, String option, String value) {

		Select s = new Select(element);

		if (option.equalsIgnoreCase("value")) {
			s.selectByValue(value);
		} else if (option.equalsIgnoreCase("visibletext")) {
			s.selectByVisibleText(value);
		} else if (option.equalsIgnoreCase("index")) {
			s.selectByIndex(Integer.parseInt(value));
		}

	}
}
