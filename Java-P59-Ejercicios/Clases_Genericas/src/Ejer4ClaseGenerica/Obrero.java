package Ejer4ClaseGenerica;

public class Obrero extends Empresa {

	public Obrero(String nombre, long cedula, String codigo, long idBiomet) {
		super(nombre, cedula);
		datos.setAtributo2(codigo);
		datos.setAtributo4(idBiomet);
	}
	
	
	//cast se empezifica el valor de entrada o salida con el tipo de dato entre parentesis (TIPO)
	
	public Double clave() {
		return datos.obtenerValorNumerico((double) datos.getAtributo3()/datos.getAtributo4());
	}

	public String informacion() {
		return "\nNombre Empleado: " + datos.getAtributo1() + "\n Cedula: " + datos.getAtributo3() + "\nCodigo: "
				+ datos.getAtributo2() + "\nId Biometrica: " + datos.getAtributo4()+"\n Clave: "+clave();
	}

}
