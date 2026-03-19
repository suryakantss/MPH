package com.mphasis.secondwebapp.service;

public class LoginService {

	public boolean check(String login, String password) {
		if (login.equals("Tom") & password.equals("123"))
			return true;
		else
			return false;
	}

}
