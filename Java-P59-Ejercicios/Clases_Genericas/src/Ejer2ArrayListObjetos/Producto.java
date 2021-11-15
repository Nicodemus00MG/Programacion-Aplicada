package Ejer2ArrayListObjetos;

public class Producto {

	// Atributos
	private String nombreProducto;

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	public void setUnidades(int unidades) {
		this.unidades = unidades;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	private int unidades;
	private double precio;

	public Producto(String nombreProducto, int unidades, double precio) {
		this.nombreProducto = nombreProducto;
		this.unidades = unidades;
		this.precio = precio;
	}

	public String getNombreProducto() {
		return nombreProducto;
	}

	public int getUnidades() {
		return unidades;
	}

	public double getPrecio() {
		return precio;
	}

}
