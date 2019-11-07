package Tybsc;

import static org.junit.Assert.*;

import org.junit.Test;

public class CubeTest {

	@Test
	public void test() {
		Cube obj=new Cube();
		obj.setlength(10);
		obj.setBreadth(5);
		int r=obj.Calarea();
		assertEquals(50, r);
		System.out.println("Value of r is"+ " "+r);
				
	}

}
