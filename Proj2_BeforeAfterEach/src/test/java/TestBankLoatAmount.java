import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.nt.service.BankLoanAmount;

public class TestBankLoatAmount {
	private BankLoanAmount o;
	@BeforeAll
	public  static void afterAllTest() {
		System.out.println("BeforeAll");
	}
	@BeforeEach
	public void setUP() {
		System.out.println("Object created");
		o=new BankLoanAmount();
	}
	@Test
	public void testcalcSIA() {
		float actual=o.calcSIA(100000, 2, 12);
		float expected=24000.0f;
		assertEquals(expected,actual);
		System.out.println("Test1");
	}
	@Test
	public void testing() {
		System.out.println("test2");
	}
	@AfterEach
	public void setEnd() {
		System.out.println("object unrefrenced");
		o=null;
	}
	@AfterAll
	public static void afterAllTesting() {
		System.out.println("afterall");
	}
}
