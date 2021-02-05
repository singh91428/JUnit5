package com.nt.service;

public class BankLoanServiceWithThrows {
	public float calcSIAmount(float pa,float r,float t) {
		System.out.println("BankLoanServiceWithThrows.calcSIAmount()");
		if(pa<=0||r<=0||t<=0)
			throw new IllegalArgumentException("Invalid Input");
		return pa*r*t/100.0f;
	}
}
