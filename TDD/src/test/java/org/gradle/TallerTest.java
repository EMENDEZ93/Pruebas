package org.gradle;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class TallerTest {

	Taller taller;

	@Before
	public void setUp() {
		taller = new Taller();
	}

	@Test
	public void ingresoCincoYTresReciboOcho() {

		// arrange
		int numero1 = 5;
		int numero2 = 3;

		// act
		int resultado = taller.sumar(numero1, numero2);

		// assert
		assertEquals(8, resultado);
	}

	@Test
	public void ingresoCincoReciboSeis() {

		// arrange
		int numero1 = 5;

		// act
		int resultado = taller.sumarUno(numero1);

		// assert
		assertEquals(6, resultado);

	}

	@Test
	public void ingresoCuatroYReciboCinco() {

		// arrange
		int numero1 = 4;

		// act
		int resultado = taller.sumarUno(numero1);

		// assert
		assertEquals(5, resultado);

	}

	@Test
	public void ingresoCincoYTresReciboDos() {

		// arrange
		int numero1 = 5;
		int numero2 = 3;

		// act
		int resultado = taller.restar(numero1, numero2);

		// assert
		assertEquals(2, resultado);
	}

	@Test
	public void ingresoOchoYCuatroReciboCuatro() {

		// arrange
		int numero1 = 8;
		int numero2 = 4;

		// act
		int resultado = taller.restar(numero1, numero2);

		// assert
		assertEquals(4, resultado);
	}

	@Test
	public void ingresoCuatroYDosReciboDos() {

		// arrange
		int numero1 = 4;
		int numero2 = 2;

		// act
		int resultado = taller.restar(numero1, numero2);

		// assert
		assertEquals(2, resultado);
	}

	@Test
	public void ingresoDosYCincoReciboDiez() {

		// arrange
		int numero1 = 2;
		int numero2 = 5;

		// act
		Taller taller = new Taller();
		int resultado = taller.multiplicar(numero1, numero2);

		// assert
		assertEquals(10, resultado);
	}

	@Test
	public void ingresoSieteYTresReciboVentiUno() {

		// arrange
		int numero1 = 7;
		int numero2 = 3;

		// act
		int resultado = taller.multiplicar(numero1, numero2);

		// assert
		assertEquals(21, resultado);
	}

	@Test
	public void ingresoDosYDosReciboCuatro() {

		// arrange
		int numero1 = 2;
		int numero2 = 2;

		// act
		int resultado = taller.multiplicar(numero1, numero2);

		// assert
		assertEquals(4, resultado);
	}

	@Test
	public void ingresoSeisYDosReciboTres() {

		// arrange
		int numero1 = 6;
		int numero2 = 2;

		// act
		int resultado = taller.dividir(numero1, numero2);

		// assert
		assertEquals(3, resultado);
	}

	@Test
	public void ingresoDiezYCincoReciboDos() {

		// arrange
		int numero1 = 10;
		int numero2 = 5;

		// act
		int resultado = taller.dividir(numero1, numero2);

		// assert
		assertEquals(2, resultado);
	}

	@Test
	public void ingresoDosYDosReciboUno() {

		// arrange
		int numero1 = 2;
		int numero2 = 2;

		// act
		int resultado = taller.dividir(numero1, numero2);

		// assert
		assertEquals(1, resultado);
	}

	@Test
	public void ingresoHolaYReciboHola() {

		// arrange
		String texto = "Hola";

		// act
		String resultado = taller.getTexto(texto);

		// assert
		assertEquals("Hola", resultado);
	}

	@Test
	public void ingresoBancolombiaYReciboBancolombia() {

		// arrange
		String texto = "Bancolombia";

		// act
		String resultado = taller.getTexto(texto);

		// assert
		assertEquals("Bancolombia", resultado);
	}

	@Test
	public void ingresofUnCiOnAlYRecibofUnCiOnAl() {

		// arrange
		String texto = "fUnCiOnAl";

		// act
		String resultado = taller.getTexto(texto);

		// assert
		assertEquals("fUnCiOnAl", resultado);
	}

	@Test
	public void ingresoHolaYReciboCuatro() {

		// arrange
		String texto = "Hola";

		// act
		int resultado = taller.getNumeroCaracteres(texto);

		// assert
		assertEquals(4, resultado);
	}

	@Test
	public void ingresoBancolombiaYReciboDiez() {

		// arrange
		String texto = "Bancolombia";

		// act
		int resultado = taller.getNumeroCaracteres(texto);

		// assert
		assertEquals(11, resultado);
	}

	@Test
	public void ingresofUnCiOnAlYReciboNueve() {

		// arrange
		String texto = "fUnCiOnAl";

		// act
		int resultado = taller.getNumeroCaracteres(texto);

		// assert
		assertEquals(9, resultado);
	}

	
	@Test
	public void ingresoCincoYReciboTrue() {

		// arrange
		int numero = 5;

		// act
		boolean resultado = taller.getNumeroPorBoolean(numero);

		// assert
		assertEquals(true, resultado);
	}	

	
	@Test
	public void ingresoCuatroYReciboFalse() {

		// arrange
		int numero = 4;

		// act
		boolean resultado = taller.getNumeroPorBoolean(numero);

		// assert
		assertEquals(false, resultado);
	}
	
	@Test
	public void ingresoTresYReciboFalse() {

		// arrange
		int numero = 3;

		// act
		boolean resultado = taller.getNumeroPorBoolean(numero);

		// assert
		assertEquals(false, resultado);
	}	

	@Test
	public void ingresoDosYReciboFalse() {

		// arrange
		int numero = 2;

		// act
		boolean resultado = taller.getNumeroPorBoolean(numero);

		// assert
		assertEquals(false, resultado);
	}	
	
	
	@Test
	public void ingreso_CincoYReciboTrue() {

		// arrange
		int numero = 5;

		// act
		boolean resultado = taller.esNumeroEsPositivo(numero);

		// assert
		assertEquals(true, resultado);
	}	
	

	@Test
	public void ingresoMenosTresYReciboFalse() {

		// arrange
		int numero = -3;

		// act
		boolean resultado = taller.esNumeroEsPositivo(numero);

		// assert
		assertEquals(false, resultado);
	}	
	
	@Test
	public void ingreso_DosYReciboTrue() {

		// arrange
		int numero = 2;

		// act
		boolean resultado = taller.esNumeroEsPositivo(numero);

		// assert
		assertEquals(true, resultado);
	}

	
	@Test
	public void ingresoMenosCincoYReciboFalse() {

		// arrange
		int numero = -5;

		// act
		boolean resultado = taller.esNumeroEsPositivo(numero);

		// assert
		assertEquals(false, resultado);
		
	}	

	
	@Test
	public void insertDosYReciboTrue() {

		// arrange
		int numero = 2;

		// act
		boolean resultado = taller.elNumeroEsPar(numero);

		// assert
		assertEquals(true, resultado);
		
	}	

	
	@Test
	public void insertTreYReciboFalse() {

		// arrange
		int numero = 3;

		// act
		boolean resultado = taller.elNumeroEsPar(numero);

		// assert
		assertEquals(false, resultado);
		
	}	
	
	@Test
	public void insertCuatroYReciboTrue() {

		// arrange
		int numero = 4;

		// act
		boolean resultado = taller.elNumeroEsPar(numero);

		// assert
		assertEquals(true, resultado);
		
	}
	
	@Test
	public void insertCincoYReciboFalse() {

		// arrange
		int numero = 5;

		// act
		boolean resultado = taller.elNumeroEsPar(numero);

		// assert
		assertEquals(false, resultado);
		
	}

	
	@Test
	public void insertDosReciboDos() {

		// arrange
		int numero = 2;

		// act
		int resultado = taller.siemprePositivo(numero);

		// assert
		assertEquals(2, resultado);		
	}
	
	@Test
	public void insertMenosCuatroReciboCuatro() {

		// arrange
		int numero = -4;

		// act
		int resultado = taller.siemprePositivo(numero);

		// assert
		assertEquals(4, resultado);		
	}

	@Test
	public void insertMenosSeisReciboSeis() {

		// arrange
		int numero = -6;

		// act
		int resultado = taller.siemprePositivo(numero);

		// assert
		assertEquals(6, resultado);		
	}

	
	@Test
	public void insertSieteReciboSiete() {

		// arrange
		int numero = 7;

		// act
		int resultado = taller.siemprePositivo(numero);

		// assert
		assertEquals(7, resultado);		
	}	
	
}
