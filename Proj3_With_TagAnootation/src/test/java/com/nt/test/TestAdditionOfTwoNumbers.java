package com.nt.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import com.nt.service.AdditionOfTwoNumbers;

public class TestAdditionOfTwoNumbers {
	private static AdditionOfTwoNumbers obj;
	@BeforeAll
	public static void createObj() {
		obj=new AdditionOfTwoNumbers();
	}
	@Test
	@DisplayName("addition of two positive numbers")
	@Tag("dev")
	public void testPositive() {
		int actual=obj.addTwoNumbers(5, 7);
		int expected=12;
		assertEquals(expected,actual,"no may not positive");
	}
	@Test
	@DisplayName("addition of two negative numbers")
	@Tag("uat")
	public void testNegative() {
		assertThrows(IllegalArgumentException.class,()->{
			obj.addTwoNumbers(-7, 5);
		});
	}
}
