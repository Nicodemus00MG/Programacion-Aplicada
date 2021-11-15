package Ejer1ArrayList;

import java.util.*;

public class Academia {

	// ARREGLO DINAMICO USANDO ARRAYLIST, CLASE INTEGRADA DE JAVA.UTIL*
	// Atributos
	public Scanner leer = new Scanner(System.in);
	private ArrayList<Materia> materias;
	private ArrayList<String> docentes;

	// Uso del concepto de programacion generica: se usa la misma clase para crear
	// varios objetos
	// del tipo que nosotros necesitemos

	// Métodos
	public Academia() {
		materias = new ArrayList<Materia>();
		docentes = new ArrayList<String>();
	}

	public void print(String text) {
		System.out.print(text);
	}

	public void registrarNumeroAlumnos() {
		int numero;
		String materia;
		char opc;
		print("\nIngrese la materia que quiere asignar el grupo de alumnos: \n");
		listarMaterias();
		materia = leer.next();
		for (Materia m : materias) {
			if (materia.contentEquals(m.getMateria())) {
				print("Ingrese cantidad de alumnos: ");
				numero = leer.nextInt();
				m.setAlumnos(numero);
				while (true) {
					print("Desea continuar? [s/n]\n");

					opc = leer.next().charAt(0);
					if (opc == 's') {
						break;
					} else if (opc == 'n') {

					} else {
						print("Error entrada no valida!! ...\n");
					}
				}

			}

		}
	}

	public void registrarMaterias() {

		String materia;

		print("Ingrese materia a registrar: ");
		materia = leer.next();

		materias.add(new Materia(materia, null, 0));

	}

	public void listarMaterias() {
		int i = 0;
		for (Materia m : materias) {
			System.out.print((i + 1) + "." + m.getMateria() + "\n");
			i++;
		}

	}

	public void listarInscritos() {
		int i = 0;
		for (Materia m : materias) {
			System.out.println("\n******** " + m.getMateria() + " *********\n");
			System.out.println("Alumnos: " + m.getAlumnos() + "\n");

			i++;
		}
	}

	public void listarDocentes() {
		int i = 0;
		for (String d : docentes) {
			print((1 + i) + "." + d + "\n");

			i++;
		}
	}

	public void asociarDocente() {

		String docente;
		String materia;
		char opc;
		print("\nIngrese la materia que quiere asignar un docente : \n");
		listarMaterias();
		materia = leer.next();
		for (Materia m : materias) {
			if (materia.contentEquals(m.getMateria())) {
				print("Ingrese nombre del docente a asignar ");
				listarDocentes();
				docente = leer.next();
				m.setDocente(docente);
				while (true) {
					print("Desea continuar? [s/n]\n");

					opc = leer.next().charAt(0);
					if (opc == 's') {
						break;
					} else if (opc == 'n') {

					} else {
						print("Error entrada no valida!! ...\n");
					}
				}

			} else {
				print("No se ha encontrado la materia!\n");
			}

		}
	}

	public void registrarDocente() {
		String docente;

		print("Ingrese Docente a registrar: ");
		docente = leer.next();

		docentes.add(docente);

	}

	public void listarEstudiantesDocentes() {
		int i = 0;
		for (Materia m : materias) {
			System.out.println("\n******** " + m.getMateria() + " *********\n");
			System.out.println("Alumnos: " + m.getAlumnos() + "\n");
			System.out.println("Docentes: " + m.getDocente() + "\n");

			i++;
		}

	}

	public void menu() {
		char op;
		boolean bandera1 = true;
		while (bandera1) {
			print("\n****************************\n");
			print("1.Registrar Materias\n");
			print("2.Listar Materias\n");
			print("3.Registrar n numero de estudiantes\n");
			print("4.Listar inscritos por materia\n");
			print("5.Registrar docente\n");
			print("6.Asociar Docente\n");
			print("7.Listar Estudiantes por Docente\n");
			print("8.Salir\n");
			print("\n****************************\n");
			print("Ingrese opcion: ");
			op = leer.next().charAt(0);

			switch (op) {

			case '1':
				boolean bandera = true;
				char opc;
				registrarMaterias();
				while (bandera) {
					System.out.println("Desea registrar mas materias [s/n]: ");
					opc = leer.next().charAt(0);
					if (opc == 's') {
						registrarMaterias();
					} else if (opc == 'n') {
						bandera = false;
					} else {
						print("Error entrada no valida!\n");
					}
				}

				break;

			case '2':
				listarMaterias();
				break;
			case '3':
				registrarNumeroAlumnos();

				break;
			case '4':
				listarInscritos();

				break;
			case '5':
				boolean bandera2 = true;
				char opc1;
				registrarDocente();
				while (bandera2) {
					System.out.println("Desea registrar mas docentes [s/n]: ");
					opc1 = leer.next().charAt(0);
					if (opc1 == 's') {
						registrarDocente();
					} else if (opc1 == 'n') {
						bandera2 = false;
					} else {
						print("Error entrada no valida!\n");
					}
				}

				break;

			case '6':
				asociarDocente();
				break;
			case '7':
				listarEstudiantesDocentes();
				break;
			case '8':
				bandera1 = false;
				print("Gracias por usar esta app!!\n");
				break;
			default:
				print("Error! entrada no permitida");
			}

		}
	}
}
