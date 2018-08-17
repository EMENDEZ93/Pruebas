package org.gradle;

import java.util.Arrays;

public class Taller {

	public int sumar(int numero1, int numero2) {
		return numero1 + numero2;
	}

	public int sumarUno(int numero1) {
		return ++numero1;
	}

	public int restar(int numero1, int numero2) {
		return numero1 - numero2;
	}

	public int multiplicar(int numero1, int numero2) {
		return numero1 * numero2;
	}

	public int dividir(int numero1, int numero2) {
		return numero1 / numero2;
	}

	public String getTexto(String texto) {
		return texto;
	}

	public int getNumeroCaracteres(String texto) {
		return texto.length();
	}

	public boolean getNumeroPorBoolean(int numero) {
		return (numero == 5) ? true : false;
	}

	public boolean esNumeroEsPositivo(int numero) {
		return (numero >= 0) ? true : false;
	}

	public boolean elNumeroEsPar(int numero) {
		return (numero % 2 == 0) ? true : false;
	}

	public int siemprePositivo(int numero) {
		return Math.abs(numero);
	}

	public String returnPascua(String cadena1, String cadena2) {
		String result = "";
		if (cadena1 == "Rojo" && cadena2 == "Naranja") {
			result = "Pascua";
		} else if (cadena1 == "Verde" && cadena2 == "Naranja") {
			result = "Halloween";
		} else if (cadena1 == "Rojo" && cadena2 == "Verde") {
			result = "Navidad";
		}

		return result;
	}

	public boolean moduloDosNumerosEnY(int valor1, int valor2) {
		return (valor2 % 10 ==  valor1 )?true:false;
		
	}

	public int mayorDeLosValores(int valor1, int valor2, int valor3) {
		return Math.max( valor3, Math.max(valor1, valor2));
	}

	public String elEstudianteAprobo(int bimestre1, int bimestre2) {
		String resultado = "";
		
		/*if(bimestre1 + bimestre2 >= 14) {
			resultado = "Aprueba";
		} else if (bimestre1 + bimestre2 <= 13 && bimestre1 + bimestre2 >= 10 ) {
			resultado = "Supletorio";
		} else if (bimestre1 + bimestre2 < 10 ) {
			resultado = "Reprueba";
		}*/
		
		//return resultado; 
		return (bimestre1 + bimestre2 >= 14)?"Aprueba"
				:(bimestre1 + bimestre2 <= 13 && bimestre1 + bimestre2 >= 10 )?"Supletorio"
						:(bimestre1 + bimestre2 < 10 )?"Reprueba":"";
	}

	public int sumatoria(int valor1, int valor2) {
	
		int pivot = 0;
		for (int i = 0; i < valor2; i++) {
			pivot += valor1;
		}
		
		return pivot;
	}

	public int exponente(int base, int exponente_) {
		int resultado = 0;
		
		for(int i = 0; i < exponente_; i++) {
			resultado = sumatoria(base, base);
		}
		
		return resultado;
	}

	public int mayorEnArray(int[] base) {
		return Arrays.stream(base).max().getAsInt();
	}

	public int[] ArrayMayor(int[] arrayA, int[] arrayB) {
		return (Arrays.stream(arrayA).sum() > Arrays.stream(arrayB).sum())?arrayA:arrayB ;
	}

	
}
