package opreation;

import static org.junit.Assert.*;

import org.junit.Test;

public class additionTest {

	@Test
	public void test() {
	 addition o=new addition();
	 int r = o.sum(20,40);
	 assertEquals(60,r);
	 
	 
	}

}
