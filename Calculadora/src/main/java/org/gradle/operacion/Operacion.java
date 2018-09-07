package org.gradle.operacion;

import java.util.Random;

public class Operacion {

	public int sumar(int a, int b) {
		return a + b;
	}

	public int restar(int a, int b) {
		return a - b;
	}

	public int multiplicar(int a, int b) {
		int pivot = 0;
		for (int i = 0; i < b; i++) {
			pivot += a;
		}
		
		return pivot;
	}

	public int exponente(int a, int b) {
		int resultado = 0;
		
		for(int i = 0; i < b; i++) {
			resultado = multiplicar(a, a);
		}
		
		return resultado;
	}

	
	public int factorial(int a) {
		
		int resultado = 1;
		
		for(int i= 1 ; i <= a; i++) {
			resultado *=i;
		}
		return resultado;

	}	
	
	
	public int generateRandomNumber() {
		Random number = new Random();
		return number.nextInt(10)+1;
	}
	
}
