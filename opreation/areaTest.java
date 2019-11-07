package opreation;

import static org.junit.Assert.*;

import org.junit.Test;

public class areaTest {

	@Test
	public void test() {
		 area r1=new area();
				 r1.setlenght(3);
				 r1.setbeardth(10);
				 int ans=r1.calarea();
				 assertEquals(30, ans);
	}

}
