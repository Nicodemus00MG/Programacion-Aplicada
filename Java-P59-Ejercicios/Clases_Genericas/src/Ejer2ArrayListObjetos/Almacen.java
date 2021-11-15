package Ejer2ArrayListObjetos;

import java.util.*;

public class Almacen {

	// Atributos
	private ArrayList<Producto> producto;
	private String nombreProducto;
	private int unidades;
	private double precio;
	public Scanner leer = new Scanner(System.in);

	// Metodos

	public Almacen() {
		this.producto = new ArrayList<Producto>();
	}

	public void print(String text) {
		System.out.print(text);
	}

	public void addProductos(Producto p) {
		producto.add(p);
	}

	public void cargarProductos() {
		print("Ingrese nombre del producto: ");
		nombreProducto = leer.next();

		print("Ingrese numero de unidades: ");
		unidades = leer.nextInt();

		print("Ingrese precio c/u: ");
		precio = leer.nextDouble();

		// OJO AQUI USO COMO PARAMETRO UNA INSTANCIA, CREACION DE MI OBJETO PARA USARLO
		// AGREGANDOLO EN MI ARRAYLIST DE OBJETOS
		addProductos(new Producto(nombreProducto, unidades, precio));

	}

	public void listarProductos() {
		print("\n*************************************\n");
		int i=1;
		for (Producto p_ : producto) {

			print(i + "." + "\t" + "Nombre: " + p_.getNombreProducto() + "\n");
			print(i + "." + "\t" + "Unidades: " + p_.getUnidades() + "\n");
			print(i + "." + "\t" + "Precio: " + p_.getPrecio() + "\n");
			i++;
		}
		print("\n**************************************\n");
	}

	public void inventarioTotal() {

		print("\n*************************************\n");
		print("Nombre\t");
		print("Unidades   ");
		print("Precio\t");
		print("Total\n");
		for (Producto p_ : producto) {

			print(p_.getNombreProducto() + "\t");
			print(p_.getUnidades() + "        ");
			print(p_.getPrecio() + "          ");
			System.out.print(p_.getPrecio() * p_.getUnidades());
			print("\n");
		}
		print("\n**************************************\n");

	}

	public void cambiarPrecio() {
		String nombre;
		char opc;
		double precio;
		print("Ingrese el nombre del producto a buscar: ");
		nombre = leer.next();
		for (Producto p_ : producto) {
			if (nombre.contentEquals(p_.getNombreProducto())) {
				print("Producto encontrado: " + p_.getNombreProducto() + "\n");
				print("Precio c/u: " + p_.getPrecio() + "\n");
				while (true) {
					print("Desea cambiar el precio c/u: ? [s/n]");
					opc = leer.next().charAt(0);
					if (opc == 's' || opc == 'S') {
						print("Ingrese precio: ");
						precio = leer.nextDouble();
						p_.setPrecio(precio);
					} else if (opc == 'n' || opc == 'N') {
						break;
					} else {
						print("Error! opcion no valida");
					}
				}
			}
		}

	}

	public void modificarUnidades() {

		String nombre;
		char opc;
		int unidades;
		print("Ingrese el nombre del producto a buscar: ");
		nombre = leer.next();
		for (Producto p_ : producto) {
			if (nombre.contentEquals(p_.getNombreProducto())) {
				print("Producto encontrado: " + p_.getNombreProducto() + "\n");
				print("Unides: " + p_.getUnidades() + "\n");
				while (true) {
					print("Desea cambiar las unidades: ? [s/n]");
					opc = leer.next().charAt(0);
					if (opc == 's' || opc == 'S') {
						print("Ingrese las unidades: ");
						unidades = leer.nextInt();
						p_.setUnidades(unidades);
					} else if (opc == 'n' || opc == 'N') {
						break;
					} else {
						print("Error! opcion no valida");
					}
				}
			}
		}

	}

}
