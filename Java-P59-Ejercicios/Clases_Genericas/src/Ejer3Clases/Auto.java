package Ejer3Clases;

public class Auto {

	
	//Atributo
	protected Generica<String> g1=new Generica<String>();
	protected Generica<Integer>g2=new Generica<Integer>();
	
	
	//Metodos
	public Auto(String marca,String modelo,int anio) {
		g1.setAtributo1(marca);
		g1.setAtributo2(modelo);
		g2.setAtributo1(anio);
	}
	
	public String informacion() {
		return "Marca: "+g1.getAtributo1()+"\n"+"Modelo:"+g1.getAtributo2()+"\n"+"Anio: "+g2.getAtributo1()+"\n";
	}
	
	
	
	
	
}
