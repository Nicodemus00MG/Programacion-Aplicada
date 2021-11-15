package Ejercicio2;

public class TestFiguras {

	public static void main(String args[]) {

		// Instancias
		Figuras figuras[] = new Figuras[1];
		Rectangulo rectangulo[] = new Rectangulo[figuras.length];
		Cuadrado cuadrado[] = new Cuadrado[figuras.length];
		Elipse elipse[] = new Elipse[figuras.length];
		CirculoElip circulo[] = new CirculoElip[figuras.length];
		String color = "verde";
		int cx = 0, cy = 0;
		String nombre = "";

		for (int i = 0; i < figuras.length; i++) {

			figuras[i] = new Figuras(nombre, color, cx, cy);

			rectangulo[i] = new Rectangulo("rectangulo", color, cx, cy, 3, 4);
			rectangulo[i].imprimir();
			cuadrado[i] = new Cuadrado("cuadrado", color, cx, cy, 2, 5);
			cuadrado[i].imprimir();
			elipse[i] = new Elipse("elipse", color, cx, cy, 3.9, 1.9);
			elipse[i].imprimir();
			circulo[i] = new CirculoElip("elipse", color, cx, cy, 4.5);
			circulo[i].imprimir();
		}

	}

}
