package org.amazon.locators;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.wedbriver.function.webdrivermethods;

public class xpath_Login extends webdrivermethods {
	public xpath_Login()
	{
		PageFactory.initElements(browser, this);
	}

	@FindBy(xpath = "//span[contains(text(),'Hello,')]")
	private WebElement signin;

	public WebElement getSignin() 
	{return signin;}
	
//**********************************************************************//

	@FindBy(name = "email")
	private WebElement email;

	@FindBy(name = "password")
	private WebElement password;

	@FindBy(id = "continue")
	private WebElement cntinue;

	public WebElement getemail()
	{return email;	}

	public WebElement getpassword() 
	{return password; }

	public WebElement getcntinue() 
	{return cntinue;}
	
//**********************************************************************//

	@FindBy(id = "signInSubmit")
	private WebElement signInSubmit;

	public WebElement getSignInSubmit() 
	{return signInSubmit;	}
//**********************************************************************//
	public void signinaction() {
		ClickElement(getSignin());
	}

	public void userlogin() throws FileNotFoundException, IOException, InterruptedException {

		try{
			PassElement(getemail(), readdata("uname")); 
			Thread.sleep(1000);
			ClickElement(getcntinue());
			Thread.sleep(1000);
			PassElement(getpassword(),readdata("pwd"));
			Thread.sleep(1000);}
		catch(Exception e)
		{System.out.println(e);}

	}

	public void signin() {
		try
		{ClickElement(getSignInSubmit());
		Thread.sleep(1000);}
		catch(Exception e)
		{System.out.println(e);}
	}
}