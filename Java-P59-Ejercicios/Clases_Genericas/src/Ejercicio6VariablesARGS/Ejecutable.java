package Ejercicio6VariablesARGS;

import Ejer4ClaseGenerica.Generica;

public class Ejecutable {

	public static void main(String args[]) {

		VariablesArgs vargs = new VariablesArgs();
		System.out.println("Res1: " + vargs.sumarValores(10, 2.9, 40.8));
		System.out.println("Res2: " + vargs.sumarValores(98, 2.9, 40.3));
		System.out.println("Res3: " + vargs.sumarValores(11, 22.9, 27.93));

	}

	// Metodos

}
