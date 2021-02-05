package com.nt.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import com.nt.service.ParameterizedTesting;

public class TestParameterizedTesting {
	@ParameterizedTest(name="{index}--value {0}")
	@ValueSource(ints= {6,8,7,9,10})
	public void testisEven(int n) {
		assertTrue(new ParameterizedTesting().isEven(n));
	}
	@ParameterizedTest
	@ValueSource(strings= {"raja","rani"})
	public void testWish(String user) {
		assertEquals("Hello "+user,new ParameterizedTesting().wish(user));
	}
}
