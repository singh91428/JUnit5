package nit.Proj5_MethodOrderTesting;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class MethodOrderTest {
	@Test
	@Order(3)
	public void testOrder3() {
		System.out.println("MethodOrderTest.testOrder3()");
	}
	@Test
	@Order(1)
	public void testOrder1() {
		System.out.println("MethodOrderTest.testOrder1()");
	}
	@Test
	@Order(2)
	public void testOrder2() {
		System.out.println("MethodOrderTest.testOrder2()");
	}
	
}
