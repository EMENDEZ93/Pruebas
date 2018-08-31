package org.gradle.operacion;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PrincipalTest {

	Principal principal;
	
	@Before
	public void setUp() {
		principal = new Principal();
	}
	
	@Test
	public void SumaArray2_5Igual_7() {
		
		//arrange
		String operacion = "Suma";
		int[] valores = {2, 5};
		
		//act
		int resultado = principal.operacion(operacion, valores);
		
		//assert
		assertEquals(7, resultado);
		
	}
	
	@Test
	public void restaArray5_3Igual_2() {
		
		//arrange
		String operacion = "Restar";
		int[] valores = {5, 3};
		
		//act
		int resultado = principal.operacion(operacion, valores);
		
		//assert
		assertEquals(2, resultado);
		
	}

	@Test
	public void multiplicarArray4_5Igual_20() {
		
		//arrange
		String operacion = "Multiplicar";
		int[] valores = {4, 5};
		
		//act
		int resultado = principal.operacion(operacion, valores);
		
		//assert
		assertEquals(20, resultado);
		
	}	

	@Test
	public void potencialArray2_3Igual_8() {
		
		//arrange
		String operacion = "Potencia";
		int[] valores = {2, 3};
		
		//act
		int resultado = principal.operacion(operacion, valores);
		
		//assert
		assertEquals(20, resultado);
		
	}	
	
}
