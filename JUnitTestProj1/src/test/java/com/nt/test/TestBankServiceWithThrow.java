package com.nt.test;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import com.nt.service.BankLoanServiceWithThrows;

public class TestBankServiceWithThrow {
	@Test
	public void testcalcSIA() {
	BankLoanServiceWithThrows o=new BankLoanServiceWithThrows();
	assertThrows(ArithmeticException.class, ()->{
		o.calcSIAmount(0, 0, 0);
		});
	}
}
