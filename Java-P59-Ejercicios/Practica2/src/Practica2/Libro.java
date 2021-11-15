package Practica2;

public class Libro {

	// Atributos
	private String ISBN;
	private String autor;
	private String titulo;
	private String anio;
	private boolean estado = true;

	// Metodos
	public Libro(String autor, String titulo, String anio, String ISBN) {
		this.ISBN = ISBN;
		this.autor = autor;
		this.titulo = titulo;
		this.anio = anio;

	}

	public Libro(String autor, String titulo, String anio, String ISBN, boolean estado) {
		this.ISBN = ISBN;
		this.autor = autor;
		this.titulo = titulo;
		this.anio = anio;
		this.estado = estado;
	}

	public void estadoLibro() {
		if (estado == true) {
			System.out.print("DISPONIBLE");
		} else {
			System.out.print("PRESTADO");
		}
	}

	public void informacion() {
		System.out.print(autor + "," + '\u0022' + titulo + '\u0022' + "," + anio + "," + "ISBN: " + ISBN + ",");
		estadoLibro();

	}

	public String getISBN() {
		return this.ISBN;
	}

	public boolean getEstado() {
		return this.estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

}
