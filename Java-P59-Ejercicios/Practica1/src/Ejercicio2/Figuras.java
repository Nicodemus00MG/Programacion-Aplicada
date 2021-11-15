package Ejercicio2;

public class Figuras {

	// Atributos
	private int cx, cy;
	
	private String nombreFigura, color;

	public String getNombreFigura() {
		return nombreFigura;
	}

	public String getColor() {
		return color;
	}

	public int getCx() {
		return cx;
	}

	public int getCy() {
		return cy;
	}

	

	// Metodos

	public Figuras(String nombre, String color, int cx, int cy) {
		this.nombreFigura = nombre;
		this.color = color;
		this.cx = cx;
		this.cy = cy;
	}

	public void imprimir() {
		System.out.print("\n**************************\n");
		System.out.print("Nombre de la figura: " + this.nombreFigura + "\n" + "Color de la figura: " + this.color + "\n"
				+ "Cordenada centro: " + "(" + this.cx + "," + this.cy + ")");
		System.out.println("\n***************************\n");

	}

}
