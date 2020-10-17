package com.testes;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.List;

import org.hamcrest.core.Is;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ExceptionTest {

	//Teste retorna verdadeiro
	@Test(expected = IndexOutOfBoundsException.class)
	public void empty() {
		new ArrayList<Object>().get(0);
	}

	//Lista populada , o teste gera erro
	@Test(expected = IndexOutOfBoundsException.class)
	public void isNotEmpty() {
		List<String> lista = new ArrayList<String>();
		lista.add("Tomas");
		lista.get(0);
	}

	@Rule
	public ExpectedException excecaoLancada = ExpectedException.none();

	@Test
	public void shouldTestExceptionMessage() throws IndexOutOfBoundsException {

		List<Object> list = new ArrayList<Object>();
		excecaoLancada.expect(IndexOutOfBoundsException.class);
		excecaoLancada.expectMessage("Index 0 out of bounds for length 0");
		list.get(0);
	}

	@Test
	public void testExceptionMessage() {
		try {
			new ArrayList<Object>().get(0);
			fail("Esperado que a IndexOutOfBoundsException seja lançada");

		} catch (IndexOutOfBoundsException e) {
			//Retorna verdadeiro , pois a mensagem do is é igual a lançada pela excessão
			assertThat(e.getMessage(), is("Index 0 out of bounds for length 0"));
		}

	}

}
