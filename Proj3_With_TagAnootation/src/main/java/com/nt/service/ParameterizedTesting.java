package com.nt.service;

public class ParameterizedTesting {
	public String wish(String user) {
		return "Hello "+user;
	}
	public boolean isEven(int no) {
		if(no%2==0)
			return true;
		else
			return false;
	}
}
