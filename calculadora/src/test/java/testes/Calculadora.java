package testes;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import metodos.Metodos;

public class Calculadora {
	Metodos metodos = new Metodos();
	
	@Test
	public void testSoma() {
		int resultado = metodos.somar(1, 2);
		assertEquals(resultado, 3);
	}
	@Test
	public void testSubtracao() {
		int resultado = metodos.subtrair(5, 4);
		assertEquals(resultado, 1);
	}
	@Test
	public void testDivisao() {
		int resultado = metodos.dividir(9, 3);
		assertEquals(resultado, 3);
	}
	@Test
	public void testMultiplicacao() {
		int resultado = metodos.multiplicar(4, 4);
		assertEquals(resultado, 16);
	}

}
