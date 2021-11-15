package Ejer2ArrayListObjetos;

public class EjecutableProducto {

	public static void main(String args[]) {

		Almacen almacen = new Almacen();

		char op;

		while (true) {
			almacen.print("1.Registro\n");
			almacen.print("2.Listar\n");
			almacen.print("3.Inventario total\n");
			almacen.print("4.Modificar precio\n");
			almacen.print("5.Modificar unidades\n");
			almacen.print("6.Salir\n");
			almacen.print("Ingrese una opcion: ");
			op = almacen.leer.next().charAt(0);
			if (op == '1') {
				almacen.cargarProductos();
			} else if (op == '2') {
				almacen.listarProductos();
			} else if (op == '3') {
				almacen.inventarioTotal();
			} else if (op == '4') {
				almacen.cambiarPrecio();
			} else if (op == '5') {
				almacen.modificarUnidades();
			} else if (op == '6') {
				almacen.print("Gracias por usar esta app");
				break;
			} else {
				almacen.print("Error!! ingrese una opcion correcta.");
			}
		}
	}

}
