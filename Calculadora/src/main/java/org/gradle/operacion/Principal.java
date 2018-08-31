package org.gradle.operacion;

import org.gradle.Calculadora;

public class Principal {

	Operacion operacion2 = new Operacion();

	public int operacion(String operacion, int[] valores) {

		if (operacion.equals("Suma")) {
			return operacion2.sumar(valores[0], valores[1]);
		} else if (operacion.equals("Restar")) {
			return operacion2.restar(valores[0], valores[1]);
		} else if (operacion.equals("Multiplicar")) {
			return operacion2.multiplicar(valores[0], valores[1]);
		} else if (operacion.equals("Potencia")) {
			return operacion2.exponente(valores[0], valores[1]);
		}

		return 0;
	}

}
