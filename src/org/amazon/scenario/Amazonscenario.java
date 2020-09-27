package org.amazon.scenario;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.amazon.locators.xpath_Login;
import org.amazon.locators.xpath_amazonsearch;
import org.wedbriver.function.webdrivermethods;

public class Amazonscenario extends webdrivermethods{


	xpath_Login login = new xpath_Login();
	xpath_amazonsearch search = new xpath_amazonsearch();

	public void UserLoginaction() throws FileNotFoundException, IOException, InterruptedException {
		try{
			String username = readdata("uname");
			String pwd = readdata("uname");

			login.userlogin(username,pwd);
			login.verifyHomePage();}
		catch(Exception e)
		{System.out.println(e);}

	}

	//another scenario
	public void searchfunction(){

		try{search.searchText();
		//verify seacrh scenario
		}
		catch(Exception e)
		{System.out.println(e);}
	}
}
