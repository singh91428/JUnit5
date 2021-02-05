package com.nt.service;

public class BankLoanAmount {
	public float calcSIA(float p,float r,float t) {
		System.out.println("BankLoanAmount.calcSIA()");
		return p*r*t/100.0f;
	}
}
