package com.servlet;

public class UservalidationService {

	public boolean isUserValid(String user, String password) {
		System.out.println(user + password);
		if (user.equals("God") && password.equals("dog")) {
			return true;
		}

		return false;

	}
}
