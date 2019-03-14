package com.luv2code.scrape;

import java.security.cert.PKIXRevocationChecker.Option;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import okio.Options;

public class MyTest {

	public static void main(String args[]) {
		
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\thanman\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\thanman\\Downloads\\chromedriver_win32\\chromedriver.exe");

		//WebDriver driver = new ChromeDriver();
		
		ChromeOptions options = new ChromeOptions(); 
		options.addArguments("disable-infobars"); 
		DesiredCapabilities caps = DesiredCapabilities.chrome(); 
		caps.setCapability(ChromeOptions.CAPABILITY, options); 
		WebDriver driver = new ChromeDriver(caps);
		
		//driver.get("https://shop.coles.com.au/a/a-national/product/coles-tuna-cat-food/");
		driver.get("https://shop.coles.com.au/a/a-national/product/coles-tuna-cat-food");
		driver.manage().window().maximize();
		String appTitle = driver.getPageSource();
		
		System.out.println(appTitle);
		
		String expTitle = "Google";
		
		if (appTitle.equals(expTitle)) {
			System.out.println("Verification Successfull");
		} else {
			System.out.println("Verification Failed");

		}
		
		driver.close();
		System.exit(0);
	}
}