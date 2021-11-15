package Ejercicio2;

import java.math.*;

public class CirculoElip extends Elipse {
	private double radio;

	public CirculoElip(String nombre, String color, int cx, int cy, double radio) {
		super(nombre, color, cx, cy, radio, radio);
		this.radio = radio;

	}

	// Metodos
	public void areaCirculo() {
		System.out.print("Area: " + (Math.PI * Math.pow(this.radio, 2)) + "\n");
	}

	public double getRadio() {
		return this.radio;
	}

	public void imprimir() {
		System.out.print("\n**************************\n");
		System.out.print("Nombre de la figura: " + getNombreFigura() + "\n" + "Color de la figura: " + getColor() + "\n"
				+ "Cordenada centro: " + "(" + getCx() + "," + getCy() + ")" + "\n");
		System.out.print("Radio del Circulor: " + getRadio() + "\n");

		areaCirculo();

		System.out.println("\n***************************\n");

	}
}
