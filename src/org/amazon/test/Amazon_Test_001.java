package org.amazon.test;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.amazon.scenario.Amazonscenario;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.wedbriver.function.webdrivermethods;

public class Amazon_Test_001 extends webdrivermethods{

	Amazonscenario scenario;

	@BeforeTest
	public void browser()
	{			
		launch();
		scenario=new Amazonscenario();
	}

	@Test
	public void Userfunction() throws FileNotFoundException, IOException, InterruptedException
	{
		try{
		scenario.UserLoginaction();
		scenario.searchfunction();}
		catch(Exception e)
		{System.out.println(e);}

	}}
