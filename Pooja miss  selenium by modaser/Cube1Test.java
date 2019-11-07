package Tybsc;

import static org.junit.Assert.*;

import org.junit.Test;

public class Cube1Test {

	@Test   
	public void test() {
		Cube1 obj=new Cube1();
		obj.setedge(4);
		int v=obj.CubeVolume();
		int a=obj.CubeArea();
		assertEquals(64, v);
		assertEquals(96, a);
		System.out.println("Value of Area is "+a+" and Volume is "+v);
	}

}
