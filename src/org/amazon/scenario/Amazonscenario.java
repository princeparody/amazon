package org.amazon.scenario;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.amazon.locators.xpath_Login;
import org.amazon.locators.xpath_amazonsearch;

public class Amazonscenario {


	xpath_Login login = new xpath_Login();
	xpath_amazonsearch search = new xpath_amazonsearch();

	public void UserLoginaction() throws FileNotFoundException, IOException, InterruptedException {
		try{
			login.signinaction();
			login.userlogin();
			login.signin();}
		catch(Exception e)
		{System.out.println(e);}

	}

	public void searchfunction(){

		try{search.searchText();}
		catch(Exception e)
		{System.out.println(e);}
	}




}
