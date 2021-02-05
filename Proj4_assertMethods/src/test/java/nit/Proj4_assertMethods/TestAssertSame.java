package nit.Proj4_assertMethods;

import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

import com.nt.service.AssertSameTesting;

public class TestAssertSame {
	@Test
	public void testInstance() {
		AssertSameTesting o1=AssertSameTesting.getInstance();
		AssertSameTesting o2=AssertSameTesting.getInstance();
		/*
		 * if(o1==o2) fail("p1,p2 value must be different");
		 */
		assertSame(o1,o2);
	}
}
