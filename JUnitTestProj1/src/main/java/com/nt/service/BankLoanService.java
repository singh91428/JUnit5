package com.nt.service;

public class BankLoanService {
	public float calcSIAmount(float pAmt,float time,float rate) {
		System.out.println("BankLoanService.calcSIAmount()");
		float si=pAmt*rate*time/100.0f;
		return si;
	}
	
}
