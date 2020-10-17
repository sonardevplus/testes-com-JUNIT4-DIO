package com.testes;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;

public class CalculadoraTest {

	@Test
	public void test() {
		Calculadora cal = new Calculadora();
		String expressao = "1+1+2" ;
		int soma = cal.somar(expressao);
		assertEquals(4,soma);
	}
	
	@Test
	public void testarSomarComMock() {
		Calculadora calc = mock(Calculadora.class);
		when(calc.somar("1+2")).thenReturn(10);
		
		int resultado = calc.somar("1+2");
		
		assertEquals(10, resultado );
	}

}
