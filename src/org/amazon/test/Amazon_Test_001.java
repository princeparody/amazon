package org.amazon.test;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.amazon.scenario.Amazonscenario;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.wedbriver.function.webdrivermethods;

public class Amazon_Test_001 extends webdrivermethods{

	Amazonscenario scenario;

	@BeforeTest
	public void browser()
	{	launch();	}
	  
	@Test(priority=1)
	public void login() throws FileNotFoundException, IOException, InterruptedException
	{
		try{
			scenario=new Amazonscenario();
			scenario.UserLoginaction();
			}
		catch(Exception e)
		{System.out.println(e);}

	}	
	
	@Test(priority =2)
	public void searchScenario1() throws FileNotFoundException, IOException, InterruptedException
	{
		try{
			scenario=new Amazonscenario();
			scenario.searchfunction();
			}
		catch(Exception e)
		{System.out.println(e);}

	}	
	
	@AfterTest
	public void browserClose()
	{
		try{
			closeBrowser();
		}
		catch(Exception e)
		{System.out.println(e);}
	}


}
