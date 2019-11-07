package Tybsc;

import static org.junit.Assert.*;

import org.junit.Test;

public class ConcatenanteTest {

	@Test
	public void test() {
		Concatenante obj=new Concatenante();
		String r=obj.Concat("Modaser", "Sadat");
		assertEquals("ModaserSadat",r);
		
		
	}

}
