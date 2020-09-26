package org.wedbriver.function;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
public class webdrivermethods{

	public static WebDriver browser;

	public static WebDriver getbrowser() {
		return browser;
	}

	public void launch()
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		webdrivermethods.browser = new ChromeDriver();
		browser.get("https://amazon.in");
		browser.manage().window().maximize();
		PageFactory.initElements(browser, this);
	}

	public void ClickElement(WebElement webele) {
		try{webele.click();}
		catch(Exception c)
		{System.out.println(c);}
	}

	public void PassElement(WebElement webele, String text) {
		try{webele.sendKeys(text);}
		catch (Exception e) {
			try{
				webele.clear();
				webele.sendKeys(Keys.DELETE);
			}
			catch(Exception e1)
			{webele.sendKeys(text);}
		}}

	public static void closeBrowser() {
		try {browser.close();} 
		catch (Exception c) {
			System.out.println(c);
		}
	}

	public String readdata(String text) throws FileNotFoundException, IOException
	{
		try{
			Properties p= new Properties();
			p.load(new FileInputStream(new File(".//Data//Values.properties")));
			String pp = p.getProperty(text);
			return pp;
		}
		catch(Exception e)
		{System.out.println(e);		}
		return text;
	}
	



}
