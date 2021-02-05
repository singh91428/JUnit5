package nit.Proj5_MethodOrderTesting;

import org.junit.jupiter.api.MethodOrderer.Alphanumeric;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
@TestMethodOrder(Alphanumeric.class)
public class MethodOrder_MethodName {
	@Test
	public void testG() {
		System.out.println("MethodOrder_MethodName.testG()");
	}
	@Test
	public void testB() {
		System.out.println("MethodOrder_MethodName.testB()");
	}
	@Test
	public void testC() {
		System.out.println("MethodOrder_MethodName.testC()");
	}
	@Test
	public void testA() {
		System.out.println("MethodOrder_MethodName.testA()");
	}
}
