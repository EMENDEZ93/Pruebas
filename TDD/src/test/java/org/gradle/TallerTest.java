package org.gradle;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TallerTest {

	@Test
	public void ingresoCincoYTresReciboOcho() {
	
		//arrange
		int numero1 = 5;
		int numero2 = 3;
		

		//act
		Taller taller = new Taller();
		int resultado = taller.sumar(numero1, numero2);
		
		
		//assert
		assertEquals(8, resultado);
	}
	
}
