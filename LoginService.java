package com.in28minutes.login;

public class LoginService {

	public boolean isUserValid(String user, String password) {
		if (user.equals("shivani") && password.equals("pgdcsa"))
			return true;
		
		
		return false;
	}

}