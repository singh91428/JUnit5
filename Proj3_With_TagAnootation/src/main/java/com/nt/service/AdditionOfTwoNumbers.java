package com.nt.service;

public class AdditionOfTwoNumbers {
	public int addTwoNumbers(int a,int b) {
		if(a<=0 || b<=0)
			throw new IllegalArgumentException("please pass positive value");
		return a+b;
	}
}
