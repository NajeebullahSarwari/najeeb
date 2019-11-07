package opreation;

import static org.junit.Assert.*;

import org.junit.Test;

public class cubeTest {

	@Test
	public void test() {
		 cube o=new cube();
		 o.setlenght(3);
		 
		 
		 int ans=o.area();
		 assertEquals(54, ans);
		 
		 int vans=o.valume();
		 assertEquals(27, vans);
		 
	}

}
