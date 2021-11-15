package Ejercicio1;

import java.math.*;

public class Circulo {

	// Atributos
	private String color;
	private double radio;

//sobrecarga de constructores
	// Constructores
	public Circulo() {
		this.color = "azul";
		this.radio = 1.0;

	}

	public Circulo(double radio) {
		this.radio = radio;
	}

	public Circulo(double radio, String color) {
		this.color = color;
		this.radio = radio;
	}

	// Metodos

	public double calcularAreaCirculo() {

		return Math.PI * Math.pow(this.radio, 2);

	}

	public String toString() {
		return "Radio: " + this.radio + "\n" + "Color: " + this.color;

	}

	public double getRadio() {
		return this.radio;
	}

	public String getColor() {
		return this.color;
	}

}
