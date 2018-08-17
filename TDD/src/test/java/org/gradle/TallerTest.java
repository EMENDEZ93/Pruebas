package org.gradle;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

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

	
	@Test
	public void rojoYnaranjaIgualPascua() {
	
		//arrange
		String cadena1 = "Rojo";
		String cadena2 = "Naranja";
		
		// act
		String resultado = taller.returnPascua(cadena1, cadena2);

		// assert
		assertEquals("Pascua", resultado);		
		
	}
	
	
	@Test
	public void ochoYDiezOcho() {
		
		//arrange
		int valor1 = 8;
		int valor2 = 18;
		
		//act
		boolean resultado = taller.moduloDosNumerosEnY(valor1, valor2);
		
		//assert
		assertEquals(true, resultado);
		
	}

	
	@Test
	public void treYCientoTrece() {
		
		//arrange
		int valor1 = 3;
		int valor2 = 113;
		
		//act
		boolean resultado = taller.moduloDosNumerosEnY(valor1, valor2);
		
		//assert
		assertEquals(true, resultado);
		
	}	

	
	@Test
	public void seisYCientoDiezSiete() {
		
		//arrange
		int valor1 = 6;
		int valor2 = 117;
		
		//act
		boolean resultado = taller.moduloDosNumerosEnY(valor1, valor2);
		
		//assert
		assertEquals(false, resultado);
		
	}	
	
	
	@Test
	public void mayorTreinta() {
		
		//arrange
		int valor1 = 8;
		int valor2 = 18;
		int valor3 = 30;
		
		//act
		int resultado = taller.mayorDeLosValores(valor1, valor2, valor3);
		
		//assert
		assertEquals(30, resultado);		
		
	}

	
	@Test
	public void mayorVentiNueve() {
		
		//arrange
		int valor1 = 29;
		int valor2 = 5;
		int valor3 = 15;
		
		//act
		int resultado = taller.mayorDeLosValores(valor1, valor2, valor3);
		
		//assert
		assertEquals(29, resultado);		
		
	}	

	@Test
	public void mayorCincuenta() {
		
		//arrange
		int valor1 = 10;
		int valor2 = 50;
		int valor3 = 1;
		
		//act
		int resultado = taller.mayorDeLosValores(valor1, valor2, valor3);
		
		//assert
		assertEquals(50, resultado);		
		
	}	

	
	@Test
	public void sieteySieteAprueba() {
		
		//arrange
		int bimestre1 = 7;
		int bimestre2 = 7;
		
		//act
		String resultado = taller.elEstudianteAprobo(bimestre1, bimestre2);
		
		//assert
		assertEquals("Aprueba", resultado);		
		
	}	

	@Test
	public void cuatroySeisSupletorio() {
		
		//arrange
		int bimestre1 = 4;
		int bimestre2 = 6;
		
		//act
		String resultado = taller.elEstudianteAprobo(bimestre1, bimestre2);
		
		//assert
		assertEquals("Supletorio", resultado);		
		
	}	

	@Test
	public void cincoyCuatroSupletorio() {
		
		//arrange
		int bimestre1 = 5;
		int bimestre2 = 4;
		
		//act
		String resultado = taller.elEstudianteAprobo(bimestre1, bimestre2);
		
		//assert
		assertEquals("Reprueba", resultado);		
		
	}	
	
	
	@Test
	public void dosSumatorioDosigualCuatro() {
		
		//arrange
		int valor1 = 2;
		int valor2 = 2;
		
		//act
		int resultado = taller.sumatoria(valor1, valor2);
		
		//assert
		assertEquals(4, resultado);		
		
	}	

	@Test
	public void treSumatorioCuatroigualDoce() {
		
		//arrange
		int valor1 = 3;
		int valor2 = 4;
		
		//act
		int resultado = taller.sumatoria(valor1, valor2);
		
		//assert
		assertEquals(12, resultado);		
		
	}	
	
	@Test
	public void cincoSumatorioCincoigualVentiCinco() {
		
		//arrange
		int valor1 = 5;
		int valor2 = 5;
		
		//act
		int resultado = taller.sumatoria(valor1, valor2);
		
		//assert
		assertEquals(25, resultado);		
		
	}
	
	@Test
	public void dosExponenteDosigualCuatro() {
		
		//arrange
		int base = 2;
		int exponente_ = 2 ;
		
		//act
		int resultado = taller.exponente(base, exponente_);
		
		//assert
		assertEquals(4, resultado);		
		
	}

	
	@Test
	public void tresExponenteDosigualNueve() {
		
		//arrange
		int base = 3;
		int exponente_ = 2 ;
		
		//act
		int resultado = taller.exponente(base, exponente_);
		
		//assert
		assertEquals(9, resultado);		
		
	}	

	
	@Test
	public void seisExponenteDosigualTreintaYSeis() {
		
		//arrange
		int base = 6;
		int exponente_ = 2 ;
		
		//act
		int resultado = taller.exponente(base, exponente_);
		
		//assert
		assertEquals(36, resultado);		
		
	}		
	
	
	@Test
	public void array5381mayor8() {
		
		//arrange
		int[] base = {5,3,8,1};
		
		//act
		int resultado = taller.mayorEnArray(base);
		
		//assert
		assertEquals(8, resultado);		
		
	}	

	
	@Test
	public void array2321mayor3() {
		
		//arrange
		int[] base = {2,3,2,1};
		
		//act
		int resultado = taller.mayorEnArray(base);
		
		//assert
		assertEquals(3, resultado);		
		
	}

	
	@Test
	public void array15_4_14_menosCincomayor15() {
		
		//arrange
		int[] base = {15,4,14,-5};
		
		//act
		int resultado = taller.mayorEnArray(base);
		
		//assert
		assertEquals(15, resultado);		
		
	}

	
	
	@Test
	public void arrayA6_3_ArrayB9_1_SumaMayorArrayB() {
		
		//arrange
		int[] arrayA = {6,3};
		int[] arrayB = {9,1};
		
		//act
		int[] resultado = taller.ArrayMayor(arrayA, arrayB);
		
		//assert
		Assert.assertArrayEquals(arrayB, resultado);
		
	}	
	

	@Test
	public void arrayA2_3ArrayB2_6SumaMayorArrayB() {
		
		//arrange
		int[] arrayA = {2,3};
		int[] arrayB = {2,6};
		
		//act
		int[] resultado = taller.ArrayMayor(arrayA, arrayB);
		
		//assert
		Assert.assertArrayEquals(arrayB, resultado);
		
	}		

	@Test
	public void arrayA6_4ArrayB1_6SumaMayorArrayA() {
		
		//arrange
		int[] arrayA = {6,4};
		int[] arrayB = {1,6};
		
		//act
		int[] resultado = taller.ArrayMayor(arrayA, arrayB);
		
		//assert
		Assert.assertArrayEquals(arrayA, resultado);
		
	}			
	
}





















