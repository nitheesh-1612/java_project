package com.sget;

import java.util.ResourceBundle;

public class App {
	
	public int 	userLogin(String user_1, String pass_1)
	{
		ResourceBundle rb = ResourceBundle.getBundle("config");
		String user = rb.getString("user");
		String pass = rb.getString("user");
		
		if (user_1.equals(user) && pass_1.equals(pass))
			return 1;
		else
			return 0;
	}
}
