package opreation;

import static org.junit.Assert.*;

import org.junit.Test;

public class concatinationTest {

	@Test
	public void test() {
		concatination o=new concatination();
		String r=o.concat("Moha","mmad");
		assertEquals("Mohammad",r);
		


	}

}
