package com.nt.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;

import com.nt.service.RepeatedTesting;

public class TestRepeatedTesting {
	@RepeatedTest(value = 10, name="execution of {displayName}-"
			+ "{currentRepetition}/{totalRepetitions}")
	@DisplayName("test")
	public void testrepeate() {
		assertEquals("test",new RepeatedTesting().repeatdcheck());
	}
	@RepeatedTest(value=10,name="test -{displayName}"
			+ "-{currentRepetition}/{totalRepetitions}")
	@DisplayName("even or odd")
	public void testeven() {
		assertEquals("even",new RepeatedTesting().even(6));
	}
	
}
