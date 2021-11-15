package Ejercicio2;

public class Cuadrado extends Rectangulo {

	private double ladoA, ladoB;

	public Cuadrado(String nombre, String color, int cx, int cy, double ladoA, double ladoB) {
		super(nombre, color, cx, cy);
		this.ladoA = ladoA;
		this.ladoB = ladoB;

	}

	public double getLadoA() {
		return this.ladoA;
	}

	public double getLadoB() {
		return this.ladoB;
	}

	// Metodos
	public void calcularArea() {
		System.out.print("Area: " + (this.ladoA * this.ladoB) + "\n");
	}

	public void calcularPerimetro() {
		System.out.print("Perimetro: " + (2 * this.ladoA + 2 * this.ladoB) + "\n");
	}

	public void cambiarTamanio(int escalar) {
		System.out.print("Escalar para cambiar tamanio: " + escalar + "\n");
		this.ladoA *= escalar;
		this.ladoB *= escalar;
	}

	public void imprimir() {
		System.out.print("\n**************************\n");
		System.out.print("Nombre de la figura: " + getNombreFigura() + "\n" + "Color de la figura: " + getColor() + "\n"
				+ "Cordenada centro: " + "(" + getCx() + "," + getCy() + ")" + "\n");
		System.out.print("Lado Mayor: " + getLadoA() + "\n");
		System.out.print("Lado Menor: " + getLadoB() + "\n");
		calcularArea();
		calcularPerimetro();
		cambiarTamanio(2);
		calcularArea();
		calcularPerimetro();
		System.out.println("\n***************************\n");

	}

}
