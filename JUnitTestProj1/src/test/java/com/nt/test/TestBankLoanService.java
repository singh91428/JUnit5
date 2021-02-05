package com.nt.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.nt.service.BankLoanService;

public class TestBankLoanService{
	@Test
	public void testCalcSIAmountWithSmallNo() {
		BankLoanService obj=new BankLoanService();
		float actual=obj.calcSIAmount(100000,2,12);
		float expected=24000.0f;
		assertEquals(expected, actual,"mar result not same");
	}
}