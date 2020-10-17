package com.testes;

import static org.junit.Assert.*;

import org.junit.Test;

public class AssertTest {

	@Test
	public void testAssertArrayEquals() {
		byte[] esperado = "teste".getBytes();
		byte[] atual = "teste".getBytes();
		assertArrayEquals(esperado, atual);		
	}
	
	@Test
	public void testAssertStringEquals() {
		assertEquals("text","text");
	}
	
	@Test
	public void testAssertBoolean() {
		assertFalse(false);
	};
	
	@Test
	public void testAssertObjectNotNull() {
		assertNotNull(new Object()) ;	
	}
	
	@Test
	public void testAssertObjectIsNull() {
		assertNull(null);
	}
	
	
	@Test
	public void testAssertIsSame() {
		Integer aNumber = Integer.valueOf(763);
		assertSame(aNumber,aNumber);
	}
	
	

}
