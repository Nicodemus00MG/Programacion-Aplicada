package Ejercicio2;

public class Rectangulo extends Figuras {
	// Atributos
	private double ladoMayor, ladoMenor;

	public Rectangulo(String nombre, String color, int cx, int cy) {
		super(nombre, color, cx, cy);

	}

	public Rectangulo(String nombre, String color, int cx, int cy, double ladoMayor, double ladoMenor) {
		super(nombre, color, cx, cy);
		this.ladoMayor = ladoMayor;
		this.ladoMenor = ladoMenor;

	}

	public double getLadoMayor() {
		return this.ladoMayor;
	}

	public double getLadoMenor() {
		return this.ladoMenor;
	}

	// Metodos
	public void calcularArea() {
		System.out.print("Area: " + (this.ladoMayor * this.ladoMenor) + "\n");
	}

	public void calcularPerimetro() {
		System.out.print("Perimetro: " + (2 * this.ladoMayor + 2 * this.ladoMenor) + "\n");
	}

	public void cambiarTamanio(int escalar) {
		System.out.print("Escalar para cambiar tamanio: " + escalar + "\n");
		this.ladoMayor *= escalar;
		this.ladoMenor *= escalar;
	}

	public void imprimir() {
		System.out.print("\n**************************\n");
		System.out.print("Nombre de la figura: " + getNombreFigura() + "\n" + "Color de la figura: " + getColor() + "\n"
				+ "Cordenada centro: " + "(" + getCx() + "," + getCy() + ")" + "\n");
		System.out.print("Lado Mayor: " + getLadoMayor() + "\n");
		System.out.print("Lado Menor: " + getLadoMenor() + "\n");
		calcularArea();
		calcularPerimetro();
		cambiarTamanio(2);
		calcularArea();
		calcularPerimetro();
		System.out.println("\n***************************\n");

	}

}
