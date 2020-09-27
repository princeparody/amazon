package org.amazon.locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.wedbriver.function.webdrivermethods;

public class xpath_amazonsearch extends webdrivermethods{

	public xpath_amazonsearch()
	{PageFactory.initElements(browser, this);}


	@FindBy(xpath="//input[@id='twotabsearchtextbox']")
	private WebElement searchtextbox;

	@FindBy(xpath="//input[@value='Go']")
	private WebElement Go;
	
	//list webelement and verify it
	
	//**********************************************************************//

	public WebElement getSearchtextbox() 
	{return searchtextbox;}

	public WebElement getGo() 
	{return Go;}
	
	//**********************************************************************//

	public void searchText(){
		try {
			Thread.sleep(2000);
			PassElement(getSearchtextbox(), readdata("lapname"));
			Thread.sleep(2000);
			ClickElement(Go);			
		} catch (Exception e) 
		{System.out.println(e);}
	}}
