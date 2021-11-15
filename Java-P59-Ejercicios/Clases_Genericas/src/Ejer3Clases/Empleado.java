package Ejer3Clases;

public class Empleado {
	
	//Atributos
	
	//public String nombre,cargo;
	private Generica<String>g1=new  Generica <String>();
	//public int edad,horas_extras;
	private Generica<Integer>g2=new Generica <Integer>();
	
	//public double sueldo;
	private Generica <Double>g3=new Generica <Double>();
	
	
	
	//Metodos
	
	public Empleado(String nombre,String cargo,int edad,double salario,int horasExtras) {
		g1.setAtributo1(nombre);
		g1.setAtributo2(cargo);
		g2.setAtributo1(edad);
		g3.setAtributo2(salario);
		g2.setAtributo1(horasExtras);
	}
	
	
	public double getSalario() {
	
		return g3.getAtributo2()/160;
	}
	
	
	public String toString() {
		return "Empleado:"+g1.getAtributo1()+"\nCargo:"+g1.getAtributo2()+"\nEdad: "+g2.getAtributo1()+"\nSalario: "+getSalario()+"\n";
	}
	
	
}
