package Ejercicio2;

import java.math.*;

public class Elipse extends Figuras {
	// Atributos
	private double radioMenor, radioMayor;

	
	public Elipse(String nombre, String color, int cx, int cy) {
		super(nombre, color, cx, cy);
		
		// TODO Auto-generated constructor stub
	}
	
	public Elipse(String nombre, String color, int cx, int cy, double radioMenor, double radioMayor) {
		super(nombre, color, cx, cy);
		this.radioMayor = radioMayor;
		this.radioMenor = radioMenor;
		// TODO Auto-generated constructor stub
	}

	// Metodos
	public void areaElipse() {
		System.out.print("Area: " + (Math.PI * this.radioMenor * this.radioMayor));
	}

	public double getRadioMayor() {
		return this.radioMayor;
	}

	public double getRadioMenor() {
		return this.radioMenor;
	}

	public void imprimir() {
		System.out.print("\n**************************\n");
		System.out.print("Nombre de la figura: " + getNombreFigura() + "\n" + "Color de la figura: " + getColor() + "\n"
				+ "Cordenada centro: " + "(" + getCx() + "," + getCy() + ")" + "\n");
		System.out.print("Radio Mayor: " + getRadioMayor() + "\n");
		System.out.print("Radio Menor: " + getRadioMenor() + "\n");
		areaElipse();

		System.out.println("\n***************************\n");

	}

}
