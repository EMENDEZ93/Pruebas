package org.gradle;

public class Taller {

	public int sumar(int numero1, int numero2) {
		return numero1 + numero2;
	}

	public int sumarUno(int numero1) {
		return  ++numero1;
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
		return (numero%2 == 0) ? true : false;
	}

	public int siemprePositivo(int numero) {
		return  Math.abs(numero);
	}


}
