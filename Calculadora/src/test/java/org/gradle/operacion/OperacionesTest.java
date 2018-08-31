package org.gradle.operacion;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class OperacionesTest {

	Operacion operacion;

	
	@Before
	public void sepUp() {
		operacion = new Operacion();

	}

	@Test
	public void tresMasDosigualCinco() {

		// arrange
		int a = 3;
		int b = 2;

		// act
		int resultado = operacion.sumar(a, b);

		// assert
		assertEquals(5, resultado);
	}

	@Test
	public void nueveMasSieteigualDiezSeis() {

		// arrange
		int a = 9;
		int b = 7;

		// act
		int resultado = operacion.sumar(a, b);

		// assert
		assertEquals(16, resultado);
	}

	@Test
	public void sieteMenosSieteigualCero() {

		// arrange
		int a = 7;
		int b = 7;

		// act
		int resultado = operacion.restar(a, b);

		// assert
		assertEquals(0, resultado);
	}

	@Test
	public void tresMenosUnogualDos() {

		// arrange
		int a = 3;
		int b = 1;

		// act
		int resultado = operacion.restar(a, b);

		// assert
		assertEquals(2, resultado);
	}

	@Test
	public void tresPorUnogualTres() {

		// arrange
		int a = 3;
		int b = 1;

		// act
		int resultado = operacion.multiplicar(a, b);

		// assert
		assertEquals(3, resultado);
	}

	@Test
	public void tresPorCuatrIgualDoce() {

		// arrange
		int a = 3;
		int b = 4;

		// act
		int resultado = operacion.multiplicar(a, b);

		// assert
		assertEquals(12, resultado);
	}

	@Test
	public void tresExponenteTresIgualVeinteYSiete() {

		// arrange
		int a = 3;
		int b = 3;

		// act
		int resultado = operacion.exponente(a, b);

		// assert
		assertEquals(27, resultado);
	}

	@Test
	public void tresFactorialSeis() {

		// arrange
		int a = 3;

		// act
		int resultado = operacion.factorial(a);

		// assert
		assertEquals(6, resultado);
	}

	@Test
	public void cuatriFactorialDoce() {

		// arrange
		int a = 4;

		// act
		int resultado = operacion.factorial(a);

		// assert
		assertEquals(24, resultado);
	}
	
	
	
	

}
