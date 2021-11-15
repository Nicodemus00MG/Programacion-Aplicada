package Ejercicio1;

public class EjecutableFiguras {
	public static void main(String args[]) {

		Circulo c1 = new Circulo(3.1, "verde");
		Cilindro cin1 = new Cilindro();
		System.out.println(c1.toString());
		System.out.println(c1.calcularAreaCirculo());
		System.out.println("\n");
		System.out.println(cin1.toString());
		System.out.println(cin1.volumenCilindro());

	}
}
