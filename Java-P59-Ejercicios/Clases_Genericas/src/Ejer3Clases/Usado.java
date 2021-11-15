package Ejer3Clases;

public class Usado extends Auto {

	private Generica<String> g3 = new Generica<String>();

	public Usado(String marca, String modelo, int anio, String placa, String propietario) {
		super(marca, modelo, anio);
		g3.setAtributo1(placa);
		g3.setAtributo2(propietario);

	}
	
	
	
	public String informacion() {
		return "Propiertario: "+g3.getAtributo2()+"\nModelo"+g1.getAtributo2()+"\nPlaca: "+g3.getAtributo1();
		
	}

}
