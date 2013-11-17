package homeWork6.D;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;

public class FirstTest {
	public TestSet tS = new  TestSet();

	@Test
	public void testE() {
		String expected = "MAMUN";
		String actual = tS.testE("MAMUN", "MAMUN");
		Assert.assertEquals( expected,actual);
	}
	
	@Test
	public void testS() {
		int expected = 20;
		int actual = tS.testSum(10, 10);
		Assert.assertEquals("Total 20", expected, actual);
	}	

}
