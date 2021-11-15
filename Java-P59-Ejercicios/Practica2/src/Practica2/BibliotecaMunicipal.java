package Practica2;

import java.util.*;

public class BibliotecaMunicipal {

	// Atributos
	public Scanner leer = new Scanner(System.in);
	private ArrayList<Libro> libros;
	public String nombre;
	// Constructor

	public BibliotecaMunicipal() {
		libros = new ArrayList<Libro>();
	}

	// Mètodos
	public void agregarLibro(Libro l) {
		libros.add(l);
	}

	public void listarLibros() {

		for (int i = 0; i < libros.size(); i++) {
			if (libros.get(i).getEstado() == true) {
				System.out.print((i + 1) + ".");
				libros.get(i).informacion();
				System.out.println("\n");
			} else {
				System.out.print((i + 1) + ".");
				libros.get(i).informacion();

				System.out.print(" a: " + nombre + "\n");
			}

		}

	}

	public void PrestarLibro() {
		String ISBN;
		char opc;
		boolean bandera = true;
		while (bandera) {
			System.out.println("Ingresar datos del libro a prestar: ");
			System.out.print("Ingrese su ISBN:  ");
			ISBN = leer.next();
			System.out.println("Ingresar su nombre: ");
			nombre = leer.next();
			for (Libro l : libros) {
				if (l.getISBN().contentEquals(ISBN)) {
					if (l.getEstado() == true) {
						System.out.println("EL libro : ");

						l.informacion();
						l.setEstado(false);
						System.out.println("\n++++++++EL LIBRO CAMBIA DE ESTADO +++++++++ \n");
						l.informacion();

						System.out.println("\nPROCESO LOGRADO CON EXITO..." + '\u2714' + "\n");
						System.out.println("\n++++++++++++++++++++++++++++++++++++\n");
						bandera = false;
					} else {
						System.out.println("El libro: ");
						l.informacion();
						System.out.println("\n");
						System.out.println("El libro no esta disponible" + "Prestado a: " + nombre + "\n");
						System.out.println("Desea continuar [s/n]");
						opc = leer.next().charAt(0);
						if (opc == 's' || opc == 'S') {
							PrestarLibro();
						} else if (opc == 'n' || opc == 'N') {
							bandera = false;
						} else {
							System.out.println("Error entrada incorrecta");
						}

					}
				}
			}

		}
	}

	public void devolverLibro() {
		String ISBN;
		char opc;
		boolean bandera = true;
		while (bandera) {
			System.out.println("Ingresar datos del libro a devolver: ");
			System.out.print("Ingrese su ISBN:  ");
			ISBN = leer.next();

			for (Libro l : libros) {
				if (l.getISBN().contentEquals(ISBN)) {
					System.out.println("Libro encontrado satisfactoriamente ..." + '\u2714');
					if (l.getEstado() == false) {
						System.out.println("EL libro : ");

						l.informacion();
						System.out.println("\nEl libro se devolvera a la biblioteca Municipal...\n");

						System.out.println("Desea continuar [s/n]");
						opc = leer.next().charAt(0);
						if (opc == 's' || opc == 'S') {
							l.setEstado(true);

							System.out.println("\nPROCESO LOGRADO CON EXITO..." + '\u2714' + "\n");
							bandera = false;

						} else if (opc == 'n' || opc == 'N') {
							bandera = false;
						} else {
							System.out.println("Error entrada incorrecta");
						}

					}
				}
			}
		}
	}

	public void menu() {

		char op;
		boolean bandera = true;
		while (bandera) {
			System.out.println("\n +++++ BIBLIOTECA MUNICIPAL ++++++ \n");
			System.out.println("1.Ingresar un libro");
			System.out.println("2.Listar los libros");
			System.out.println("3.Prestar un libro");
			System.out.println("4.Devolver libro");
			System.out.println("0.Salir");
			System.out.print("Ingrese su opcion: ");
			op = leer.next().charAt(0);
			System.out.println("\n++++++++++++++++++++++++\n");
			switch (op) {
			case '1':
				System.out.println("+++Ingrese DATOS DEL LIBRO+++");
				String ISBN, autor, titulo, anio;
				System.out.print("Titulo: ");
				titulo = leer.next();
				System.out.print("Autor: ");
				autor = leer.next();
				System.out.print("ISBN: ");
				ISBN = leer.next();
				System.out.print("Anio: ");
				anio = leer.next();
				Libro libro$ = new Libro(titulo, autor, anio, ISBN, true);
				agregarLibro(libro$);

				System.out.println("\nLIBRO CARGADO EXITOSAMENTE... " + '\u2714');

				break;
			case '2':

				listarLibros();
				break;

			case '3':
				PrestarLibro();
				break;
			case '4':
				devolverLibro();
				break;
			case '0':
				bandera = false;
				System.out.println("Gracias por usar esta app");
				break;
			}

		}

	}

}
