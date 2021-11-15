package Ejercicio1;

import java.math.*;

public class Cilindro extends Circulo {

	private double altura;

	// Constructores
	// sobrecarga de constructores
	public Cilindro() {
		this.altura = 1.0;
	}

	public Cilindro(double radio) {
		super(radio);
		this.altura = 1.0;
	}

	public Cilindro(double radio, String color) {
		super(radio, color);
		this.altura = 1.0;
	}

	public Cilindro(double radio, String color, double altura) {
		super(radio, color);
		this.altura = altura;
	}

	// Metodo

	public double volumenCilindro() {
		return calcularAreaCirculo() * this.altura;
	}

	// sobreescritura de metodos
	public String toString() {
		return "Radio: " + this.getRadio() + "\n" + 
				"Color: " + this.getColor() + "\n" + 
				"Altura: " + this.altura;
	}

}
