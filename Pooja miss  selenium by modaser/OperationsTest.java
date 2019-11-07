package Tybsc;

import static org.junit.Assert.*;

import org.junit.Test;

public class OperationsTest {

	@Test
	public void test() {
		Operations obj=new Operations();
		int r= obj.add(20,30);
		assertEquals(50, r);
		String result=obj.Concat("Modaser", "Sadat");
		assertEquals("ModaserSadat", result);
	
		
	}

}
