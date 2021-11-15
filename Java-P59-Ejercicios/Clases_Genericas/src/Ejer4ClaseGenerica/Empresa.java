package Ejer4ClaseGenerica;

public class Empresa {

	//Atributos
	
	
	
	//se define mi variable datos el cual es de tipo generica, (una clase parametrizada)
	protected Generica <String,Long,Double> datos;
	
	//Constructor
	public Empresa(String nombre,long cedula) {
		
		//Intanciando mi clase "GENERICA"
		datos =new Generica <String,Long,Double>(nombre,cedula,null);
		
	}
	
	public void print(String text) {
		System.out.print(text);
	}
	
	public String informacion() {
		return"Nombre: "+datos.getAtributo1()+"\n"+"Cedula: "+datos.getAtributo3();
	}
	
	
	
	
	
	
	
	
	//Métodos
	
	
	
}
