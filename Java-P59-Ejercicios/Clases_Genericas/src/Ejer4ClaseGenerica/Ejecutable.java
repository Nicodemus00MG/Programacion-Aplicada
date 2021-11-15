package Ejer4ClaseGenerica;

public class Ejecutable {

	public static void main(String args[]) {
		Empresa empresa[] = new Empresa[3];
		empresa[0] = new Obrero("Juan Perez", 175123123, "123crde1", 123123123);
		empresa[1] = new Obrero("Samantha Anibal", 134423433, "3fscrde1", 45123);
		empresa[2] = new Obrero("Sebastian Ocles", 1912323, "2dedee1", 542123123);

		for (Empresa emp : empresa) {

			emp.print(emp.informacion());

		}

	}

}
